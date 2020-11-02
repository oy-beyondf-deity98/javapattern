package pattern.instance.abstractFactory;

import pattern.instance.abstractFactory.factory.Link;
import pattern.instance.abstractFactory.factory.Page;
import pattern.instance.abstractFactory.factory.Tray;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 31.
 * Time: 오전 12:53
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args){
        String inputStr = "pattern.instance.abstractFactory.listfactory.ListFactory";

        if("".equals(inputStr)){

            System.out.println("Usage: Java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");

            System.exit(0);
        }

        Factory factory = Factory.getFactory(inputStr);

        Link joins = factory.createLink("중앙일보","http://www.joins.com/");
        Link chosun = factory.createLink("조선일보","http://www.chosun.com/");

        Link us_yahoo = factory.createLink("Yahho!","http://www.yahoo.com/");
        Link excite = factory.createLink("Excite","http://www.excite.com");
        Link google = factory.createLink("Google","http://www.google.com");

        Tray traynews = factory.createTray("신문");
        traynews.add(joins);
        traynews.add(chosun);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);

        Tray traysearch = factory.createTray("검색엔진");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage","영진닷컴");
        page.add(traynews);
        page.add(traysearch);
        page.output();

    }
}
