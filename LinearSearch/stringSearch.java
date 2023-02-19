package practices.LinearSearch;

public class stringSearch {
    public static void main(String[] args) {
        String name = "Ansari Umer";
        char ch = 'A';

        System.out.println(search(name,ch));
    }

    static boolean search(String str, char target){
        if (str.length() == 0){
            return false;
        }

        for (int index = 0; index < str.length(); index++) {
            if (target == str.charAt(index)){
                return true;
            }
        }

        return false;
    }
}
