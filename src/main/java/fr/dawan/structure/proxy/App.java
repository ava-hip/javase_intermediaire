package fr.dawan.structure.proxy;

public class App {
    public static void main(String[] args) {
        Message msg = new UserMessage("le contenu du message");
        Message proxy = new MessageProxy(msg);
        System.out.println(proxy.getContent());
    }
}
