package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class Controller {
    public Label labelNumber;

    public void setZero(ActionEvent actionEvent) {

    }

    public void setOne(ActionEvent actionEvent) {
    }

    public void setTwo(ActionEvent actionEvent) {
    }

    public void setThree(ActionEvent actionEvent) {
    }

    public void setFour(ActionEvent actionEvent) {
    }

    public void setFive(ActionEvent actionEvent) {
    }

    public void setSix(ActionEvent actionEvent) {
    }

    public void setSeven(ActionEvent actionEvent) {
    }

    public void setEight(ActionEvent actionEvent) {
    }

    public void setNine(ActionEvent actionEvent) {
    }

    public void add(ActionEvent actionEvent) {
        int number = Integer.parseInt(labelNumber.getId());
        number++;
        String num = Integer.toString(number);
        labelNumber.setId(num);
    }

    public void subtract(ActionEvent actionEvent) {
    }

    public void multiply(ActionEvent actionEvent) {
    }

    public void equals(ActionEvent actionEvent) {
    }

    public void clears(ActionEvent actionEvent) {
    }
}
