package swingpack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class SA {
	public static void main(String st[]){
		new Frm();
	}
}
class Frm implements ActionListener{
	JFrame frame;
	JLabel nameLabel;
	JTextField nameText;
	JPasswordField passfield;
	JCheckBox c1,c2;
	JRadioButton r1,r2;
	ButtonGroup bg;
	
	JComboBox<String> cm;
	JButton btn;
	JTable table;
	JScrollPane sp;
	
	String data[][]={{"krishna","123"},{"krishna","123"},{"krishna","123"},{"krishna","123"}};
	String col[] = {"Name","Password"};
	Frm(){
		frame = new JFrame("MyFrame");
		nameLabel = new JLabel("User Name");
		nameText = new JTextField();
		
		table = new JTable(data,col);
		sp = new JScrollPane(table);
		
		frame.add(sp);
		
		
		
		cm = new JComboBox<>();
		cm.addItem("java");
		cm.addItem("Android");
		cm.addItem("python");
		
		
		btn = new JButton("click me");
		btn.addActionListener(this);
		
		frame.setLayout(null);
		
		frame.add(nameLabel);
		frame.add(nameText);
		frame.add(btn);
		frame.add(cm);
		nameLabel.setBounds(20, 30, 100, 22);
		nameText.setBounds(100, 30, 100, 22);
		cm.setBounds(100, 50, 100,22);
		btn.setBounds(100, 80, 100, 22);
		sp.setBounds(100, 120, 150, 50);
		frame.setVisible(true);
		frame.setSize(300, 400);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s  = nameText.getText();
		
		System.out.println(s);
		
	}
}
