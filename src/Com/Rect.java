package Com;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;




public class Rect {
    int x1;
    int y1;
    int x2;
    int y2;
    int col;
    Rectangle rct;
    
    public void create(int a, int b, int c, int d, int x) {
        this.x1 = a;
        this.y1 = b;
        this.x2 = c;
        this.y2 = d;
        this.col = x;
        rct = new Rectangle(x1, y1, (int)(30*1.5), (int)(30*1.5));
    }
    
    public void draw(Graphics2D g) {
        if(col == 1) {
            g.setColor(Color.white);
        }
        else if(col == 2) {
            g.setColor(Color.red);
        }
        else if(col == 3) {
            g.setColor(Color.blue);
        }
        else if(col == 4) {
            g.setColor(Color.pink);
        }
        else if(col == 5) {
            g.setColor(Color.green);
        }
        else if(col == 6) {
            g.setColor(Color.yellow);
        }
        
        g.fillRect(x1, y1, (int)(30*1.5), (int)(30*1.5));
        
        g.setStroke(new BasicStroke(3));
        g.setColor(Color.black);
        g.drawRect(x1, y1, (int)(30*1.5), (int)(30*1.5));
        
    }
    
    public void updateColor(int x) {
        this.col = x;
    }
    
    public Boolean isMouseOver(int mouseX, int mouseY) {
        if(new Rectangle(mouseX, mouseY, 1, 1).intersects(rct)){
            return true;
        } else {
            return false;
        }
    }
}
