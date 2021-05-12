package api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class database {
	   Connection cn;

       PreparedStatement ps;

       ResultSet rs;                                

      public database() {

          try {

         	 Class.forName("com.mysql.cj.jdbc.Driver");

         	 
              cn= DriverManager.getConnection("jdbc:mysql://127.0.1:3306/client","root","ABHISHEK");
               System.out.println("Database Connected..");

                }catch(Exception e) {

                System.out.println("Database not Connected.." + e);

                }

       }     
      
      
      
      public void inserts(String id, String firstname, String lastname, String email) {

          try {

                   ps = cn.prepareStatement("insert into employee values(?,?,?,?,?,?)");

                   ps.setString(1, id);

                   ps.setString(2, firstname);

                   ps.setString(3, lastname);

                   ps.setString(4, email);
      
                   ps.executeUpdate();

                   System.out.println("1 Record inserted...");

          }catch(Exception e) {

                   System.out.print("\n Unable to insert..\n" + e);

          }

          }        // end of insert
      
      
      public void display() {

          try {

                   ps = cn.prepareStatement("select * from client");

                   rs = ps.executeQuery();

                             System.out.println("  ID    |    FIRST_NAME        |    LAST_NAME   |   E-MAIL    ");

                             System.out.println("--------------------------------------------------------------------------");

                   while(rs.next()) {

                             System.out.println( rs.getString(1) + "\t " + rs.getString(2) + "\t " + rs.getString(3) + "\t " + rs.getString(4));

                   }        //       end of while

          }catch(Exception e) {}

          }                 //       end of dispay

      public void close()  {   

          try {

                   rs.close();

                   ps.close();

                   cn.close();

          }catch(Exception e) {}

          }        //       end of close

}
