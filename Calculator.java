import java.awt.*;
import javax.swing.*;
public class Calculator extends JFrame {
		public static JButton add,sub,div,mult,equal , clear;
		public static JTextField result;
		JButton arbt[];
		public Calculator()
		{
			super("calculator");
	 	JPanel panel = new JPanel();
		panel.setLayout( new FlowLayout());
		result=new JTextField("",12);
		panel.add( result );
		arbt = new JButton[10];
		// create buttons
		for(int i =0;i<10;i++){
		arbt[i] = new JButton(Integer.toString(i));
		panel.add(arbt[i]);
		}
		div = new JButton( "/" );
		panel.add( div );
		mult = new JButton( "*" );
		panel.add( mult );
		sub = new JButton( "-" );
		panel.add( sub );
		equal = new JButton( "=" );
		panel.add( equal );
		add = new JButton( "+" );
		panel.add( add );
		clear = new JButton( "c" );
		panel.add( clear );
		this.add(panel);
		//acction listener for button inner class
		ButtonHandler handler = new ButtonHandler();
		for(int i=0;i<10;i++){
			arbt[i].addActionListener(handler);
			}
		add.addActionListener( handler );
		sub.addActionListener( handler );
		div.addActionListener( handler );
		mult.addActionListener( handler );
		equal.addActionListener( handler );
		result.addActionListener (handler);
		clear.addActionListener (handler);
		////////////////////////////////////////////////////
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE );
		setSize( 200, 190 );
		setVisible( true );
	}
		public static void main(String[] args) {
		new Calculator();
		}


}// class JFram