package pattern.divide.bridge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 6.
 * Time: 오후 5:01
 * To change this template use File | Settings | File Templates.
 */
public class TextDisplayImpl extends StringDisplayImpl{
    FileReader fr = null;
    private List stringList;
    private int width;

    public TextDisplayImpl(String string) {
        super(string);
        this.stringList = getFileData(string);
        this.width = stringList.size();
    }


    @Override
    public void rawPrint() {
        Iterator<String> iter = stringList.iterator();

        while(iter.hasNext()){
            String string = iter.next();
            System.out.println("|"+string + "|");
        }


    }

    private List getFileData(String string){
        List list = new ArrayList();
        try {

            BufferedReader br = new BufferedReader(new FileReader(string));

            while(br.ready()){
                list.add(br.readLine());
            }

            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
