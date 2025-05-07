public class Main {
    public static void main(String[] args) {

        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                                   to be used as objects. "Wrap them in an object"
        //                                   Generally, don't wrap primitives unless you need an object.
        //                                   Allows use of Collections Framework and static utility methods.

        //Autoboxing
//        Integer a = 123;
//        Double b = 3.14;
//        Character c = '$';
//        Boolean d = true;

        // Unboxing
//        int x = a;
//        double x = b
//        char x = c;
//        boolean x = d;

        // toString()
        String i = Integer.toString(123);
        String dub = Double.toString(3.13);
        String cha = Character.toString('#');
        String bool = Boolean.toString(true);
        System.out.println(i + dub + cha + bool);

        int a = Integer.parseInt("1234");
        double b = Double.parseDouble("13.213");
        char c = "S@dik".charAt(0);
        boolean d = Boolean.parseBoolean("true");

        System.out.println(Character.isLetter(c));
        System.out.println(Character.isUpperCase(c));

    }
}
