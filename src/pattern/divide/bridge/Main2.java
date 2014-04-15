package pattern.divide.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 6.
 * Time: 오후 4:35
 * To change this template use File | Settings | File Templates.
 */
public class Main2 {
    public static void main(String[] args){

        RandomDisplay d1 = new RandomDisplay(new StringDisplayImpl("hello, world"));

        d1.randomDisplay(5);

    }
}
