package pattern.integration.facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 10.
 * Time: 오전 3:07
 * To change this template use File | Settings | File Templates.
 */
public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailaddr,String filename) {
        Properties mailprop = Database.getProperties("maildata");
        String username = mailprop.getProperty(mailaddr);
        try {
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to "+username+" 's page!");
            writer.paragraph(username + "의 페이지에 오신 걸 환영합니다.");
            writer.paragraph("메일을 기다리고 있습니다.");
            writer.mailto(mailaddr,username);
            writer.close();
            System.out.println(filename + "is created for" + mailaddr + " ("+username +")");
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }
}
