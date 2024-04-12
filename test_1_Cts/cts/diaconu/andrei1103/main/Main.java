package cts.diaconu.andrei1103.main;

import cts.diaconu.andrei1103.builder.GamingSystemBuilder;
import cts.diaconu.andrei1103.builder.GamingSystemDirector;
import cts.diaconu.andrei1103.builder.IGamingSystem;
import cts.diaconu.andrei1103.builder.IGamingSystemBuilder;
import cts.diaconu.andrei1103.singleton.ITestingModule;
import cts.diaconu.andrei1103.singleton.TestingModule;

public class Main {
    public static void main(String[] args) {

        //ex1 main-implementation
        IGamingSystemBuilder builder = new GamingSystemBuilder();
        GamingSystemDirector director = new GamingSystemDirector(builder);
        director.buildGamingSystem();
        IGamingSystem gamingSystem_1 = director.getGamingSystem();
        gamingSystem_1.printConfiguration();

        //ex2 main-implementation
        ITestingModule testingModule = TestingModule.getInstance();
        String testResult=testingModule.test();
        System.out.println(testResult);

        ITestingModule anotherTestingModule = TestingModule.getInstance();
        System.out.println("Test if SingletonClass works: " + new String(String.valueOf(testingModule==anotherTestingModule)));
        //if true => both testingModules from singletonclass have  the same referenec
    }
}
