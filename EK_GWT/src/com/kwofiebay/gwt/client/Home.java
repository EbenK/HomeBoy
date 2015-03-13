package com.kwofiebay.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class Home implements EntryPoint {

	private Button btn2;
	private Button btn;
	private int i =0;
	
	public void onModuleLoad() {
		
		btn2 = new Button("=(");
		btn = new Button("Click Me");
		btn.addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				if(i++ % 2 == 0)
				  btn2.setText("=)");
				else
					btn2.setText("=(");
				
			}});
		RootPanel.get().add(btn2);
		RootPanel.get().add(btn);
		};

}
