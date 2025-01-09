public class IceCream {
    public int numberOfScoops;
    public String flavor;
    public boolean hasSprinkles;
    public IceCream(int pnumberOfScoops, String pflavor, boolean phasSprinkles){
        numberOfScoops = pnumberOfScoops;
        flavor = pflavor;
        hasSprinkles = phasSprinkles;
    }
    public void printInfo(){
        System.out.println("Number of Scoops: " + numberOfScoops);
        System.out.println("Flavor: " + flavor);
        System.out.println("Has Sprinkles: " + hasSprinkles);
    }
}
