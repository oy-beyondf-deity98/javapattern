package pattern.divide.strategy.program;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 6.
 * Time: 오후 11:55
 * To change this template use File | Settings | File Templates.
 */
public class SortAndPrint {
    Comparable[] data;
    Sorter sorter;

    public SortAndPrint(Comparable[] data,Sorter sorter) {
        this.data = data;
        this.sorter = sorter;
    }

    public void execute(){
        print();
        sorter.sort(data);
        print();
    }

    private void print() {
        for(int i= 0;i<data.length;i++){
            System.out.print(data[i]+",");
        }
        System.out.println("");
    }
}
