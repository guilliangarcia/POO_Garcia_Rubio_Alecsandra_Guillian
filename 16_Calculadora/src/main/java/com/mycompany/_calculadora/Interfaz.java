package com.mycompany._calculadora;

/**
 *
 * @author Alecsandra
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Interfaz extends JFrame implements ActionListener {
    
    
    //definir los campo que son necesarios para interfaz
    JTextField txtnum1;
    JTextField txtnum2;
    //definir los botones
    JButton btnresta;
    JButton btnsuma;
    JButton btnproducto;
    JButton btndivision;
    //etiquetas
    JLabel numero1;
    JLabel numero2;
    JLabel resultado;
    JLabel mostrarresultado;
    //panel 
    JPanel panel = (JPanel)this.getContentPane();//contenedor de la interfaz
    
    Operaciones op = new Operaciones();
    
    //variables para las operaciones
    double num1, num2;
    
    //interfaz
    public Interfaz(){
        
        //aqui vamos a cargar con todo
        setLayout(null);
        //localizacion del panel
        setLocation(100, 80);
        //que no se pueda redimensionat
        setResizable(false);
        //definir el tamaño
        setSize(300, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //hay que cargas los componentes
        componentes();
    }
    

    private void componentes() {
     
        panel.setLayout(null);
        numero1 = new JLabel("Numero 1");
        numero1.setBounds(10, 10, 70, 30);
        panel.add(numero1);
        
        
        numero2 = new JLabel("Numero 2");
        numero2.setBounds(10, 70, 70, 30);
        panel.add(numero2);
        
        
        resultado = new JLabel("Resultado");
        resultado.setBounds(10, 140, 70, 30);
        panel.add(resultado);
        
        mostrarresultado = new JLabel("");
        mostrarresultado.setBounds(100, 140, 70, 30);
        panel.add(mostrarresultado);
        
        txtnum1 = new JTextField();
        txtnum1.setBounds(100, 10, 70, 30);
        panel.add(txtnum1);
        
        txtnum2 = new JTextField();
        txtnum2.setBounds(100, 70, 70, 30);
        panel.add(txtnum2);
        
        btnsuma = new JButton("+");
        btnsuma.setBounds(10, 200, 50, 50);
        panel.add(btnsuma);
        //mando a llamar a listener (accion)
        btnsuma.addActionListener(this);  //del metodo abstracto
        
        btnresta = new JButton("-");
        btnresta.setBounds(100, 200, 50, 50);
        panel.add(btnresta);
        //mando a llamar a listener (accion)
        btnresta.addActionListener(this);  //del metodo abstracto
        
        btnproducto = new JButton("*");
        btnproducto.setBounds(100, 270, 50, 50);
        panel.add(btnproducto);
        //mando a llamar a listener (accion)
        btnproducto.addActionListener(this);  //del metodo abstracto
        
        btndivision= new JButton("/");
        btndivision.setBounds(100, 270, 50, 50);
        panel.add(btndivision);
        //mando a llamar a listener (accion)
        btndivision.addActionListener(this);  //del metodo abstracto
        
        
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
     //aqui adentro se diferencian las acciones
     
     if(event.getSource()==btnsuma){
        //estoy asignandp a la variable num1
        //el valor del campo de texto txtnum1 y
        //lo estoy transformando a Double
        num1 = Double.parseDouble(txtnum1.getText());
        //enviar el valor
        op.setNum1(num1);
        
        num2 = Double.parseDouble(txtnum2.getText());
        
        op.getNum2();
        
        //debo mostrar el resultado
        mostrarresultado.setText(String.valueOf(op.suma()));
     }
     
     if(event.getSource()==btnresta){
        //estoy asignandp a la variable num1
        //el valor del campo de texto txtnum1 y
        //lo estoy transformando a Double
        num1 = Double.parseDouble(txtnum1.getText());
        //enviar el valor
        op.setNum1(num1);
        
        num2 = Double.parseDouble(txtnum2.getText());
        
        op.getNum2();
        
        //debo mostrar el resultado
        mostrarresultado.setText(String.valueOf(op.resta()));
      
     }
     
    }
    
    //los eventos son las acciones de los botones
    
}