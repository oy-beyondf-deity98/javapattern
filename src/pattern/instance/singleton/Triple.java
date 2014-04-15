package pattern.instance.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 27.
 * Time: 오전 8:09
 * To change this template use File | Settings | File Templates.
 *
 * ThreadPool example
 */
public class Triple {
    private static Triple[] triples = new Triple[]{
            new Triple(0),new Triple(1),new Triple(2)
    };
    private int id;

    public Triple(int id){
        System.out.println("The instance "+id+" is created.");
        this.id = id;
    }

    public static Triple getInstance(int i){
        return triples[i];
    }

    public String toString(){
        return "[Triple id="+id+"]";
    }


}
