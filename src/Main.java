import org.postgresql.util.PSQLException;

import java.sql.*;



public class Main {
    public static void main(String[] args) throws PSQLException, SQLException {


        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname= "postgres";
        String password = "19092002";
        String sql = "UPDATE student set sname = 'Sid' where sid=1";


        Connection con  = DriverManager.getConnection(url,uname,password);
        System.out.println("Yay! Connection Established");
        Statement st = con.createStatement();
        System.out.println("Statement ");
        //for read operation
       ResultSet rs = st.executeQuery(sql);

       while(rs.next()){
           System.out.print(rs.getInt("sid")+" - ");
           System.out.print(rs.getString("sname")+" - ");
           System.out.print(rs.getInt("marks"));
           System.out.println();
       }
// For update and delete operations
//        boolean status  = st.execute(sql);
//        System.out.println(status);


        con.close();

        System.out.println("Connection Closed");


    }
}