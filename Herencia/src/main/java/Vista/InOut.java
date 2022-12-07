/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;

public class InOut {
    
    public String pedirString(String m){
        return JOptionPane.showInputDialog(m);
    }
    
   public int pedirEntero(String m){
        return Integer.parseInt(JOptionPane.showInputDialog(m));
    } 
    
   public double pedirDouble(String m){
        return  Double.parseDouble(JOptionPane.showInputDialog(m));
    } 
 
      
    public void mostrarRes(String m){
        JOptionPane.showMessageDialog(null, m);
    }
    
}
