package pattern.divide.strategy.program;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 6.
 * Time: 오후 11:57
 * To change this template use File | Settings | File Templates.
 */
public class Main2 {
    public static void main(String[] args){
        String[] data ={
            "Dumpty","Bowman","Carroll","Elfland","Alice",
        };

        SortAndPrint sap = new SortAndPrint(data,new InsertSorter());
        sap.execute();
    }
}
