import javax.swing.JOptionPane;

public class AdditionDialog {
    public static void main(String[] args) {
        
        String num1 = JOptionPane.showInputDialog("Enter first integer");
        String num2 = JOptionPane.showInputDialog("Enter second integer");

        int intNum1 = Integer.parseInt(num1);
        int intNum2 = Integer.parseInt(num2);

        int sum = intNum1 + intNum2;

        String message = String.format("The sum of %d and %d is %d", intNum1, intNum2, sum);
        JOptionPane.showMessageDialog(null, message);
    }
}
