import java.util.*;

public class anagram {

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            char[] ch = s.toCharArray();

            Arrays.sort(ch);

            String key = new String(ch);

            map.putIfAbsent(key, new ArrayList<>());

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] words = {
                "eat",
                "tea",
                "tan",
                "ate",
                "nat",
                "bat"
        };

        List<List<String>> ans = groupAnagrams(words);

        System.out.println(ans);
    }
}