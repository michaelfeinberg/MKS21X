import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Window extends JFrame implements ActionListener{
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
	A.addActionListener(this);
	A.setActionCommand("CToF");
	
	B = new JButton("F To C");
	B.addActionListener(this);
	B.setActionCommand("FToC");
	
	T = new JTextField(5);
	L = new JLabel("");
	
	pane.add(A);
	pane.add(B);
	pane.add(T);
	pane.add(L);
    }
    public static int FToC(int temp){
	return (int)((temp-32)*5/9);
    }
    public static int CToF(int temp){
	return (int)((9*temp/5)+32);
    }
    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
	String input = T.getText();
	try{
	    int initTemp = Integer.parseInt(input);
	    int endTemp;
	    if(action.equals("CToF")){
		endTemp = CToF(initTemp);
	    }else if(action.equals("FToC")){
		endTemp = FToC(initTemp);
	    }else{
		endTemp = 0;
	    }
	    L.setText(endTemp +"");
	}catch(NumberFormatException a){
	    L.setText("Please input an integer");
	}
    }
    public static void main(String[]args){
    }
}