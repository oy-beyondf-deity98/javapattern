package pattern.divide.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 6.
 * Time: 오후 8:30
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args){


        int seed1 = 314;//Integer.parseInt(args[0]);
        int seed2 = 15;//Integer.parseInt(args[1]);

        Player player1 = new Player("두리",new WinningStrategy(seed1));
        Player player2 = new Player("하나",new ProbStrategy(seed2));

        for(int i = 0; i< 10000;i++){
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();

            if(nextHand1.isStrongerThen(nextHand2)){
                System.out.println("Winner:"+player1);
                player1.win();
                player2.lose();
            }else if(nextHand2.isStrongerThen(nextHand1)){
                System.out.println("Winner:"+player2);
                player1.lose();
                player2.win();
            }else{
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }

        System.out.println("Total result:");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
