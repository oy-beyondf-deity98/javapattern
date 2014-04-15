package pattern.recursive.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 9.
 * Time: 오전 2:21
 * To change this template use File | Settings | File Templates.
 */
public class SideBorder extends Border {
    private char borderChar;

    public SideBorder(Display display,char ch) {
        super(display);
        this.borderChar = ch;
    }


    @Override
    public int getColumns() {
        return 1+display.getColumns()+1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }

}
