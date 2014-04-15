package pattern.subclass.FactoryMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 20.
 * Time: 오전 9:15
 * To change this template use File | Settings | File Templates.
 */
@SuppressWarnings("ConstantConditions")
public class IDCardFactory extends Factory {
    private List owners = new ArrayList();

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    @Override
    protected Product createProduct(String owner) {

        return new IDCard(owner);
    }

    public List getOwners(){
        return owners;
    }
}
