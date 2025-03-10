package Utilites;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {

    public static String getProperty(String key){
        Properties p = new Properties();
        try {
            p.load(new FileInputStream("src/test/resources/Project.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return p.getProperty(key);
    }
}
