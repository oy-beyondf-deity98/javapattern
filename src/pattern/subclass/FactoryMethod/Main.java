package pattern.subclass.FactoryMethod;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 20.
 * Time: 오전 9:11
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args){

        Factory factory = new IDCardFactory();
        Product card1 = factory.create("홍길동");
        Product card2 = factory.create("이순신");
        Product card3 = factory.create("강감찬");

        card1.use();
        card2.use();
        card3.use();


    }

}
