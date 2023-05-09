/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.mvc;

import javax.swing.*;

/**
 *
 * @author ajuand
 */
public class PersonaView {

    private JFrame ventana;
    private JLabel labelNombre,labelEdad,labelPeso;
    private JTextField textNombre,textEdad,textPeso;
    private JButton boton;

    public PersonaView() {
        ventana = new JFrame("Programa Persona");
        labelNombre = new JLabel("Nombre:");
        textNombre = new JTextField(20);
        
        labelEdad = new JLabel("Edad:");
        textEdad = new JTextField(10);
        
        labelPeso = new JLabel("Peso:");
        textPeso = new JTextField(10);
        
        
        boton = new JButton("Aceptar");

        JPanel panel = new JPanel();
        
        panel.add(labelNombre);
        panel.add(textNombre);
        
        panel.add(labelEdad);
        panel.add(textEdad);
        
        panel.add(labelPeso);
        panel.add(textPeso);
        
        panel.add(boton);

        ventana.add(panel);
        ventana.pack();
        ventana.setVisible(true);

    }
    
    public String getTexto(){
        return textNombre.getText();
    }
    
    public void mostrarTexto(String texto){
        JOptionPane.showMessageDialog(ventana,texto);
    }
    
    public JButton getBoton(){
        return boton;
    }
    

}
