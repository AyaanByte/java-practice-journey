

public class CL_15_ps3 {
    public static void main(String[] args) {

        // * 1-> Write a java program to convert a string to lower case.
        System.out.println("_____Question-1_____");
        String name ="\tJACK PARKOR";
        name=name.toLowerCase();
        System.out.println(name);


        // * 2-> Write a program to replace space with underScore
        System.out.println("_____Question-2_____");
        String text ="\tI AM ALICE";
        text=text.replace(" ","_");
        System.out.println(text);

        // * 3. Question
        System.out.println("_____Question-3_____");
        String letter = "\tDear <|name|>,Thanks a lot!!";
        letter=letter.replace("<|name|>","Alice");
        System.out.println(letter);

        // * 4-> Write a program to detect double and triple space in a string
        System.out.println("_____Question-4_____");
        String myStr="\tThis String contain   double     and triple space ";
        System.out.println(myStr.indexOf("   "));

        // * 5--> Write a program to format the following letter using escape sequence character = \n
        System.out.println("_____Question-5_____");
        String letter2 ="\tDear Alice,\n\tThis Java Course is Nice\n\tThanks!";
        System.out.println(letter2);

    }
}
