import model.Bottle;
import model.Person;
import model.Product;

public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person("Daniel", 23, true);
        System.out.println(firstPerson.getName() + " is " + firstPerson.getAge() + " and " + (firstPerson.getMarried()?"is married":"is not married"));

        Person secondPerson = new Person("Monica", 35, false);
        System.out.println(secondPerson.getName() + " is " + secondPerson.getAge() + " and " + (secondPerson.getMarried()?"is married":"is not married"));

        Person thirdPerson = new Person("Andrei", 57, false);
        System.out.println(thirdPerson.getName() + " is " + thirdPerson.getAge() + " and " + (thirdPerson.getMarried()?"is married":"is not married"));


        Product product1 = new Product("Mouse", 250, 3000, "electronice");
        System.out.println(product1.getName() + " RON:" + product1.getPrice() + " BUC:" + product1.getQuantity() + " CAT:" + product1.getCategory() + " " + product1.hasStock(250) + " " + product1.isCategory("electronice"));

        Product product2 = new Product("Lampa", 100, 0 , "casa");
        System.out.println(product2.getName() + " RON:" + product2.getPrice() + " BUC:" + product2.getQuantity() + " CAT:" + product2.getCategory() + " " + product2.hasStock(0) + " " + product2.isCategory("decorative"));

        Product product3 = new Product("Pahar", 45, 15000, "bucatarie");
        System.out.println(product3.getName() + " RON:" + product3.getPrice() + " BUC:" + product3.getQuantity() + " CAT:" + product3.getCategory() + " " + product3.hasStock(15000) + " " + product3.isCategory("bucatarie"));

        Bottle myBottle = new Bottle(5000, 3785, true);
        System.out.println("The bottle has a total capacity of:" + myBottle.getTotalCapacity() +" being " + myBottle.getAvailableLiquid() + " ml full. And is " + (myBottle.getOpen()?"Opened":"Not opened"));
        System.out.println(myBottle.isOpened());
        System.out.println(myBottle.drink(2000));
        System.out.println(myBottle.drink(890));
        System.out.println(myBottle.isClosed());
        System.out.println(myBottle.drink(310));
        System.out.println("Available Liquid: " + myBottle.getAvailableLiquid() + " ml");
        System.out.println("Empty Capacity: " + myBottle.getEmptyCapacity() + " ml");
    }
}
