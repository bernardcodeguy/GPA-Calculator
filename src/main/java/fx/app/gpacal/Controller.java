package fx.app.gpacal;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller  {

    @FXML
    private Button btnCalc;
    @FXML
    private Button btnClear;
    @FXML
    private TextField gpaTxtField;

    @FXML
    private TextField courseTxt1;
    @FXML
    private TextField courseTxt2;
    @FXML
    private TextField courseTxt3;
    @FXML
    private TextField courseTxt4;
    @FXML
    private TextField courseTxt5;
    @FXML
    private TextField courseTxt6;
    @FXML
    private TextField courseTxt7;
    @FXML
    private TextField courseTxt8;
    @FXML
    private TextField courseTxt9;
    @FXML
    private TextField courseTxt10;

    @FXML
    private ComboBox cbx1;
    @FXML
    private ComboBox cbx2;
    @FXML
    private ComboBox cbx3;
    @FXML
    private ComboBox cbx4;
    @FXML
    private ComboBox cbx5;
    @FXML
    private ComboBox cbx6;
    @FXML
    private ComboBox cbx7;
    @FXML
    private ComboBox cbx8;
    @FXML
    private ComboBox cbx9;
    @FXML
    private ComboBox cbx10;

    @FXML
    private ComboBox cbxG1;
    @FXML
    private ComboBox cbxG2;
    @FXML
    private ComboBox cbxG3;
    @FXML
    private ComboBox cbxG4;
    @FXML
    private ComboBox cbxG5;
    @FXML
    private ComboBox cbxG6;
    @FXML
    private ComboBox cbxG7;
    @FXML
    private ComboBox cbxG8;
    @FXML
    private ComboBox cbxG9;
    @FXML
    private ComboBox cbxG10;

    private final double A_GPT = 4.00;
    private final double A_NEG_GPT = 3.67;
    private final double B_PLUS_GPT = 3.33;
    private final double B_GPT = 3.00;
    private final double B_NEG_GPT = 2.67;
    private final double C_PLUS_GPT = 2.33;
    private final double C_GPT = 2.00;
    private final double C_NEG_GPT = 1.67;
    private final double D_GPT = 1.00;
    private final double F_GPT = 0.00;

    private int hr1,hr2,hr3,hr4,hr5,hr6,hr7,hr8,hr9,hr10;

    private String selectedCBX1,selectedCBX2,selectedCBX3,selectedCBX4,selectedCBX5,selectedCBX6,selectedCBX7,selectedCBX8,selectedCBX9,selectedCBX10;

    private String selectedCBXG1,selectedCBXG2,selectedCBXG3,selectedCBXG4,selectedCBXG5,selectedCBXG6,selectedCBXG7,selectedCBXG8,selectedCBXG9,selectedCBXG10;

    private double grade1,grade2,grade3,grade4,grade5,grade6,grade7,grade8,grade9,grade10;




    public void initialize() {
        ObservableList <String> optionsCreHr = FXCollections.observableArrayList("1","2","3","4","5","6");
        ObservableList <String> optionsGrad = FXCollections.observableArrayList("A","A-","B+","B","B-","C+","C","C-","D","F");

        // Credit Hours Combo Boxes
        cbx1.setItems(optionsCreHr);
        cbx2.setItems(optionsCreHr);
        cbx3.setItems(optionsCreHr);
        cbx4.setItems(optionsCreHr);
        cbx5.setItems(optionsCreHr);
        cbx6.setItems(optionsCreHr);
        cbx7.setItems(optionsCreHr);
        cbx8.setItems(optionsCreHr);
        cbx9.setItems(optionsCreHr);
        cbx10.setItems(optionsCreHr);

        // Grades Combo Boxes
        cbxG1.setItems(optionsGrad);
        cbxG2.setItems(optionsGrad);
        cbxG3.setItems(optionsGrad);
        cbxG4.setItems(optionsGrad);
        cbxG5.setItems(optionsGrad);
        cbxG6.setItems(optionsGrad);
        cbxG7.setItems(optionsGrad);
        cbxG8.setItems(optionsGrad);
        cbxG9.setItems(optionsGrad);
        cbxG10.setItems(optionsGrad);



    }




    public void clearField(ActionEvent actionEvent) {

        gpaTxtField.clear();
        courseTxt1.clear();
        courseTxt2.clear();
        courseTxt3.clear();
        courseTxt4.clear();
        courseTxt5.clear();
        courseTxt6.clear();
        courseTxt7.clear();
        courseTxt8.clear();
        courseTxt9.clear();
        courseTxt10.clear();



    }




    public void calcGPA(ActionEvent actionEvent) {


        assignSelectedCreHr();
        assignSelectedGrade();

        long totalCreditHrs = totalCreditHrs();

        double gradeTxHrs = gradeTxHrs();

       double gpa = gradeTxHrs/totalCreditHrs;



       gpaTxtField.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
       gpaTxtField.setText(String.format("%.2f",gpa));


    }

    private double gradeTxHrs() {

        if(selectedCBXG1.equals("A")){
            grade1 = A_GPT;
        }else if(selectedCBXG1.equals("A-")){
            grade1 = A_NEG_GPT;
        }else if(selectedCBXG1.equals("B+")){
            grade1 = B_PLUS_GPT;
        }else if(selectedCBXG1.equals("B")){
            grade1 = B_GPT;
        }else if(selectedCBXG1.equals("B-")){
            grade1 = B_NEG_GPT;
        }else if(selectedCBXG1.equals("C+")){
            grade1 = C_PLUS_GPT;
        }else if(selectedCBXG1.equals("C")){
            grade1 = C_GPT;
        }else if(selectedCBXG1.equals("C-")){
            grade1 = C_NEG_GPT;
        }else if(selectedCBXG1.equals("D")){
            grade1 = D_GPT;
        }else if(selectedCBXG1.equals("F")){
            grade1 = F_GPT;
        } else{
            grade1 = 0.00;
        }

        if(selectedCBXG2.equals("A")){
            grade2 = A_GPT;
        }else if(selectedCBXG2.equals("A-")){
            grade2 = A_NEG_GPT;
        }else if(selectedCBXG2.equals("B+")){
            grade2 = B_PLUS_GPT;
        }else if(selectedCBXG2.equals("B")){
            grade2 = B_GPT;
        }else if(selectedCBXG2.equals("B-")){
            grade2 = B_NEG_GPT;
        }else if(selectedCBXG2.equals("C+")){
            grade2 = C_PLUS_GPT;
        }else if(selectedCBXG2.equals("C")){
            grade2 = C_GPT;
        }else if(selectedCBXG2.equals("C-")){
            grade2 = C_NEG_GPT;
        }else if(selectedCBXG2.equals("D")){
            grade2 = D_GPT;
        }else if(selectedCBXG2.equals("F")){
            grade2 = F_GPT;
        } else{
            grade2 = 0.00;
        }

        if(selectedCBXG3.equals("A")){
            grade3 = A_GPT;
        }else if(selectedCBXG3.equals("A-")){
            grade3 = A_NEG_GPT;
        }else if(selectedCBXG3.equals("B+")){
            grade3 = B_PLUS_GPT;
        }else if(selectedCBXG3.equals("B")){
            grade3 = B_GPT;
        }else if(selectedCBXG3.equals("B-")){
            grade3 = B_NEG_GPT;
        }else if(selectedCBXG3.equals("C+")){
            grade3 = C_PLUS_GPT;
        }else if(selectedCBXG3.equals("C")){
            grade3 = C_GPT;
        }else if(selectedCBXG3.equals("C-")){
            grade3 = C_NEG_GPT;
        }else if(selectedCBXG3.equals("D")){
            grade3 = D_GPT;
        }else if(selectedCBXG3.equals("F")){
            grade3 = F_GPT;
        } else{
            grade3 = 0.00;
        }

        if(selectedCBXG4.equals("A")){
            grade4 = A_GPT;
        }else if(selectedCBXG4.equals("A-")){
            grade4 = A_NEG_GPT;
        }else if(selectedCBXG4.equals("B+")){
            grade4 = B_PLUS_GPT;
        }else if(selectedCBXG4.equals("B")){
            grade4 = B_GPT;
        }else if(selectedCBXG4.equals("B-")){
            grade4 = B_NEG_GPT;
        }else if(selectedCBXG4.equals("C+")){
            grade4 = C_PLUS_GPT;
        }else if(selectedCBXG4.equals("C")){
            grade4 = C_GPT;
        }else if(selectedCBXG4.equals("C-")){
            grade4 = C_NEG_GPT;
        }else if(selectedCBXG4.equals("D")){
            grade4 = D_GPT;
        }else if(selectedCBXG4.equals("F")){
            grade4 = F_GPT;
        } else{
            grade4 = 0.00;
        }

        if(selectedCBXG5.equals("A")){
            grade5 = A_GPT;
        }else if(selectedCBXG5.equals("A-")){
            grade5 = A_NEG_GPT;
        }else if(selectedCBXG5.equals("B+")){
            grade5 = B_PLUS_GPT;
        }else if(selectedCBXG5.equals("B")){
            grade5 = B_GPT;
        }else if(selectedCBXG5.equals("B-")){
            grade5 = B_NEG_GPT;
        }else if(selectedCBXG5.equals("C+")){
            grade5 = C_PLUS_GPT;
        }else if(selectedCBXG5.equals("C")){
            grade5 = C_GPT;
        }else if(selectedCBXG5.equals("C-")){
            grade5 = C_NEG_GPT;
        }else if(selectedCBXG5.equals("D")){
            grade5 = D_GPT;
        }else if(selectedCBXG5.equals("F")){
            grade5 = F_GPT;
        } else{
            grade5 = 0.00;
        }

        if(selectedCBXG6.equals("A")){
            grade6 = A_GPT;
        }else if(selectedCBXG6.equals("A-")){
            grade6 = A_NEG_GPT;
        }else if(selectedCBXG6.equals("B+")){
            grade6 = B_PLUS_GPT;
        }else if(selectedCBXG6.equals("B")){
            grade6 = B_GPT;
        }else if(selectedCBXG6.equals("B-")){
            grade6 = B_NEG_GPT;
        }else if(selectedCBXG6.equals("C+")){
            grade6 = C_PLUS_GPT;
        }else if(selectedCBXG6.equals("C")){
            grade6 = C_GPT;
        }else if(selectedCBXG6.equals("C-")){
            grade6 = C_NEG_GPT;
        }else if(selectedCBXG6.equals("D")){
            grade6 = D_GPT;
        }else if(selectedCBXG6.equals("F")){
            grade6 = F_GPT;
        } else{
            grade6 = 0.00;
        }

        if(selectedCBXG7.equals("A")){
            grade7 = A_GPT;
        }else if(selectedCBXG7.equals("A-")){
            grade7 = A_NEG_GPT;
        }else if(selectedCBXG7.equals("B+")){
            grade7 = B_PLUS_GPT;
        }else if(selectedCBXG7.equals("B")){
            grade7 = B_GPT;
        }else if(selectedCBXG7.equals("B-")){
            grade7 = B_NEG_GPT;
        }else if(selectedCBXG7.equals("C+")){
            grade7 = C_PLUS_GPT;
        }else if(selectedCBXG7.equals("C")){
            grade7 = C_GPT;
        }else if(selectedCBXG7.equals("C-")){
            grade7 = C_NEG_GPT;
        }else if(selectedCBXG7.equals("D")){
            grade7 = D_GPT;
        }else if(selectedCBXG7.equals("F")){
            grade7 = F_GPT;
        } else{
            grade7 = 0.00;
        }

        if(selectedCBXG8.equals("A")){
            grade8 = A_GPT;
        }else if(selectedCBXG8.equals("A-")){
            grade8 = A_NEG_GPT;
        }else if(selectedCBXG8.equals("B+")){
            grade8 = B_PLUS_GPT;
        }else if(selectedCBXG8.equals("B")){
            grade8 = B_GPT;
        }else if(selectedCBXG8.equals("B-")){
            grade8 = B_NEG_GPT;
        }else if(selectedCBXG8.equals("C+")){
            grade8 = C_PLUS_GPT;
        }else if(selectedCBXG8.equals("C")){
            grade8 = C_GPT;
        }else if(selectedCBXG8.equals("C-")){
            grade8 = C_NEG_GPT;
        }else if(selectedCBXG8.equals("D")){
            grade8 = D_GPT;
        }else if(selectedCBXG8.equals("F")){
            grade8 = F_GPT;
        } else{
            grade8 = 0.00;
        }

        if(selectedCBXG9.equals("A")){
            grade9 = A_GPT;
        }else if(selectedCBXG9.equals("A-")){
            grade9 = A_NEG_GPT;
        }else if(selectedCBXG9.equals("B+")){
            grade9 = B_PLUS_GPT;
        }else if(selectedCBXG9.equals("B")){
            grade9 = B_GPT;
        }else if(selectedCBXG9.equals("B-")){
            grade9 = B_NEG_GPT;
        }else if(selectedCBXG9.equals("C+")){
            grade9 = C_PLUS_GPT;
        }else if(selectedCBXG9.equals("C")){
            grade9 = C_GPT;
        }else if(selectedCBXG9.equals("C-")){
            grade9 = C_NEG_GPT;
        }else if(selectedCBXG9.equals("D")){
            grade9 = D_GPT;
        }else if(selectedCBXG9.equals("F")){
            grade9 = F_GPT;
        } else{
            grade9 = 0.00;
        }

        if(selectedCBXG10.equals("A")){
            grade10 = A_GPT;
        }else if(selectedCBXG10.equals("A-")){
            grade10 = A_NEG_GPT;
        }else if(selectedCBXG10.equals("B+")){
            grade10 = B_PLUS_GPT;
        }else if(selectedCBXG10.equals("B")){
            grade10 = B_GPT;
        }else if(selectedCBXG10.equals("B-")){
            grade10 = B_NEG_GPT;
        }else if(selectedCBXG10.equals("C+")){
            grade10 = C_PLUS_GPT;
        }else if(selectedCBXG10.equals("C")){
            grade10 = C_GPT;
        }else if(selectedCBXG10.equals("C-")){
            grade10 = C_NEG_GPT;
        }else if(selectedCBXG10.equals("D")){
            grade10 = D_GPT;
        }else if(selectedCBXG10.equals("F")){
            grade10 = F_GPT;
        } else{
            grade10 = 0.00;
        }






        double totalGrad = (grade1*hr1) + (grade2*hr2) + (grade3*hr3) + (grade4*hr4) + (grade5*hr5) + (grade6*hr6) + (grade7*hr7) + (grade8*hr8) + (grade9*hr9) + (grade10*hr10);
        return totalGrad;
    }

    private long totalCreditHrs() {
        hr1 = Integer.parseInt(selectedCBX1);
        hr2 = Integer.parseInt(selectedCBX2);
        hr3 = Integer.parseInt(selectedCBX3);
        hr4 = Integer.parseInt(selectedCBX4);
        hr5 = Integer.parseInt(selectedCBX5);
        hr6 = Integer.parseInt(selectedCBX6);
        hr7 = Integer.parseInt(selectedCBX7);
        hr8 = Integer.parseInt(selectedCBX8);
        hr9 = Integer.parseInt(selectedCBX9);
        hr10 = Integer.parseInt(selectedCBX10);
        long totalCre = hr1+hr2+hr3+hr4+hr5+hr6+hr7+hr8+hr9+hr10;
        return totalCre;
    }

    private void assignSelectedGrade() {

        if(cbxG1.getSelectionModel().isEmpty()){
            selectedCBXG1 = "0";
        }else{
            selectedCBXG1 = cbxG1.getSelectionModel().getSelectedItem().toString();
        }
        if(cbxG2.getSelectionModel().isEmpty()){
            selectedCBXG2 = "0";
        }else{
            selectedCBXG2 = cbxG2.getSelectionModel().getSelectedItem().toString();
        }
        if(cbxG3.getSelectionModel().isEmpty()){
            selectedCBXG3 = "0";
        }else{
            selectedCBXG3 = cbxG3.getSelectionModel().getSelectedItem().toString();
        }
        if(cbxG4.getSelectionModel().isEmpty()){
            selectedCBXG4 = "0";
        }else{
            selectedCBXG4 = cbxG4.getSelectionModel().getSelectedItem().toString();
        }
        if(cbxG5.getSelectionModel().isEmpty()){
            selectedCBXG5 = "0";
        }else{
            selectedCBXG5 = cbxG5.getSelectionModel().getSelectedItem().toString();
        }
        if(cbxG6.getSelectionModel().isEmpty()){
            selectedCBXG6 = "0";
        }else{
            selectedCBXG6 = cbxG6.getSelectionModel().getSelectedItem().toString();
        }
        if(cbxG7.getSelectionModel().isEmpty()){
            selectedCBXG7 = "0";
        }else{
            selectedCBXG7 = cbxG7.getSelectionModel().getSelectedItem().toString();
        }
        if(cbxG8.getSelectionModel().isEmpty()){
            selectedCBXG8 = "0";
        }else{
            selectedCBXG8 = cbxG8.getSelectionModel().getSelectedItem().toString();
        }
        if(cbxG9.getSelectionModel().isEmpty()){
            selectedCBXG9 = "0";
        }else{
            selectedCBXG9 = cbxG9.getSelectionModel().getSelectedItem().toString();
        }
        if(cbxG10.getSelectionModel().isEmpty()){
            selectedCBXG10 = "0";
        }else{
            selectedCBXG10 = cbxG10.getSelectionModel().getSelectedItem().toString();
        }

    }

    private void assignSelectedCreHr() {

        if(cbx1.getSelectionModel().isEmpty()){
            selectedCBX1 = "0";
        }else{
            selectedCBX1 = cbx1.getSelectionModel().getSelectedItem().toString();
        }
        if(cbx2.getSelectionModel().isEmpty()){
            selectedCBX2 = "0";
        }else{
            selectedCBX2 = cbx2.getSelectionModel().getSelectedItem().toString();
        }
        if(cbx3.getSelectionModel().isEmpty()){
            selectedCBX3 = "0";
        }else{
            selectedCBX3 = cbx3.getSelectionModel().getSelectedItem().toString();
        }
        if(cbx4.getSelectionModel().isEmpty()){
            selectedCBX4 = "0";
        }else{
            selectedCBX4 = cbx4.getSelectionModel().getSelectedItem().toString();
        }
        if(cbx5.getSelectionModel().isEmpty()){
            selectedCBX5 = "0";
        }else{
            selectedCBX5 = cbx5.getSelectionModel().getSelectedItem().toString();
        }
        if(cbx6.getSelectionModel().isEmpty()){
            selectedCBX6 = "0";
        }else{
            selectedCBX6 = cbx6.getSelectionModel().getSelectedItem().toString();
        }

        if(cbx7.getSelectionModel().isEmpty()){
            selectedCBX7 = "0";
        }else{
            selectedCBX7 = cbx7.getSelectionModel().getSelectedItem().toString();
        }
        if(cbx8.getSelectionModel().isEmpty()){
            selectedCBX8 = "0";
        }else{
            selectedCBX8 = cbx8.getSelectionModel().getSelectedItem().toString();
        }
        if(cbx9.getSelectionModel().isEmpty()){
            selectedCBX9 = "0";
        }else{
            selectedCBX9 = cbx9.getSelectionModel().getSelectedItem().toString();
        }
        if(cbx10.getSelectionModel().isEmpty()){
            selectedCBX10 = "0";
        }
        else{
            selectedCBX10 = cbx10.getSelectionModel().getSelectedItem().toString();
        }

    }


}