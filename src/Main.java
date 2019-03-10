//  Not a fucking clue why is everything the way it is and why the hell
//  this is working. Someone tell me.

import Com.Cube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amit Dehariya
 */


public class Main implements ActionListener, MouseListener {
    
    Cube cb;
    JButton KBT;
    JButton reset;
    
    Main(){
        cb = new Cube();
        cb.addMouseListener(this);
        KBT = new JButton("KeyBoard Turner");
        KBT.addActionListener(this);
        reset = new JButton("Reset");
        reset.addActionListener(this);
    }
    
    public static void main(String[] args) {
        Main mn = new Main();
        JFrame frame = new JFrame();
        
        
        mn.KBT.setBounds(770, 20, 150, 20);
        mn.KBT.setFocusable(false);
        frame.add(mn.KBT);
        
        mn.reset.setBounds(990, 20, 150, 20);
        mn.reset.setFocusable(false);
        frame.add(mn.reset);
        
        
        
        mn.cb.setBounds(0, 0, 700, 600);
        frame.add(mn.cb);
        
        frame.setBounds(10,10,1200,600);
        frame.setTitle("Rubik's Cube");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == KBT){
            cb.KeyTurner();
            System.out.println("Working");
        }
        else if(ae.getSource() == reset){
            cb.reset();
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        int mouseX = me.getX();
        int mouseY = me.getY();
        
        cb.clickSwitch(mouseX, mouseY);
    }

    
    //Useless Methods
    @Override
    public void mousePressed(MouseEvent me) {}

    @Override
    public void mouseReleased(MouseEvent me) {}

    @Override
    public void mouseEntered(MouseEvent me) {}

    @Override
    public void mouseExited(MouseEvent me) {}
    
}
