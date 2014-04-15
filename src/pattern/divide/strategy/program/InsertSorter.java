package pattern.divide.strategy.program;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 7.
 * Time: 오전 12:01
 * To change this template use File | Settings | File Templates.
 */
public class InsertSorter implements Sorter {
    @Override
    public void sort(Comparable[] data) {
        for(int i=0;i<data.length -1;i++){
            int min = i;
            for(int j = i+1;j<data.length;j++){
                if(data[i].compareTo(data[j])>0){
                    Comparable passingplace = data[min];
                    data[i] = data[j];
                    data[j] = passingplace;
                }
            }


        }
    }
}
