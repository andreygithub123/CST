package Decorator;

public class Main {
    public static void main(String[] args) {
        DataService dataService = new DataServiceConcrete();
        dataService.fetchData();

        DataService logginService = new LoggedDecorator(dataService);
        logginService.fetchData();
        String data = logginService.fetchData();
        System.out.println("Retrieved data: " + data);
    }
}
