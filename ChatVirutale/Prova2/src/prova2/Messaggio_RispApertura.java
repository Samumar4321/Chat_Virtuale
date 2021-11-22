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
public class Messaggio_RispApertura extends Messaggio {

    String nomeDest;

    public Messaggio_RispApertura(DatagramPacket p) throws SocketException {
        super(p);
    }

    @Override
    public void execute() {
        System.out.println("DENTRO MESS_RISP_APER_EXEC");
        String[] csv = new String(packet.getData()).split(";");
        String risp = csv[0];
        if (risp.equals("y") && c.isMittente()) {
            c.nomeDestinatario = csv[1];
            byte[] buffer = "y;".getBytes();
            DatagramPacket pack = new DatagramPacket(buffer, buffer.length);
            pack.setAddress(lastIP);
            pack.setPort(lastPort);
            try {
                send(pack);
            } catch (IOException ex) {
                Logger.getLogger(Messaggio_RispApertura.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (risp.equals("y")) {

        } else if (risp.equals("n")) {

        }

        System.out.println("USCITO MESS_RISP_APER_EXEC\n");
    }

}
