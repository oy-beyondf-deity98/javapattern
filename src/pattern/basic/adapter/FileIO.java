package pattern.basic.adapter;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 20.
 * Time: 오전 4:23
 * To change this template use File | Settings | File Templates.
 */
public interface FileIO {
    public void readFromFile(String filename) throws IOException;
    public void writeToFile(String filename) throws IOException;
    public void setValue(String key, String value);
    public String getValue(String key);
}
