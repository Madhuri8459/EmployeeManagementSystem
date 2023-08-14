package dbconfig;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConfiguration {
	public static Connection getMyConnection()
	{
		Properties properties =new Properties();
		try {
			FileReader reader =new FileReader("dbfile.properties");
		properties.load(reader);
		Class.forName(properties.getProperty("jdbcdriver"));
		String url=properties.getProperty("jdbcurl");
		String uname=properties.getProperty("username");
		String pass=properties.getProperty("password");
		Connection connection =DriverManager.getConnection(url,uname,pass);
		return connection;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return null;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return null;
		}
		
	}

}

