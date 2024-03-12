import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type show whitespaces,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //ex1
        class Vehicle{
            public void printDetails() {

            }
        }

        class VehicleValue{
            public void calculateValue(){

            }
        }

        class VehicleToDB{
            public void addVehicleToDB(){

            }
        }



        //ex2

        interface Value{
            public double calculateValue();
        }

        class Car implements Value{
            private double attribute1;
            private double attribute2;
            @Override
            public double calculateValue() {
                return attribute1*attribute2;
            }
        }

        class Bike implements Value{
            private double attribute1;
            private double attribute2;
            @Override
            public double calculateValue() {
                return attribute1*attribute2;
            }
        }
    }
}