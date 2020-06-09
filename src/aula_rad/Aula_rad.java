/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_rad;

import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;
import frames.TelaPrincipal;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author cristiano
 */
public class Aula_rad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        try {
            UIManager.setLookAndFeel(new SyntheticaPlainLookAndFeel());
            TelaPrincipal telaPrincipal = new TelaPrincipal();
            telaPrincipal.setVisible(true);
            telaPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        } catch (ParseException ex) {
            Logger.getLogger(Aula_rad.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
