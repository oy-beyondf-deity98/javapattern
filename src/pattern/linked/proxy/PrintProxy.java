package pattern.linked.proxy;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 12.
 * Time: 오후 11:51
 * To change this template use File | Settings | File Templates.
 */
public class PrintProxy implements Printable {
    private String name;
    private Printer real;

    public PrintProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {

        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {


        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    private synchronized void realize() {

        if (real == null) {
            real = new Printer(name);
        }
    }
}
