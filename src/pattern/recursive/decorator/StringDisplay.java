package pattern.recursive.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 9.
 * Time: 오전 1:58
 * To change this template use File | Settings | File Templates.
 */
public class StringDisplay extends Display {
    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    public int getColumns() {
        return string.getBytes().length;
    }

    public int getRows() {
        return 1;
    }

    public String getRowText(int row) {
        if(row ==0){
            return string;
        } else{
            return null;
        }
    }
}
