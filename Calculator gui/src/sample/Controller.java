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
    String times = "times";
    String total = "";
    int total1 = 0;
    int total2 = 0;
    int total3 = 0;
    int total4 = 0;
    int total5 = 0;
    boolean lastButtonIsOperator = false;
//button methods
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
        addOperators(times);
    }
    public void equals(ActionEvent actionEvent) {
        numbers.add(labelNumber.getText());
        addEquals0(0,1);
        addEquals(1,2);
        addEquals2(2,3);
        addEquals3(3,4);
        addEquals4(4,5);
        }
    public void clears(ActionEvent actionEvent) {
        labelNumber.setText("");
        numbers.clear();
        operators.clear();
        lastButtonIsOperator = false;
        total1 = 0;
        total2 = 0;
        total3 = 0;
        total4 = 0;
        total5 = 0;
    }
//method for adding buttons
    public void addButtons(int num) {
        String number = labelNumber.getText() + num;
        labelNumber.setText(number);
        lastButtonIsOperator = false;
    }
//method for adding operators
    public void addOperators(String operator) {
        if (lastButtonIsOperator == false) {
            lastButtonIsOperator = true;
            operators.add(operator);
            numbers.add(labelNumber.getText());
            System.out.println(numbers.size() + 1);
            labelNumber.setText("");
        }
    }
    //other methods
    public void addEquals0(int a, int b) {
        if (operators.get(0) == plus) {
            int total = (Integer.valueOf(numbers.get(0)) + Integer.valueOf(numbers.get(1)));
            total1 = total;
            labelNumber.setText(Integer.toString(total));

        }
        if (operators.get(0) == minus) {
            int total = (Integer.valueOf(numbers.get(0)) - Integer.valueOf(numbers.get(1)));
            total1 = total;
            labelNumber.setText(Integer.toString(total));
        }
        if (operators.get(0) == times) {
            int total = (Integer.valueOf(numbers.get(0)) * Integer.valueOf(numbers.get(1)));
            labelNumber.setText(Integer.toString(total));
            total1 =total;
        }
    }
    public void addEquals(int a, int b) {
        if (operators.get(a) == plus) {
            int total = (total1 + Integer.valueOf(numbers.get(b)));
            labelNumber.setText(Integer.toString(total));
            total2 = total;
        }
        if (operators.get(a) == minus) {
            int total = (total1 - Integer.valueOf(numbers.get(b)));
            labelNumber.setText(Integer.toString(total));
            total2 = total;
        }
        if (operators.get(a) == times) {
            int total = (total1 * Integer.valueOf(numbers.get(b)));
            labelNumber.setText(Integer.toString(total));
            total2 = total;
        }

    }
    public void addEquals2(int a, int b) {
        if (operators.get(a) == plus) {
            int total = (total2 + Integer.valueOf(numbers.get(b)));
            labelNumber.setText(Integer.toString(total));
            total3 = total;
        }
        if (operators.get(a) == minus) {
            int total = (total2 - Integer.valueOf(numbers.get(b)));
            labelNumber.setText(Integer.toString(total));
            total3 = total;
        }
        if (operators.get(a) == times) {
            int total = (total2 * Integer.valueOf(numbers.get(b)));
            labelNumber.setText(Integer.toString(total));
            total3 = total;
        }

    }
    public void addEquals3(int a, int b) {
        if (operators.get(a) == plus) {
            int total = (total3 + Integer.valueOf(numbers.get(b)));
            labelNumber.setText(Integer.toString(total));
            total4 = total;
        }
        if (operators.get(a) == minus) {
            int total = (total3 - Integer.valueOf(numbers.get(b)));
            labelNumber.setText(Integer.toString(total));
            total4 = total;
        }
        if (operators.get(a) == times) {
            int total = (total3 * Integer.valueOf(numbers.get(b)));
            labelNumber.setText(Integer.toString(total));
            total4 = total;
        }

    }
    public void addEquals4(int a, int b) {
        if (operators.get(a) == plus) {
            int total = (total4 + Integer.valueOf(numbers.get(b)));
            labelNumber.setText(Integer.toString(total));
            total5 = total;
        }
        if (operators.get(a) == minus) {
            int total = (total4 - Integer.valueOf(numbers.get(b)));
            labelNumber.setText(Integer.toString(total));
            total5 = total;
        }
        if (operators.get(a) == times) {
            int total = (total4 * Integer.valueOf(numbers.get(b)));
            labelNumber.setText(Integer.toString(total));
            total5 = total;
        }

    }
}