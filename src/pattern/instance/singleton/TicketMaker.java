package pattern.instance.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 27.
 * Time: 오전 7:56
 * To change this template use File | Settings | File Templates.
 */
public class TicketMaker {
    private int ticket = 1000;
    private static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker(){
        System.out.println("티켓시스템이 가동되기 시작되었습니다.");
    }

    public static TicketMaker getInstance(){
        return ticketMaker;
    }

    public synchronized int getNextTicketNumber(){
        return ticket++;
    }
}
