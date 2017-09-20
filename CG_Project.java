import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class CG_Project extends JFrame implements ActionListener
{
    public int x = 20 ,direction = 1;
    int x1[]={20,100,80 ,40 ,20};
    int y[] ={80,80 ,130,130,80};
    Color DARKBROWN = new Color ( 150, 70, 80 ) ;
    public CG_Project()
    {
         setSize(200, 300);
         setTitle("Moving Car");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLayout(new BorderLayout());
         JButton move = new JButton("Move the car");
         move.addActionListener(this);
         add(move , BorderLayout.SOUTH);
         setVisible(true);
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.red);
        g.fillRect(x, 80, 80, 50);
        //g.fillPolygon(x1,y,4);
        g.setColor(DARKBROWN);
        g.fillOval(x, 130, 30, 30);
        g.fillOval(x+50, 130, 30, 30);
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
            	if(x >= getWidth()-70)
            	    direction = -1;
            	else if (x <= 0)
            	    direction = 1 ;
            	x += direction *10;

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
    	new CG_Project();

	}
}


/*import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class CG_Project extends JFrame implements ActionListener
{
    public int x = 20 ,direction = 1;
    // size of area needed for applet figure
		public final int FIGUREHEIGHT = 280;
		public final int FIGUREWIDTH  = 445;

	// color definitions (red, green, blue)
	    Color REDBROWN = new Color ( 182, 100, 110 ) ;
		Color DARKBROWN = new Color ( 150, 70, 80 ) ;
		Color LTBLUE = new Color ( 35, 206, 255 ) ;
		Color DARKGOLD = new Color ( 240, 220, 0 ) ;

    public CG_Project()
    {
         setSize(200, 300);
         setTitle("Moving Car");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLayout(new BorderLayout());
         JButton move = new JButton("Move the car");
         move.addActionListener(this);
         add(move , BorderLayout.SOUTH);
         setVisible(true);
    }
    public void paint(Graphics g)
    {
        super.paint(g);
/*        g.setColor(Color.red);
        g.fillRect(x, 80, 80, 50);
        g.setColor(DARKBROWN);
        g.drawLine(x,110,x+80,110);
        g.drawLine(x,112,x+80,112);
        g.fillOval(x, 130, 30, 30);
        g.fillOval(x+50, 130, 30, 30);
*/
/*	// background for figure
        g.setColor ( Color.white ) ;
		g.fillRect ( 0+x, 0, FIGUREWIDTH, FIGUREHEIGHT ) ;

	// front tire
		g.setColor ( Color.black ) ;
  		g.fillOval ( 20+x, 170, 100+x, 100 ) ;
		g.setColor ( Color.white ) ;
  		g.fillOval ( 30+x, 180, 80+x, 80 ) ;
		g.setColor ( Color.black ) ;
  		g.drawOval ( 40+x, 190, 60+x, 60 ) ;

	// back tire
		g.setColor ( Color.black ) ;
  		g.fillOval ( 270+x, 170, 100+x, 100 ) ;
		g.setColor ( Color.white ) ;
  		g.fillOval ( 280+x, 180, 80+x, 80 ) ;
		g.setColor ( Color.black ) ;
  		g.drawOval ( 290+x, 190, 60+x, 60 ) ;

  	// car hood
        g.setColor ( DARKBROWN ) ;
  		g.fillRect ( 10+x, 113, 122+x, 12 ) ;
    	g.setColor ( REDBROWN ) ;
  		g.fillRect ( 10+x, 123, 122+x, 82 ) ;

	// car hood ornament
  		g.fillOval ( 10+x, 105, 10+x, 10 ) ;

  	//  car window
    	g.setColor ( LTBLUE ) ;
    	g.fillRect ( 130+x, 15, 130+x, 100 ) ;

	// car door
        g.setColor ( REDBROWN ) ;
  		g.fillRect ( 130+x, 113, 130+x, 92 ) ;

	// car backseat
  		g.fillRect ( 258+x, 15, 122+x, 190 ) ;

	// car trunk
		g.setColor ( REDBROWN ) ;
  		g.fillRect ( 378+x, 80, 57+x, 125 ) ;

	// car running board
    	g.setColor ( DARKBROWN ) ;
  		g.fillRect ( 118+x, 205, 154+x, 10 ) ;

	// visor
		g.setColor ( Color.BLACK ) ;
		g.drawLine ( 131+x, 15, 110+x, 30) ;
		g.drawLine ( 131+x, 16, 110+x, 31) ;
		g.drawLine ( 131+x, 17, 110+x, 32) ;

	// door handle
		g.drawLine ( 145+x, 125, 170+x, 125) ;
		g.drawLine ( 145+x, 124, 170+x, 124) ;
		g.drawLine ( 145+x, 123, 170+x, 123) ;

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
            	if(x >= getWidth()-70)
            	    direction = -1;
            	else if (x <= 0)
            	    direction = 1 ;
            	x += direction+10;

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
    	new CG_Project();
	}
}*/