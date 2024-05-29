import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UnitConverter extends JFrame {
    private JTextField inputField;
    private JComboBox<String> unitFrom;
    private JComboBox<String> unitTo;
    private JLabel resultLabel;

    public UnitConverter() {
        setTitle("Conversor de Unidades");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel inputLabel = new JLabel("Valor:");
        inputLabel.setBounds(20, 20, 50, 20);
        add(inputLabel);

        inputField = new JTextField();
        inputField.setBounds(80, 20, 100, 20);
        add(inputField);

        String[] units = {"km", "m", "cm"};
        unitFrom = new JComboBox<>(units);
        unitFrom.setBounds(200, 20, 60, 20);
        add(unitFrom);

        unitTo = new JComboBox<>(units);
        unitTo.setBounds(280, 20, 60, 20);
        add(unitTo);

        JButton convertButton = new JButton("Converter");
        convertButton.setBounds(150, 60, 100, 30);
        add(convertButton);

        resultLabel = new JLabel("Resultado:");
        resultLabel.setBounds(20, 100, 350, 20);
        add(resultLabel);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertUnits();
            }
        });
    }

    private void convertUnits() {
        try {
            double input = Double.parseDouble(inputField.getText());
            String fromUnit = (String) unitFrom.getSelectedItem();
            String toUnit = (String) unitTo.getSelectedItem();
            double result = convert(input, fromUnit, toUnit);
            resultLabel.setText("Resultado: " + result + " " + toUnit);
        } catch (NumberFormatException e) {
            resultLabel.setText("Por favor, insira um número válido.");
        }
    }

    private double convert(double value, String fromUnit, String toUnit) {
        if (fromUnit.equals(toUnit)) {
            return value;
        }

        // Converter para metros primeiro
        switch (fromUnit) {
            case "km":
                value *= 1000;
                break;
            case "cm":
                value /= 100;
                break;
        }

        // Converter de metros para a unidade desejada
        switch (toUnit) {
            case "km":
                return value / 1000;
            case "cm":
                return value * 100;
        }

        return value; // Para metros
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UnitConverter().setVisible(true);
            }
        });
    }
}
