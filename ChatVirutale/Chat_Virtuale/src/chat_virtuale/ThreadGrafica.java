/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chat_virtuale;

import java.awt.Frame;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author samum
 */
public class ThreadGrafica extends Thread {

    Condivisa c;
  

    public ThreadGrafica() throws SocketException, UnknownHostException {
        c = Condivisa.getInstance();
       
    }

    @Override
    public void run() {
        while (true) {
            c.frame.repaint();
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadGrafica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
