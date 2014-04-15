package pattern.recursive.composite;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 9.
 * Time: 오전 1:26
 * To change this template use File | Settings | File Templates.
 */
public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public void printList(){
        printList(" ");
    }

    protected abstract void printList(String prefix);

    public String toString(){
        return getName() + " (" + getSize() + ")";
    }




}
