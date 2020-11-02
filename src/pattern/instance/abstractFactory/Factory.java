package pattern.instance.abstractFactory;

import pattern.instance.abstractFactory.factory.Link;
import pattern.instance.abstractFactory.factory.Page;
import pattern.instance.abstractFactory.factory.Tray;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 30.
 * Time: 오후 11:46
 * To change this template use File | Settings | File Templates.
 */
public abstract class Factory extends Main {
    public static Factory getFactory(String classname){
        Factory factory = null;

        try {
            factory = (Factory)Class.forName(classname).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IllegalAccessException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return factory;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
