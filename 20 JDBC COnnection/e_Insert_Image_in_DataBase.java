import java.sql.*;
import java.io.*;
public class e_Insert_Image_in_DataBase {
    public static void main(String[] args){
        try{
            //load Driver...
            Class.forName("com.mysql.cj.jdbc.Driver");

            //create Connection...
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","4642");

            //create a Query
            String q = "insert into images(pic) values(?)";

            PreparedStatement pstmt=con.prepareStatement(q);

            FileInputStream fis=new FileInputStream("c:\\users\\rohit\\3d objects\\matrix java\\20 jdbc connection\\rahul.jpeg");

            pstmt.setBinaryStream(1,fis,fis.available());

            pstmt.executeUpdate();

            System.out.println("Done.....");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
