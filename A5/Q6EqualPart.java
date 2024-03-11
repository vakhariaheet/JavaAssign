import java.applet.Applet;
import java.awt.*;
// Write a Java applet that draws a circle divided in 8 equal parts
public class Q6EqualPart extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int x = 100;
        int y = 100;
        int r = 50;
        int startAngle = 0;
        int arcAngle = 45;
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                g.setColor(Color.red);
            } else {
                g.setColor(Color.blue);
            }
            g.fillArc(x, y, r, r, startAngle, arcAngle);
            startAngle += arcAngle;
        }
    }
}


/**
 * <applet code="Q6EqualPart.class" width="300" height="300">
 * </applet>
 */