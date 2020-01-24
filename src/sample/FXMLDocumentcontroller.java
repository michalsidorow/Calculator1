package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLDocumentcontroller implements Initializable {

    double data=0;
    int operation = -1;
    double memory = 0.0;
    int counter = 0;

    @FXML
    private Button clear;

    @FXML
    private Button sign;

    @FXML
    private Button percent;

    @FXML
    private Button split;

    @FXML
    private Button eight;

    @FXML
    private Button seven;

    @FXML
    private Button nine;

    @FXML
    private Button multiplication;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button minus;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button trhee;

    @FXML
    private Button plus;

    @FXML
    private Button dot;

    @FXML
    private Button equals;

    @FXML
    private Button zero;

    @FXML
    private TextField display;

    @FXML
    public void handleButtonAction(ActionEvent event) {
        if(event.getSource() == one){
            display.setText(display.getText()+"1");
        }else if(event.getSource() == two){
            display.setText(display.getText()+"2");
        }else if(event.getSource() == trhee){
            display.setText(display.getText()+"3");
        }else if(event.getSource() == four){
            display.setText(display.getText()+"4");
        }else if(event.getSource() == five){
            display.setText(display.getText()+"5");
        }else if(event.getSource() == six){
            display.setText(display.getText()+"6");
        }else if(event.getSource() == seven){
            display.setText(display.getText()+"7");
        }else if(event.getSource() == eight){
            display.setText(display.getText()+"8");
        }else if(event.getSource() == nine){
            display.setText(display.getText()+"9");
        }else if(event.getSource() == zero){
            display.setText(display.getText()+"0");
        }else if(event.getSource() == dot){
            display.setText(display.getText()+".");
        }else if(event.getSource() == clear){
            display.setText("");
        }else if(event.getSource() == plus){
            data = Double.parseDouble(display.getText());
            operation = 1;
            display.setText("");
        }else if(event.getSource() == minus){
            data = Double.parseDouble(display.getText());
            operation = 2;
            display.setText("");
        }else if(event.getSource() == multiplication){
            data = Double.parseDouble(display.getText());
            operation = 3;
            display.setText("");
        }else if(event.getSource() == split){
            data = Double.parseDouble(display.getText());
            operation = 4;
            display.setText("");
        }else if(event.getSource() == sign){
            data = Double.parseDouble(display.getText())*(-1);
            display.setText(Double.toString(data));
        }else if(event.getSource() == percent){
            data = Double.parseDouble(display.getText())*0.01;
            display.setText(Double.toString(data));
        }else if(event.getSource() == equals){
            double secondOperation = Double.parseDouble(display.getText());
            double result = 0.0;
            switch (operation){
                case 1:
                    result = data + secondOperation;
                    display.setText(String.valueOf(result));
                    break;
                case 2:
                    result = data - secondOperation;
                    display.setText(String.valueOf(result));
                    break;
                case 3:
                    result = data * secondOperation;
                    display.setText(String.valueOf(result));
                    break;
                case 4:
                    try{
                        result = data / secondOperation;
                    }catch(Exception e){
                        display.setText("Come on man don't test me");
                    }
                    display.setText(String.valueOf(result));
                    break;
            }
        }
    }

    public void onButtonClicked(){
        System.out.println("Hello");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
