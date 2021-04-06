package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Controller {
    public Label labelname;
    public Label number;
    public AnchorPane labelNumber;

    public void changename(ActionEvent actionEvent) {
        labelname.setText("whatever");
    }

    public void add1(ActionEvent actionEvent) {
        int number = Integer.parseInt(labelNumber.getId());
        number++;
        String num = Integer.toString(number);
        labelNumber.setId(num);
    }
}
