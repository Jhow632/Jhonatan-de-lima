import javax.swing.JOptionPane;

public class ContagemRegressiva {
    public static void main(String[] args) {
        int numero = 100;
        StringBuilder resultado = new StringBuilder();

        // Loop de contagem regressiva
        while (numero >= 1) {
            numero--;
        }

        // Exibir o resultado em uma janela de diálogo
        JOptionPane.showMessageDialog(null, resultado.toString(), "Contagem Regressiva", JOptionPane.INFORMATION_MESSAGE);
    }
}
