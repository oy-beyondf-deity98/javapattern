package pattern.linked.flyweight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 12.
 * Time: 오전 6:29
 * To change this template use File | Settings | File Templates.
 */
public class BigChar {
    private char charname;
    private String fontdata;

    public BigChar(char charname) {
        this.charname = charname;
        String path = "/Users/kimgyupyo/study/project/workspace/ion/JavaPattern/src/pattern/linked/flyweight/resource/";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path + "big"+charname+".txt"));
            String line;
            StringBuffer buf = new StringBuffer();
            while((line = reader.readLine())  != null){
                buf.append(line);
                buf.append("\n");
            }

            reader.close();
            this.fontdata = buf.toString();
        } catch (FileNotFoundException e) {
            this.fontdata = charname + "?";
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }

    public void print() {
    }
}
