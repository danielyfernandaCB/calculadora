
package calculadora;

import javax.swing.JOptionPane;

public class metodo {
    int a=1;
    int x=0;
    int v=0;
    public void divisao(){
        String numA =
            JOptionPane.showInputDialog("Digite o divisor:");
            int num1= Integer.parseInt( numA );
            String numB =
         JOptionPane.showInputDialog("Digite o dividendo :");
            int num2= Integer.parseInt( numB );
           v=num2/num1;
    }
    
    
    
    public void multiplicacao(){
        v=1;
        String numA =
            JOptionPane.showInputDialog("Digite o 1 número :");
            int num1= Integer.parseInt( numA );
            
            
            
            while(x==0){
             a=a+1;
             
            String numB =
         JOptionPane.showInputDialog("Digite o "+a+" número :");
            int num2= Integer.parseInt( numB );
            
            v=v*num2;
            
            String caixa2=
         JOptionPane.showInputDialog("Deseja add mais algum número ? (S/N) :"); 
            
          if(caixa2.equals ("s")){
              
          }
          if(caixa2.equals("n")){
              
              x=1;
          }
          
             
       }
            v=v*num1;
         JOptionPane.showMessageDialog(null,"O resultado é : "+v ); 
    }
    
    
    
    public void adicao(){
            String numA =
            JOptionPane.showInputDialog("Digite o 1 número :");
            int num1= Integer.parseInt( numA );
            
            
            
            while(x==0){
             a=a+1;
             
            String numB =
         JOptionPane.showInputDialog("Digite o "+a+" número :");
            int num2= Integer.parseInt( numB );
            
            v=v+num2;
            
            String caixa2=
         JOptionPane.showInputDialog("Deseja add mais algum número ? (S/N) :"); 
            
          if(caixa2.equals ("s")){
              
          }
          if(caixa2.equals("n")){
              
              x=1;
          }
          
             
       }
            v=v+num1;
         JOptionPane.showMessageDialog(null,"O resultado é : "+v );     
            
    }
    
    
    
    public void subtracao(){
            
    }
   
    
    
    
}