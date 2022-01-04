package clicker.alogic;

public class PersonalCalculator implements Calculator{
    private int value = 0;
    public PersonalCalculator(){}
    public int giveValue(){
        return this.value;
    }
    public void increase(){
        this.value += 1;
    }
}