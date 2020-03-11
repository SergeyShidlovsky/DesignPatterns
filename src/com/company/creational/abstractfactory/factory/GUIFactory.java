package com.company.creational.abstractfactory.factory;

import com.company.creational.abstractfactory.buttons.Button;
import com.company.creational.abstractfactory.checkboxes.Checkbox;

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckBox();
}
