/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;

/**
 *
 * @author saurabhmaiti
 */
public class connection_provider {
    public static Connection getCon()
    {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BBMS","root","Saurabhmaiti@5934");
        return con;
                }
        catch(Exception e)
        {
            return null;
        }
        
    }
}