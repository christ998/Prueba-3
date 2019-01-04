/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Christian
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //a.
            Lectura lector = new Lectura();
            List<Vino> vinos = lector.leerDatos();
            Ordenamientos ordenes = new Ordenamientos();
            ordenes.insercionPrecio(vinos);
            
            for (Vino vino : vinos) {
                if (vino.getPrice() > 500) {
                  System.out.println(vino.toString());  
                }               
            }
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        

    }


