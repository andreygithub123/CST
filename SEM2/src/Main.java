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

        interface Vehicle{
            public double calculateValue();
        }





        class Car implements Vehicle{
            private double attribute1;
            private double attribute2;
            @Override
            public double calculateValue() {
                return attribute1*attribute2;
            }
        }

        class Bike implements Vehicle{
            private double attribute1;

            @Override
            public double calculateValue() {
                return attribute1*23;
            }
        }

        //ex3

        interface Height{
            public void setHeight(double h);
        }

        interface Width{
            public void setWidth(double w);
        }

        class Rectangle implements  Height,Width{
            private double height;
            private double width;

            @Override
            public void setWidth(double w) {
                this.width=w;
            }

            @Override
            public void setHeight(double h) {
                this.height=h;
            }
        }

        class Square extends Rectangle {

            //constructor
            @Override
            public void setHeight(double h) {
                super.setHeight(h);
            }

            @Override
            public void setWidth(double w) {
                super.setWidth(w);
            }
        }
    }
}