public class Y3_Conditionals {
    int randomInt = 0;
    public static void main(String[] args) {

        String Question = "Will it be a good day?";
        System.out.println(Question);
        Y3_Conditionals MagicEightBall = new Y3_Conditionals();
    }

    public Y3_Conditionals(){
        randomInt = (int)(Math.random()*10)+1;
        if (randomInt == 1 || randomInt == 10){
            System.out.println("Something surprising will happen tonight.");
        } else if (randomInt == 2 || randomInt == 9) {
            System.out.println("Better not tell you now.");
        } else if (randomInt == 3) {
            System.out.println("Very doubtful");
        } else if (randomInt == 4) {
            System.out.println("As I see it, yes.");
        } else if (randomInt == 5 || randomInt == 8) {
            System.out.println("Without a doubt.");
        } else if (randomInt == 6 || randomInt == 7) {
            System.out.println("Hard to tell.");
        }
    }
}
