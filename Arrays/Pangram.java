package Practice;

public class Pangram {
        public boolean checkIfPangram(String sentence) {
            int[] letters = new int[26];
            for (int i = 0; i < 26; i++) {
                letters[i] = -1;
            }
            for (int i = 0; i < sentence.length(); i++) {
                char ch = sentence.charAt(i);
                letters[ch - 97]++; //assigning the value zero at every index. Integer value //of a=97
            }
            for (int i : letters) {
                if (i == -1) return false;
            }
            return true;
        }
    }