package com.company.creational.factory.buttons;

import com.company.creational.factory.Dialog;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return  new HtmlButton();
    }
}
