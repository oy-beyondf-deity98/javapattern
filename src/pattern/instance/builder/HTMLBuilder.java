package pattern.instance.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 30.
 * Time: 오후 10:09
 * To change this template use File | Settings | File Templates.
 */
public class HTMLBuilder extends Builder{
    private String filename;
    private PrintWriter writer;

    public void makeTitle(String title){
        filename = title + ".html";

        try {
            writer = new PrintWriter(new FileWriter(filename)) ;
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        writer.println("<html><head><title>"+title+"</title></head><body>");
        writer.println("<h1>"+title+"</h1>");


    }

    public void makeString(String str){
        writer.println("<p>"+str+"</p>");
    }

    public void makeItems(String[] items){
        writer.println("<ul>");

        for(int i=0;i<items.length;i++){
            writer.println("<li>"+items[i]+"</li>");
        }

        writer.println("</ul>");
    }

    public void close(){
        writer.println("<body><html>");
        writer.close();
    }

    public String getResult(){
        return filename;
    }

}
