import java.applet.Applet;
import java.awt.*;
public class Q5Background extends Applet {
    public void init() {
        setBackground(Color.red);
        setForeground(Color.blue);
    }
    public void paint(Graphics g) {
        g.setColor(Color.CYAN);
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        g.drawString("Hello World", 150, 150);
        g.setColor(getForeground());
        g.fillRect(200, 200, 100, 100);
    }
}

/**
 * <applet code="Q5Background.class" width="300" height="300">
 * </applet>
 */