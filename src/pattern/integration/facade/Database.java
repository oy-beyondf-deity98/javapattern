package pattern.integration.facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 10.
 * Time: 오전 3:06
 * To change this template use File | Settings | File Templates.
 */
public class Database extends PageMaker {
    private Database() {
    }

    public static Properties getProperties(String dbname) {

        String filename = Database.class.getCanonicalName()+"."+dbname +".txt";
        System.out.println(filename);
        Properties prop = new Properties();

        try {
            prop.load(new FileInputStream(filename));
        } catch (IOException e) {
            System.out.println("Warning: "+ filename + " is not found.");
        }

        return prop;
    }
}
