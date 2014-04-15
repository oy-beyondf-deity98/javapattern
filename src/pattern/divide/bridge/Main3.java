package pattern.divide.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 6.
 * Time: 오후 4:35
 * To change this template use File | Settings | File Templates.
 */
public class Main3 {
    public static void main(String[] args){

        String path = "/Users/kimgyupyo/study/project/workspace/ion/JavaPattern/src/pattern/divide/bridge";

        CountDisplay d3 = new CountDisplay(new TextDisplayImpl(path+"/file.txt"));
        d3.display();
    }
}
