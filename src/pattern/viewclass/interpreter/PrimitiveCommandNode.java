package pattern.viewclass.interpreter;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 13.
 * Time: 오전 1:10
 * To change this template use File | Settings | File Templates.
 */
public class PrimitiveCommandNode extends Node {
    private String name;

    @Override
    public void parse(Context context) throws ParseException {
        name = context.currentToken();
        context.skipToken(name);

        if(!name.equals("go") && !name.equals("right") && !name.equals("left")){
            throw new ParseException(name + " is undefined");
        }
    }

    @Override
    public String toString() {
        return name;
    }


}
