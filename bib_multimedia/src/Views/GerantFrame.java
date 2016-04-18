package Views;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class GerantFrame extends JFrame {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private JPanel contentPane;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          GerantFrame frame = new GerantFrame();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public GerantFrame() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(150, 40, 920, 650);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    contentPane.setLayout(new BorderLayout(0, 0));
    setContentPane(contentPane);
    setTitle("Espace gerant ") ;
    contentPane.setForeground(Color.yellow);
    contentPane.setBackground(Color.WHITE);
    contentPane.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,20));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(150, 40, 920, 650);
    
    JMenuBar menuBar = new JMenuBar();
    setJMenuBar(menuBar);
    
    JMenu mnFichier = new JMenu("Fichier");
    menuBar.add(mnFichier);
    
    JMenu mnEditer = new JMenu("Editer");
    menuBar.add(mnEditer);
    
    JMenu mnChercher = new JMenu("chercher");
    menuBar.add(mnChercher);
    
    JMenu mnApropos = new JMenu("Apropos");
    menuBar.add(mnApropos);
    
    JMenu mnAide = new JMenu("Aide");
    menuBar.add(mnAide);
    setTitle("espace adminstrateur") ;
    getContentPane().setLayout(null);
    
    Panel panel = new Panel();
    panel.setForeground(Color.GRAY);
    panel.setBounds(0, 0, 228, 590);
    panel.setBackground(Color.MAGENTA);
    getContentPane().add(panel);
    panel.setLayout(null);
    panel.setBackground(Color.PINK);
    
    JPanel panel_1 = new JPanel();
    panel_1.setBounds(10, 31, 193, 254);
    panel.add(panel_1);
    
    JPanel panel_2 = new JPanel();
    panel_2.setBounds(10, 317, 193, 238);
    panel.add(panel_2);
    
    JLabel lblInfos = new JLabel("infos ");
    lblInfos.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
    lblInfos.setBounds(20, 296, 46, 14);
    panel.add(lblInfos);
    
    JLabel lblFonctions = new JLabel("fonctions");
    lblFonctions.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
    lblFonctions.setBounds(10, 11, 76, 14);
    panel.add(lblFonctions);
    
  }
}
