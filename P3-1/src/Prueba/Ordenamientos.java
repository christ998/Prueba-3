/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import static java.util.Collections.swap;
import java.util.List;

/**
 *
 * @author Christian
 */
public class Ordenamientos {

    public Ordenamientos() {
    }
    public void insercionPrecio(List<Vino> list) {

        for (int i = 0; i < list.size(); i++) {
            int pos = i;
            double aux = (list.get(i).getPrice());

            while ((pos > 0) && list.get(pos - 1).getPrice() > aux) {
                swap(list, pos, pos - 1);
                pos--;
            }
        }

    }

}
