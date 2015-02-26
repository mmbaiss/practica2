package es.us.eii.client;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.RootPanel;


import es.us.eii.shared.Contact;



/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class AISSPracticaAgenda implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
		/**
	 * This is the entry point method.
	 */
	
	public static List<Contact> contactsSimple;
	
	
	public void onModuleLoad() {
		initAgenda();
		go("init", new HashMap<String,String>());
	}
	
	
	public static void go(String token, Map<String,String> params){
		Panel p = RootPanel.get();
		if (token=="list" || token=="init"){
			p.clear();
			p.add(new ViewList(params));
		}else if (token=="create"){
			p.add(new ViewCreate(params));
		}
		
	}
	
	public void initAgenda(){
		contactsSimple = new ArrayList<Contact>();
		contactsSimple.add(new Contact("Antonio Manuel Gutierrez", "111111111"));
		contactsSimple.add(new Contact("Sergio Segura Rueda", "88888888"));
		contactsSimple.add(new Contact("Lionel Messi", "XXXXXXXX"));
		
	}
}
