/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_rad;

import frames.TelaPrincipal;
import javax.swing.JFrame;

/**
 *
 * @author cristiano
 */
public class Aula_rad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
        telaPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
}
