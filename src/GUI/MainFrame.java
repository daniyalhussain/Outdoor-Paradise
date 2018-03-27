/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JFrame;

/**
 *
 * @author Daniyal
 */
public class MainFrame extends JFrame {
    
    private final int X = 500;
    private final int Y = 500;
    
    public MainFrame() {
        initComponent();
    }
    
    private void initComponent() {
        
        setSize(X, Y);
        setTitle("Outdoor Paradise");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        MainFrame main = new MainFrame();
        
    }
}
