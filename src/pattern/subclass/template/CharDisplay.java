package pattern.subclass.template;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 20.
 * Time: 오전 8:23
 * To change this template use File | Settings | File Templates.
 */
public class CharDisplay extends AbstractDisplay {

    private char ch;
    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void close() {
        System.out.println(">>");
    }

    @Override
    public void print() {
        System.out.print(this.ch);
    }
}
