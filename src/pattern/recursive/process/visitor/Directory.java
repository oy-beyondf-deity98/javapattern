package pattern.recursive.process.visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 9.
 * Time: 오후 11:45
 * To change this template use File | Settings | File Templates.
 */
public class Directory extends Entry {
    private String name;
    private ArrayList dir = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;

        Iterator it = dir.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            size += entry.getSize();
        }

        return size;
    }

    @Override
    public Entry add(Entry entry){
        dir.add(entry);
        return this;
    }

    @Override
    public Iterator iterator(){
        return dir.iterator();
    }


    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
