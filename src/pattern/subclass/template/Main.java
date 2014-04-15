package pattern.subclass.template;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 20.
 * Time: 오전 8:20
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, world.");
        AbstractDisplay d3 = new StringDisplay("안녕하세요.");
        d1.display();
        d2.display();
        d3.display();
    }
}
