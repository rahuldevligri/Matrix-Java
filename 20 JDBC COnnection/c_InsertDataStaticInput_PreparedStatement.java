import java.sql.*;
public class c_InsertDataStaticInput_PreparedStatement {
    public static void main(String[] args){
        try{
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //create Conncetion..
            String url="jdbc:mysql://localhost:3306/youtube";
            String username="root";
            String password="4642";
            Connection con=DriverManager.getConnection(url,username,password);

            //create a query
            String q = "insert into table1(tName,tCity) values (?,?)";

            //get the PreparedStatement object...
            PreparedStatement pstmt = con.prepareStatement(q);

            //set the valuse to Query
            pstmt.setString(1,"Rohit Devligri");
            pstmt.setString(2,"Jaipur");

            pstmt.executeUpdate();

            System.out.println("inserted...");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
