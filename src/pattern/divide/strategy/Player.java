package pattern.divide.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 6.
 * Time: 오후 8:13
 * To change this template use File | Settings | File Templates.
 */
public class Player {
    private String name;
    private Strategy strategy;
    private int wincount;
    private int losecount;
    private int gamecount;

    public Player(String name, Strategy strategy){
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand(){
        return strategy.nextHand();
    }

    public void win(){
        strategy.study(true);
        wincount++;
        gamecount++;

    }

    public void lose(){
        strategy.study(false);
        losecount++;
        gamecount++;
    }

    public void even(){
        gamecount++;
    }

    public String toString(){
        return "["+name+":"+gamecount+"games, "+wincount + " wind,"+losecount+" lose"+"]";
    }

}
