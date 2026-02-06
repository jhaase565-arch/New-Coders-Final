package main.java;
//edit the code such that the 3rd case returns grey and the 5th case returns white and the 1st case returns blue 
public class SwitchTest {
    public boolean checkCorrect(){
        boolean correct;
        output("Red", 1);
        int num = 0;
        if (output("Red", 1) == "blue") {
            num++;
        }
        if (output("orange", 3) == "grey") {
            num++;
        } 
        if (output("purple", 5) == "white") {
            num++;
        }
        if (num == 3) {
            correct = true;
        }
        else {
            correct = false;
        }
        System.out.println(correct);
        return correct;
    }
    //DO NOT EDIT ABOVE HERE
    int number = 1;
    String color = "purple";
    public String output(String color, int number) {
        this.color = color;
        this.number = number;
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
        return color;
    }
    public SwitchTest(){}
}
