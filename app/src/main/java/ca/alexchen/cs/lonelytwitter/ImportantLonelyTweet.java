package ca.alexchen.cs.lonelytwitter;

public class ImportantLonelyTweet extends LonelyTweet {
    @Override
    public boolean isValid() {
        if (tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 20) { 
            return false;
        }

        return true;
    }
}
