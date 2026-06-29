public class SmartTV implements StreamingService, GamingService {

    public void streamMovie() {
        System.out.println("Movie Streaming Started.");
    }

    public void playGame() {
        System.out.println("Game Started.");
    }

    @Override
    public void showSubscriptionDetails() {

        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }

    public static void main(String[] args) {

        String movies[] = {
                "Avengers",
                "Avatar",
                "Inception"
        };

        String games[] = {
                "FIFA",
                "Minecraft",
                "PUBG"
        };

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();

        System.out.println("\nMovies:");

        for (String movie : movies)
            System.out.println(movie);

        System.out.println("\nGames:");

        for (String game : games)
            System.out.println(game);

        tv.streamMovie();
        tv.playGame();
    }
}