package Day_26_Methods;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("apple", 'm'));
        System.out.println(frequencyOfCharacters("apple", 'p'));
    }
    public static int frequencyOfCharacters (String word, char letter) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}
