package configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFactory {

  public static final String TESTING_PROPERTIES_FILE = "testing.properties";

  private static Properties properties;


  public static Properties getInstance() {
    if (null == properties) {
      properties = new Properties();
      InputStream is;
      try {
        is = ClassLoader.getSystemResourceAsStream(TESTING_PROPERTIES_FILE);
        properties.load(is);
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    return properties;
  }

  public static Properties getInstance(String fileName) {
    if (null == properties) {
      properties = new Properties();
      InputStream is;
      try {
        is = new FileInputStream(fileName);
        properties.load(is);
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return properties;
  }

}
