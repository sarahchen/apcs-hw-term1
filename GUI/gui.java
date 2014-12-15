import javax.swing.*;
import java.awt.*;

public class gui extends JFrame {

    public gui() {
	setTitle("My First Gui");
	setSize(600,400);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
	gui f = new gui();
	f.setVisible(true);
    }
}
