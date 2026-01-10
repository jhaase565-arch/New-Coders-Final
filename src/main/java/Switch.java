package main.java;

public class Switch {
    public int output(String color, int number) {
        color = "ngrjenj";
        number = 1;
        switch (number) {
            case 1:
                color = "red";
                break;

            case 2:
                color = "blue";
                break;
            
            case 3:
                color = "white";
                break;

            default:
                System.out.println("stop being a loser and do it already");
                break;
        }
        return number;
    }
}
