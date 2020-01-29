/*The start of the class for our application */
/*Here we initiate our Connection to MySQL for the Login_Form*/
package com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/*Created By Bxxdyz*/

public class Login_Form {
    
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "user_db";
    private static Integer portnumber = 3308;
    private static String Password = "Wolviver24";
    
    public static Connection getConnection() {
        Connection form = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try{
            cnx = datasource.getConnection();
        }catch(SQLException ex){
            Logger.getLogger("Get Connection ->" + Login_Form.class.getName()).log(Level.SEVERE,null, ex);
    }
     
        return form;
    }

}

/*End the class for our application*/


