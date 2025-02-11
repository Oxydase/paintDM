package paintDM;

import java.awt.Color;
import java.awt.Graphics;

public class MyLine extends MyShape
{  

    public MyLine()
    {
        super();
    }
    

    public MyLine( int x1, int y1, int x2, int y2, Color color )
    {
        super(x1, y1, x2, y2, color);
    } 
     

    @Override
    public void draw( Graphics g )
    {
        g.setColor( getColor() ); //sets the color
        g.drawLine( getX1(), getY1(), getX2(), getY2() ); //draws the line
    } 
}