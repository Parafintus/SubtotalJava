
import java.util.ArrayList;
import java.util.List;

public class ToysMain {
    public static void main(String[] args) {

        ToysPro toy1 = new ToysPro(0, "Железная дорога", 13.8);
        ToysPro toy2 = new ToysPro(1, "Вертолет радиоуправляемый", 43.9);
        ToysPro toy3 = new ToysPro(2, "Конструктор", 79.1);
        ToysPro toy4 = new ToysPro(3, "Набор юного археолога", 67.3);
        ToysPro toy5 = new ToysPro(4, "Спортивная кукла с гардеробом", 58.2);
        ToysPro toy6 = new ToysPro(5, "Игрушечный пистолет", 12.2);
        ToysPro toy7 = new ToysPro(6, "Набор доктора", 33.3);
        ToysPro toy8 = new ToysPro(7, "Набор полицейского", 12.5);
        ToysPro toy9 = new ToysPro(8, "Минифутбол", 3);
        ToysPro toy10 = new ToysPro(9, "Настольный хоккей", 35);

        List<ToysPro> toys = new ArrayList<ToysPro>();
        toys.add(toy10);
        toys.add(toy9);
        toys.add(toy8);
        toys.add(toy7);
        toys.add(toy6);
        toys.add(toy5);
        toys.add(toy4);
        toys.add(toy3);
        toys.add(toy2);
        toys.add(toy1);

        ToyShopPro toyShop = new ToyShopPro(toys);
        toyShop.toyRaffle();
        toyShop.toyRaffle();
        toyShop.toyRaffle();
        toyShop.toyRaffle();
        toyShop.toyRaffle();
    }

}