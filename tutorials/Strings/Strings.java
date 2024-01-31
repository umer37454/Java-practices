package practices.tutorials.Strings;

public class Strings {
    public static void main(String[] args) {
        String test = "John doe is the best in the country";
        String test2 = "John doe is the best in the country";

        System.out.println(test == test2); // both are pointing to same string in a pool - checking references
        System.out.println(test.equals(test2)); // checking only content

        String demo = new String("Messi is an argentina player");
        String demo2 = new String("Messi is an argentina player");

        System.out.println(demo == demo2); // different refrences
        System.out.println(demo.equals(demo2)); // same content

        String player = "Lionel";
        String playerFullName = player.concat(" Messi"); // new object is created

        System.out.println(player); // only Lionel as string is immutable
        System.out.println(playerFullName);
    }
}
