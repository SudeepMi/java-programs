import java.io.*;

public class VowelConsonantSeparator {
    public static void main(String[] args) {
        try {
        
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a string: ");
            String input = reader.readLine();

            StringBuilder vowels = new StringBuilder();
            StringBuilder consonants = new StringBuilder();

            for (char ch : input.toCharArray()) {
                if (Character.isLetter(ch)) {
                    ch = Character.toLowerCase(ch); // Convert to lowercase for case-insensitivity
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels.append(ch);
                    } else {
                        consonants.append(ch);
                    }
                }
            }

            // Write vowels to VOWEL.TXT
            BufferedWriter vowelWriter = new BufferedWriter(new FileWriter("VOWEL.TXT"));
            vowelWriter.write(vowels.toString());
            vowelWriter.close();

            // Write consonants to CONSONANT.TXT
            BufferedWriter consonantWriter = new BufferedWriter(new FileWriter("CONSONANT.TXT"));
            consonantWriter.write(consonants.toString());
            consonantWriter.close();

            System.out.println("Vowels have been written to VOWEL.TXT");
            System.out.println("Consonants have been written to CONSONANT.TXT");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
