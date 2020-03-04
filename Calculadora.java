
package calculadora;

import javax.swing.JOptionPane;
public class Calculadora {

    public static void main(String[] args) {
        metodo w= new metodo();
       
       
        String caixa1 = 
        JOptionPane.showInputDialog( "Deseja fazer que tipo de operação ? (Divisão(1), Multiplicação(2), Adição(3), Subtração(4))" );
        int resp1= Integer.parseInt( caixa1 );
       
        if(resp1==1){
            w.divisao();     
        }
         if(resp1==2){
            w.multiplicacao();     
        }
          if(resp1==3){
            w.adicao();     
        }
           if(resp1==4){
            w.subtracao();     
        }
           
        
        
        
        
        
        
        
        
        }
    
}

