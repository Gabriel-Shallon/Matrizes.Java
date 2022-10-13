import javax.swing.JOptionPane;

public class Aula1310 {
    
    public static void main(String[] args){

        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o números de colunas"));
        int l = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o números de linhas"));
        
        int matA[][] = new int[c][l];
        int matB[][] = new int[c][l];
        int matC[][] = new int[c][l];

        for (int j = 0; j<matA.length; j++){
            for (int i = 0; i<matA.length; i++){
       
               matA[j][i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o valor da Matriz A["+j+"]["+i+"]"));
       
           }
       }

       for (int j = 0; j<matA.length; j++){
          for (int i = 0; i<matA.length; i++){
   
           matB[j][i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o valor da Matriz B["+j+"]["+i+"]"));
   
       }
   }

   for (int j = 0; j<matA.length; j++){
      for (int i = 0; i<matA.length; i++){

     matC[j][i] = matA[j][i]+matB[j][i]; 

 }
}

for (int j = 0; j<matA.length; j++){
    for (int i = 0; i<matA.length; i++){

        JOptionPane.showMessageDialog(null, "Matriz A["+j+"]["+i+"]("+matA[j][i]+") + Matriz B["+j+"]["+i+"]("+matB[j][i]+") = "+matC[j][i]);

 }
}

    }
}
