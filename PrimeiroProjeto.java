
package primeiro.projeto;

import javax.swing.JOptionPane;

public class PrimeiroProjeto {

    public static void main(String[] args) {
        
        String firstNumber = JOptionPane.showInputDialog("enter first integer");
        String secondNumber= JOptionPane.showInputDialog("enter second number");
        
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        
        int sum = number1 + number2;
        
        JOptionPane.showMessageDialog(null, "the sum is"+sum,"Sum of two integers",JOptionPane.PLAIN_MESSAGE);
        
        System.out.println(number1);
        System.out.println(number2);
        
       
    }
    
}
