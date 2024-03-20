package fr.dawan.consolidation.genericite;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao implements Dao<Product> {
    private final String url = "jdbc:mysql://localhost:3306/java_consolidation";
    private final String user = "root";
    private final String password = "admin";

    @Override
    public List<Product> getAll() {
        List<Product> lst = new ArrayList<>();
        try(Connection cnx=DriverManager.getConnection(url, user, password)) {
            PreparedStatement ps = cnx.prepareStatement("SELECT id, description, prix FROM Products");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                lst.add(new Product(rs.getLong("id"), rs.getString("description"), rs.getDouble("prix")));
            }
        }
        catch(SQLException e) {
            System.err.println(e.getMessage());
        }
        return lst;
    }

    @Override
    public void insert(Product elm) {
        try (Connection cnx = DriverManager.getConnection(url, user, password)) {
            PreparedStatement ps = cnx.prepareStatement("INSERT INTO Products(description, prix) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, elm.getDescription());
            ps.setDouble(2, elm.getPrix());
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()) {
                elm.setId(rs.getLong(1));
            }
        }
        catch (SQLException e) {
            System.err.println("Erreur connexion");
        }
    }
}
