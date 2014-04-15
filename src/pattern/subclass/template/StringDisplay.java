package pattern.subclass.template;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 20.
 * Time: 오전 8:28
 * To change this template use File | Settings | File Templates.
 */
public class StringDisplay extends AbstractDisplay{
    private String str;
    private int width;

    public StringDisplay(String str) {
        this.str = str ;
        this.width = str.getBytes().length;
    }


    @Override
    public void open() {
        printLine();
    }

    @Override
    public void close() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|"+this.str+"|");
    }

    private void printLine(){
        System.out.println("+");
        for(int i=0;i<width;i++){
            System.out.print("-");
        }
        System.out.println("+");
    }


}
