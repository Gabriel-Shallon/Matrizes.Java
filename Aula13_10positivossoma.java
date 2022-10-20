import javax.swing.JOptionPane;

public class Aula13_10positivossoma {
    
    public static void main(String[] args){

        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o números de colunas"));
        int l = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o números de linhas"));
        
        int matA[][] = new int[c][l];
        int matB[][] = new int[c][l];
        

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

   int a =  Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma linha."));

   for (int i = 0; i < matA.length; i++){

        JOptionPane.showMessageDialog(null, "Matriz A["+a+"]["+i+"] = "+matA[a][i]);

   }

   int b =  Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma coluna."));

   for (int i = 0; i < matA.length; i++){

        JOptionPane.showMessageDialog(null, "Matriz A["+b+"]["+i+"] = "+matA[b][i]);

   }

   for (int i = 0; i < matA.length; i++){
    for (int j = 0; j < matA.length; i++){
    if (i==j){

        JOptionPane.showMessageDialog(null, matA[i][j]+" faz parte da diagonal principal.");

    }

    }

   }

   int aa = 0;
   for (int i = 0; i < matA.length; i++){
    for (int j = 0; j < matA.length; i++){

        matB[j][i] = matA[j][i];
        if (matA[j][i]<0){

          matB[j][i] = matA[j][i]*matA[j][i];

        }

    }
}

for (int i = 0; i < matA.length; i++){
    for (int j = 0; j < matA.length; i++){

        JOptionPane.showMessageDialog(null, "Matriz A["+i+"]["+j+"] = "+matA[i][j]+".");

    }
}


    }
}
