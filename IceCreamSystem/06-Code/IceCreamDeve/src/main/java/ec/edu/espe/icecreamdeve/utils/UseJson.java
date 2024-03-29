package ec.edu.espe.icecreamdeve.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Carlos Hernandez, Mateo Iza, Juan Granda, Josue Guayasamin
 * @param <T>
 */
public class UseJson<T> {

    public ArrayList<T> readFile(String fileAddress, Type type) {
        ArrayList<T> items = new ArrayList<>();
        try {
            try (FileReader fileReader = new FileReader(fileAddress)) {
                Gson gson = new GsonBuilder()
                        .registerTypeAdapter(Date.class, new DateSerializer())
                        .registerTypeAdapter(Date.class, new DateDeserializer())
                        .setPrettyPrinting()
                        .create();
                items = gson.fromJson(fileReader, type);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Error in creating the File Reader Object");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return items;
    }

    public void writeFile(String fileAddress, ArrayList<T> items) {
        try {
            try (FileWriter fileWriter = new FileWriter(fileAddress)) {
                Gson gson = new GsonBuilder()
                        .registerTypeAdapter(Date.class, new DateSerializer())
                        .registerTypeAdapter(Date.class, new DateDeserializer())
                        .setPrettyPrinting()
                        .create();
                gson.toJson(items, fileWriter);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}