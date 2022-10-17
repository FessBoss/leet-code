import org.example.solution1832.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckIfTheSentenceIsPangram {
    private final Solution solution = new Solution();

    @Test
    public void checkIfPangramReturnTrue() {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        Assertions.assertTrue(solution.checkIfPangram(sentence));
    }

    @Test
    public void checkIfPangramReturnFalse() {
        String sentence = "leetcode";
        Assertions.assertFalse(solution.checkIfPangram(sentence));
    }
}
