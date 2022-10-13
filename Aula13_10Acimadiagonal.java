import javax.swing.JOptionPane;

public class Aula13_10Acimadiagonal {
    
    public static void main(String[] args){

        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o números de colunas"));
        int l = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o números de linhas"));
        
        int matA[][] = new int[c][l];
        

        for (int j = 0; j<matA.length; j++){
            for (int i = 0; i<matA.length; i++){
       
               matA[j][i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o valor da Matriz A["+j+"]["+i+"]"));
       
           }
       }

       int soma = 0;
       for (int j = 0; j<matA.length; j++){
        for (int i = 0; i<matA.length; i++){
   
     if (j<i){

       soma = soma+matA[j][i]; 

     }

       }
   }

   JOptionPane.showMessageDialog(null, "A soma dos números acima da diagonal é "+soma);

    }
}

 
