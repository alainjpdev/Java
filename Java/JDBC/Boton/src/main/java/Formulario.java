import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
 private JButton nuevo, abrir, cerrar;
 private JLabel texto1,version;
 
 public Formulario(){
   setLayout(null);
   nuevo = new JButton("Nuevo");
   nuevo.setBounds(15,100,90,30);
   add(nuevo);
   nuevo.addActionListener(this);
   
   abrir = new JButton("Abrir");
   abrir.setBounds(110,100,90,30);
   add(abrir);
   abrir.addActionListener(this);

   cerrar = new JButton("Cerrar");
   cerrar.setBounds(205,100,90,30);
   add(cerrar);
   cerrar.addActionListener(this);

   texto1 = new JLabel("Bienvenido al programa de Axel.");
   texto1.setBounds(10,10,225,60);
   add(texto1);

   version = new JLabel("versión 1.0");
   version.setBounds(220,145,100,30);
   add(version);
  }

  public void actionPerformed(ActionEvent e){
    if (e.getSource() == nuevo){
      texto1.setText("creando nuevo archivo");
    } 
    if (e.getSource() == abrir){
      texto1.setText("Seleccione el archivo");
    }
    if (e.getSource() == cerrar){
      System.exit(0);
    }
  }
  
  public static void main (String args[]){
    Formulario formulario1 = new Formulario();
    formulario1.setBounds(0,0,315,250);
    formulario1.setVisible(true);
    formulario1.setResizable(false);
    formulario1.setLocationRelativeTo(null);
 }  
}