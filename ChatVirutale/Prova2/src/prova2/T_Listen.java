/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samum
 */
public class T_Listen extends Thread {

    Condivisa c;
    Gestore_Packet gPacket;

    public T_Listen() throws SocketException, UnknownHostException {
        c = Condivisa.getInstance();
        gPacket = Gestore_Packet.GetInstance();
    }

    @Override
    public void run() {
        while (true) {
            try {
                byte[] buffer = new byte[1500];
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                c.serverRicezione.receive(packet);
                gPacket.execute(packet);
                // c.gPacket.add(packet);
                System.out.println("p ricevuto\n");
            } catch (IOException ex) {
                Logger.getLogger(T_Listen.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Thread.sleep(150);
            } catch (InterruptedException ex) {
                Logger.getLogger(T_Listen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
