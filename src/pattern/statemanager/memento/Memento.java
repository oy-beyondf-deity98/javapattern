package pattern.statemanager.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 11.
 * Time: 오전 1:56
 * To change this template use File | Settings | File Templates.
 */
public class Memento {
    int money;
    ArrayList fruits;

    public Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    public int getMoney() {
        return money;
    }

    List getFruits() {
        return (ArrayList) fruits.clone();
    }

    void addFruit(String fruit){
        fruits.add(fruit);
    }
}
