/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *
 * @author samum
 */
public class Messaggio {

    DatagramPacket packet;
    int lastPort;
    InetAddress lastIP;
    Condivisa c;

    public Messaggio(DatagramPacket p) throws SocketException {
        packet = p;
        //lastPort = packet.getPort();
        lastPort = 12345;
        lastIP = packet.getAddress();
        this.c = Condivisa.getInstance();
    }

    public void execute() {

    }
    public void send(DatagramPacket p) throws IOException
    {
        System.out.println("Dentro MESSAGGIO SEND\n");
        c.serverInvio.send(p);
    }
}
