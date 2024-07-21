package com.salah;

import org.apache.wicket.csp.CSPDirective;
import org.apache.wicket.csp.CSPDirectiveSrcValue;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * Application object for your web application.
 * If you want to run this application without deploying, run the Start class.
 *
 * This class is the value of parameter applicationClassName in web.xml
 */
public class WicketApplication extends WebApplication {
    /**
     * @see org.apache.wicket.Application#getHomePage()
     * Defining the home page, Duh!
     */
    @Override
    public Class<? extends WebPage> getHomePage() {
        return SimpleLogin.class;
    }

    /**
     * @see org.apache.wicket.Application#init()
     * This method is called when our application is loaded by the web server  and is the ideal place to put our configuration code.
     */
    @Override
    public void init() {
        super.init();

        // needed for the styling used by the quickstart
        getCspSettings().blocking()
                .add(CSPDirective.STYLE_SRC, CSPDirectiveSrcValue.SELF)
                .add(CSPDirective.STYLE_SRC, "https://fonts.googleapis.com/css")
                .add(CSPDirective.FONT_SRC, "https://fonts.gstatic.com");

        // add your configuration here
    }
}
