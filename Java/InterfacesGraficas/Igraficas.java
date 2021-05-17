
package com.mycompany.interfacesgraficas;

import javax.swing.*;
import java.awt.event.*;


public class Igraficas extends JFrame implements 
        ActionListener{
 
//   private JLabel label1;
//   private JLabel label2;
    
    JButton boton1;
    public Igraficas(){
    setLayout(null);
    boton1 = new JButton("Cerrar");
    boton1.setBounds(300,250,100,30);
    add(boton1);
    boton1.addActionListener(this);
    }
    public void actionPerfomed(ActionEvent e){
        if(e.getSource() == boton1){
            System.exit(0);
        }
    }

   
//   public Igraficas(){
//    setLayout(null);
//    label1 = new JLabel("Interfaz grafica");
//    label1.setBounds(10,20,300,30);
//    add(label1);
//    label2 = new JLabel("Version 1.0");
//    label2.setBounds(10,100,100,30);
//    add(label2);
    
            
//    label1= new JLabel("Alain Raimond");
//    label1.setBounds(10,20,200,300);
//    add(label1);

    public static void main(String[] args) {
        
    Igraficas ig1 = new Igraficas();
    ig1.setBounds(0,0,450,350);
    ig1.setVisible(true);
    ig1.setResizable(false);
    ig1.setLocationRelativeTo(null);
        
//        Igraficas label1 = new Igraficas();
//        label1.setBounds(100,100,800,650);
//        label1.setVisible(true);
//        label1.setLocationRelativeTo(null);
//        label1.setResizable(false);
//        
        
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
