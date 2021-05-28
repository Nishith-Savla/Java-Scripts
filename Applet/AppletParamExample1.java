import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class AppletParamExample1 extends Applet {
    private String username;

    public void init() {
        setBackground(Color.GREEN);
        username = "User";
    }

    public void start() {
        username = getParameter("username");
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawString("Welcome " + username, 50, 50);
    }
}
