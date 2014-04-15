package pattern.recursive.process.chain;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 10.
 * Time: 오전 2:10
 * To change this template use File | Settings | File Templates.
 */
public class Trouble {
    private int number;

    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "[Trouble " + number +"]";
    }
}
