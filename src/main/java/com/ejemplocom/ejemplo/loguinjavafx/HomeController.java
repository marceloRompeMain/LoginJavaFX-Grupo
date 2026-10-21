package com.ejemplocom.ejemplo.loguinjavafx;

import com.ejemplocom.ejemplo.loguinjavafx.entidades.Usuario;
import com.ejemplocom.ejemplo.loguinjavafx.util.SesionUsuario;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomeController {

    @FXML private Label lblBienvenida;

    @FXML
    private void initialize() {
        Usuario u = SesionUsuario.getUsuarioActual();
        if (u != null) {
            lblBienvenida.setText("Bienvenido, " + u.getNombre() + " " + u.getApellido());
        }
    }

    @FXML
    private void cerrarSesion() throws Exception {
        SesionUsuario.cerrar();
        App.setRoot("login");
    }
}