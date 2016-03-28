
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Estrella extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Estrella frame = new Estrella();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

  
    public Estrella() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setBounds(0,0,800,600);
    }
    
    public void paint (Graphics g)
    {
        super.paint(g);
        int x1,x2,y1,y2;
        x1 =200;
        x2 =200;
        y1 =200;
        y2 =200;
        
        g.setColor (Color.BLACK);
        g.drawLine (x1+130,y1+20, x2+150,y2+90);
        g.drawLine (x1+150,y1+90, x2+210,y2+ 90);
        g.drawLine (x1+210,y1+90, x2+160,y2+ 130);
        g.drawLine (x1+160,y1+130,x2+180,y2+ 200);
        g.drawLine (x1+180,y1+200,x2+130,y2+ 160);
        g.drawLine (x1+130,y1+160,x2+80, y2+200);
        g.drawLine (x1+80, y1+200,x2+100,y2+ 130);
        g.drawLine (x1+100,y1+130,x2+50, y2+90);
        g.drawLine (x1+50, y1+90, x2+110,y2+ 90);
        g.drawLine (x1+110,y1+90, x2+130,y2+ 20);
 
       
    }
}