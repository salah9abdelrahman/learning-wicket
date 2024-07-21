package com.salah;

public class SimpleLogin extends MyFirstTemplate {
    public SimpleLogin() {
        super();
        replace(new LoginPanel(CONTENT_ID));
        getMenuPanel().setVisible(false);
    }
}
