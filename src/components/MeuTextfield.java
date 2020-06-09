/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import javax.swing.JTextField;
import javax.swing.border.Border;


public class MeuTextfield extends JTextField implements Componente {

    private String descricao ="Nome Campo";
            
    public MeuTextfield() {
          this.setBackground(new java.awt.Color(224, 224, 224));
            this.setBorder(javax.swing.BorderFactory.
                  createTitledBorder(null,descricao,
                          javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                          javax.swing.border.TitledBorder.ABOVE_TOP, 
                          new java.awt.Font("Dialog", 0, 11), java.awt.Color.black)); // NOI18N
    }
    
    public MeuTextfield(String descricao){
          this.setBackground(new java.awt.Color(224, 224, 224));
        setDescricao(descricao);
          this.setBorder(javax.swing.BorderFactory.
                  createTitledBorder(null,descricao,
                          javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                          javax.swing.border.TitledBorder.ABOVE_TOP, 
                          new java.awt.Font("Dialog", 0, 11), java.awt.Color.black)); // NOI18N
    }
    
    
    @Override
    public boolean ehvazio() {
        if (this.getText().length() > 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean ehValido() {
        if (!ehvazio() && this.getText().length() > 3) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void ehEnabled(boolean status) {
      this.setEnabled(status);
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void limpar() {
        this.setText("");
    }
    
    

}
