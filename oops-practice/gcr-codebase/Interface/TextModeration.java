interface TextModeration {

    void checkOffensive(String post);

    default void displayModerationPolicy() {
        System.out.println("No offensive language allowed.");
    }

    static boolean containsRestrictedWords(String post) {

        return post.toLowerCase().contains("bad");
    }
}