import javax.swing.*;
import java.awt.*;

public class gui extends JFrame {

    private Container pane;
    private JButton b1;
    private JButton b2;
    public gui() {
	setTitle("My First Gui");
	setSize(600,400);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = getContentPane();
	//	pane.setLayout(new GridLayout(3,3));
	pane.setLayout(new FlowLayout());
	b1 = new JButton("button");
	pane.add(b1);
	b2 = new JButton("exit");
	pane.add(b2);
	JTextArea text;
	text = new JTextArea();
	text.setColumns(40);
	text.setRows(10);
	text.setBorder(BorderFactory.createLineBorder(Color.red));
	pane.add(text);

	
    }
    
    public static void main(String[] args) {
	gui f = new gui();
	f.setVisible(true);
    }
}
