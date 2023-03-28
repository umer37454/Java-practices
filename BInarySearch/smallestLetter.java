package practices.BInarySearch;

public class smallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';
        char result = nextGreatestLetter(letters,target);
        System.out.println(result);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            int middle = start + (end-start)/2;
            if (target < middle){
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        return letters[start % letters.length];
    }
}

