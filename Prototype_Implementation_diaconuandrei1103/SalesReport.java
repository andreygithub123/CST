public class SalesReport implements Report{

    private String format;
    private String data;

    public SalesReport() throws InterruptedException {
        System.out.println("SalesReport started....");
        Thread.sleep(2000);
        System.out.println("SalesReport finished....");
        this.format="Sales report format";
        this.data="Sales report data";
    }


    @Override
    public void generateReport() {
        System.out.println("Report is being generated...");
    }

    @Override
    public void setData(String data) {
        this.data=data;
    }

    @Override
    public void setFormat(String format) {
        this.format=format;
    }

    @Override
    public Report clone() {
        SalesReport copy = null;
        try {
            copy=new SalesReport();
            copy.format=this.format;
            copy.data=this.data;
            return copy;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
