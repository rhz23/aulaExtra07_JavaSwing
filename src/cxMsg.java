import javax.swing.*;

public class cxMsg {

    public static void main(String[] args) {
        String x = "Nome";
        int ret =0;

        JOptionPane.showMessageDialog(null, "Valor de x: " + x, "Mostra nome", JOptionPane.PLAIN_MESSAGE);

        x = JOptionPane.showInputDialog(null, "Digite um nome: ", "Entrada de Nome", JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(null, "Valor de x: " + x, "Mostra nome", JOptionPane.PLAIN_MESSAGE);

        ret = JOptionPane.showConfirmDialog(null, "Confirma Nome? " + x, "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION);

        if (ret == 0) {
            JOptionPane.showMessageDialog(null, "O nome esta correto! " + x, "Mostra nome", JOptionPane.PLAIN_MESSAGE);
        }
        else if (ret == 1){
            JOptionPane.showMessageDialog(null, "O nome Não esta correto! " + x, "Mostra nome", JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Operação Cancelada! " + x, "Mostra nome", JOptionPane.PLAIN_MESSAGE);
        }


    }
}
