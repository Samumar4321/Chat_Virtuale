/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2;

import java.net.DatagramPacket;
import java.net.SocketException;

/**
 *
 * @author marelli_samuele
 */
public class Messaggio_Chiusura extends Messaggio {

    public Messaggio_Chiusura(DatagramPacket p) throws SocketException {
        super(p);
    }

    @Override
    public void execute() {
        c.connected = false;
    }

}
