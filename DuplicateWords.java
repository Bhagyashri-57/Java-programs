
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateWords {
    public static void main(String[] args) {
        String sentence = "java is fun and java is powerful";

        String[] words = sentence.toLowerCase().split("\\s+");
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new LinkedHashSet<>();

        for (String word : words) {
            if (!seen.add(word)) {
                duplicates.add(word);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicate words.");
        } else {
            System.out.println("Duplicate words: " + duplicates);
        }
    }
}
