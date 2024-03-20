package fr.dawan.consolidation.exercices;
import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ImportExportTool {

    public static <T> void toBin(String path,T t) throws FileNotFoundException, IOException {
        try(BufferedOutputStream fos=new BufferedOutputStream(new FileOutputStream(path))){
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(t);
        }
    }


    public static <T> T fromBin(String path) throws IOException, ClassNotFoundException {
        Object obj=null;
        try(BufferedInputStream fis=new BufferedInputStream(new FileInputStream(path))){
            ObjectInputStream ois=new ObjectInputStream(fis);
            obj=ois.readObject();
        }
        return (T) obj;
    }

    public static <T> void toCsv(String path, List<T> list) throws Exception {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            boolean first = true;
            for(T elm : list) {
                Class<?> clazz = elm.getClass();
                Field[] champs = clazz.getDeclaredFields();
                StringBuffer sb = new StringBuffer();
                if (first) {
                    StringBuffer ligne = new StringBuffer();
                    for (Field f : champs) {
                        ligne.append(f.getName());
                        ligne.append(";");
                    }
                    bw.write(ligne.toString());
                    bw.newLine();
                    first = false;
                }
                for (Field f : champs) {
                    sb.append(f.getName());
                    sb.append(";");
                }
                bw.write(sb.toString());
                bw.newLine();
            }
        }
    }


    public static <T> List<T> fromCsv(String path, Class<T> clazz) throws Exception {
        List<T> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            br.readLine();
            String line = null;
            while ((line = br.readLine()) !=null) {
                String[] tab = line.split(";");
                T obj = clazz.getDeclaredConstructor().newInstance();
                Field[] fields = clazz.getDeclaredFields();
                int i = 0;
                for(Field f : fields) {
                    f.setAccessible(true);
                    Class<?> type = f.getType();
                    if(type.equals(String.class)) {
                        f.set(obj,tab[i]);
                    } else if (type.getName().equals("double")) {
                        f.set(obj, Double.parseDouble(tab[i]));
                    }
                    i++;
                }
                list.add(obj);
            }
        }
        return list;
    }

}
