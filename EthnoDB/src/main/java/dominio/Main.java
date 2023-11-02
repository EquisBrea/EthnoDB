package dominio;

import com.mysql.cj.protocol.Resultset;
import dominio.actors.Collaborator;
import dominio.actors.Community;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.Scanner;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws SQLException {


        // * tomar input por consolapara el nombre
        //Scanner scn = new Scanner(System.in);
        //String inputName1 = scn.nextLine();


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


}