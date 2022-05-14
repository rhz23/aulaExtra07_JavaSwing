import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Janela implements ActionListener {

    //instanciar um JFrame
    public static JFrame jan1 = new JFrame("Titulo Janela 1");

    //Label do Jframe
    private static JLabel rotuloCPF = new JLabel();
    private static JLabel rotuloNome = new JLabel();
    //caixa de texto do JFrame
    private static JTextField caixaCPF = new JTextField(15);
    private static JTextField caixaNome = new JTextField(25);
    //Botão do JFrame
    private static JButton botaoFechar = new JButton("Fechar");
    private static JButton botaLimpar = new JButton("Limpar");
    //Janela JFrame
    private static Janela j =  new Janela();

    public static void main(String[] args) {

        int larg = 1000, alt = 200;
        //atribuindo largura e altura para a janela
        jan1.setSize(larg, alt);

        //String titulo = JOptionPane.showInputDialog(null, "Informe o titulo para a janela", "Novo nome", 0 );
        //jan1.setTitle(titulo);

        //setando titulo para a janela
        jan1.setTitle("Primeira Janela");
        //tornando a janela visivel
        jan1.setVisible(true);

        rotuloCPF.setText("CPF: ");
        rotuloNome.setText("Nome: ");

        jan1.add(rotuloCPF);
        jan1.add(caixaCPF);
        jan1.add(rotuloNome);
        jan1.add(caixaNome);
        jan1.add(botaLimpar);
        jan1.add(botaoFechar);

        botaoFechar.addActionListener(j);
        botaLimpar.addActionListener(j);

        jan1.setLayout(new FlowLayout());

        jan1.setDefaultCloseOperation(jan1.EXIT_ON_CLOSE);
        //jan1.setDefaultCloseOperation(jan1.DISPOSE_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(botaoFechar)){
            fecharAplicacao();
        }
        if (e.getSource().equals(botaLimpar)){
            limparCaixas();
        }
    }

    public void fecharAplicacao(){
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar a aplicação?", "Fechar?", JOptionPane.YES_NO_CANCEL_OPTION);
        //verificando retorno
        //JOptionPane.showMessageDialog(null, resposta);
        if (resposta == 0){
            jan1.dispose();
        }
    }

    public void limparCaixas(){
        caixaCPF.setText("");
        caixaNome.setText("");
        caixaCPF.requestFocus();

    }
}