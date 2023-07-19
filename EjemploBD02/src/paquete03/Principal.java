/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import paquete01.Enlace;
import paquete02.Auto;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        
        String[][] autos = {{"LBC0001", "230.2"},
        {"LBC0002", "330.2"},
        {"LBC0003", "430.2"},
        {"LBC0004", "530.1"},
        {"LBC0005", "130,2"},};

        // 1. guardar en la tabla autos de la base de datos
        Enlace e = new Enlace();
        Auto a = new Auto();
        
        for (int i = 0; i < obtenerDataAuto.length; i++) {
            a.establecerPlaca(autos[i][1]);
            a.establecerValorMatricula(Double.persevalorMatricula);
            
            e.insertarAuto(auto);
        }
        // 2. Presentar todos los registros de la tabla autos de la base de datos
        
    }
}
