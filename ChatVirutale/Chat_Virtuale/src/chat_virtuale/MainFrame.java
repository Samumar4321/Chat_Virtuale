/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package chat_virtuale;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.colorchooser.AbstractColorChooserPanel;

/**
 *
 * @author samum
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    int port = 666;
    int y = 0;

    public MainFrame() throws SocketException, UnknownHostException {
        initComponents();
        this.getContentPane().setBackground(Color.gray);
        jScrollPane1.getViewport().setBackground(Color.gray);       
        Condivisa c = Condivisa.getInstance();
        c.setFrame(this);
        this.setTitle("CHAT_VIRTUALE");
        String s = (String) JOptionPane.showInputDialog(
                this,
                "Inserire l'username\n",
                "Login Dialog",
                JOptionPane.PLAIN_MESSAGE
        );
        c.nome = s;
        Insets ins = new Insets(3, 0, 0, 3);
        gc.insets = ins;
        System.out.println("NOME: " + s);
        panel.setLayout(new GridBagLayout());
        panel.setDoubleBuffered(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setToolTipText("");
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setDoubleBuffered(true);

        jButton1.setText("CONNETTI A:");
        jButton1.setToolTipText("");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jTextField1.setAutoscrolls(false);

        jTextArea1.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(jTextArea1);

        jButton2.setText("INVIA");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("END CHAT");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(34, 34, 34))
        );

        jScrollPane1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        String ipname = jTextField1.getText();
        if (!ipname.equals("")) {
            try {
                System.out.println("P inviato\n");
                Condivisa c = Condivisa.getInstance();
                c.mittente = true;
                // TODO add your handling code here:               
                String str = "a;" + c.nome + ";";
                byte[] buffer = str.getBytes();
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                InetAddress ip = InetAddress.getByName(ipname);
                Gestore_Packet gp = Gestore_Packet.GetInstance();
                gp.connectedIP = ip;
                packet.setAddress(ip);
                packet.setPort(port);
                Condivisa.getInstance().serverInvio.send(packet);
            } catch (SocketException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnknownHostException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

            String[] opt = {"OK", "ANNULLA"};
            int choice = JOptionPane.showOptionDialog(this, "Connessione...", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opt, opt[1]);

            if (choice == 1) {
                try {
                    Condivisa c = Condivisa.getInstance();
                    Gestore_Packet gp = Gestore_Packet.GetInstance();
                    c.mittente = false;
                    // TODO add your handling code here:               
                    String str = "n;" + c.nome + ";";
                    byte[] buffer = str.getBytes();
                    DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                    InetAddress ip = InetAddress.getByName(ipname);
                    gp.connectedIP = null;
                    packet.setAddress(ip);
                    packet.setPort(port);
                    Condivisa.getInstance().serverInvio.send(packet);
                } catch (SocketException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(this, "Connessione annullata...");
            }

        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try {
            // TODO add your handling code here:
            if (Condivisa.getInstance().connected && jTextArea1.getText() != "") {
                try {
                    System.out.println("MESSAGGIO INVIATO");
                    String ipname = Gestore_Packet.GetInstance().connectedIP.getHostName();
                    String str = "m;" + jTextArea1.getText() + ";";
                    byte[] buffer = str.getBytes();
                    DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                    InetAddress ip = InetAddress.getByName(ipname);
                    packet.setAddress(ip);
                    packet.setPort(port);
                    Condivisa.getInstance().serverInvio.send(packet);
                } catch (SocketException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                JTextArea text = new JTextArea(1, 17);
                Color c = new Color(0, 102, 51);
                text.setBackground(c);
                text.setForeground(Color.WHITE);
                Font f = new Font("Italic", Font.ITALIC, 15);
                text.setFont(f);
                text.setEditable(false);
                text.setLineWrap(true);
                text.setText(jTextArea1.getText());
                gc.gridx = 1;

                gc.gridy = y;
                y++;

                panel.add(text, gc);
                jScrollPane1.getViewport().add(panel);
            } else {
                JOptionPane.showMessageDialog(this, "Connettersi con un host");
            }
        } catch (SocketException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            if (Condivisa.getInstance().connected) {
                try {
                    Condivisa.getInstance().connected = false;
                    Gestore_Packet gp = Gestore_Packet.GetInstance();
                    System.out.println("MESSAGGIO CHIUSURA INVIATO");
                    String ipname = Gestore_Packet.GetInstance().connectedIP.getHostName();
                    String str = "c;";
                    byte[] buffer = str.getBytes();
                    DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                    InetAddress ip = InetAddress.getByName(ipname);
                    packet.setAddress(ip);
                    packet.setPort(port);
                    Condivisa.getInstance().serverInvio.send(packet);
                    gp.connectedIP = null;
                    panel = new JPanel();                  
                    panel.setLayout(new GridBagLayout());
                    panel.setDoubleBuffered(true);
                    jScrollPane1.getViewport().add(panel);
                    Condivisa.getInstance().nomeDestinatario = "";
                    jScrollPane1.setBorder(null);
                } catch (SocketException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Connettersi con un host");
            }
        } catch (SocketException | UnknownHostException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SocketException, InterruptedException, UnknownHostException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    new MainFrame().setVisible(true);
                } catch (SocketException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        Thread.sleep(1000);
        Condivisa cond = Condivisa.getInstance();
        T_Listen listen = new T_Listen();
        ThreadGrafica tg = new ThreadGrafica();
        tg.start();
        listen.start();

    }
    JPanel panel = new JPanel();
    GridBagConstraints gc = new GridBagConstraints();
    int i = 0;

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Condivisa c = null;
        try {
            c = Condivisa.getInstance();
        } catch (SocketException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (!c.messaggio.equals("")) {
            JTextArea text = new JTextArea(1, 17);
            Font f = new Font("Italic", Font.ITALIC, 15);
            text.setBackground(Color.DARK_GRAY);
            text.setForeground(Color.WHITE);
            text.setFont(f);
            text.setLineWrap(true);
            text.setText(c.messaggio);
            gc.gridx = 0;
            gc.gridy = y;
            y++;
            panel.add(text, gc);
            jScrollPane1.getViewport().add(panel);
            c.messaggio = "";
        }
        if (!c.nomeDestinatario.equals("")) {
            TitledBorder border = new TitledBorder(c.nomeDestinatario.toUpperCase());
            border.setTitleJustification(TitledBorder.CENTER);
            jScrollPane1.setBorder(border);
            this.revalidate();

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
