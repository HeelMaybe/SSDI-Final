package ssdi.ssdi.entities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Displaystudent {
	   public static void main(String[] args) throws Exception {

	      // register Oracle thin driver with DriverManager service
	      // It is optional for JDBC4.x version
	      Class.forName("com.mysql.cj.jdbc.Driver");

	      // variables
	      final String url = "jdbc:mysql:///ssdi_sample";
	      final String user = "ssdi";
	      final String password = "flight";

	      // establish the connection
	      Connection con = DriverManager.getConnection(url, user, password);

	      // display status message
	      if (con == null) {
	         System.out.println("Connection unsuccessfull. Please check Database connection details!");
	         return;
	      } else
	         System.out.println("Congratulations," + 
	              " Successfully connected to MySQL.\n");
	      String query = "select * from ssdi_sample_spike2";
	      
	//statement
	      Statement st = con.createStatement();

	      // send and execute SQL query in Database software
	      ResultSet rs = st.executeQuery(query);

	      // process the ResultSet object
	      boolean flag = false;
	      while (rs.next()) {
	         flag = true;
	         System.out.println(rs.getString(1) + " " + rs.getString(2));
	      }

	      if (flag == true) {
	         System.out.println("\nRecords retrieved and displayed");
	      } else {
	         System.out.println("Record not found");
	      }

	      // close JDBC objects
	      rs.close();
	      st.close();
	      con.close();

	   } 
	}


