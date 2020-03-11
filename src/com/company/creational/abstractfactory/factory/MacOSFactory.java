package com.company.creational.abstractfactory.factory;

import com.company.creational.abstractfactory.buttons.Button;
import com.company.creational.abstractfactory.buttons.MacOSButton;
import com.company.creational.abstractfactory.checkboxes.Checkbox;
import com.company.creational.abstractfactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacOSCheckbox();
    }
}
