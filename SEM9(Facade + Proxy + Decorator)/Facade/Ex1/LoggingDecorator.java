package Facade.Ex1;

public class LoggingDecorator implements DataService{
    private DataService wrappee;

    public LoggingDecorator(DataService wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String fetchData() {
        System.out.println("Fetching data...");
        return wrappee.fetchData();
    }
}
