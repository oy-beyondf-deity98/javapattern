package pattern.basic.adapter;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 20.
 * Time: 오전 4:26
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        FileIO f = new FileProperties();

        try {
            f.readFromFile("/Users/kimgyupyo/study/project/workspace/ion/JavaPattern/src/pattern/basic/adapter/file.txt");
            f.setValue("year","2004");
            f.setValue("month","4");
            f.setValue("day","21");
            f.writeToFile("newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }
}
