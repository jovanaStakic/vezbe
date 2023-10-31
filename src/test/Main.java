/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import form.bezMain;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        JFrame form=new JFrame();
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setExtendedState(JFrame.MAXIMIZED_BOTH);
        form.add(new JButton("Ovo je neko dugme"));
        form.setVisible(true);
        
    }
}
