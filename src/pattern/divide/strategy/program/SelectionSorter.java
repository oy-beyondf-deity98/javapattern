package pattern.divide.strategy.program;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 6.
 * Time: 오후 11:52
 * To change this template use File | Settings | File Templates.
 */
public class SelectionSorter implements Sorter {
    public void sort(Comparable[] data){
        for(int i=0;i<data.length -1;i++){
            int min = i;
            for(int j = i+1;j<data.length;j++){
                if(data[min].compareTo(data[j])>0){
                    min = j;
                }
            }

            Comparable passingplace = data[min];
            data[min] = data[i];
            data[i] = passingplace;
        }
    }
}
