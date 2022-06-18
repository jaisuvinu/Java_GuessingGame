package java01;
import java.util.*;
import javax.swing.JOptionPane;

public class Main{
	

	
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 1-6 : "));
		JOptionPane.showMessageDialog(null,"You entered! "+num+" Lets see what the system selected!");
		
		if (num >1 & num <6){
			Random random = new Random();
			int x = random.nextInt(6)+1;
			if (num == x){
				JOptionPane.showMessageDialog(null," Wow! Your guess is Right! You Won! ");
			
			}
			else {
				JOptionPane.showMessageDialog(null," Oh ho! the system selected" + x + " you loss this time!");
			}
		}
		else {
			JOptionPane.showMessageDialog(null,"Please enter a number between 0-6.");
		}
				
							
		
	}
     		
	
}