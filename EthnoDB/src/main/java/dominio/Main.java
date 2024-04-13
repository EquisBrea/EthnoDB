package dominio;

import java.sql.*;

import dominio.GUI.VentanaInicio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import javax.swing.*;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static EntityManager getEntityManager(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
        return factory.createEntityManager();
    }
    public void main(String[] args) throws SQLException {


            Menu menu = new Menu();

            SwingUtilities.invokeLater(() ->
                    new VentanaInicio());

            try {
                // menu.showMenu();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }

        // * tomar input por consolapara el nombre
        //Scanner scn = new Scanner(System.in);
        //String inputName1 = scn.nextLine();

        /*
        //conexión con la DB
        Connection connection = null;
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ethnoDBtest1","root", "Gas71985");
       try {
        Statement statement=connection.createStatement();
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS`ethnoDBtest1`.`collaborator` (\n" +
                "  `idcollaborator` INT NOT NULL AUTO_INCREMENT, givenname VARCHAR(45), familyname VARCHAR(45), age int,\n" +
                "  PRIMARY KEY (`idcollaborator`));");



        PreparedStatement insertStatement;
        insertStatement = connection.prepareStatement("INSERT INTO collaborator (givenname, familyname, age) VALUES (?, ?, ?)");
        insertStatement.setString(1, "Anja");
        insertStatement.setString(2,"Cizel");
        insertStatement.setInt(3, 32);
        insertStatement.executeUpdate();

        PreparedStatement deleteStatement;
        Statement selectStatement = connection.createStatement();
        ResultSet resultSet = selectStatement.executeQuery("SELECT * FROM collaborator");
        while(resultSet.next()) {
            String familyname = resultSet.getString("familyname");
            String name = resultSet.getString("givenname");
            int age = resultSet.getInt("age");
            System.out.println(name + " " + familyname + " " + age);
        }
            deleteStatement = connection.prepareStatement("DELETE FROM collaborator WHERE givenname =?");
            deleteStatement.setString(1, "Anja");
            deleteStatement.executeUpdate();

            connection.close();
        } catch (SQLException e){
            System.out.println("Error de DB");

        }
/*
        Collaborator newCollab = new Collaborator("Anja","Cizel");


        Scanner scn2 = new Scanner(System.in);
        String inputCommunity1 = scn2.nextLine();

        Community community = new Community();
        community.setCommunityName(inputCommunity1);


        community.addCollaborator(newCollab);
        System.out.println("Collaborator " + newCollab.getName() + " of community" + community.getName());
        Set collNames = community.getCollaborators();
        System.out.println("Collaborators:" + collNames);

*/
    }

