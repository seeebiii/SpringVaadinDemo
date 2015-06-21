package de.sebastianhesse.springvaadindemo;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * Created by SebastianHesse on 21.06.2015.
 */
@SpringUI
@Theme("valo")
class MySpringUI extends UI {

    @Override
    protected void init(final VaadinRequest vaadinRequest) {
        VerticalLayout root = new VerticalLayout();
        Button button = new Button("Hello!!!");
        button.addClickListener(clickEvent -> Notification.show("Hello World."));
        root.addComponentAsFirst(button);
        root.setSizeFull();
        root.setMargin(true);
        root.setSpacing(true);
        this.setContent(root);
    }
}