import Sweets.*;

/**
 * Формируется сладкий подарок.
 * - Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * - У каждой сладости есть название, вес, цена и свой уникальный параметр
 * - Необходимо собрать подарок из сладостей
 * - Найти общий вес подарка, общую стоимость подарка
 * - Вывести на консоль информацию о всех сладостях в подарке
 * @author SNesterov
 * @version 0.1
 */

public class SweetsCount {

    public static void main(String[] args) {
        //creating classes instances
        Candy candy1 = new Candy("Step", 0.05, 4.99, "chocolate");
        Jellybean jellybean1 = new Jellybean("Pretty", 0.1, 6.99, "Purple");
        Donut donut1 = new Donut("Sweet Donut", 0.2, 5.99, true );
        Pancake pancakes1 = new Pancake("Pancaky", 0.25, 5.99, 15);
        //create the "gift"
        Sweet[] sweetGift = {candy1, jellybean1, donut1, pancakes1};

        //print gift's information
        System.out.print("Gift consist of \n");
        for (Sweet sweet: sweetGift) {
            System.out.println(sweet.toString() + " ");
        }

        //print total information about the gift
        //it was calculated in a static fields of the class called "Sweet"
        System.out.printf("\nThe total weight of the gift is %.2f \n", Sweet.getAbsoluteWeight());
        System.out.printf("The total price of the gift is %.2f", Sweet.getAbsolutePrice());
    }
}