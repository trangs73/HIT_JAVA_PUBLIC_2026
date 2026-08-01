package app;

import model.Toy;
import model.ElectronicToy;
import model.PlushToy;

public class Main {
    public static void main(String[] args) {
        Toy[] toys = new Toy[3];

        toys[0] = new Toy("T01", "Bộ xếp hình", 200, 3);
        toys[1] = new ElectronicToy("T02", "Robot thông minh", 525, 2, 12);
        toys[2] = new PlushToy("T03", "Gấu bông Teddy", 300, 5, "Bông gòn");

        for (Toy toy : toys) {
            toy.printInfo();
        }
    }
}
