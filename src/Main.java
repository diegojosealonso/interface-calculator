import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Calculadora");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);
        ventana.setVisible(true);


        JLabel lblNumero1 = new JLabel("Número 1:");
        lblNumero1.setBounds(30, 30, 80, 30);
        ventana.add(lblNumero1);

        JLabel lblNumero2 = new JLabel("Número 2:");
        lblNumero2.setBounds(30, 80, 80, 30);
        ventana.add(lblNumero2);


        JSpinner primerNumero = new JSpinner(new SpinnerNumberModel(0, -1000, 1000, 1));
        primerNumero.setBounds(120, 30, 100, 30);
        ventana.add(primerNumero);

        JSpinner segundoNumero = new JSpinner(new SpinnerNumberModel(0, -1000, 1000, 1));
        segundoNumero.setBounds(120, 80, 100, 30);
        ventana.add(segundoNumero);


        JButton btnSuma = new JButton("+");
        btnSuma.setBounds(30, 150, 70, 40);
        ventana.add(btnSuma);

        JButton btnResta = new JButton("-");
        btnResta.setBounds(110, 150, 70, 40);
        ventana.add(btnResta);

        JButton btnMultiplicacion = new JButton("×");
        btnMultiplicacion.setBounds(190, 150, 70, 40);
        ventana.add(btnMultiplicacion);

        JButton btnDivision = new JButton("÷");
        btnDivision.setBounds(270, 150, 70, 40);
        ventana.add(btnDivision);


        btnSuma.addActionListener(e -> {
            int n1 = (int) primerNumero.getValue();
            int n2 = (int) segundoNumero.getValue();
            JOptionPane.showMessageDialog(ventana, "Resultado: " + (n1 + n2), "Suma", JOptionPane.INFORMATION_MESSAGE);
        });

        btnResta.addActionListener(e -> {
            int n1 = (int) primerNumero.getValue();
            int n2 = (int) segundoNumero.getValue();
            JOptionPane.showMessageDialog(ventana, "Resultado: " + (n1 - n2), "Resta", JOptionPane.INFORMATION_MESSAGE);
        });

        btnMultiplicacion.addActionListener(e -> {
            int n1 = (int) primerNumero.getValue();
            int n2 = (int) segundoNumero.getValue();
            JOptionPane.showMessageDialog(ventana, "Resultado: " + (n1 * n2), "Multiplicación", JOptionPane.INFORMATION_MESSAGE);
        });

        btnDivision.addActionListener(e -> {
            int n1 = (int) primerNumero.getValue();
            int n2 = (int) segundoNumero.getValue();
            if (n2 == 0) {
                JOptionPane.showMessageDialog(ventana, "Error: no se puede dividir por 0", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(ventana, "Resultado: " + (n1 / n2), "División", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}