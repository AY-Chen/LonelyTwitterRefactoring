package ca.alexchen.cs.loneliertwitter;

import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet {
    public ImportantLonelyTweet(String text, Date date) {
        this.tweetDate = date;
        this.tweetBody = text;
    }

    @Override
    public boolean isValidBody() {
        if (tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 20) {
            return false;
        }

        return true;
    }
}
