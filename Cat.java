package lesson7;
public class Cat {
    private  String name;
    private  int appetite;
    public  boolean satiety;
    public Cat (String name, int appetite, boolean satiety){
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;}
    public void eat (Plate plate){
        plate.decreaseFood(appetite);}
    public String getName() {
        return name;}
    public int getAppetite() {
        return appetite;}}
