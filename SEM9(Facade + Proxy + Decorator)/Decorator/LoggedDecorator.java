package Decorator;

public class LoggedDecorator implements DataService{

    DataService wrapee;

    public LoggedDecorator(DataService wrapee) {
        this.wrapee = wrapee;
    }

    @Override
    public String fetchData() {
        return wrapee.fetchData();
    }
}
