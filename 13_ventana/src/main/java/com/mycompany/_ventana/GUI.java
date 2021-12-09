/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ventana;

/**
 *
 * @author tosh
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GUI implements ActionListener{
   
    private static JLabel userLabel;
    private static JLabel appat;
    private static JLabel appmat;
    private static JTextField userText;
    private static JTextField texto2;
    private static JTextField texto3;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;
    
    public static void main(String[]args){
    JFrame frame=new JFrame();
    JPanel panel=new JPanel();
    frame.setSize(400,235);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.add(panel);
    
    //Usuario(Nombre)
    panel.setLayout(null);
    
     userLabel=new JLabel("Nombre");
    userLabel.setBounds(10,10,80,25);
    panel.add(userLabel);
    
     userText=new JTextField(20);
    userText.setBounds(100,10,165,25);
    panel.add(userText);

    //Apellido Paterno
    appat = new JLabel("Apellido Paterno");
    appat.setBounds(10,40,80,25);
    panel.add(appat);
     
    texto2 =new JTextField(20);
    texto2.setBounds(100,40,165,25);
    panel.add(texto2);
    
    //Apellido Materno
    appmat = new JLabel("Apellido Materno");
    appmat.setBounds(10,70,80,25);
    panel.add(appmat);
     
    texto3 =new JTextField(20);
    texto3.setBounds(100,70,165,25);
    panel.add(texto3);
    
    //Contraseña
     passwordLabel=new JLabel("Contraseña");
    passwordLabel.setBounds(10,100,80,25);
    panel.add(passwordLabel);
    
     passwordText=new JPasswordField();
    passwordText.setBounds(100,100,165,25);
    panel.add(passwordText);
    
    
     button = new JButton("Registro");
    button.setBounds(10,150,80,25);
    button.addActionListener(new GUI());
    panel.add(button);
    
     success=new JLabel(" ");
    success.setBounds(10,150,300,25);
    panel.add(success);
    frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String user=userText.getText();
       String apellido=texto2.getText();
       String apellidoMat=texto3.getText();
       String password=passwordText.getText();
       System.out.println(user+", "+password);
       
       //if(user.equals("Jannet")&&password.equals("utc2023")){
       JFrame ventana2 =new JFrame();
       JPanel panel = new JPanel();
       ventana2.setSize(350,200);
       ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ventana2.add(panel);
       
       //exitoso=new JLabel("");
       //exitoso.setBounds(10,110,300,25);
       //panel.add(exitoso);
       
       ventana2.setVisible(true);
       ventana2.setLocation(465,300);
       JLabel datos=new JLabel("Bienvenido"+user+" "+apellido+" "+apellidoMat);
       datos.setBounds(10,10,80,25);
       panel.add(datos);
       //exitoso.setText("Bienvenido"+user);
       }
    
    }