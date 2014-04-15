package pattern.recursive.process.visitor;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 10.
 * Time: 오전 12:35
 * To change this template use File | Settings | File Templates.
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println("Making root entryes...");
        Directory rootdir = new Directory("root");
        Directory bindir = new Directory("bin");
        Directory tmpdir = new Directory("tmp");
        Directory usrdir = new Directory("usr");

        rootdir.add(bindir);
        rootdir.add(tmpdir);
        rootdir.add(usrdir);

        bindir.add(new File("vi",1000));
        bindir.add(new File("latex", 20000));

        Directory Kim = new Directory("Kim");
        Directory Lee = new Directory("Lee");
        Directory Park = new Directory("Park");

        usrdir.add(Kim);
        usrdir.add(Lee);
        usrdir.add(Park);

        Kim.add(new File("diary.html",100));
        Kim.add(new File("Composite.java",200));
        Lee.add(new File("memo.tex",300));
        Park.add(new File("game.doc",400));
        Park.add(new File("junk.mail",500));

        FileFindVisitor ffv = new FileFindVisitor(".html");
        rootdir.accept(ffv);

        System.out.println("HTML files are:");
        Iterator it = ffv.getFoundFiles();
        while (it.hasNext()) {
            File file = (File) it.next();
            System.out.println(file.toString());
        }
    }

}
