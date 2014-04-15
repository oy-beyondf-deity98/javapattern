package pattern.divide.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 6.
 * Time: 오후 5:55
 * To change this template use File | Settings | File Templates.
 */
public class Hand {

    public static final int HANDVALUE_GUU = 0;
    public static final int HANDVALUE_CHO = 1;
    public static final int HANDVALUE_PAA = 2;

    private int handvalue;


    private Hand(int handvalue) {
        this.handvalue = handvalue;

    }

    public static final Hand[] hand = {
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA)
    };


    //enum을 써도 될듯? 바꿔볼까?
    private static final String[] name ={
        "주먹","가위","보"
    };

    public static Hand getHand(int handvalue){
        return hand[handvalue];
    }

    public boolean isStrongerThen(Hand h){
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h){
        return fight(h) == -1;
    }

    private int fight(Hand h) {
        if(this == h){
            return 0;
        }else if((this.handvalue +1) % 3 == h.handvalue){
            return 1;
        }else{
            return -1;
        }

    }

    public String toString(){
        return name[handvalue];
    }


}
