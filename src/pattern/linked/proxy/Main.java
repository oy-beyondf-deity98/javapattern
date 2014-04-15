package pattern.linked.proxy;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 12.
 * Time: 오전 6:24
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        Printable p = new PrintProxy("Alice");
        System.out.println("이름은 현재" + p.getPrinterName() + "입니다.");
        p.setPrinterName("Bob");
        System.out.println("이름은 현재" + p.getPrinterName() + "입니다.");
        p.print("Hello, world.");

    }
}
