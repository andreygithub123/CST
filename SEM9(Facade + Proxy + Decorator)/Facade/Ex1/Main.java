package Facade.Ex1;

public class Main {
    public static void main(String[] args) {
        DataService myDataService = new LoggingDecorator(new DataServiceConcerete());
        System.out.println(myDataService.fetchData());

        DataService realDataService = new DataServiceConcerete();
        realDataService.fetchData();

        DataService loggedDataService = new LoggingDecorator(realDataService);

        String data= loggedDataService.fetchData();
        System.out.println("Data retrieved: " + data);
    }


}
