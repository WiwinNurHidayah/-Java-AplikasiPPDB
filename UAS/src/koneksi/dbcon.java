/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author rthkido
 */
public class dbcon {
    Connection koneksi;
    
    public static Connection Koneksi(){
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "dsiswa";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        try{
            Class.forName(driver);
            Connection koneksi = DriverManager.getConnection(url + dbName, userName, password);
            
            return koneksi;
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            
            return null;
        }
    }
}
