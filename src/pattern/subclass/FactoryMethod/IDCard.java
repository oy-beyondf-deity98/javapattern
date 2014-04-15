package pattern.subclass.FactoryMethod;


import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 20.
 * Time: 오전 9:20
 * To change this template use File | Settings | File Templates.
 */
public class IDCard extends Product {
    private String owner;
    private String idNumber;

    public IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;

    }

    @Override
    public void use() {
        System.out.println(owner + "의 카드를 사용합니다.");

    }

    public String getOwner(){
        return owner;
    }
}
