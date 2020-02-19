
package cauculadora;

import javax.swing.JOptionPane;
public class Cauculadora {

  
    public static void main(String[] args) {
        
        double operacao=0;
        
        String num1 = 
                JOptionPane.showInputDialog("digite o primeiro numero");
        
        String num2 = 
                JOptionPane.showInputDialog("digite o segundo numero");
        
        
        int numero1= Integer.parseInt(num1);
        
        int numero2= Integer.parseInt(num2);
        
                
      
        String resp =
            JOptionPane.showInputDialog("Escolha a operacao que deseja realizar:"
                    + " 1 para soma\n" +
"        2 para subtracao\n" +
"        3 para multiplicacao\n" +
"        4 para divisao");
        
                
        if(resp.equals("1")){
            double soma=numero1+numero2;
            operacao=soma;
        }else{
            if(resp.equals("2")){
                double subtracao=numero1-numero2;
                operacao=subtracao;
            }else{
                if(resp.equals("3")){
                    double multi=numero1*numero2;
                    operacao=multi;
                }else{
                    if(resp.equals("4")){
                        double divisao=numero1/numero2;
                        operacao=divisao;
                    }
                }
                
            }
        }
        
        JOptionPane.showMessageDialog(null,"O resultado da sua operacao e:"+operacao);
        
        
        
        
        
        
        
    }
    
}
