import java.applet.Applet;
import java.awt.Graphics;

public class AppletLifecycleExample extends Applet {
    public void init() {
        System.out.println("init() called");
    }

    public void start() {
        System.out.println("start() called");
    }

    public void paint(Graphics g) {
        System.out.println("paint() called");
        g.drawString("Hello World", 150, 150);
        showStatus("Applet's Lifecycle");   
    }

    public void stop() {
        System.out.println("stop() called");
    }

    public void destroy() {
        System.out.println("destroy() called");
    }
}
