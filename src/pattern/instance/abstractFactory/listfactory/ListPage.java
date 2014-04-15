package pattern.instance.abstractFactory.listfactory;

import pattern.instance.abstractFactory.factory.Item;
import pattern.instance.abstractFactory.factory.Page;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 31.
 * Time: 오전 1:06
 * To change this template use File | Settings | File Templates.
 */
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    protected String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>"+title+"</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>"+title+"</h1>\n");
        buffer.append("<ul>\n");

        Iterator it = content.iterator();

        while(it.hasNext()){
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }

        buffer.append("</ul>\n");
        buffer.append("<hr><address"+author+"</address>");
        buffer.append("</body></html>\n");

        return buffer.toString();
    }
}
