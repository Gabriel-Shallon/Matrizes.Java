import javax.swing.JOptionPane;

public class Aula13_10_22 {
    
    public static void main(String[] args){

        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o números de colunas"));
        int l = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o números de linhas"));
        
        int matA[][] = new int[c][l];
        int vetA[] = new int[c];
        
        for (int j = 0; j<matA.length; j++){
            for (int i = 0; i<matA.length; i++){
       
               matA[j][i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o valor da Matriz A["+j+"]["+i+"]"));
       
           }
       }

       
       for (int j = 0; j<matA.length; j++){
        
        for (int i = 0; i<matA.length; i++){
    
            if (matA[j][i]>vetA[j]){
                
           vetA[j] = matA[j][i];

             }
           }
        }
    
    for (int i = 0; i < matA.length; i++){


        JOptionPane.showMessageDialog(null, "O maior número da linha "+i+" é "+vetA[i]+".");


    }
    
    
    } 
}
