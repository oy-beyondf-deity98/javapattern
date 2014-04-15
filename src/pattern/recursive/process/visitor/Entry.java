package pattern.recursive.process.visitor;


import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 9.
 * Time: 오후 11:26
 * To change this template use File | Settings | File Templates.
 */
public abstract class Entry implements Element {

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException{
        throw new FileTreatmentException();
    }

    public Iterator iterator() throws FileTreatmentException{
        throw new FileTreatmentException();
    }

    public String toString(){
        return getName() + " (" + getSize() + ")" ;
    }
}
