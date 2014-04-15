package pattern.linked.proxy;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 12.
 * Time: 오후 11:42
 * To change this template use File | Settings | File Templates.
 */
public class Printer implements Printable {
    private String name;

    public Printer() {
        heavyJob("Printer의 인스턴스를 생성 중");
    }

    public Printer(String name) {
        this.name = name;
    }

    private void heavyJob(String msg) {
        System.out.println("msg");

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(".");
        }

        System.out.println("완료.");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("=== " +name+" ===");
        System.out.println(string);
    }
}
