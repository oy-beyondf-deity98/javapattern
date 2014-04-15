package pattern.linked.proxy;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 12.
 * Time: 오후 11:40
 * To change this template use File | Settings | File Templates.
 */
public interface Printable {
    public abstract void setPrinterName(String name);
    public abstract String getPrinterName();
    public abstract void print(String string);
}
