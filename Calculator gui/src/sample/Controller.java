package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class Controller {
    public Label labelNumber;
    public ArrayList<String> numbers = new ArrayList<>();
    public ArrayList<String> operators = new ArrayList<>();
    String plus = "plus";
    String minus = "minus";
    String multiply = "multiply";
    String firstNumber = "";
    String secondNumber = "";
    String total = "";
    int a = 0;
    boolean lastButtonIsOperator = false;

    public void setZero(ActionEvent actionEvent) {
        addButtons(0);
    }

    public void setOne(ActionEvent actionEvent) {
        addButtons(1);
    }

    public void setTwo(ActionEvent actionEvent) {
        addButtons(2);
    }

    public void setThree(ActionEvent actionEvent) {
        addButtons(3);
    }

    public void setFour(ActionEvent actionEvent) {
        addButtons(4);
    }

    public void setFive(ActionEvent actionEvent) {
        addButtons(5);
    }

    public void setSix(ActionEvent actionEvent) {
        addButtons(6);
    }

    public void setSeven(ActionEvent actionEvent) {
        addButtons(7);
    }

    public void setEight(ActionEvent actionEvent) {
        addButtons(8);
    }

    public void setNine(ActionEvent actionEvent) {
        addButtons(9);
    }

    public void add(ActionEvent actionEvent) {
        addOperators(plus);
    }

    public void subtract(ActionEvent actionEvent) {
        addOperators(minus);
    }

    public void multiply(ActionEvent actionEvent) {
        addOperators(multiply);
    }

    public void equals(ActionEvent actionEvent) {
        numbers.add(labelNumber.getText());
        for (int i = 0; i < numbers.size(); ) {

            Integer.parseInt(numbers.get(i++));
        }
        for (int i = 0; i < operators.size(); ) {
            if (operators.get(i++) == plus) {
                int total = (Integer.valueOf(numbers.get(i++)) + Integer.valueOf(numbers.get(a)));
                labelNumber.setText(Integer.toString(total));
                a++;
            }
            if (operators.get(i++) == minus) {
                int total = (Integer.valueOf(numbers.get(i++)) - Integer.valueOf(numbers.get(1)));
                labelNumber.setText(Integer.toString(total));
            }
            if (operators.get(i++) == multiply) {
                int total = (Integer.valueOf(numbers.get(i++)) * Integer.valueOf(numbers.get(1)));
                labelNumber.setText(Integer.toString(total));
            }
        }
    }
    public void clears(ActionEvent actionEvent) {
        labelNumber.setText("");
        numbers.clear();
        operators.clear();
        lastButtonIsOperator = false;
    }

    public void addButtons(int num) {
        String number = labelNumber.getText() + num;
        labelNumber.setText(number);
        lastButtonIsOperator = false;
    }

    public void addOperators(String operator) {
        if (lastButtonIsOperator == false) {
            lastButtonIsOperator = true;
            operators.add(operator);
            numbers.add(labelNumber.getText());
            System.out.println(numbers.size() + 1);
            labelNumber.setText("");
        }
    }
}