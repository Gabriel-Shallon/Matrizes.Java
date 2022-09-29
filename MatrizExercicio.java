import javax.swing.JOptionPane;

public class MatrizExercicio {
    
    public static void main(String[] args){


        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o tamanho da matriz."));
        
        
        int matA[][] = new int[c][c];
        
        for (int j = 0; j<matA.length; j++){
             for (int i = 0; i<matA.length; i++){
        
                matA[j][i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o valor."));
        
            }
        }
        
        

        for (int j = 0; j<matA.length; j++){
        
            for (int i = 0; i<matA.length; i++){
        
                JOptionPane.showMessageDialog(null, matA[j][i]);
        
            }
        }

        int negativos = 0;
        for (int j = 0; j<matA.length; j++){
        
            for (int i = 0; i<matA.length; i++){
        
                if (matA[j][i]<0){
                    negativos++;
                    JOptionPane.showMessageDialog(null, matA[j][i]+" é negativo");

                }
            }
        }
        JOptionPane.showMessageDialog(null, "Há "+negativos+" numeros negativos na matriz.");

        int i = 0;
        for (int j = 0; j<matA.length; j++){
        i =+ j;
                
              JOptionPane.showMessageDialog(null, matA[j][i]+" faz parte da diagonal principal.");
       
           }
       }

    }

