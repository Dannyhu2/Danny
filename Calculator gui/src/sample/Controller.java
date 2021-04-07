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
        numbers.add(labelNumber.getText());
        operators.add(plus);
        labelNumber.setText("");
        System.out.println(numbers.get(numbers.size()+1));



    }

    public void subtract(ActionEvent actionEvent) {
        labelNumber.setText("");
    }

    public void multiply(ActionEvent actionEvent) {
        labelNumber.setText("");

    }

    public void equals(ActionEvent actionEvent) {
        String number = numbers.get(1);
        labelNumber.setText(String.valueOf(number));
    }

    public void clears(ActionEvent actionEvent) {
        labelNumber.setText("");


    }
    public void addButtons(int num){
        String number=labelNumber.getText()+num;
        labelNumber.setText(number);
    }
}
