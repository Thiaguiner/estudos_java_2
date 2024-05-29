
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorDeUnidade extends JFrame {

    private JTextField inputField;
    private JComboBox<String> fromUnit;
    private JComboBox<String> toUnit;
    private JLabel resultLabel;

    public ConversorDeUnidade() {
        setTitle("Conversor de Unidades");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();

        inputField = new JTextField(10);
        panel.add(inputField);

        String[] units = {"Quilometros", "Metros", "Centímetros"};
        fromUnit = new JComboBox<>(units);
        panel.add(fromUnit);

        JLabel toLabel = new JLabel(" para ");
        panel.add(toLabel);

        toUnit = new JComboBox<>(units);
        panel.add(toUnit);

        JButton convertButton = new JButton("Converter");
        convertButton.addActionListener(new ConvertAction());
        panel.add(convertButton);

        resultLabel = new JLabel("Resultado: ");
        panel.add(resultLabel);

        add(panel);
    }

    private class ConvertAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double inputValue = Double.parseDouble(inputField.getText());
                String from = (String) fromUnit.getSelectedItem();
                String to = (String) toUnit.getSelectedItem();
                double result = convertUnits(inputValue, from, to);
                resultLabel.setText("Resultado: " + result);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(ConversorDeUnidade.this, "Por favor, insira um número válido.", "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        private double convertUnits(double value, String from, String to) {
            if (from.equals(to)) {
                return value;
            }

            double meters = 0;
            switch (from) {
                case "Quilometros":
                    meters = value * 1000;
                    break;
                case "Metros":
                    meters = value;
                    break;
                case "Centímetros":
                    meters = value / 100;
                    break;
            }

            switch (to) {
                case "Quilometros":
                    return meters / 1000;
                case "Metros":
                    return meters;
                case "Centímetros":
                    return meters * 100;
            }

            return 0;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ConversorDeUnidade converter = new ConversorDeUnidade();
            converter.setVisible(true);
        });
    }
}
