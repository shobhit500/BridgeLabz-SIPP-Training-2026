import java.util.*;

public class DuplicateTokenChecker {

    public static boolean hasDuplicateToken(String[] tokens) {

        HashSet<String> set = new HashSet<>();

        for (String token : tokens) {

            if (!set.add(token)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] tokens = {
                "ABC123",
                "XYZ456",
                "PQR789",
                "ABC123"
        };

        System.out.println(hasDuplicateToken(tokens));
    }
}