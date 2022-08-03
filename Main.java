package lesson7;

import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int action;
    Cat [] allCats = new Cat[7];
    allCats [0] = new Cat("Мурка", 12, false);
    allCats [1] = new Cat("Мурзик", 16, false);
    allCats [2] = new Cat("Пекарь", 20, false);
    allCats [3] = new Cat("Маркиз", 24, false);
    allCats [4] = new Cat("Пушистик", 28, false);
    allCats [5] = new Cat("Барсик", 32, false);
    allCats [6] = new Cat("Кот", 36, false);

        Plate plate = new Plate(300);
        plate.PrintInfo();

        for (int i = 0; i < allCats .length; i++) {
            if (allCats[i].satiety  == false && allCats[i].getAppetite() < plate.getFood ())
            {
                allCats[i].eat(plate);
                allCats[i].satiety = true;
                System.out.println("Кот " + allCats[i].getName() + " поел и насытился! ");}
            else {
                System.out.println("Кот " + allCats[i].getName() + " не покушал, так как не хватило еды! ");}}

        plate.PrintInfo();
        System.out.println("Сколько единиц еды нужно добавить в миску? ");
        action = scanner.nextInt();
        plate.increaseFood(action);
        plate.PrintInfo();}}


