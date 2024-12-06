package com.mycompany.t22.estudiantes;

import Modelos.Estudiante;
import java.time.LocalDate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class SecondaryController {

    @FXML
    private TableColumn<Estudiante, String> colApe;

    @FXML
    private TableColumn<Estudiante, LocalDate> colFeN;

    @FXML
    private TableColumn<Estudiante, String> colNom;

    @FXML
    private Button secondaryButton;

    @FXML
    private TableView<Estudiante> tblestudiantes;

    @FXML
    void switchToPrimary(ActionEvent event) {
        colNom.setCellValueFactory(new PropertyValueFactory("nombre"));
        colApe.setCellValueFactory(new PropertyValueFactory("apellido"));
        colFeN.setCellValueFactory(new PropertyValueFactory("fechaNacimiento"));
        final ObservableList<Estudiante> estudiantes = FXCollections.observableArrayList();
                estudiantes.add(new Estudiante("Laura","Mendoza",LocalDate.of(2004, 05, 10)));
                estudiantes.add(new Estudiante("Danna","Gonzales",LocalDate.of(2005, 11, 20)));
                estudiantes.add(new Estudiante("Carlos","Sossa",LocalDate.of(2003, 02, 14)));
                estudiantes.add(new Estudiante("Maria","Robles",LocalDate.of(2004, 07, 02)));
                estudiantes.add(new Estudiante("Jorge","Duran",LocalDate.of(2003, 01, 30)));
        //LlenarTableView
        tblestudiantes.setItems(estudiantes);
        
    }

}
