package pattern.viewclass.interpreter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 13.
 * Time: 오전 12:18
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        String path = "/Users/kimgyupyo/study/project/workspace/ion/JavaPattern/src/pattern/viewclass/interpreter/";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path+"program.txt"));

            String text;
            while((text = reader.readLine()) != null){
                System.out.println("text = \""+text+"\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = "+node);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (ParseException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }


}
