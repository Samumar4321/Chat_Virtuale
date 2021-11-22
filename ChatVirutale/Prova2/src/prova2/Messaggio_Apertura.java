/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samum
 */
public class Messaggio_Apertura extends Messaggio {

    String nomeMittente;

    public Messaggio_Apertura(DatagramPacket p) throws SocketException {
        super(p);
        nomeMittente = "";
    }

    @Override
    public void execute() {
        System.out.println("DENTRO MESS_APER_EXEC");
        String[] csv = new String(packet.getData()).split(";");
        c.nomeDestinatario = csv[1];
        String str = ("y;" + c.nome + ";");
        byte[] buffer = str.getBytes();
        DatagramPacket pack = new DatagramPacket(buffer, buffer.length);
        pack.setAddress(lastIP);
        pack.setPort(lastPort);

        try {
            send(pack);
        } catch (IOException ex) {
            Logger.getLogger(Messaggio_Apertura.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("USCITO MESS_APER_EXEC\n");
    }

}
