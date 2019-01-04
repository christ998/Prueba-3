/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


/**
 *
 * @author Christian
 */
public class Lectura {

    private FileReader fr;
    private BufferedReader lector;
    public List<Vino> list;

    public Lectura() {
        list = new ArrayList<Vino>();
    }

    public List<Vino> leerDatos() throws FileNotFoundException, IOException, ParseException {

        try {
            String JSON_FILE = "Datos/datos-vino.json";
            File file = new File(JSON_FILE);
            JSONParser parser = new JSONParser();

            JSONArray json = (JSONArray) parser.parse(new FileReader(JSON_FILE));

            Iterator iterator = json.iterator();
            while (iterator.hasNext()) {
                JSONObject features = (JSONObject) iterator.next();
                long precio = 0;
                String country="";
                String description="";
                String title = "";
                try {
                   precio = (long) features.get("price"); 
                } catch (Exception e) {
                    precio = 0;
                }
                try{
                country = (String) features.get("country");
                }catch(NullPointerException e){
                    country = "null";
                }
                try {
                    description = (String) features.get("description");
                } catch (Exception e) {
                    description = "null";
                }
                try {
                  title = (String) features.get("title");
                                    
                } catch (Exception e) {
                    title = "Null";
                }
                list.add(new Vino(precio, country, description, title));
                //Vinos vinos=new Vinos();
                //vinos.setCountry(iterator.get("country"))
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }
}
