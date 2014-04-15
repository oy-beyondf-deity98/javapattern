package pattern.instance.builder;


/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 30.
 * Time: 오후 9:18
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        String inputStr = "html";


//        if(inputStr.length != 1){
//            usage();
//            System.exit(0);
//        }

        if(inputStr.equals("plain")){
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        }else if(inputStr.equals("html")){
            HTMLBuilder htmlbuilder = new HTMLBuilder();
            Director director = new Director(htmlbuilder);
            director.construct();
            String filename = htmlbuilder.getResult();
            System.out.println(filename+"가 작성되었습니다.");
        }else{
            usage();
            System.exit(0);
        }


    }

    private static void usage() {
        System.out.println("Usage: java Main plain 일반 텍스트로 문서작성");
        System.out.println("Usage: java Main html HTML 파일로 문서작성");
    }
}
