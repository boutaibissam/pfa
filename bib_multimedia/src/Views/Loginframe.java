package Views;

import java.awt.EventQueue;
import java.awt.Image;
import java.sql.* ;

import javax.swing.JFrame;
import javax.swing.JTextField;

import controllers.mysqlconnection;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;

public class Loginframe {

  private JFrame frame;
  private JTextField textFielduser;
  private JPasswordField passwordField;

  /**
   * Launch the application.
   */
  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Loginframe window = new Loginframe(); 
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public Loginframe() {
    initialize();
    frame.setTitle("Login" );
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 700, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    frame.setResizable(false);
    
    textFielduser = new JTextField();
    textFielduser.setBounds(397, 167,154 , 20);
    frame.getContentPane().add(textFielduser);
    textFielduser.setColumns(10);
    
    JLabel lblNewLabel = new JLabel("  username ");
    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
    lblNewLabel.setBounds(285, 168, 102, 17);
    frame.getContentPane().add(lblNewLabel);
    
    JLabel lblNewLabel_1 = new JLabel("  pass word");
    lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
    lblNewLabel_1.setBounds(285, 205, 86, 14);
    frame.getContentPane().add(lblNewLabel_1);
    
    JButton btnNewButton = new JButton("Login ");
    btnNewButton.addActionListener(new ActionListener() {
      @SuppressWarnings("deprecation")
      public void actionPerformed(ActionEvent e) {
         try{
        Connection conn=mysqlconnection.dbConnector() ;
        String query ="select *  from users where username=? and password=?  ";
        PreparedStatement pst=conn.prepareCall(query) ;
        pst.setString(1,textFielduser.getText());
        pst.setString(2,passwordField.getText());
       
        ResultSet rs=pst.executeQuery() ;
        int count=0 ;
        String type ="";
        while (rs.next()){
          count++ ;
          type=rs.getString("type") ;  
          
        }
        
        if (count==1){         
          if (type.equals("admin")){
            JOptionPane.showMessageDialog(null, "username and pass word are correct ");
            frame.dispose();
            
            AdminFrame  adminwindow=new  AdminFrame() ;
            adminwindow.setVisible(true) ;            
          }
          else  if(type.equals("gerant")) {
              JOptionPane.showMessageDialog(null, "username and pass word are correct ");
              frame.dispose();
              GerantFrame gerantWindow=new  GerantFrame() ;
              gerantWindow.setVisible(true) ;
           
          }
        }
        else if (count>1) {
          JOptionPane.showMessageDialog(null, "duplicated Username and passeword <s");
        }
        else{
          JOptionPane.showMessageDialog(null, "username and passwaord are not correct  !");
        }
        
        rs.close();
        pst.close();
        conn.close();
        
      }
      catch (Exception e1){
        JOptionPane.showMessageDialog(null,e1);
        
      }
     
    }
    });
    btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
    btnNewButton.setBounds(392, 236, 77, 23);
    frame.getContentPane().add(btnNewButton);
    
    JButton btnNewButton_1 = new JButton(" Cancel");
    btnNewButton_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        frame.dispose();
      }
    });
    btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
    btnNewButton_1.setBounds(474, 236, 77, 23);
    frame.getContentPane().add(btnNewButton_1);
    
    passwordField = new JPasswordField();
    passwordField.setBounds(397, 203, 154, 20);
    frame.getContentPane().add(passwordField);
    
    JLabel lblNewLabel_2 = new JLabel("");
    Image img =new ImageIcon(this.getClass().getResource("/login.jpg")).getImage() ;
    lblNewLabel_2.setIcon(new ImageIcon(img)) ;
    lblNewLabel_2.setBounds(0, 0, 700, 500);
    frame.getContentPane().add(lblNewLabel_2);
  }
}
