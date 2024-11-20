public class Y4_Brackets {
    public static void main(String[] args) {
        Y4_Brackets Pancakes = new Y4_Brackets();
    }

    public Y4_Brackets() {
        // Ingredients
        int eggs = 2;
        double flourCups = 1.5;
        boolean hasMilk = true;

        // Check if we have all the ingredients
        if (eggs >= 2 && flourCups >= 1.5 && hasMilk) {
            System.out.println("You have all the ingredients!");
        }
        // Mixing the batter
        System.out.println("Mixing the batter...");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Stirring " + i + " times...");
        }

        // Heat the pan
        System.out.println("Heating the pan...");
        System.out.println("Greasing the pan...");

        // Cooking the pancakes
        int numberOfPancakes = 6;
        for (int j = 1; j <= numberOfPancakes; j++) {
            System.out.println("Pouring pancake batter for pancake " + j);
            System.out.println("Cooking pancake " + j);
        }

        // Serve
        if (eggs == 2 && flourCups == 1.5 && hasMilk == true) {
            System.out.println("Pancakes are ready! Serve and enjoy!");
        } else {
            System.out.println("You are missing some ingredients. Can't make pancakes.");
        }

    }
}

