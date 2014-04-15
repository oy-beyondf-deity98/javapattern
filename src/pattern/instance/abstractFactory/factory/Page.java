package pattern.instance.abstractFactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 30.
 * Time: 오후 11:52
 * To change this template use File | Settings | File Templates.
 */
public abstract class Page{
    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item){
        content.add(item);
    }

    public void output(){
        String filename = title +".html";
        try {
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();

            System.out.println(filename +"을 작성했습니다.");
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    protected abstract String makeHTML();



}
