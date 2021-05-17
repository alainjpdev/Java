
package com.mycompany.interfacesgraficas;

import javax.swing.*;
import java.awt.event.*;


public class Igraficas extends JFrame implements ActionListener{
 
   private JLabel label1;
   private JLabel label2;
   
   
   public Igraficas(){
    setLayout(null);
    label1 = new JLabel("Interfaz grafica");
    label1.setBounds(10,20,300,30);
    add(label1);
    label2 = new JLabel("Version 1.0");
    label2.setBounds(10,100,100,30);
    add(label2);
    
            
//    label1= new JLabel("Alain Raimond");
//    label1.setBounds(10,20,200,300);
//    add(label1);
   }
    public static void main(String[] args) {
        
        
        Igraficas label1 = new Igraficas();
        label1.setBounds(100,100,800,650);
        label1.setVisible(true);
        label1.setLocationRelativeTo(null);
        label1.setResizable(false);
        
        
//        Igraficas igraficas1 = new Igraficas();
//        igraficas1.setBounds(100,100,800,650);
//        igraficas1.setVisible(true);
//        igraficas1.setLocationRelativeTo(null);
//        igraficas1.setResizable(false);
        
//        Igraficas igraficas1 = new Igraficas();
//        igraficas1.setBounds(0,0,400,300);
//        igraficas1.setVisible(true);
//        igraficas1.setLocationRelativeTo(null);
        
        
    }
}
