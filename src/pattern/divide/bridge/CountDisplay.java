package pattern.divide.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 6.
 * Time: 오전 8:23
 * To change this template use File | Settings | File Templates.
 */
public class CountDisplay extends Display{
    public CountDisplay(DisplayImpl impl){
        super(impl);
    }

    public void multiDisplay(int times){
        open();
        for(int i = 0; i< times;i++){
            print();
        }
        close();
    }
}
