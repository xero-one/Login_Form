/*The start of the class for our application */
/*Here we initiate our Connection to MySQL for the Login_Form*/
package login_ragister_design;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/*Created By Bxxdyz*/

public class Login_Form_Connection {
    
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
            Logger.getLogger("Get Connection ->" + Login_Form_Connection.class.getName()).log(Level.SEVERE,null, ex);
    }
     
        return form;
    }

}

/*End the class for our application*/

/*Beginning of the Login form*/

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

/*Create a function to check if the entered username already exists in the database*/
public boolean checkUsername(String username){

    PreparedStatement st;
    ResultSet rs;
    boolean username_exist = false;

    String query = "SELECT*FROM `users` WHERE `username`=?";

    try {

        st = Login_Form_Connection.getConnection().prepareStatement(query);
        st.setString(1, username);
        rs=st.executeQuery();
        
        if(re.next())
        {
            username_exist = true;
            jOptionPane.showMessageDialog(null, "This Username is Already Taken, Choose Another One", "Username Failed", 2);
        }
    }
    
    catch(SQLException ex) {
        Logger.getLogger(Register_Form.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return username_exist;

}

/*button register*/
private void jButton_RegisterActionPerformed(java.awt.event.ActionEvent evt) {
        /*get data from fields*/
        String fname = jTextField_Fullname.getText();
        String username = jTextField_Username.getText();
        String pass1 = String.valueOf(jPasswordField_1.getPassword());
        String pass2 = String.valueOf(jPasswordField_2.getPassword());
        String phone = jTextField_Phone.getText();
        String gender = "Male";
         
        if(jRadioButton_Female.isSelected()){
             gender = "Female";
        }
        
        /*Check if the data are empty*/
        if(verifyFields()) {
        /*check if the username already exists*/
            if(!checkUsername(username)) {
                PreparedStatement ps;
                ResultSet rs;
                String registerUserQuery = "INSERT INTO `users`(`full_name`, `username`, `password`, `phone`, `gender`, `picture`) VALUES (?,?,?,?,?,?)";
                 
                try {
                     
                    ps = Login_Form_Connection.getConnection().prepareStatement(registerUserQuery);
                    ps.setString(1, fname);
                    ps.setString(2, username);
                    ps.setString(3, pass1);
                    ps.setString(4, phone);
                    ps.setString(5, gender);
                     
                    try {
                        /*save the image as blob in the database*/
                        if(image_path != null){
                         
                            InputStream image = new FileInputStream(new File(image_path));
                            ps.setBlob(6, image);}

                        else{
                            ps.setNull(6, java.sql.Types.NULL);
                        }
                         
                        if(ps.executeUpdate() != 0){
                            JOptionPane.showMessageDialog(null, "Your Account Has Been Created");
                        }
                        
                        else{
                            JOptionPane.showMessageDialog(null, "Error: Check Your Information");
                        }
                    }

                    catch (FileNotFoundException ex) {
                        Logger.getLogger(Register_Form.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    catch (SQLException ex) {
                        Logger.getLogger(Register_Form.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        }
}
/*End of the Login form*/

/*Beginning of the Sign In form*/
public SignIn_Form() {
    initComponents();
    
    /*Center the form positioning*/
    this.setLocationRelativeTo(null);
    
    /*Create a yellow border for the jPanel_title*/
    /*0 border in the top*/
    Border jpanel_title_border = BorderFactory.createGlossBorder(0, 1, 1, 1, Color.yellow);
    /*Set the border to the jPanel_title*/
    jPanel_title.setBorder(jpanel_title_border);
    
    /*Create an orange border for the global panel*/
    Border glob_panel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.orange);
    jPanel1.setBorder(glob_panel_border);
        
    /*Create a black border for the close & minimize jlables*/
    Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
    jLabel_minimize.setBorder(label_border);
    jLabel_close.setBorder(label_border);
        
    /*Create a border for the create acconut jlabel*/
    Border label_create_accont_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.lightGray);
    jLabel_Create_Account.setBorder(label_create_accont_border);
        
    /*Create a border with the color of the parent jpanel for the icons label to remove the move*/
    Border label_icons_border = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153,153,153));
    jLabel_username.setBorder(label_icons_border);
    jLabel_password.setBorder(label_icons_border);
        
    /*create border for the username and password field*/
    Border field_border = BorderFactory.createMatteBorder(1, 5, 1, 1, Color.white);
    jTextField_Username.setBorder(field_border);
    jPasswordField.setBorder(field_border);
        
}

/*jlabel minimize -> mouse entered*/
private void jLabel_minimizeMouseEntered(java.awt.event.MouseEvent evt) {
    Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
    jLabel_minimize.setBorder(label_border);
    jLabel_minimize.setForeground(Color.white);
}

/*jlabel minimize -> mouse exited*/
private void jLabel_minimizeMouseExited(java.awt.event.MouseEvent evt) {
    Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
    jLabel_minimize.setBorder(label_border);
    jLabel_minimize.setForeground(Color.black);
}

/*jlabel close -> mouse exited*/
private void jLabel_closeMouseEntered(java.awt.event.MouseEvent evt) {

    Border label_border = NorderFactory.createGlossBorder(1, 1, 1, 1, Color.white);
    jLabel_close.setBorder(label_border);
    jLabel_close.setForeground(Color.black);

}

/*jlabel close -> mouse exited*/
private void jLabel_closeMouseExited(java.awt.event.MouseEvent evt) {

    Border label_border = BorderFactory.createGlossBorder(1, 1, 1, 1, Color.black);
    jLabel_close.setBorder(label_border);
    jLabel_close.setForeground(Color.black);

}
