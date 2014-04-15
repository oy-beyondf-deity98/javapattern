package pattern.recursive.process.visitor;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 9.
 * Time: 오후 11:27
 * To change this template use File | Settings | File Templates.
 */
public class ListVisitor extends Visitor {
    private String currentdir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentdir +"/"+file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentdir +"/"+directory);

        String savedir = currentdir;
        currentdir = currentdir + "/"+ directory.getName();

        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }


        currentdir = savedir;
    }
}
