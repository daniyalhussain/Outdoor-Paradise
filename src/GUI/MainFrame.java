/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;

/**
 *
 * @author tradebits
 */
public class MainFrame extends JFrame {
    
    private final int x_size = 500;
    private final int y_size = 500;
    
    public MainFrame() {
        initComponent();
    }
    
    private void initComponent() {
        
        setSize(x_size, y_size);
        setTitle("Outdoor Paradise");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        MainFrame main = new MainFrame();
        
    }
}
