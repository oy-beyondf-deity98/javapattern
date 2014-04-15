package pattern.basic.adapter;

import java.io.*;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 20.
 * Time: 오전 4:27
 * To change this template use File | Settings | File Templates.
 */
public class FileProperties implements FileIO {
    private Properties prop = new Properties();

    @Override
    public void readFromFile(String filename) throws IOException {
        prop.load(new InputStreamReader(new FileInputStream(filename)));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        prop.store(new OutputStreamWriter(new FileOutputStream(filename)),"#written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        prop.setProperty(key,value);
    }

    @Override
    public String getValue(String key) {
        return prop.getProperty(key);
    }
}
