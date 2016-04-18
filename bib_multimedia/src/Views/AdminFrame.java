package Views;



import java.awt.*;
import javax.swing.*;
import java.awt.Panel;
import java.awt.event.*;


public class AdminFrame extends JFrame {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          AdminFrame frame = new AdminFrame();
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
  public AdminFrame() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(150, 40, 920, 650);
    
    JMenuBar menuBar = new JMenuBar();
    setJMenuBar(menuBar);
    
    JMenu mnFichier = new JMenu("Fichier");
    menuBar.add(mnFichier);
    
    JMenu mnEditer = new JMenu("Editer");
    menuBar.add(mnEditer);
    
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
    panel.setBackground(Color.BLUE);
    
    JTextPane txtpnCetEspaceDe = new JTextPane();
    txtpnCetEspaceDe.setText("     Cet espace de travail, est r\u00E9s\u00E9rv\u00E9 aux administrateurs du systeme permet de parametrer le d\u00E9ploiment  de 'appication ");
    txtpnCetEspaceDe.setBounds(10, 26, 195, 99);
    panel.add(txtpnCetEspaceDe);
    
    JTextPane textPane_1 = new JTextPane();
    textPane_1.setBounds(10, 202, 195, 267);
    panel.add(textPane_1);
    
    JButton btnNewButton = new JButton("New button");
    Image img =new ImageIcon(this.getClass().getResource("/gerant.jpg")).getImage() ;
    btnNewButton.setIcon(new ImageIcon(img)) ;
    btnNewButton.addActionListener(new ActionListener() {          
      public void actionPerformed(ActionEvent arg0) {
        
      }
    });
    btnNewButton.setBounds(244, 61, 130, 130);
    getContentPane().add(btnNewButton);
    
    JButton button = new JButton("New button");
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      }
    });
    Image img2 =new ImageIcon(this.getClass().getResource("/annonce.png")).getImage() ;
    button.setIcon(new ImageIcon(img2)) ;
    button.setBounds(624, 61,130, 130);
    getContentPane().add(button);
    
    JButton button_1 = new JButton("New button");
    Image img3 =new ImageIcon(this.getClass().getResource("/profil.jpg")).getImage() ;
    button_1.setIcon(new ImageIcon(img3)) ;
    button_1.setBounds(244, 412,130, 130);
    getContentPane().add(button_1);
    
    JButton button_2 = new JButton("New button");
    Image img4 =new ImageIcon(this.getClass().getResource("/rapports.png")).getImage() ;
    button_2.setIcon(new ImageIcon(img4)) ;
    button_2.setBounds(636, 412, 130, 130);
    getContentPane().add(button_2);
    
    JLabel lblAdministrateur = new JLabel("     Administrateur");
    lblAdministrateur.setFont(new Font("Tahoma", Font.BOLD, 13));
    lblAdministrateur.setBounds(234, 23, 147, 23);
    getContentPane().add(lblAdministrateur);
    
    JLabel lblNewLabel = new JLabel(" gestion des gerants et des droits");
    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblNewLabel.setBounds(245, 374, 297, 23);
    getContentPane().add(lblNewLabel);
    
    JLabel lblAcce = new JLabel("Acc\u00E8s");
    lblAcce.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
    lblAcce.setBounds(776, 62, 102, 23);
    getContentPane().add(lblAcce);
    
    JTextPane txtpnAnnoncesAuxUtilistaeurs = new JTextPane();
    txtpnAnnoncesAuxUtilistaeurs.setText("annonces aux utilistaeurs");
    txtpnAnnoncesAuxUtilistaeurs.setBounds(764, 96, 102, 81);
    getContentPane().add(txtpnAnnoncesAuxUtilistaeurs);
    
    JLabel lblProfils = new JLabel("profils ");
    lblProfils.setFont(new Font("Tahoma", Font.BOLD, 11));
    lblProfils.setBounds(384, 412, 71, 23);
    getContentPane().add(lblProfils);
    
    JLabel lblMotDePasse = new JLabel("mot de passe ");
    lblMotDePasse.setFont(new Font("Tahoma", Font.BOLD, 11));
    lblMotDePasse.setBounds(384, 61, 84, 24);
    getContentPane().add(lblMotDePasse);
    
    JTextPane txtpnChangerLeMot = new JTextPane();
    txtpnChangerLeMot.setText("changer le mot de passe de l'administrateur ");
    txtpnChangerLeMot.setBounds(384, 84, 112, 93);
    getContentPane().add(txtpnChangerLeMot);
    
    JTextPane txtpnGestionDesUtiisateurs = new JTextPane();
    txtpnGestionDesUtiisateurs.setText("voire les profils des utilisateurs de l'appications");
    txtpnGestionDesUtiisateurs.setBounds(384, 442, 102, 81);
    getContentPane().add(txtpnGestionDesUtiisateurs);
    
    JTextPane txtpnGestionDesUtiisateurs_1 = new JTextPane();
    txtpnGestionDesUtiisateurs_1.setText("gestion des utiisateurs de l applications");
    txtpnGestionDesUtiisateurs_1.setBounds(776, 442, 102, 81);
    getContentPane().add(txtpnGestionDesUtiisateurs_1);
    
    JLabel lblUtilisateurs = new JLabel("utilisateurs");
    lblUtilisateurs.setFont(new Font("Tahoma", Font.BOLD, 11));
    lblUtilisateurs.setBounds(776, 408, 71, 23);
    getContentPane().add(lblUtilisateurs);
    
    JLabel lblNewLabel_1 = new JLabel("configuration");
    lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
    lblNewLabel_1.setBounds(382, 227, 86, 14);
    getContentPane().add(lblNewLabel_1);
    
    JButton btnNewButton_1 = new JButton("New button");
    Image img5 =new ImageIcon(this.getClass().getResource("/config.png")).getImage() ;
    btnNewButton_1.setIcon(new ImageIcon(img5)) ;
    btnNewButton_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      }
    });
    btnNewButton_1.setBounds(244, 227, 130, 130);
    getContentPane().add(btnNewButton_1);
    
    JTextPane textPane = new JTextPane();
    textPane.setText("changer le mot de passe de l'administrateur ");
    textPane.setBounds(384, 253, 112, 93);
    getContentPane().add(textPane);
  }
}
