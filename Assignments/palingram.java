package practices.Assignments;

public class palingram {
    public static void main(String[] args) {
        String test = "thekcdmnk";
        boolean result = checkIfPangram(test);
        System.out.println(result);
    }

    static boolean checkIfPangram(String sentence) {
        boolean[] alphabet = new boolean[26];

        for(int i = 0; i < sentence.length(); i++){
            //it will check if alphabet is there or not
            alphabet[sentence.charAt(i) - 97] = true;
        }

        for(int i = 0; i < 26; i++){
            if(!alphabet[i]){
                return false;
            }
        }

        return true;
    }
}

