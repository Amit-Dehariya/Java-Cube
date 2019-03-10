package Com;


import Com.Solver.Cube.Boxes;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;






public class Cube extends JPanel implements KeyListener, ActionListener {

    int VX[] = new int[77];
    int VY[] = new int[77];
    
    Rect[] box = new Rect[54];
    Boxes obj1;
    boolean anti = false;
    
    boolean KeyAccess = true;
    
    
    
    public Cube() {
        
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    
        
        obj1 = new Boxes();
        
        for(int i = 0; i < 54; i++) {
            box[i] = new Rect();
        }
        
        VX[1] =140;           VY[1] =50;
        VX[2] =170;           VY[2] =50;
        VX[3] = 200;          VY[3] =50;
        VX[4] = 230;          VY[4] =50;
        VX[5] = 140;          VY[5] =80;
        VX[6] = 170;          VY[6] =80;
        VX[7] = 200;          VY[7] =80;
        VX[8] = 230;          VY[8] = 80;
        VX[9] = 140;          VY[9] =110;
        VX[10] = 170;         VY[10] =110;
        VX[11] = 200;         VY[11] =110;
        VX[12] = 230;         VY[12] =110;
        VX[13] = 50;          VY[13] =140;
        VX[14] = 80;          VY[14] =140;
        VX[15] = 110;         VY[15] =140;
        VX[16] = 140;         VY[16] =140;
        VX[17] = 170;         VY[17] =140;
        VX[18] = 200;         VY[18] =140;
        VX[19] = 230;         VY[19] =140;
        VX[20] = 260;         VY[20] =140;
        VX[21] = 290;         VY[21] =140;
        VX[22] = 320;         VY[22] =140;
        VX[23] = 350;         VY[23] =140;
        VX[24] = 380;         VY[24] =140;
        VX[25] = 410;         VY[25] =140;
        VX[26] = 50;          VY[26] =170;
        VX[27] = 80;          VY[27] =170;
        VX[28] = 110;         VY[28] =170;
        VX[29] = 140;         VY[29] =170;
        VX[30] = 170;         VY[30] =170;
        VX[31] = 200;         VY[31] =170;
        VX[32] = 230;         VY[32] =170;
        VX[33] = 260;         VY[33] =170;
        VX[34] = 290;         VY[34] =170;
        VX[35] = 320;         VY[35] =170;
        VX[36] = 350;         VY[36] =170;
        VX[37] = 380;         VY[37] =170;
        VX[38] = 410;         VY[38] =170;
        VX[39] = 50;          VY[39] =200;
        VX[40] = 80;          VY[40] =200;
        VX[41] = 110;         VY[41] =200;
        VX[42] = 140;         VY[42] =200;
        VX[43] = 170;         VY[43] =200;
        VX[44] = 200;         VY[44] =200;
        VX[45] = 230;         VY[45] =200;
        VX[46] = 260;         VY[46] =200;
        VX[47] = 290;         VY[47] =200;
        VX[48] = 320;         VY[48] =200;
        VX[49] = 350;         VY[49] =200;
        VX[50] = 380;         VY[50] =200;
        VX[51] = 410;         VY[51] =200;
        VX[52] = 50;          VY[52] =230;
        VX[53] = 80;          VY[53] =230;
        VX[54] = 110;         VY[54] =230;
        VX[55] = 140;         VY[55] =230;
        VX[56] = 170;         VY[56] =230;
        VX[57] = 200;         VY[57] =230;
        VX[58] = 230;         VY[58] =230;
        VX[59] = 260;         VY[59] =230;
        VX[60] = 290;         VY[60] =230;
        VX[61] = 320;         VY[61] =230;
        VX[62] = 350;         VY[62] =230;
        VX[63] = 380;         VY[63] =230;
        VX[64] = 410;         VY[64] =230;
        VX[65] = 140;         VY[65] =260;
        VX[66] = 170;         VY[66] =260;
        VX[67] = 200;         VY[67] =260;
        VX[68] = 230;         VY[68] =260;
        VX[69] = 140;         VY[69] =290;
        VX[70] = 170;         VY[70] =290;
        VX[71] = 200;         VY[71] =290;
        VX[72] = 230;         VY[72] =290;
        VX[73] = 140;         VY[73] =320;
        VX[74] = 170;         VY[74] =320;
        VX[75] = 200;         VY[75] =320;
        VX[76] = 230;         VY[76] =320;
        
        for(int i = 0; i < 77; i++) {
            VX[i] *= 1.5;
            VY[i] *= 1.5;
        }
        
        box[0].create ( VX[1], VY[1], VX[6], VY[6], obj1.WorkingMatrix_2[1]);
        box[1].create ( VX[2], VY[2], VX[7], VY[7], obj1.WorkingMatrix_2[2]);
        box[2].create ( VX[3], VY[3], VX[8], VY[8], obj1.WorkingMatrix_2[3]);
        box[3].create ( VX[5], VY[5], VX[10], VY[10], obj1.WorkingMatrix_2[4]);
        box[4].create ( VX[6], VY[6], VX[11], VY[11], obj1.WorkingMatrix_2[5]);
        box[5].create ( VX[7], VY[7], VX[12], VY[12], obj1.WorkingMatrix_2[6]);
        box[6].create ( VX[9], VY[9], VX[17], VY[17], obj1.WorkingMatrix_2[7]);
        box[7].create ( VX[10], VY[10], VX[18], VY[18], obj1.WorkingMatrix_2[8]);
        box[8].create ( VX[11], VY[11], VX[19], VY[19], obj1.WorkingMatrix_2[9]);
        box[9].create ( VX[16], VY[16], VX[30], VY[30], obj1.WorkingMatrix_2[10]);
        box[10].create ( VX[17], VY[17], VX[31], VY[31], obj1.WorkingMatrix_2[11]);
        box[11].create ( VX[18], VY[18], VX[32], VY[32], obj1.WorkingMatrix_2[12]);
        box[12].create ( VX[29], VY[29], VX[43], VY[43], obj1.WorkingMatrix_2[13]);
        box[13].create ( VX[30], VY[30], VX[44], VY[44], obj1.WorkingMatrix_2[14]);
        box[14].create ( VX[31], VY[31], VX[45], VY[45], obj1.WorkingMatrix_2[15]);
        box[15].create ( VX[42], VY[42], VX[56], VY[56], obj1.WorkingMatrix_2[16]);
        box[16].create ( VX[43], VY[43], VX[57], VY[57], obj1.WorkingMatrix_2[17]);
        box[17].create ( VX[44], VY[44], VX[58], VY[58], obj1.WorkingMatrix_2[18]);
        box[18].create ( VX[19], VY[19], VX[33], VY[33], obj1.WorkingMatrix_2[19]);
        box[19].create ( VX[20], VY[20], VX[34], VY[34], obj1.WorkingMatrix_2[20]);
        box[20].create ( VX[21], VY[21], VX[35], VY[35], obj1.WorkingMatrix_2[21]);
        box[21].create ( VX[32], VY[32], VX[46], VY[46], obj1.WorkingMatrix_2[22]);
        box[22].create ( VX[33], VY[33], VX[47], VY[47], obj1.WorkingMatrix_2[23]);
        box[23].create ( VX[34], VY[34], VX[48], VY[48], obj1.WorkingMatrix_2[24]);
        box[24].create ( VX[45], VY[45], VX[59], VY[59], obj1.WorkingMatrix_2[25]);
        box[25].create ( VX[46], VY[46], VX[60], VY[60], obj1.WorkingMatrix_2[26]);
        box[26].create ( VX[47], VY[47], VX[61], VY[61], obj1.WorkingMatrix_2[27]);
        box[27].create ( VX[22], VY[22], VX[36], VY[36], obj1.WorkingMatrix_2[28]);
        box[28].create ( VX[23], VY[23], VX[37], VY[37], obj1.WorkingMatrix_2[29]);
        box[29].create ( VX[24], VY[24], VX[38], VY[38], obj1.WorkingMatrix_2[30]);
        box[30].create ( VX[35], VY[35], VX[49], VY[49], obj1.WorkingMatrix_2[31]);
        box[31].create ( VX[36], VY[36], VX[50], VY[50], obj1.WorkingMatrix_2[32]);
        box[32].create ( VX[37], VY[37], VX[51], VY[51], obj1.WorkingMatrix_2[33]);
        box[33].create ( VX[48], VY[48], VX[62], VY[62], obj1.WorkingMatrix_2[34]);
        box[34].create ( VX[49], VY[49], VX[63], VY[63], obj1.WorkingMatrix_2[35]);
        box[35].create ( VX[50], VY[50], VX[64], VY[64], obj1.WorkingMatrix_2[36]);
        box[36].create ( VX[13], VY[13], VX[27], VY[27], obj1.WorkingMatrix_2[37]);
        box[37].create ( VX[14], VY[14], VX[28], VY[28], obj1.WorkingMatrix_2[38]);
        box[38].create ( VX[15], VY[15], VX[29], VY[29], obj1.WorkingMatrix_2[39]);
        box[39].create ( VX[26], VY[26], VX[40], VY[40], obj1.WorkingMatrix_2[40]);
        box[40].create ( VX[27], VY[27], VX[41], VY[41], obj1.WorkingMatrix_2[41]);
        box[41].create ( VX[28], VY[28], VX[42], VY[42], obj1.WorkingMatrix_2[42]);
        box[42].create ( VX[39], VY[39], VX[53], VY[53], obj1.WorkingMatrix_2[43]);
        box[43].create ( VX[40], VY[40], VX[54], VY[54], obj1.WorkingMatrix_2[44]);
        box[44].create ( VX[41], VY[41], VX[55], VY[55], obj1.WorkingMatrix_2[45]);
        box[45].create ( VX[55], VY[55], VX[66], VY[66], obj1.WorkingMatrix_2[46]);
        box[46].create ( VX[56], VY[56], VX[67], VY[67], obj1.WorkingMatrix_2[47]);
        box[47].create ( VX[57], VY[57], VX[68], VY[68], obj1.WorkingMatrix_2[48]);
        box[48].create ( VX[65], VY[65], VX[70], VY[70], obj1.WorkingMatrix_2[49]);
        box[49].create ( VX[66], VY[66], VX[71], VY[71], obj1.WorkingMatrix_2[50]);
        box[50].create ( VX[67], VY[67], VX[72], VY[72], obj1.WorkingMatrix_2[51]);
        box[51].create ( VX[69], VY[69], VX[74], VY[74], obj1.WorkingMatrix_2[52]);
        box[52].create ( VX[70], VY[70], VX[75], VY[75], obj1.WorkingMatrix_2[53]);
        box[53].create ( VX[71], VY[71], VX[76], VY[76], obj1.WorkingMatrix_2[54]);
        
    }
    
    
    @Override
    public void paint(Graphics g) {
        //back ground
        g.setColor(Color.black);
        g.fillRect(0, 0, 700, 600);
        
        //draw boxes
        for(int i = 0; i < 54; i++) {
            box[i].draw((Graphics2D)g);
        }
    }
    
    
    public void KeyTurner(){
        if(KeyAccess){
            KeyAccess = false;
            System.out.println("false");
        } else {
            KeyAccess = true;
            System.out.println("true");
        }
    }
    
    
    public void clickSwitch(int mouseX, int mouseY) {
        
        
        for(int i = 0; i < 54; i++){
            if(this.box[i].isMouseOver(mouseX, mouseY)){
                
                obj1.WorkingMatrix_2[i+1] = (obj1.WorkingMatrix_2[i+1] + 1) % 6;
                if(obj1.WorkingMatrix_2[i+1] == 0){
                    obj1.WorkingMatrix_2[i+1]++;
                }
                obj1.WorkingMatrix_1[i+1] = obj1.WorkingMatrix_2[i+1];
                
                box[i].updateColor(obj1.WorkingMatrix_2[i+1]);
                System.out.println(mouseX + "\t" + mouseY);
                break;
            }
        }
        repaint();
    }
    
    public void reset() {
        obj1.reset();
        for(int i = 0; i < 54; i++){
            box[i].col = obj1.WorkingMatrix_2[i+1];
        }
        repaint();
    }
    
    
    
    
    //KeyListener
    @Override
    public void keyPressed(KeyEvent ke) {
        
        if(ke.getKeyCode() == KeyEvent.VK_ENTER) {
            KeyTurner();
            System.out.println("Enter");
        }
        
        if(KeyAccess){
            if(ke.getKeyCode() == KeyEvent.VK_SHIFT) {
                anti = true;
            }

            if(ke.getKeyCode() == KeyEvent.VK_R) {
                if(!anti){
                    obj1.RC();
                    System.out.println("R");
                } else {
                    obj1.RAC();
                    System.out.println("R'");
                }
                for(int i = 0; i < 54; i++){
                    box[i].updateColor(obj1.WorkingMatrix_2[i+1]);
                }
            }

            if(ke.getKeyCode() == KeyEvent.VK_L) {
                if(!anti){
                    obj1.LC();
                    System.out.println("L");
                } else {
                    obj1.LAC();
                    System.out.println("L'");
                }
                for(int i = 0; i < 54; i++){
                    box[i].updateColor(obj1.WorkingMatrix_2[i+1]);
                }
            }

            if(ke.getKeyCode() == KeyEvent.VK_U) {
                if(!anti){
                    obj1.UC();
                    System.out.println("U");
                } else {
                    obj1.UAC();
                    System.out.println("U'");
                }
                for(int i = 0; i < 54; i++){
                    box[i].updateColor(obj1.WorkingMatrix_2[i+1]);
                }
            }

            if(ke.getKeyCode() == KeyEvent.VK_B) {
                if(!anti){
                    obj1.BC();
                    System.out.println("B");
                } else {
                    obj1.BAC();
                    System.out.println("B'");
                }
                for(int i = 0; i < 54; i++){
                    box[i].updateColor(obj1.WorkingMatrix_2[i+1]);
                }
            }

            if(ke.getKeyCode() == KeyEvent.VK_D) {
                if(!anti){
                    obj1.DC();
                    System.out.println("D");
                } else {
                    obj1.DAC();
                    System.out.println("D'");
                }
                for(int i = 0; i < 54; i++){
                    box[i].updateColor(obj1.WorkingMatrix_2[i+1]);
                }
            }

            if(ke.getKeyCode() == KeyEvent.VK_F) {
                if(!anti){
                    obj1.FC();
                    System.out.println("F");
                } else {
                    obj1.FAC();
                    System.out.println("F'");
                }
                for(int i = 0; i < 54; i++){
                    box[i].updateColor(obj1.WorkingMatrix_2[i+1]);
                }
            }
        }
        
        repaint();
    }
    @Override
    public void keyReleased(KeyEvent ke) {
        if(ke.getKeyCode() == KeyEvent.VK_SHIFT) {
            anti = false;
        }
    }
    
    
    
    
    
    
    //ActionListener
    @Override
    public void actionPerformed(ActionEvent ae) {}
    
    //Useless
    @Override
    public void keyTyped(KeyEvent ke) {}

    
}
