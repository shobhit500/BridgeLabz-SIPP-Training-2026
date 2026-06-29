public class ContentModerator implements TextModeration, SpamDetection {

    public void checkOffensive(String post) {

        if (TextModeration.containsRestrictedWords(post))
            System.out.println(post + " -> Offensive");
    }

    public void checkSpam(String post) {

        if (post.toLowerCase().contains("buy now"))
            System.out.println(post + " -> Spam");
    }

    @Override
    public void displayModerationPolicy() {

        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }

    public static void main(String[] args) {

        String posts[] = {
                "Buy now and win",
                "This is a bad post",
                "Good Morning Everyone",
                "Buy now bad offer",
                "Happy Coding"
        };

        ContentModerator cm = new ContentModerator();

        cm.displayModerationPolicy();

        System.out.println();

        for (String post : posts) {

            if (post.toLowerCase().contains("buy now")) {

                System.out.println(post + " -> Spam");

            } else if (TextModeration.containsRestrictedWords(post)) {

                System.out.println(post + " -> Offensive");

            } else {

                System.out.println(post + " -> Valid");
            }
        }
    }
}