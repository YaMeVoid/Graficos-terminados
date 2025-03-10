/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;


/**
 *
 * @author soryl
 */
public class Graficos1 extends JFrame {
    
    private JLabel result;
    private JLabel label1;
    private JLabel label2;
    private JLabel labelresta;
    private JTextField dato1;
    private JTextField dato2;
    private JButton btnsumar;
    private JButton btnrestar;
    private JButton btnmultiplicacion;
    private JButton btndivisiom;
    
    public Graficos1() {
        setTitle("Operaciones Básicas"); //titulo de la ventana
             // alto ancho
        setSize(550, 300); //tamaño de ventana
        setLocationRelativeTo(null); //centrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // funcion terminar la ejecución al cerrar la ventana
        //componenetes
        result = new JLabel("Resultado");
        label1 = new JLabel("Valor 1");
        label2 = new JLabel("Valor 2");
        labelresta = new JLabel("Valor 1");
                
        dato1 = new JTextField(5);
        dato2 = new JTextField(5);
        btnsumar = new JButton("Sumar");
        btnrestar = new JButton("Restar");
        btnmultiplicacion = new JButton("Multiplicacion");
        btndivisiom = new JButton("Division");
    }
    
    public void Componentes(Graficos1 ventana){
                 
        ventana.add(label1);
        ventana.add(dato1);
        ventana.add(label2);
        ventana.add(dato2);
        ventana.add(btnsumar);      
        ventana.add(result);
        ventana.add(btnrestar);      
        ventana.add(btnmultiplicacion);
        ventana.add(btndivisiom);

        btnsumar.addActionListener(new java.awt.event.ActionListener() { //tipo de evento, al dar click en el componente 
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) { // metodo del evento
                btnsumarActionPerformed(evt);
                btnmultiplicacionActionPerformed(evt);
                btndivisiomActionPerformed(evt);
            }
        });   
        
        btnsumar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() { // tipo de evento, al posicionar el maouse sobre el componente
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) { // metodo del evento
                btnsumarActionPerformed2(evt);
            }
        });
         
        btnrestar.addActionListener(new java.awt.event.ActionListener() { //tipo de evento, al dar click en el componente 
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) { // metodo del evento
                btnrestarActionPerformed(evt);
            }
        });   
        
        btnrestar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() { // tipo de evento, al posicionar el maouse sobre el componente
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) { // metodo del evento
                btnrestarActionPerformed2(evt);
            }
        });
        
        btnmultiplicacion.addActionListener(new java.awt.event.ActionListener() { //tipo de evento, al dar click en el componente 
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) { // metodo del evento
               btnmultiplicacionActionPerformed(evt);
            }
        });   
        
        btnmultiplicacion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() { // tipo de evento, al posicionar el maouse sobre el componente
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) { // metodo del evento
                 btnmultiplicacionActionPerformed2(evt);
            }
        });
          btndivisiom.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() { // tipo de evento, al posicionar el maouse sobre el componente
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) { // metodo del evento
                  btndivisiomActionPerformed2(evt);
            }
        });
           btndivisiom.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() { // tipo de evento, al posicionar el maouse sobre el componente
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) { // metodo del evento
                  btndivisiomActionPerformed2(evt);
            }
        });
    }
    
    private void btnsumarActionPerformed(ActionEvent evt) {
        int v1 = Integer.parseInt(dato1.getText()); 
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1+v2;
        result.setText("Resultado: " + re);
    }
    
    private void btnsumarActionPerformed2(MouseEvent evt) {
        int v1 = Integer.parseInt(dato1.getText()); 
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1+v2;
        result.setText("Resultado Mouse: " + re);
    }
    
     private void btnrestarActionPerformed(ActionEvent evt) {
        int v1 = Integer.parseInt(dato1.getText());
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1-v2;
        result.setText("Resultado: " + re);
    }
    
    private void btnrestarActionPerformed2(MouseEvent evt){
        int v1 = Integer.parseInt(dato1.getText());
         int v2 = Integer.parseInt(dato2.getText());
         int re = v1-v2;
         result.setText("Resultado de la resta: "+re);
    
    }
    private void btnmultiplicacionActionPerformed2(MouseEvent evt){
        int v1 = Integer.parseInt(dato1.getText());
         int v2 = Integer.parseInt(dato2.getText());
         int re = v1*v2;
         result.setText("Resultado de la multiplicacion: "+re);
    
    }
    
    private void btnmultiplicacionActionPerformed(ActionEvent evt) {
        int v1 = Integer.parseInt(dato1.getText());
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1*v2;
        result.setText("Resultado de la multiplicacion: " + re);
    }
    
    private void btndivisiomActionPerformed2(MouseEvent evt){
        int v1 = Integer.parseInt(dato1.getText());
         int v2 = Integer.parseInt(dato2.getText());
         int re = v1/v2;
         result.setText("Resultado de la division: "+re);
    
    }
    
    private void btndivisiomActionPerformed(ActionEvent evt) {
        int v1 = Integer.parseInt(dato1.getText());
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1/v2;
        result.setText("Resultado de la division: " + re);
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        Graficos1 ventana = new Graficos1();
        ventana.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        ventana.setBackground(Color.yellow);
        ventana.Componentes(ventana); 
          
        ventana.setVisible(true); //activar la ventana 
            
       
    }
    
    
}




