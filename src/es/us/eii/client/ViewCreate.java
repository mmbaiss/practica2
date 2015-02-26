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
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

import es.us.eii.shared.Contact;
public class ViewCreate extends Composite{
 
	
	public ViewCreate(Map<String, String> params) {
		// Inicialización de la vista
		HorizontalPanel mainPanel = new HorizontalPanel();
		initWidget(mainPanel);
		
		final FlexTable agendaPanel = new FlexTable();		// Tabla para posicionar los controles
		final TextBox name = new TextBox();					// Campo de texto para el nombre
		final TextBox telephone = new TextBox();			// Campo de texto para el telefono
		
		
		/** TODO: COLOCAR CONTROLES EN LA TABLA Y AÑADIR LA TABLA AL PANEL PRINCIPAL */ 
		
		// MIO EJERCICIO 4
		
		agendaPanel.setWidget(0, 0, new Label("Name"));
		agendaPanel.setWidget(0, 1, name);
		
		agendaPanel.setWidget(1, 0, new Label("Telephone"));
		agendaPanel.setWidget(1, 1, telephone);
		mainPanel.add(agendaPanel);
		// FIN MIO
		
		
		// Botón de guardar
		Button saveButton = new Button("Save");
		mainPanel.add(saveButton);
		
		saveButton.addClickHandler(new ClickHandler() {
		      public void onClick(ClickEvent event) {
		    	  /** TODO: AÑADIR CONTACTO A LA LISTA DE CONTACTOS Y VOLVER A LA VISTA DE LISTA DE CONTACTOS */
		    	
		    	  
		    	  // MIO EJERCICIO 4
		    	  Contact nuevo = new Contact(name.getValue(), telephone.getValue());
		    	  AISSPracticaAgenda.contactsSimple.add(nuevo);
		    	  AISSPracticaAgenda.go("list", new HashMap<String, String>());
		    	  // FIN MIO EJERCICIO 4
		      }
		    });
				
	}

}
