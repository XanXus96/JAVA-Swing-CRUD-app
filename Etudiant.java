
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.coobird.thumbnailator.Thumbnails;
import net.proteanit.sql.DbUtils;





   





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cybarg
 */
public class Etudiant extends javax.swing.JFrame {

    
     Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    public Etudiant() {
        initComponents();
        
        conn= MysqlConnect.ConnectDB();
        jRadioButton1.setSelected(false);
        jRadioButton1.setVisible(false);
        update_table(null);
       btn_save.setEnabled(false);
       btn_update.setEnabled(false);
       btn_delete.setEnabled(false);
       btn_clear.setEnabled(false);
       jPanel3.setVisible(false);
        
      
}
    
    public void Clearfields(){
    txt_id.setText("");
    txt_nom.setText("");
    txt_prenom.setText("");
    txt_nappogee.setText("");
    jComboBox_niveau.setSelectedIndex(0);
    jComboBox_option.setSelectedIndex(0);
    jDateChooser1.setDate(null);
    jTextArea_Adresse.setText("");
    imagelabel.setIcon(null);
    txt_imagepath.setText("");
    
    jRadioButton_Homme.setSelected(false);
    jRadioButton_Femme.setSelected(false);
    jRadioButton1.setSelected(true);
    this.sexe = null;
    
  };
    
    
    private void update_table(String search){
        String sql;
        try {
         if(search==null) 
         {sql = "select * from etudiant"; }
         else 
         {sql = "select * from etudiant where Nom like '%"+search+"%' or Prenom like '%"+search+"%' or Sexe like '%"+search+"%' or Numero_Appogee like '%"+search+"%' or Niveau like '%"+search+"%' or Section like '%"+search+"%' or Filiere like '%"+search+"%' or Adresse like '%"+search+"%' or Date_de_Naissance like '%"+search+"%'";}
         pst=conn.prepareStatement(sql);
         rs=pst.executeQuery();
         Table_data.setModel(DbUtils.resultSetToTableModel(rs));
            
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        } finally{
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
            }
        
        
        }
    
    
    
    };

   
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_nom = new javax.swing.JTextField();
        txt_prenom = new javax.swing.JTextField();
        txt_nappogee = new javax.swing.JTextField();
        jRadioButton_Homme = new javax.swing.JRadioButton();
        jRadioButton_Femme = new javax.swing.JRadioButton();
        jComboBox_option = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Adresse = new javax.swing.JTextArea();
        btn_imageupload = new javax.swing.JButton();
        txt_imagepath = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        imagelabel = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jRadioButton1 = new javax.swing.JRadioButton();
        jComboBox_niveau = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btn_new = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btn_print = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_data = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nom");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Prenom");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Sexe");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("N°Appogee");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Niveau");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Section");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Date de naissance");

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));

        txt_nom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_nom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));

        txt_prenom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_prenom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));

        txt_nappogee.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_nappogee.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));

        jRadioButton_Homme.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton_Homme);
        jRadioButton_Homme.setText("Homme");
        jRadioButton_Homme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_HommeActionPerformed(evt);
            }
        });

        jRadioButton_Femme.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton_Femme);
        jRadioButton_Femme.setText("Femme");
        jRadioButton_Femme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_FemmeActionPerformed(evt);
            }
        });

        jComboBox_option.setFont(jComboBox_option.getFont().deriveFont(jComboBox_option.getFont().getStyle() | java.awt.Font.BOLD, jComboBox_option.getFont().getSize()+1));
        jComboBox_option.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Section A", "Section B" }));
        jComboBox_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_optionActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Adresse");

        jTextArea_Adresse.setColumns(20);
        jTextArea_Adresse.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Adresse);

        btn_imageupload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image upload.png"))); // NOI18N
        btn_imageupload.setText("Parcourir une image");
        btn_imageupload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imageuploadActionPerformed(evt);
            }
        });

        txt_imagepath.setEditable(false);

        jLabel10.setText("Chemin ");

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        imagelabel.setBackground(new java.awt.Color(255, 255, 255));
        imagelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagelabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));

        jDesktopPane1.setLayer(imagelabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagelabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagelabel, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );

        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("r3");

        jComboBox_niveau.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox_niveau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CP1", "CP2", "CI1", "CI2", "CI3" }));
        jComboBox_niveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_niveauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_nappogee, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jRadioButton_Homme, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jRadioButton_Femme, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(23, 23, 23))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox_option, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox_niveau, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(jRadioButton1)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 35, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(txt_imagepath, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(btn_imageupload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txt_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(jRadioButton1)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jRadioButton_Homme)
                                            .addComponent(jRadioButton_Femme))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_nappogee, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox_niveau, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox_option, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_imageupload, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_imagepath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setPreferredSize(new java.awt.Dimension(860, 48));

        btn_new.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new-icon.png"))); // NOI18N
        btn_new.setText("Nouveau");
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        btn_save.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save-icon.png"))); // NOI18N
        btn_save.setText("Enregister");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_update.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btn_update.setText("Editer");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btn_delete.setText("Supprimer");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btn_clear.setText("Vider");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        txt_search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_searchKeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("RECHERCHE");

        btn_print.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Printer-icon.png"))); // NOI18N
        btn_print.setText("Imprimer");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_new)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_clear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_print)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addComponent(btn_save, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_update, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_new, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jPanel4.add(jPanel5);

        Table_data.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        Table_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table_data.setGridColor(new java.awt.Color(0, 204, 255));
        Table_data.setSelectionBackground(new java.awt.Color(102, 102, 102));
        Table_data.setSelectionForeground(new java.awt.Color(102, 255, 255));
        Table_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_dataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Table_data);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_imageuploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imageuploadActionPerformed
      
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        txt_imagepath.setText(filename);
        
        try {
            
            File image =new File(filename);
            
            BufferedImage thumbanail = Thumbnails.of(image).size(220, 230).asBufferedImage();
            
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            
            ImageIO.write(thumbanail, "jpeg", os);
            
            InputStream is = new ByteArrayInputStream(os.toByteArray());
            
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            
            byte[] buf = new byte[1024];  // 1 MB
            
            for(int readNum;(readNum = is.read(buf))!=-1;){
            
            bos.write(buf,0,readNum);
            
            
            }
            
            viewimage=new ImageIcon(thumbanail);
            imagelabel.setIcon(viewimage);
            
            
            etudiantimage=bos.toByteArray();
            
           
             
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
        
        
    }//GEN-LAST:event_btn_imageuploadActionPerformed

    private void jRadioButton_HommeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_HommeActionPerformed
     sexe="Homme" ; 
    }//GEN-LAST:event_jRadioButton_HommeActionPerformed

    private void jRadioButton_FemmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_FemmeActionPerformed
       sexe="Femme";
    }//GEN-LAST:event_jRadioButton_FemmeActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
       String nom_validate = txt_nom.getText();
       
       String prenom_validate =txt_prenom.getText();
         
       String nappogee_validate =txt_nappogee.getText();
         
        java.util.Date dte = jDateChooser1.getDate();
         
         String address_validate =jTextArea_Adresse.getText();
         
         if(nom_validate.equals("")){
         
             JOptionPane.showMessageDialog(null, "VEUILLEZ ENTRER UN NOM");
             
         }
         else if(prenom_validate.equals("")){
         
          JOptionPane.showMessageDialog(null, "VEUILLEZ ENTRER UN PRENOM");
         }
         else if(!nom_validate.matches("[a-zA-Z ]*") || !prenom_validate.matches("[a-zA-Z ]*")){
         
          JOptionPane.showMessageDialog(null, "VEUILLEZ ENTRER UN NOM|PRENOM VALIDE");
         
         }
         
         else if(nappogee_validate.equals("")){
         
         JOptionPane.showMessageDialog(null, "VEUILLEZ ENTRER UN NUMERO APPOGEE");
         
         }
         else if(!nappogee_validate.matches("[0-9]{8}")){
         
          JOptionPane.showMessageDialog(null, "VEUILLEZ ENTRER UN NUMERO APPOGEE VALIDE");
         
         }
         else if(sexe==null){
         
         JOptionPane.showMessageDialog(null, "VEUILLEZ CHOISIR UN SEXE");
         
         
         }
         else if(jComboBox_niveau.getSelectedItem()==null){
         JOptionPane.showMessageDialog(null, "VEUILLEZ CHOISIR UN NIVEAU"); 
         
         }
         else if(jComboBox_option.getSelectedItem()==null){
         JOptionPane.showMessageDialog(null, "VEUILLEZ CHOISIR UNE SECTION OU FILIERE"); 
         
         }
         else if(dte==null){
          JOptionPane.showMessageDialog(null, "VEUILLEZ CHOISIR UNE DATE"); 
         
         }
         else if(address_validate.equals("")){
          JOptionPane.showMessageDialog(null, "VEUILLEZ ENTRER UNE ADRESSE"); 
         
         
         }
         else if(etudiantimage==null){
         JOptionPane.showMessageDialog(null, "VEUILLEZ CHOISIR UNE IMAGE"); 
         
         }else{
         
        
        
        try {
            String sql = "insert into etudiant (Nom,Prenom,Sexe,Numero_Appogee,Niveau,Section,Filiere,Date_de_Naissance,Adresse,EtuImage)values(?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            
            pst.setString(1, txt_nom.getText());
            pst.setString(2, txt_prenom.getText());
            pst.setString(3, sexe);
            pst.setString(4, txt_nappogee.getText());
            
            String niveau = jComboBox_niveau.getSelectedItem().toString();
            pst.setString(5, niveau);
            
            String option = jComboBox_option.getSelectedItem().toString();
            if (jLabel7.getText().equals("Section")){
                pst.setString(6, option);
                pst.setString(7, null);
            }
            else {
                pst.setString(6, null);
                pst.setString(7, option);
            }
            
               
            java.util.Date date = jDateChooser1.getDate();
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
            String strDateOutput = sdf.format(date);
            
            pst.setString(8, strDateOutput);
            pst.setString(9, jTextArea_Adresse.getText());
            pst.setBytes(10,etudiantimage);
      
            pst.execute();
      
            JOptionPane.showMessageDialog(null, "ENREGISTREMENT DE DONNEES REUSSI");
            jPanel3.setVisible(false);
      
            
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
      
            
            
        }finally{
            try {
             rs.close();
             pst.close();
                
                
            } catch (Exception e) {
                
                
            }
        
        
        
        }
    
       
         }//end else here   
         update_table(null);
         Clearfields();
         btn_save.setEnabled(false);
        btn_new.setEnabled(true);
        btn_update.setEnabled(false);
        btn_delete.setEnabled(false);
        btn_clear.setEnabled(false);
         
         
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
       jPanel3.setVisible(true);
        Clearfields();
         btn_save.setEnabled(true);
        btn_new.setEnabled(false);
        btn_update.setEnabled(false);
        btn_delete.setEnabled(false);
        btn_clear.setEnabled(true);
    }//GEN-LAST:event_btn_newActionPerformed

    private void Table_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_dataMouseClicked
       jPanel3.setVisible(true);
        int row = Table_data.getSelectedRow();
       String Table_click=(Table_data.getModel().getValueAt(row, 0).toString());
       
        try {
         String sql = "select * from etudiant where ID='"+Table_click+"'";   
         pst=conn.prepareStatement(sql);
         rs=pst.executeQuery();
         
         if(rs.next()){
         String id = rs.getString("ID");
         txt_id.setText(id);
         
         String nom = rs.getString("Nom");
         txt_nom.setText(nom);
         
         String sexe = rs.getString("Sexe");
         if("Homme".equals(sexe)){
            jRadioButton_Homme.setSelected(true);
            this.sexe = "Homme";
         }
         
         if("Femme".equals(sexe)){
            jRadioButton_Femme.setSelected(true);
            jRadioButton_Homme.setSelected(true);
            this.sexe = "Femme";
         }
         
         String prenom = rs.getString("Prenom");
         txt_prenom.setText(prenom);
         
         String nappogee = rs.getString("Numero_Appogee");
         txt_nappogee.setText(nappogee);
         
         String niveau = rs.getString("Niveau");
         jComboBox_niveau.setSelectedItem(niveau);
         
         String option = rs.getString("Section");
         if (option == null) option = rs.getString("Filiere");
         jComboBox_option.setSelectedItem(option);
         
         
         String dateval = rs.getString("Date_de_Naissance");
         java.util.Date date=new SimpleDateFormat("yyyy-MM-dd").parse(dateval);
         jDateChooser1.setDate(date);

         String straddress = rs.getString("Adresse");
         jTextArea_Adresse.setText(straddress);


         byte[] imagedata = rs.getBytes("EtuImage");
         formate=new ImageIcon(imagedata);
         imagelabel.setIcon(formate);
         etudiantimage=imagedata;



         
         
         
         
         }// end if rs.next() method here
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
            }
        
        
        
        }
        
        btn_save.setEnabled(false);
        btn_new.setEnabled(true);
        btn_update.setEnabled(true);
        btn_delete.setEnabled(true);
        btn_clear.setEnabled(true);
        
    }//GEN-LAST:event_Table_dataMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        String nom_validate = txt_nom.getText();
       
       String prenom_validate =txt_prenom.getText();
         
       String nappogee_validate =txt_nappogee.getText();
         
        java.util.Date dte = jDateChooser1.getDate();
         
         String address_validate =jTextArea_Adresse.getText();
         
         if(nom_validate.equals("")){
         
             JOptionPane.showMessageDialog(null, "VEUILLEZ ENTRER UN NOM");
             
         }
         else if(prenom_validate.equals("")){
         
          JOptionPane.showMessageDialog(null, "VEUILLEZ ENTRER UN PRENOM");
         }
         else if(!nom_validate.matches("[a-zA-Z ]*") || !prenom_validate.matches("[a-zA-Z ]*")){
         
          JOptionPane.showMessageDialog(null, "VEUILLEZ ENTRER UN NOM|PRENOM VALIDE");
         
         }
         
         else if(nappogee_validate.equals("")){
         
         JOptionPane.showMessageDialog(null, "VEUILLEZ ENTRER UN NUMERO APPOGEE");
         
         }
         else if(!nappogee_validate.matches("[0-9]{8}")){
         
          JOptionPane.showMessageDialog(null, "VEUILLEZ ENTRER UN NUMERO APPOGEE VALIDE");
         
         }
         else if(sexe==null){
         
         JOptionPane.showMessageDialog(null, "VEUILLEZ CHOISIR UN SEXE");
         
         
         }
         else if(jComboBox_niveau.getSelectedItem()==null){
         JOptionPane.showMessageDialog(null, "VEUILLEZ CHOISIR UN NIVEAU"); 
         
         }
         else if(jComboBox_option.getSelectedItem()==null){
         JOptionPane.showMessageDialog(null, "VEUILLEZ CHOISIR UNE SECTION OU FILIERE"); 
         
         }
         else if(dte==null){
          JOptionPane.showMessageDialog(null, "VEUILLEZ CHOISIR UNE DATE"); 
         
         }
         else if(address_validate.equals("")){
          JOptionPane.showMessageDialog(null, "VEUILLEZ ENTRER UNE ADRESSE"); 
         
         
         }
         else if(etudiantimage==null){
         JOptionPane.showMessageDialog(null, "VEUILLEZ CHOISIR UNE IMAGE"); 
         
         }else{
        
        
        try {
          String sql = "update etudiant set Nom=?,Prenom=?,Sexe=?,Numero_Appogee=?,Niveau=?,Section=?,Filiere=?,Date_de_Naissance=?,Adresse=?,EtuImage=? where ID=?";  
         pst=conn.prepareStatement(sql);
         
         pst.setString(1, txt_nom.getText());
        pst.setString(2, txt_prenom.getText());
        pst.setString(3, sexe);
        pst.setString(4, txt_nappogee.getText());

        String niveau = jComboBox_niveau.getSelectedItem().toString();
        pst.setString(5, niveau);

        String option = jComboBox_option.getSelectedItem().toString();
        if (jLabel7.getText().equals("Section")){
            pst.setString(6, option);
            pst.setString(7, null);
        }
        else {
            pst.setString(6, null);
            pst.setString(7, option);
        }


        java.util.Date date = jDateChooser1.getDate();
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        String strDateOutput = sdf.format(date);

        pst.setString(8, strDateOutput);
        pst.setString(9, jTextArea_Adresse.getText());
        pst.setBytes(10,etudiantimage);
        pst.setString(11, txt_id.getText());
      
      pst.execute();
      
      JOptionPane.showMessageDialog(null, "EDITION REUSSITE");
      
         
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                rs.close();
                pst.close();
                jPanel3.setVisible(false);
            } catch (Exception e) {
            }
        
        
        }
        update_table(null);
         }
        
        
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
     
        if(txt_id.getText().equals("")){
        JOptionPane.showMessageDialog(null, "VEUILLEZ SELECTIONNER UNE DONNEE A SUPPRIMER");
        
        
        }else{
        int p = JOptionPane.showConfirmDialog(null, "ETES-VOUS SÛR DE VOULOIR SUPPRIMER LA DONNEE ?", "Supprimer", JOptionPane.YES_NO_OPTION);
        
        
        if(p==0){
        
            try {
         String sql = "delete from etudiant where ID=?"; 
         pst=conn.prepareStatement(sql);
         pst.setString(1, txt_id.getText());
         pst.execute();
         JOptionPane.showMessageDialog(null, "SUPPRESSION REUSSITE");
                
                
                
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, e);
            }finally{
                try {
                    rs.close();
                    pst.close();
                    jPanel3.setVisible(false);
                } catch (Exception e) {
                }
            
            
            }
        
        
        }//end if p=0
        
        
        
        }//end else
       Clearfields(); 
       update_table(null); 
        
        
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        Clearfields();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
       MessageFormat header = new MessageFormat("Rapport des étudiamts");
    
      MessageFormat footer = new MessageFormat("Page {0,number,integer}");
    
    try{
    
        Table_data.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        
    }catch(java.awt.print.PrinterException e){
    System.err.format("Impression échouée %s%n", e.getMessage());
    } 
    }//GEN-LAST:event_btn_printActionPerformed

    private void jComboBox_niveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_niveauActionPerformed
                if (jComboBox_niveau.getSelectedItem().toString().equals("CI1"))
                {
                    jLabel7.setText("Filière");
                    jComboBox_option.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GI", "GIND", "RST", "GE"}));
                }
                if (jComboBox_niveau.getSelectedItem().toString().equals("CI2"))
                {
                    jLabel7.setText("Filière");
                    jComboBox_option.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GI", "GIND", "RST", "GE-ER", "GE-SE"}));
                }
                if (jComboBox_niveau.getSelectedItem().toString().equals("CI3"))
                {
                    jLabel7.setText("Filière");
                    jComboBox_option.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GI-DL", "GI-SI", "GIND", "RST", "GE-ER", "GE-SE"}));
                }
                if (jComboBox_niveau.getSelectedItem().toString().equals("CP2") || jComboBox_niveau.getSelectedItem().toString().equals("CP2") )
                {
                    jLabel7.setText("Section");
                    jComboBox_option.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Section A", "Section B"}));
                }
                
    }//GEN-LAST:event_jComboBox_niveauActionPerformed

    private void jComboBox_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_optionActionPerformed
        
    }//GEN-LAST:event_jComboBox_optionActionPerformed

    private void txt_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyPressed

        String search = txt_search.getText();           
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)   
        {   if (search.equals(""))
                {update_table(null);}
            else 
                {update_table(search);}
        }
    }//GEN-LAST:event_txt_searchKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Etudiant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_data;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_imageupload;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel imagelabel;
    private javax.swing.JComboBox<String> jComboBox_niveau;
    private javax.swing.JComboBox jComboBox_option;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton_Femme;
    private javax.swing.JRadioButton jRadioButton_Homme;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea_Adresse;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_imagepath;
    private javax.swing.JTextField txt_nappogee;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_prenom;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
String filename = null;
private ImageIcon viewimage=null;
private ImageIcon formate=null;
private String sexe;
byte[] etudiantimage=null;



}
