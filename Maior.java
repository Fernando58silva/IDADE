import javax.swing.JOptionPane; // Import the necessary package

public class Maior {
    public static void main(String[] args) {
        int idade;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));

        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Maior de idade");
        } else {
            JOptionPane.showMessageDialog(null, "Menor de idade");
        }
    }
}