package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayOneRowExample {

    public static void main(String[] args) {
        // JDBC connection parameters
        String jdbcUrl = "jdbc:mysql://localhost:3306/edubridge";
        String username = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            // The unique identifier to fetch only one row (e.g., primary key)
            int uniqueId = 1;

            // Create the SQL query with a WHERE clause using a placeholder for the unique identifier
            String sqlQuery = "SELECT * FROM table1 WHERE id = ?";

            // Prepare the statement with the SQL query
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1, uniqueId); // Bind the uniqueId to the placeholder

            // Execute the query and get the result set
            ResultSet resultSet = preparedStatement.executeQuery();

            // Process the result (assuming 'your_table_name' has columns 'id', 'name', 'age', etc.)
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                // Use the fetched data as needed
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
            } else {
                System.out.println("No matching record found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

