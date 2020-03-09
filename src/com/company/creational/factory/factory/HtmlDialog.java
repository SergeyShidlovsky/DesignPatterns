package com.company.creational.factory.factory;

import com.company.creational.factory.buttons.Button;
import com.company.creational.factory.buttons.HtmlButton;
import com.company.creational.factory.factory.Dialog;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return  new HtmlButton();
    }
}
