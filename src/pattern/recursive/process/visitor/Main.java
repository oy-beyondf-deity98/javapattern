package pattern.recursive.process.visitor;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 10.
 * Time: 오전 12:35
 * To change this template use File | Settings | File Templates.
 */
public class Main {
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
        bindir.add(new File("latex",20000));
        rootdir.accept(new ListVisitor());

        System.out.println();
        System.out.println("Making user entries...");
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
        rootdir.accept(new ListVisitor());

    }

}
