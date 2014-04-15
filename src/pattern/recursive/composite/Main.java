package pattern.recursive.composite;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 9.
 * Time: 오전 1:37
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args){
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
            rootdir.printList();

    }




}
