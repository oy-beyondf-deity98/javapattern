package pattern.divide.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 6.
 * Time: 오전 8:18
 * To change this template use File | Settings | File Templates.
 */
public class Display {
    private DisplayImpl impl;
    public Display(DisplayImpl impl){
        this.impl = impl;
    }

    public void open(){
        impl.rawOpen();
    }

    public void print(){
        impl.rawPrint();
    }

    public void close(){
        impl.rawClose();
    }

    public final void display(){
        open();
        print();
        close();
    }


}
