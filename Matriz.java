import javax.swing.JOptionPane;

public class Matriz {
    
    public static void main(String[] args){

int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o números de colunas"));
int l = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o números de colunas"));

int matA[][] = new int[c][l];

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