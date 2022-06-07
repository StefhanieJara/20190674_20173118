package com.example._20190674_20173118.Daos;
import com.example._20190674_20173118.Beans.celebridadBean;

import java.sql.*;
import java.util.ArrayList;

public class CelebridadDaos {
    String user = "root";
    String pass = "root";
    String url = "jdbc:mysql://localhost:3306/sakila";

    public static ArrayList<celebridadBean> listarCelebridad() {
        ArrayList<celebridadBean> listaCelebridad = new ArrayList<>();
        String user = "root";
        String pass = "root";
        String url = "jdbc:mysql://localhost:3306/centro1";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (Connection connection = DriverManager.getConnection(url, user, pass);
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery("select * from (select a.actor_id, concat(first_name,'',last_name) as 'Nombre',count(a.actor_id) as 'N° Peliculas' from actor a inner join film_actor f on (a.actor_id= f.actor_id) group by f.actor_id) as t inner join  (select a.actor_id, count(a.actor_id) as 'N° Categorias' from actor a inner join film_actor f on (a.actor_id= f.actor_id) inner join film fi on (f.film_id= fi.film_id) inner join film_category ca on (fi.film_id= ca.film_id) inner join category cat on (ca.category_id=cat.category_id) group by a.actor_id) as t2 on (t2.actor_id= t.actor_id) ")){

            while (rs.next()) {
                celebridadBean bPersona = new celebridadBean();

                bPersona.setActor_id(rs.getInt(1));
                bPersona.setFirst_name(rs.getString(2));
                bPersona.setNumero_pelis(rs.getInt(3));
                bPersona.setActor_id(rs.getInt(4));
                bPersona.setNumero_categoria(rs.getInt(5));
                listaCelebridad.add(bPersona);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return listaCelebridad;
    }


}
