package lesson7;
public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;}
    public void decreaseFood(int foodToDecrease) {
        food = food - foodToDecrease;}
    public void increaseFood (int increaseFood){
        food = food + increaseFood;}
    public int getFood() {
        return food;}
    public void PrintInfo () {
            System.out.println(" В тарелке " + food + " единиц еды.");}}
