package com.company.creational.abstractfactory.factory;

import com.company.creational.abstractfactory.buttons.Button;
import com.company.creational.abstractfactory.buttons.WindowsButton;
import com.company.creational.abstractfactory.checkboxes.Checkbox;
import com.company.creational.abstractfactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WindowsCheckbox();
    }
}
