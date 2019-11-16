package com.company.creational.abstractfactory.checkboxes;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("yYou have created Windows checkbox");
    }
}
