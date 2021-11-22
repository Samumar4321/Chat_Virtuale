/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova2;

import java.net.DatagramSocket;
import java.net.SocketException;
import javax.swing.JFrame;

/**
 *
 * @author samum
 */
public class Condivisa {

    DatagramSocket serverRicezione;
    String nome;
    String nomeDestinatario;
    static Condivisa instance = null;
    boolean mittente;
    DatagramSocket serverInvio;
    JFrame frame;
    String messaggio = "";
    boolean connected = false;

    private Condivisa() throws SocketException {
        this.serverRicezione = new DatagramSocket(666);
        serverInvio = new DatagramSocket();
        mittente = false;
        nomeDestinatario = "";
        nome = "Pippo";
    }

    public static Condivisa getInstance() throws SocketException {
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
