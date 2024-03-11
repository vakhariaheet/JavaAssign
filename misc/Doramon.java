import java.applet.Applet;
import java.awt.*;


public class Doramon extends Applet {
    public void init() {
        setBackground(Color.WHITE);
    }

    public void paint(Graphics g) {
        // Mouth Blue Bg
        g.setColor(Color.decode("#629ff7"));
        g.fillOval(25, 25, 250, 250);
        g.setColor(Color.BLACK);
        g.drawOval(25, 25, 250, 250);

        // White Inner Circle
        g.setColor(Color.BLACK);
        g.drawOval(40, 75, 220, 200);
        g.setColor(Color.WHITE);
        g.fillOval(40, 75, 220, 200);
        // Smile
        g.setColor(Color.BLACK);
        g.drawArc(70, 120, 150, 130, 180, 180);

        // Line
        g.drawLine(150, 130, 150, 250);

        // Red Nose
        g.setColor(Color.RED);
        g.fillOval(140, 120, 20, 20);
        g.setColor(Color.BLACK);
        g.drawOval(140, 120, 20, 20);
        // White Dot Inside Nose
        g.setColor(Color.WHITE);
        g.fillOval(145, 125, 8, 8);
        g.setColor(Color.BLACK);
        g.drawOval(145, 125, 8, 8);

        // Right Side Beard
        g.drawLine(195, 140, 265, 115);
        g.drawLine(195, 150, 265, 135);
        g.drawLine(195, 160, 265, 155);

        // Left Side Beard
        g.drawLine(90, 140, 35, 115);
        g.drawLine(90, 150, 35, 135);
        g.drawLine(90, 160, 35, 155);

        //Left Eye
        g.setColor(Color.RED);
        g.fillOval(100, 50, 50, 70);
        g.setColor(Color.RED);
        g.drawOval(100, 50, 50, 70);
        g.setColor(Color.RED);
        g.fillOval(150, 50, 50, 70);
        g.setColor(Color.RED);
        g.drawOval(150, 50, 50, 70);

        g.setColor(Color.WHITE);
        g.fillOval(110, 90, 15, 20);

        
        g.setColor(Color.WHITE);
        g.fillOval(160, 90, 15, 20);
    }
}
/**
 * <applet code="Doramon.class" width=300 height=300></applet>
**/
