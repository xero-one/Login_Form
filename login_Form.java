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

/*beginning of the Login form*/

/*Create a variable to set the image path for the logo*/
String image_path = null;

public Register_Form() {
    initComponents();

    /*Center the form positioning*/
    this.setLocationRelativeTo(null);

    /*Boarder settings for the Jpanel*/
    Border jpanel_title_border = BorderFactory.createGlossBorder(0, 1, 1, 1, Color.yellow);

    jpanel_title.setBorder(jpanel_title_border);

    /*Secondary border for minimizing and closing jlabels*/
    Border label_border = BorderFactory.createGlossBorder(1, 1, 1, 1, Color.black);
    jLabel_minimize.setBorder(label_border);
    jLabel_close.setBorder(label_border);

    /*Create a border for the create account jlabel*/
    Border label_login_border = BorderFactory.createGlossBorder(0, 0, 1, 0 Color.lightGray);
    jLabel_login.setBorder(label_login_border);

    /*Create a border for the text and password fields*/
    Border field_border = BorderFactory.createGlossBorder(1, 5, 1, 1, Color.white);
    jTextField_Username.setBorder(field_border);
    jTextField_Fullname.setBorder(field_border);
    jTextField_Phone.setBorder(field_border);
    jPasswordField_1.setBorder(field_border);
    jPasswordField_2.setBorder(field_border);

    /*Create a button for interactivity*/
    ButtonGroup bg = new Buttongroup();
    bg.add(jRadioButton_Male);
    bg.add(jRadioButton_Female);

}




