package pattern.recursive.process.visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 10.
 * Time: 오전 1:30
 * To change this template use File | Settings | File Templates.
 */
public class FileFindVisitor extends Visitor {
    private String currentdir = "";
    private String findFileName ="";
    private ArrayList list = new ArrayList();

    public FileFindVisitor(String findFileName) {
        this.findFileName = findFileName;
    }

    @Override
    public void visit(File file) {
        String fileName = file.getName();

        if(fileName.indexOf(findFileName) < -1){
        }else{
            list.add(file.getName());
        };
    }

    @Override
    public void visit(Directory directory) {
        String savedir = currentdir;
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
    }

    public Iterator getFoundFiles(){
        return list.iterator();

    }
}
