package ca.alexchen.cs.lonelytwitter;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

public class NormalLonelyTweet extends LonelyTweet {

	private static final long serialVersionUID = 1L;
//	private Date tweetDate;
//	private String tweetBody;

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

}