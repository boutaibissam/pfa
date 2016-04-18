package controllers;

import java.sql.* ;

import javax.swing.*;

public class mysqlconnection {
  public static  Connection dbConnector() {
    String url="jdbc:mysql://localhost:3306/bib_multimedia" ;
    String user="root" ;
    String password="@2356890@";
    Connection conn=null ;
    
    try {
      Connection conn1=DriverManager.getConnection(url, user, password) ;
      JOptionPane.showMessageDialog(null, "connection succeded");
     conn=conn1 ;
    }
    catch(Exception e){
      JOptionPane.showConfirmDialog(null,e);
    }
    return conn;
    
  }
  public static void main(){
    dbConnector() ;
  }
  
}
