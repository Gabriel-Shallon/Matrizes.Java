import javax.swing.JOptionPane;

public class Matriz {
    
    public static void main(String[] args){

int[][] matA = new int[3][3];


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

    }
}