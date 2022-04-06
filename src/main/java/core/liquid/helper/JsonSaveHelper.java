package core.liquid.helper;

import com.google.gson.*;
import core.liquid.LiquidCore;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class JsonSaveHelper {
    public static void save(File file, JsonObject obj) {
        try {
            if (!file.exists()) {
                if(!file.getParentFile().mkdirs() && !file.createNewFile()) LiquidCore.log.info("Can't Create new file...");
            }

            Gson gson = (new GsonBuilder()).setPrettyPrinting().create();

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            gson.toJson(obj, writer);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void save(File file, JsonArray obj) {
        try {
            if (!file.exists()) {
                if(!file.getParentFile().mkdirs() && !file.createNewFile()) LiquidCore.log.info("Can't Create new file...");
            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            gson.toJson(obj, writer);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static JsonObject readObject(File file) {
        try {
            return readObject(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            return null;
        }
    }

    public static JsonObject readObject(InputStream input) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));
        JsonParser parser = new JsonParser();
        return (JsonObject) parser.parse(reader);
    }

    public static JsonArray readArray(File file) {
        try {
            FileInputStream input = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));
            JsonParser parser = new JsonParser();
            return (JsonArray) parser.parse(reader);
        } catch (FileNotFoundException e) {
            return new JsonArray();
        }
    }
}
