package com.salah;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class MyFirstTemplate extends WebPage {
    private Component headerPanel;
    private Component menuPanel;
    private Component footerPanel;

    public MyFirstTemplate(){
        add(headerPanel = new HeaderPanel("headerPanel"));
        add(menuPanel = new MenuPanel("menuPanel"));
        add(footerPanel = new FooterPanel("footerPanel"));
    }


    public Component getHeaderPanel() {
        return headerPanel;
    }

    public Component getMenuPanel() {
        return menuPanel;
    }

    public Component getFooterPanel() {
        return footerPanel;
    }
}
