//Singleton:
//        - only one instance of its kind exists + provide a single point of acces to it - can be accessed from anywhere in code
//        ( e doar un guvern chiar daca sunt mai multi membrii in guvern,presedinte )
//in loc sa creem 3 db, creem 1 db si il refolosim de 3 ori

//in case of multii-thread : both threads will get different instances of singleton class
public class Singleton {
    private static Singleton instance;
    private String data;

    private Singleton(String data) { //access level private ,constructor - creates objects
        this.data = data;
    }

    public static Singleton getInstance(String data){
        if ( instance == null ) {
            instance = new Singleton(data); // asa asiguram creerea unei singure instanta dar nu e multi-thread safe
        }
        return instance;
    }
}

// multi-thread implementation
public class ThreadSafeSingleton{
    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton() { }
    public static synchronized ThreadSafeSingleton getInstance(){
        if (instance ==null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}


//bill pugh implementation :
//helper is not allocated in memory even if the class is instantiated . helper is instantiated only when getIntance is called
//it doesnt require synchronization
public class BillPughSingleton {
    private BillPughSingleton() { }
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}


	