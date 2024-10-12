public class CWH_14_StringMethods {
    public static void main(String[] args) {
        String name = "Harry";
        System.out.println(name);

        int value = name.length(); // Returns length of string
        System.out.println(value);

        String lstring = name.toLowerCase(); // Converting string to lower case
        System.out.println(lstring);

        String ustring = name.toUpperCase(); // Converting string to upper case
        System.out.println(ustring);

        String nonTrimmedString = "        Harry        ";
        System.out.println(nonTrimmedString);
        String trimmedstring = nonTrimmedString.trim(); //Removes blank spaces
        System.out.println(trimmedstring);

        System.out.println(name.substring(3)); // Prints string from the index number given (only start given)
        System.out.println(name.substring(1, 4)); // Prints string from the index number given (start and end given)

        System.out.println(name.replace('r', 'p')); // Replaces the character
        System.out.println(name.replace("rry", "ier")); // Replaces the string

        System.out.println(name.startsWith("Har")); // To check the starting characters
        System.out.println(name.endsWith("ry")); // To check the ending characters

        System.out.println(name.charAt(1)); // Prints the character at given index position

        System.out.println(name.indexOf("ry")); // Prints the index of first character from given string

        System.out.println(name.lastIndexOf("rry"));

        System.out.println(name.equals("Harry")); // Checks if the strings are same
        System.out.println(name.equalsIgnoreCase("HArRy")); // Checks if the strings are same (ignores case)

        System.out.println("I am escape sequence \" double quote"); // To print escape sequences
        System.out.println("I am escape sequence \\ double quote");
        System.out.println("Hi \nguys");
        System.out.println("1\t2\t3");

    }
}
