package model;

import java.io.PrintWriter;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by srajasi on 6/2/2017.
 */
public class Drink {

    String id;
    String name;
    String type;
    String color;

    public Drink() {
    }

    public Drink(String id, String name, String type, String color) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        PrintWriter writer = null;
        System.out.println(Drink.class.getProtectionDomain().getCodeSource().getLocation().getPath());
        try {
            writer = new PrintWriter("info.txt");
            writer.write("Hello ! This is Sandy..");
        }catch (Exception e){}finally {
            writer.flush();
            writer.close();
        }

    }
}
