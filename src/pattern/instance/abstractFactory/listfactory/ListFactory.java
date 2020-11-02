package pattern.instance.abstractFactory.listfactory;

import pattern.instance.abstractFactory.Factory;
import pattern.instance.abstractFactory.factory.Link;
import pattern.instance.abstractFactory.factory.Page;
import pattern.instance.abstractFactory.factory.Tray;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 30.
 * Time: 오후 11:47
 * To change this template use File | Settings | File Templates.
 */
public class ListFactory extends Factory{
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title,author);
    }
}
