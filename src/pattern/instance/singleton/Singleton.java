package pattern.instance.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 27.
 * Time: 오전 7:51
 * To change this template use File | Settings | File Templates.
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){
        System.out.println("인스턴스를 생성했습니다.");
    }

    public static Singleton getInstance(){
        return singleton;
    }
}
