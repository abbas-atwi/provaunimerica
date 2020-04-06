import javax.swing.*;
public class TryTratamentoDeErros {
    public static void main(String[] args) {

//        O try ele verificar se o numero ou algum valor foi do tipo inteiro pois o numero e do tipo inteiro, caso for ele vai rodar certinho
//        caso nao , ele vai cair pro catch e exibir o erro
//        e o finally e o fim da execuçao!
//        Abbas Atwi.

        int numero;
        try {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
            JOptionPane.showConfirmDialog(null, "O numero digitado foi: " + numero);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Valor invalido ! ERRO:" + erro);
        } finally {
            JOptionPane.showMessageDialog(null, "fim");
        }
    }
}
