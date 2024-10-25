import javax.swing.JOptionPane;

public class NumerosPares {
    public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder();
        int contador = 1;  // Para contar quantos pares foram encontrados
        int numero = 2;    // Primeiro número par
        
        while (contador <= 100) {
            resultado.append(numero).append("\n");
            numero += 2;   // Incrementa de 2 em 2 para pegar apenas números pares
            contador++;
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
 