/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JPanel;

/**
 *
 * @author Daniyal
 */
public class Menu extends JPanel {
    
    private int x;
    private int y;
    
    public Menu(int x, int y) {
       this.x = x * 20;
       this.y = y;
       
       initComponent();
    }
    
    private void initComponent() {
      setSize((x * 20), y);
    }
    
}
