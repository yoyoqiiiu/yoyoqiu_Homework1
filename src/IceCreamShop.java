public class IceCreamShop {
    public static void main(String[] args) {IceCreamShop creamery = new IceCreamShop();}
    public String Greeting;
    public String name;
    public boolean isOpen;
    public int numberOfFlavors;
    public IceCreamShop() {
        String Greeting = "Hello World! Good luck on your exams!";
        String name = "Scoops & Loops:The Code Creamery";
        boolean isOpen = true;
        int numberOfFlavors = 32;
        System.out.println(Greeting);
        System.out.println("Welcome to " + name + "! It is " + isOpen + " that we are open. We have " + numberOfFlavors + " flavors. ");
        numberOfFlavors = 79;
        System.out.println("Welcome to " + name + "! It is " + isOpen + " that we are open. We have " + numberOfFlavors + " flavors. ");
    randomDiscount();
    specialOfTheDay("Vanilla");
    countScoops();
    chefsChoice();
        IceCream halesOrder = new IceCream(2, "Cookies and Cream", false);
        System.out.println("Mr. Hales ordered...");
        halesOrder.printInfo();
        IceCream myOrder = new IceCream(3, "Matcha, Macadamia Nut, and Salted Caramel", true);
        System.out.println("And this is my order...");
        myOrder.printInfo();
    }
    public void randomDiscount(){
        int randomInt;
        randomInt = (int) (Math.random()*31);
        System.out.println("We spun the discount wheel and you got " + randomInt + " percent off your order!");
    }
    public void specialOfTheDay(String flavor){
        System.out.println("Today's special is " + flavor + ". ");
    }
    public void countScoops(){
        for (int x = 1; x < 6; x = x + 1){
            System.out.println(x);
        }
        for (int x = 2; x < 12; x = x + 3){
            System.out.println(x);
        }
        for (int x = 8; x > -1; x = x - 1){
            System.out.print(x + ", ");
        }
    }
    public void chefsChoice(){
        double randomNum;
        randomNum = (int) (Math.random());
        if (randomNum < 0.25){
            System.out.println("The chef recommends a Banana Split.");
        }
        else if (randomNum > 0.25 || randomNum < 0.5){
            System.out.println("The chef recommends a Turtle Sundae.");
        }
        else if (randomNum > 0.5 || randomNum < 0.75){
            System.out.println("The chef recommends a Hot Fudge Sundae.");
        }
        else if (randomNum > 0.75){
            System.out.println("The chef recommends The Vermonster. ");
        }
    }
}
