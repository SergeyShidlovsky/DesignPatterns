package com.company.creational.factory.factory;

import com.company.creational.factory.buttons.Button;

public abstract class Dialog {

    public void renderWindow(){

        //realisation of code should be here

        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
