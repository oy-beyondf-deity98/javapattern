package pattern.instance.abstractFactory.listfactory;

import pattern.instance.abstractFactory.factory.Link;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 31.
 * Time: 오전 1:06
 * To change this template use File | Settings | File Templates.
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption,url);
    }

    @Override
    public String makeHTML() {
        return "<li><a href=\"" + url + "\">" +caption + "</a></li>\n";
    }
}
