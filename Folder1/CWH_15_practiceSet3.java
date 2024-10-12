import java.util.Locale;

public class CWH_15_practiceSet3 {
    public static void main(String[] args) {
        // Problem 1
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        // Problem 2
        String text = "Hi all of you";
        text = text.replace(' ', '_');
        System.out.println(text);

        // Problem 3
        String letter = "Dear < |name| >, Thanks a lot!";
        letter = letter.replace("< |name| >", "Harry");
        System.out.println(letter);

        // Problem 4
        String mystring = "This string  contains   double and triple spaces";
        System.out.println(mystring.indexOf("  ")); // Will print -1 if given string not found
        System.out.println(mystring.indexOf("   "));

        // Problem 5
        String myletter = "Dear Harry,\n\tThis Java Course is nice.\n\tThanks!";
        System.out.println(myletter);
    }
}
