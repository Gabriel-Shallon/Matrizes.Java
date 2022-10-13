import javax.swing.JOptionPane;

public class Aula13_10positivossoma {
    
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
   
          if (matA[j][i]>0){

            soma = matA[j][i];

          }

       }
   }

   

    }
}
