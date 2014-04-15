package pattern.divide.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 6.
 * Time: 오전 10:19
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        Display d1 = new Display(new StringDisplayImpl("Hello, Korean"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, Korean"));

        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);

    }
}
