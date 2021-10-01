import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.Float;

public class AdditionAndSubtractionAWT {

    public static void main (String[] args) throws InterruptedException  {
        Frame frame = new Frame("Addition & Subtraction Calculator");
        frame.setLayout(null);
        frame.setSize(400, 350);
        frame.setVisible(true);

        TextField firstNumberField = new TextField("0");
        firstNumberField.setBounds(50, 60, 130, 30);
        frame.add(firstNumberField);

        TextField secondNumberField = new TextField("0");
        secondNumberField.setBounds(200, 60, 130, 30);
        frame.add(secondNumberField);

        Checkbox additionCheckbox = new Checkbox("Add");
        additionCheckbox.setBounds(50, 130, 70, 30);
        frame.add(additionCheckbox);

        Checkbox subtractionCheckbox = new Checkbox("Subtract");
        subtractionCheckbox.setBounds(200, 130, 95, 30);
        frame.add(subtractionCheckbox);

        Button calculateButton = new Button("Calculate");
        calculateButton.setBounds(150, 200, 70, 30);
        frame.add(calculateButton);

        TextField additionResultTextField = new TextField("0");
        additionResultTextField.setBounds(50, 270, 130, 30);
        additionResultTextField.setEditable(false);
        frame.add(additionResultTextField);

        TextField subtractionResultTextField = new TextField("0");
        subtractionResultTextField.setBounds(200, 270, 130, 30);
        subtractionResultTextField.setEditable(false);
        frame.add(subtractionResultTextField);

        // Add action listener for button click
        calculateButton.addActionListener(ae -> {
            Float number1 = Float.parseFloat(firstNumberField.getText());
            Float number2 = Float.parseFloat(secondNumberField.getText());
            if(additionCheckbox.getState()) 
                additionResultTextField.setText(String.valueOf(number1 + number2));
            else
                additionResultTextField.setText("0");

            if(subtractionCheckbox.getState()) 
                subtractionResultTextField.setText(String.valueOf(number1 - number2));
            else
                subtractionResultTextField.setText("0");
        });

        // Close window by clicking on close button
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing (WindowEvent e) {
                frame.dispose();
            }
        });

    }
}

