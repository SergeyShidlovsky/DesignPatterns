package com.company.creational.factory.buttons;

public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("<buttom>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("This button should retrieve  - 'Hello World!'");
    }
}
