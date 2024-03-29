package ec.edu.espe.icecreamdeve.utils;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/**
 *
 * @author Carlos Hernandez, Mateo Iza, Juan Granda, Josue Guayasamin
 */

public class DateDeserializer implements JsonDeserializer<Date> {
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d, yyyy, hh:mm:ss a", Locale.ENGLISH);

    @Override
    public Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        try {
            return dateFormat.parse(jsonElement.getAsString());
        } catch (ParseException e) {
            throw new JsonParseException(e);
        }
    }
}