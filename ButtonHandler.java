import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
public class ButtonHandler implements ActionListener
{
		double firstNumber , secondNumber;
		char math='a';   //test first n or second n
		public void actionPerformed( ActionEvent e )
		{
			 JTextField result = Calculator.result;
			
			char str= e.getActionCommand().charAt(0);
			switch(str)
			{
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
				case '.':
					
				result.setText(result.getText() + str);
				if(math == 'a')
				firstNumber = Double.valueOf(result.getText()).doubleValue();
				else
				secondNumber = Double.valueOf(result.getText()).doubleValue();
				break;
				case 'c':
				result.setText("");
				firstNumber=0;
				secondNumber=0;
				break;	
			}
			if(e.getSource() == Calculator.add)
			{
			result.setText("");
			math='+';
			}
			else if(e.getSource() == Calculator.sub)
			{
			result.setText("");
			math='-';
			}
			else if(e.getSource() == Calculator.mult)
			{
			result.setText("");
			math='*';
			}
			else if(e.getSource() == Calculator.div)
			{
			result.setText("");
			math='/';
			}
			else if(e.getSource() == Calculator.equal)
			{
			double p=0.0;
			switch(math){
			case'+':
			p=firstNumber+secondNumber;
			break;
			case'-':
			p=firstNumber-secondNumber;
			break;
			case'*':
			p=firstNumber*secondNumber;
			break;
			case'/':
			p=firstNumber/secondNumber;
			break;
			}
			result.setText(String.valueOf(p));
			math='a';
			firstNumber=0;
			secondNumber=0;
		}
		}
		}// class button handler