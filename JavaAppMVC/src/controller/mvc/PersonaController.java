/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.mvc.Persona;
import view.mvc.PersonaView;

/**
 *
 * @author ajuand
 */
public class PersonaController {
    
    private Persona persona;
    private PersonaView personaView;
    
    public PersonaController(Persona persona, PersonaView personaView) {
        this.persona = persona;
        this.personaView = personaView;
        
        personaView.getBoton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = personaView.getTexto();
                persona.setNombre(texto);
                System.out.println(persona.toString());
                personaView.mostrarTexto(persona.getNombre());
                
            }
        });
        
    }
    
}
