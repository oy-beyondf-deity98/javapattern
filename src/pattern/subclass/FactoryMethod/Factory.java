package pattern.subclass.FactoryMethod;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 20.
 * Time: 오전 9:13
 * To change this template use File | Settings | File Templates.
 */
public abstract class Factory {
    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract void registerProduct(Product product);
    protected abstract Product createProduct(String owner);
}
