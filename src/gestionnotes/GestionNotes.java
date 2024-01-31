/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionnotes;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author HP
 */
public class GestionNotes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    
//        new bienvenue().setVisible(true);
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        JFrame WelcomePage = new bienvenue();
                
        // Création d'un Timer qui se déclenchera après 5 secondes
        Timer timer;
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Fermeture de la fenêtre lorsque le timer se déclenche
                new Signin().setVisible(true);
                WelcomePage.dispose();
                ((Timer) e.getSource()).stop();
            }
        });

        // Démarrage du timer
        timer.start();


        WelcomePage.setVisible(true);
    }
    
}
