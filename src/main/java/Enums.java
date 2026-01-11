package main.java;
//Finish the given enum and create your own enum for ice cream flavors 
//check if the day is Friday and that the ice cream flavor if chocolate 
public class Enums {
    public enum Day {
        Sunday,
        Monday,
        Tuesday,
        Wednesday
    }
    public enum Flavor {
        Chocolate,
        Vanilla
    }

    public void Check(Day day, Flavor flavor) {
        if (day == Day.Friday && flavor == Flavor.Chocolate) {
            System.out.println("It's Friday and the flavor is Chocolate!");
        }
    }
}
