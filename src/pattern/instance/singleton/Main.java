package pattern.instance.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 27.
 * Time: 오전 7:53
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args){
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2){
            System.out.println("obj1과 obj2는 같은 인스턴스입니다.");
        }else{
            System.out.println("obj1과 obj2는 다른 인스턴스입니다.");
        }

        System.out.println("End.");

        System.out.println("티켓 Start.");
        TicketMaker ticket = TicketMaker.getInstance();
        TicketMaker ticket2 = TicketMaker.getInstance();

        System.out.println(ticket.getNextTicketNumber());
        System.out.println(ticket2.getNextTicketNumber());
        System.out.println(ticket.getNextTicketNumber());

        System.out.println("티켓 End.");
    }

}
