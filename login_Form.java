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

/*jlabel minimized -> mouse click event*/
private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {

    this.setState(jFrame.ICONIFIED);

}

/*jlabel minimized -> mouse entered event*/
private void jLabel_minimizeMouseEntered(java.awt.event.MouseEvent evt) {

    /*Change the jborder color to white*/
    Border label_border = BorderFactory.createGlossBorder(1, 1, 1, 1, Color.white);
    jLabel_minimize.setBorder(label_border);
    /*Set the jlabel foreground to white*/
    jLabel_minimizeForeground(Color.white);

}

/*jlabel minimize -> mouse exited event*/
private void jLabel_minimizeMouseExited(java.awt.event.MouseEvent evt) {

    /*Reset the jLabel border color to white*/
    Border label_border = BorderFactory.createGlossBorder(1, 1, 1, 1, Color.black);
    jLabel_minimize.setBorder(label_border);
    /*Set the jlabel foreground to white*/
    jLabel_minimize.setForeground(Color.black);

}

/*jLabel close -> mouse click event*/
private void jLabel-closeMouseClicked(java.awt.eventMouseEvent evt) {

    system.exit(0);

}

/*jlabel close -> mouse enter event*/
private void jLabel_closedMouseEntered(java.awt.event.MouseEvent evt) {

    /*Change the jlabel border to white*/
    Border label_border = BorderFactory.createGlossBorder(1, 1, 1, 1, Color.white);
    jLabel_close.setBorder(label_border);
    /*Set the jlabel foreground to white*/
    jLabel_close.setForeground(Color.white);
    
}

/*jlabel close -> mouse entered event*/
private void jLabel_closedMouseEntered(java.awt.event.MouseEvent evt) {

    Border label_border = BorderFactory.createMatteBorder(1,1,1,1 Color.white);
    jLabel_close.setBorder(label_border);
    /*Set the jlabel foreground to white*/
    jLabel_close.setForeground(Color.white);

}

/*jlabel close -> mouse exited event*/
private void jLabel_closeMouseExited(java.awt.event.MouseEvent evt) {
    /*reset the jlabel border color to white*/
    Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
    jLabel_close.setBorder(label_border);
    /*reset the jlabel foreground to black*/
    jLabel_close.setForeground(Color.black);

}

/*JTextField For the Phone Number -> KeyTyped Event*/
private void jTextField_PhoneKeyTyped(java.awt.event.KeyEvent evt) {

    /*Set field to only numbers*/
    if(!Character.isDigit(evt.getKeyChar())) {
        evt.consume
    }
}

/*Button select image*/
private void jButton_SelectImageActionPerformed(java.awt.event.ActionEvent evt) {

    /*Select an image and set the image path into a jlabel*/
    String path = null;

    jFileChooser chooser = new jFileChooser();

    chooser.setCurrentDirectory(new File(System.getProperty("user.home")));

    /*File extention*/
    FileNameExtentionFilter extention = new
    FileNameExtentionFilter("*.images", "jpg", "png", "jpeg");
    chooser.addChoosableFileFilter(extention);

    int filestate = chooser.showSaveDialog(null);

    /*Check if user has selected an image*/
    if(filestate == jFileChooser.APPROVE_OPTION) {

    File selectedImage = chooser.getSelectedFile();
    path = selectedImage.getAbsolutePath();
    jLabel_imgpath.setText(path);

    image_path = path;
    }

}

/*A jlabel to open the login form on Mouse Clicked Event*/
private void jLabel_loginMouseClicked(java.awt.event.MouseEvent evt) {

    Login_Form lf = new Login_Form();
    lf.setVisible(true);
    lf.pack();
    lf.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
    this.dispose();

}

/*Reset the jlabel border color on mouse entered*/
private void jLabel_loginMouseEntered(java.awt.event.MouseEvent evt) {

    Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0, 240, 0));
    jLabel_login.setBorder(label_border);

}

/*Reset the jlabel border color on mouse exited*/
private void jLabel_loginMouseExited(java.awt.event.MouseEvent evt) {

    Border label_create_account_border = borderFactory.createGlossBorder(0, 0, 1, 0, Color.lightGray);
    jLabel_login.setBorder(label_create_account_border);

}

/*create a function to verify the empty fields*/
public boolean verifyFields()
{
    String fname = jTextField_Fullname.getText();
    String uname = jTextField_Username.getText();
    String phone = jTextField_Phone.getText();
    String pass1 = String.valueOf(jPasswordField_1.getPassword());
    String pass2 = String.valueOf(jPasswordField_2.getPassword());
    
    /*Boolean to check if there are empty fields*/
    if(fname.trim().equals("") || uname.trim().equals("") || phone.trim().equals("")
       || pass1.trim().equals("") || pass2.trim().equals(""))
    {
        JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Empty Fields",2);
        return false;
    }

        /*check if the two password are equals or not*/
    else if(!pass1.equals(pass2))
    {
        JOptionPane.showMessageDialog(null, "Password Doesn't Match","Confirm Password",2);
        return false;
    }
        
        // if everything is ok
    else{
        return true;
    }
}

