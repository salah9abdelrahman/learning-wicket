package com.salah;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {
    private static final long serialVersionUID = 1L;

    public HomePage(final PageParameters parameters) {
        super(parameters);

        // add: used to add children components to a web page
        // here is some data binding type shit
        add(new Label("version", getApplication().getFrameworkSettings().getVersion()));
        add(new Label("helloMessage", "Hello WicketWorld!"));

        // TODO Add your page's components here

    }
}
