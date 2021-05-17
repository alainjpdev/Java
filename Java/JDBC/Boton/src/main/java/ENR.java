package com.mycompany.interfacesgraficas;

import javax.swing.*;
import java.awt.event.*;


public class ENR extends JFrame implements ActionListener{
  JLabel Lb1;
  JLabel Lb2;
  JLabel Lb3;
  JLabel Lb4;
  JLabel Lb5;
  JButton Btn1;
  public ENR(){
   setLayout(null);
   Lb1 = new JLabel("*ABRE YOUTUBE* ");
   Lb1.setBounds(50,10,300,50);
   add(Lb1);
   Lb2 = new JLabel("*BUSCA EL CANAL DE ERNESTO*");
   Lb2.setBounds(50,40,300,50);
   add(Lb2);
   Lb3 = new JLabel("*TUTORIALES DE ANDROID CAPITULO 27*");
   Lb3.setBounds(50,70,1000,50);
   add(Lb3);
   Lb4 = new JLabel("*ENTIENDE TODO EL VIDEO*");
   Lb4.setBounds(50,100,300,50);
   add(Lb4);
   Lb5 = new JLabel("*REALIZA UN PROGRAMA EN HONOR A ERNESTO*");
   Lb5.setBounds(50,130,300,50);
   add(Lb5);
   Btn1 = new JButton("FELICIDAD");
   Btn1.setBounds(330,200,120,30);
   add(Btn1);
   Btn1.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e){
  if(e.getSource() == Btn1){
    System.exit(0);
  }
 }
  public static void main(String args[]){

   ENR Frm1 = new ENR();
   Frm1.setBounds(0,0,500,300);
   Frm1.setVisible(true);
   Frm1.setResizable(false);
   Frm1.setLocationRelativeTo(null);
 }
}