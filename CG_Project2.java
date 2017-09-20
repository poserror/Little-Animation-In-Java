import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="CG_Project2.class" width="1000" height="700"></applet>*/
public class CG_Project2 extends JFrame implements ActionListener
{
    public int x = 700,y=100 ,direction = 1,x1=675,w=50;
    Color DARKBROWN = new Color ( 150, 70, 80 ) ;
    public CG_Project2()
    {
	     this.getContentPane().setBackground(Color.black);
         setSize(1500,700);
         setTitle("WATER RIPPLES");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLayout(new BorderLayout());
         JButton move = new JButton("FALL THE DROP");
         move.addActionListener(this);
         add(move , BorderLayout.SOUTH);
         setVisible(true);
         //add(new JLabel(new ImageIcon("Tap.jpg")));
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.blue);
        g.drawLine(x,y,x-15,y+50);
        g.drawLine(x,y,x+15,y+50);
        g.drawArc(x-15,y+40,30,20,180,180);
        if(y>=370)
        {
			g.fillOval(x1,420,w,10);
			g.setColor(Color.black);
	        g.drawLine(x,y,x-15,y+50);
	        g.drawLine(x,y,x+15,y+50);
	        g.drawArc(x-15,y+40,30,20,180,180);
		}
    }
    public void actionPerformed(ActionEvent e)
    {
         MyThread ex = new MyThread();
         ex.start();
	}
	private class MyThread extends Thread
	{
    	public void run()
    	{
        	while(true)
        	{
				if(y<=400)
				{
					y=y+10;
				}
				else if(y>=350)
				{
					x1=x1-5;
					w=w+15;
				}
				if(x1==550)
				{
					x1=650;
					w=50;
					y=100;
				}
            	try
            	{
	                Thread.sleep(100);
	            }
	            catch(InterruptedException e)
	            {
                	System.exit(0);
            	}
           	repaint();
        	}
    	}
	}
	public static void main(String []args)
	{
    	new CG_Project2();
	}
}