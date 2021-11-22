/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chat_virtuale;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author samum
 */
public class Messaggio_Apertura extends Messaggio {

    String nomeMittente;
    String[] opt = {"SI", "NO"};

    public Messaggio_Apertura(DatagramPacket p) throws SocketException, UnknownHostException {
        super(p);
        nomeMittente = "";
    }

    @Override
    public void execute() {
        c.connected = true;
        System.out.println("DENTRO MESS_APER_EXEC");
        String[] csv = new String(packet.getData()).split(";");
        c.nomeDestinatario = csv[1];
        JOptionPane.showOptionDialog(c.frame, "Desideri accettare la connessione con: \n" + csv[1], null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opt, opt[1]);
        String str = ("y;" + c.nome + ";");
        try {
            send(str);
        } catch (IOException ex) {
            Logger.getLogger(Messaggio_Apertura.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("USCITO MESS_APER_EXEC\n");
    }

}
