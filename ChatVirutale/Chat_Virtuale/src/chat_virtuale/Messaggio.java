/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chat_virtuale;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author samum
 */
public class Messaggio {

    DatagramPacket packet;
    int lastPort;
    InetAddress lastIP;
    Condivisa c;

    public Messaggio(DatagramPacket p) throws SocketException, UnknownHostException {
        packet = p;
        //lastPort = packet.getPort();
        lastPort = 12345;
        lastIP = packet.getAddress();
        this.c = Condivisa.getInstance();
    }

    public void execute() {

    }

    public void send(String str) throws IOException {
        byte[] buffer = str.getBytes();
        DatagramPacket pack = new DatagramPacket(buffer, buffer.length);
        pack.setAddress(lastIP);
        pack.setPort(lastPort);
        System.out.println("Dentro MESSAGGIO SEND\n");
        c.serverInvio.send(pack);
    }
}
