package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    HelloWorldApplet applet = new HelloWorldApplet();
        JFrame frame = new JFrame();
        frame.getContentPane().add(applet);
        frame.setVisible(true);
        applet.start();
    }
}
