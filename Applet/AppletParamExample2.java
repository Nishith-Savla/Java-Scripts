import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class AppletParamExample2 extends Applet {
    private String username;

    public void init() {
        username = "User";
    }

    public void start() {
        username = getParameter("username");
    }

    public void paint(Graphics g) {
        g.drawString("Welcome " + username, 50, 50);
        g.drawString("Your name has " + username.length() + " characters", 50, 100);
    }
}
