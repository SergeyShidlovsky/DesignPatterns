package com.company.creational.abstractfactory.factory;

import com.company.creational.abstractfactory.buttons.Button;
import com.company.creational.abstractfactory.buttons.MacOSButton;
import com.company.creational.abstractfactory.checkboxes.Checkbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return null;
    }
}
