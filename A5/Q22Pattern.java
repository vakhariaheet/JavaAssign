import java.applet.Applet;
import java.awt.*;
public class Q22Pattern extends Applet {
    public void init() {
        setBackground(Color.YELLOW);
        setForeground(Color.BLACK);
    }

    public void paint(Graphics g) {
        g.setColor(Color.decode("#FCD5B5"));
        g.fillOval(0, 0, 500, 300);
        g.setColor(Color.BLACK);
        g.drawOval(0, 0, 500, 300);

        g.setColor(Color.BLACK);
        g.drawRect(200, 100, 100, 100);
        g.setColor(Color.decode("#00B0F0"));
        g.fillRect(200, 100, 100, 100);

        int firstTriangleX[] = { 200, 250, 300 };
        int firstTriangleY[] = { 100, 0, 100 };
        g.setColor(Color.BLACK);
        g.drawPolygon(new Polygon(firstTriangleX, firstTriangleY, 3));
        g.setColor(Color.decode("#FEC100"));
        g.fillPolygon(new Polygon(firstTriangleX, firstTriangleY, 3));

        int secondTriangleX[] = { 300, 400, 300 };
        int secondTriangleY[] = { 100, 150, 200 };
        g.setColor(Color.BLACK);
        g.drawPolygon(new Polygon(secondTriangleX, secondTriangleY, 3));
        g.setColor(Color.decode("#08146c"));
        g.fillPolygon(new Polygon(secondTriangleX, secondTriangleY, 3));

        int thirdTriangleX[] = { 200, 250, 300 };
        int thirdTriangleY[] = { 200, 300, 200 };
        g.setColor(Color.BLACK);
        g.drawPolygon(new Polygon(thirdTriangleX , thirdTriangleY, 3));
        g.setColor(Color.decode("#E46C0B"));
        g.fillPolygon(new Polygon(thirdTriangleX, thirdTriangleY, 3));

        int fourthTriangleX[] = { 200, 100, 200 };
        int fourthTriangleY[] = { 100, 150, 200 };
        g.setColor(Color.BLACK);
        g.drawPolygon(new Polygon(fourthTriangleX , fourthTriangleY, 3));
        g.setColor(Color.decode("#00B050"));
        g.fillPolygon(new Polygon(fourthTriangleX, fourthTriangleY, 3));
        
        g.setColor(Color.BLACK);
        g.drawOval(200, 100, 100, 100);
        g.setColor(Color.RED);
        g.fillOval(200, 100, 100, 100);

        
    
    }
    

}
/**
 * <applet code="Q22Pattern.class" width=500 height=300></applet>
*/