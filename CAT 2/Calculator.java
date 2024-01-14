import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame implements ActionListener {
    // Textfield to display input and result
    TextField textField;

    // Store operator and operands
    String operator;
    double num1, num2, result;

    // Constructor
    public Calculator() {
        // Create a frame with a specified title
        super("Calculator");

        // Create a textfield
        textField = new TextField();
        textField.setBounds(30, 40, 280, 30);
        textField.setEditable(false);
        add(textField);

        // Create number buttons
        Button[] numberButtons = new Button[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new Button(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        // Create operator buttons
        Button addButton = new Button("+");
        Button subtractButton = new Button("-");
        Button multiplyButton = new Button("*");
        Button divideButton = new Button("/");
        Button equalButton = new Button("=");
        Button clearButton = new Button("C");

        // Set bounds for number buttons
        int x = 40, y = 100, width = 50, height = 50;
        for (int i = 1; i < 10; i++) {
            numberButtons[i].setBounds(x, y, width, height);
            x += 60;
            if (i % 3 == 0) {
                x = 40;
                y += 60;
            }
            add(numberButtons[i]);
        }

        // Set bounds for '0' button
        numberButtons[0].setBounds(40, 280, width, height);
        add(numberButtons[0]);

        // Set bounds for operator buttons
        addButton.setBounds(130, 280, width, height);
        subtractButton.setBounds(190, 280, width, height);
        multiplyButton.setBounds(250, 280, width, height);
        divideButton.setBounds(310, 280, width, height);
        equalButton.setBounds(40, 340, 320, height);
        clearButton.setBounds(40, 400, 320, height);

        // Add action listeners to operator buttons
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        equalButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Add buttons to the frame
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(equalButton);
        add(clearButton);

        // Set layout and size of the frame
        setLayout(null);
        setSize(400, 500);
        setVisible(true);
    }

    // ActionEvent handler
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if ((command.charAt(0) >= '0' && command.charAt(0) <= '9') || command.equals(".")) {
            textField.setText(textField.getText() + command);
        } else if (command.charAt(0) == 'C') {
            textField.setText("");
            num1 = num2 = result = 0;
            operator = "";
        } else if (command.charAt(0) == '=') {
            num2 = Double.parseDouble(textField.getText());

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }

            textField.setText(String.valueOf(result));
            num1 = result;
            operator = "";
        } else {
            if (!operator.isEmpty()) {
                return;
            }
            operator = command;
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
