package pattern.instance.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 27.
 * Time: 오전 8:26
 * To change this template use File | Settings | File Templates.
 */
public class Main2 {
    public static void main(String[] arts){
        System.out.println("Start.");

        for(int i = 0;i<9;i++){
            Triple triple = Triple.getInstance(i%3);
            System.out.println(i+":"+triple);
        }

        System.out.println("End.");
    }
}
