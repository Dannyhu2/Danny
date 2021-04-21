package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;

public class Controller {

    public TextField textAge;
    public TextField textPhoneNumber;
    public TextField textName;
    public ListView<Friend> listProducts = new ListView<>();
    public Label labelName;
    public Label labelPhoneNumber;
    public Label labelAge;

    public void addFriend(ActionEvent actionEvent) {
        String name = textName.getText();
        int age = Integer.parseInt(textAge.getText());
        String phoneNumber = textPhoneNumber.getText();
        Friend product = new Friend(name,phoneNumber,age);
        listProducts.getItems().add(product);
        textAge.clear();
        textPhoneNumber.clear();
        textName.clear();
    }

    public void displayFriend(MouseEvent mouseEvent) {
        Friend product =listProducts.getSelectionModel().getSelectedItem();
        if(product == null){
            return;
        }
        labelName.setText("Name: "+product.getName());
        String age = Integer.toString(product.getAge());
        labelAge.setText("Age: "+age);
        labelPhoneNumber.setText("Phone Number: "+product.getPhoneNumber());

    }

    public void deleteFriend(ActionEvent actionEvent) {
        Friend product =listProducts.getSelectionModel().getSelectedItem();
        if(product == null){
            return;
        }
        listProducts.getItems().remove(product);
        labelAge.setText("Age: ");
        labelName.setText("Name ");
        labelPhoneNumber.setText("Phone Number: ");
    }


        }
