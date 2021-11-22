/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chat_virtuale;

import java.net.DatagramPacket;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author samum
 */
public class Messaggio_Testo extends Messaggio {

    String messaggio;

    public Messaggio_Testo(DatagramPacket p) throws SocketException, UnknownHostException {
        super(p);
        messaggio = "";
    }

    @Override
    public void execute() {
        String[] csv = new String(packet.getData()).split(";");
        messaggio = csv[1];
        c.messaggio = messaggio;
    }

}
