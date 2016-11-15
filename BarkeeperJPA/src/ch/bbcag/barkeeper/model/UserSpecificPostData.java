package ch.bbcag.barkeeper.model;

import java.sql.Date;
import java.util.List;

public class UserSpecificPostData{
	
	private String title;
	private String description;
	private String authorName;
	private Date creationDate;
	private List<String> ingredients;
	private String preperation;
	private int difficulty;
	private int timeInMinutes;
	private int voteScore;
	private boolean currentUserUpvoted;
	private boolean currentUserDownvoted;

	
	public UserSpecificPostData(Post post){
		title = post.getTitle();
		description = post.getDescription();
		authorName = "ID: " + post.getIdAuthor(); //TODO Get name by ID
		creationDate = post.getCreationDate();
		ingredients = post.getIngredients();
		preperation = post.getPreperation();
		difficulty = post.getDifficulty();
		timeInMinutes = post.getTimeInMinutes();
		voteScore = post.getUpvoterIDs().size() - post.getDownvoterIDs().size();
		currentUserUpvoted = true; //TODO Check if ID of current user is in upvoterIDs
		currentUserDownvoted = false; //TODO Check if ID of current user is in downvoterIDs
	}


	public String getTitle() {
		return title;
	}


	public String getDescription() {
		return description;
	}


	public String getAuthorName() {
		return authorName;
	}


	public Date getCreationDate() {
		return creationDate;
	}


	public List<String> getIngredients() {
		return ingredients;
	}


	public String getPreperation() {
		return preperation;
	}


	public int getDifficulty() {
		return difficulty;
	}


	public int getTimeInMinutes() {
		return timeInMinutes;
	}


	public int getVoteScore() {
		return voteScore;
	}


	public boolean isCurrentUserUpvoted() {
		return currentUserUpvoted;
	}


	public boolean isCurrentUserDownvoted() {
		return currentUserDownvoted;
	}
	

}
