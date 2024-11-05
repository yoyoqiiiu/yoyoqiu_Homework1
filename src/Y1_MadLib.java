import java.sql.SQLOutput;

public class Y1_MadLib {
    public static void main(String[] args) {
        Y1_MadLib mystory = new Y1_MadLib();
    }

    public Y1_MadLib(){
        String classmate = "Angela";
        String city = "Boston";
        String noun = "computer";
        String pluralNoun = "homeworks";
        String pluralAnimal = "wombats";
        String adjective = "wonderful";
        Boolean trueOrFalse = false;
        double decimalBiggerThan1 = 90;
        int number1 = 100;
        int number2 = 20;
        int wholeNumberBetween1And4 = 3;
        String miltonTeacher = "Mr. Milton Teacher";
        String miltonDean = "Ms. Milton Dean";
        char letterGrade = 'A';
        String season = "Summer";

        String story = "This weekend I am going camping with "
                +classmate+ ". We are going to a campsite in "
                +city+ ". I packed my "+noun+ " and "
                +pluralNoun + ".  The forecast is calling for a high of "
                +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
                +adjective+" day! This year, the park rangers have seen "
                +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
                +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
                +miltonDean+ " said it actually has happened "
                + number2+" times. Wish us luck! If we survive, we will earn a "
                +letterGrade+ "+ in P.E. class.";
        System.out.println(story);
    }

}
