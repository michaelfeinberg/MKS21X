import javax.swing.*;
import java.awt.*;
public class Window extends JFrame{
    private Container pane;
    private JLabel L;
    private JTextField T;
    private JButton A;
    private JButton B;
    
    public Window (){
	this.setTitle("Temperature Converter");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());
	A = new JButton("C To F");
	B = new JButton("F To C");
	T = new JTextField(5);
	L = new JLabel("");
	pane.add(A);
	pane.add(B);
	pane.add(T);
    }
    public static void main(String[]args){
	Window W = new Window();
	W.setVisible(true);
    }
}