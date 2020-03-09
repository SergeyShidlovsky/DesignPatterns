package com.company.creational.factory.factory;

import com.company.creational.factory.buttons.Button;
import com.company.creational.factory.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
