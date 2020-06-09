/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import javax.swing.JTextField;


public class MeuTextfield extends JTextField implements Compenente {

    
    
    @Override
    public boolean ehvazio() {
        if (this.getText().length() > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean ehValido() {
        if (ehValido() && this.getText().length() > 3) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void ehEnabled(boolean status) {
      this.setEnabled(status);
    }

}
