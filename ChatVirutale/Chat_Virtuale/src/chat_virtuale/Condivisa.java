/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chat_virtuale;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.swing.JFrame;

/**
 *
 * @author samum
 */
public class Condivisa {

    //Gestore_Packet gPacket;
    DatagramSocket serverRicezione;
    String nome;
    String nomeDestinatario;
    static Condivisa instance = null;
    boolean mittente;
    DatagramSocket serverInvio;
    JFrame frame;
    String messaggio = "";
    boolean connected = false;

    private Condivisa() throws SocketException, UnknownHostException {
        // gPacket = new Gestore_Packet();
        this.serverRicezione = new DatagramSocket(12345);
        serverInvio = new DatagramSocket();
        mittente = false;
        nomeDestinatario = "";
        nome = "Pluto";
    }

    public static Condivisa getInstance() throws SocketException, UnknownHostException {
        if (instance == null) {
            synchronized (Condivisa.class) {
                if (instance == null) {
                    instance = new Condivisa();
                }
            }
        }
        return instance;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public void setNomeDest() {

    }

    public boolean isMittente() {
        boolean temp = mittente;
        mittente = false;
        return temp;
    }

}
