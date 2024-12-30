package practice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class IntegerDivisionApp {
public static void main(String[] args) {
JFrame frame = new JFrame("Integer Division");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(300, 200);
frame.setLayout(new FlowLayout());
JLabel label1 = new JLabel("Num1:");
JTextField num1Field = new JTextField(10);
JLabel label2 = new JLabel("Num2:");
JTextField num2Field = new JTextField(10);
JButton divideButton = new JButton("Divide");
JLabel resultLabel = new JLabel("Result:");
frame.add(label1);
frame.add(num1Field);
frame.add(label2);
frame.add(num2Field);
frame.add(divideButton);
frame.add(resultLabel);
divideButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {

try {
int num1 = Integer.parseInt(num1Field.getText());
int num2 = Integer.parseInt(num2Field.getText());
if (num2 == 0) {
throw new ArithmeticException("Cannot divide by
zero");
}
int result = num1 / num2;
resultLabel.setText("Result: " + result);
} catch (NumberFormatException ex) {
JOptionPane.showMessageDialog(frame, "Invalid input! Please enter integers only.");
} catch (ArithmeticException ex) {
JOptionPane.showMessageDialog(frame,
ex.getMessage());
}
}
});
frame.setVisible(true);
}
}