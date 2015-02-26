package es.us.eii.client;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Panel;

import es.us.eii.shared.Contact;

public class ViewList extends Composite {
	
	
	public ViewList(Map<String, String> params) {
		
		// Inicialización de la vista
		final HorizontalPanel mainPanel = new HorizontalPanel();
		initWidget(mainPanel);
		
		// Creamos la tabla y la fila de cabecera 
		final FlexTable agendaPanel = new FlexTable();
		agendaPanel.setBorderWidth(1);
		agendaPanel.setWidget(0,0, new Label("Name"));
		agendaPanel.setWidget(0,1, new Label("Telephone"));	
		agendaPanel.setWidget(0,2, new Label("Delete"));
		
		// Rellenamos con los contactos
		int i = 1; // LO HE CAMBIADO A 1
		for (Contact key: AISSPracticaAgenda.contactsSimple){
			final Contact keySearch = key;
			
			/** TODO: AÑADIR A LA TABLA NOMBRE Y TELÉFONO (ejercicio 1) */
			
			// MIO EJERCICIO 1
	
			agendaPanel.setWidget(i, 0,  new Label(key.getName()));
			agendaPanel.setWidget(i, 1,  new Label(key.getTelephone()));
		
			// FIN MIO
			
			// Botón para borrar
			Button deleteButton = new Button("Delete");
			
			deleteButton.addClickHandler(new ClickHandler() {
			      public void onClick(ClickEvent event) {
			        int indexRemoved = AISSPracticaAgenda.contactsSimple.indexOf(keySearch);
			        
			        /** TODO: ELIMINAR EL CONTACTO DE LA LISTA DE CONTACTOS Y ELIMINAR LA FILA DE LA TABLA */
			        
			        // MIO EJERCICIO 3
			        AISSPracticaAgenda.contactsSimple.remove(indexRemoved);
			        agendaPanel.removeRow(indexRemoved+1);
			      
			        
			        // FIN MIO
			      }
			    });		
			/** TODO: COLOCAR BOTÓN DE ELIMINAR EN LA ÚLTIMA CELDA DE LA FILA (ejercicio 1) */
			
			// MIO EJERCICIO 1
			agendaPanel.setWidget(i, 2, deleteButton);
			// FIN MIO
			
			i++;		    
		}

		// Añadir tabla al panel principal
		mainPanel.add(agendaPanel);
		
		// Botón para crear entrada 
		Button addButton = new Button("New");
		addButton.addClickHandler(new ClickHandler() {
		      public void onClick(ClickEvent event) {    	  
		    	  
		    	 /** TODO: ACTIVAR LA VISTA DE CREACIÓN DE CONTACTO (ejercicio 4) */ 
		    	  // MIO Ejercicio 4
		    	  AISSPracticaAgenda.go("create", new HashMap<String, String>());
		    	  // FIN MIO
		    	  
		      }
		    });
		/** TODO: COLOCAR EL BOTÓN DE CREAR EN EL PANEL  (ejercicio 1)*/	
		
		// MIO EJERCICIO 1
		mainPanel.add(addButton);
		// FIN MIO
	}
}
