package ch.bbcag.barkeeper.model;

import java.sql.Date;
import java.util.List;

public class Post {

	private int id;
	private String title;
	private String description;
	private int idAuthor;
	private Date creationDate;
	private List<String> ingredients;
	private String preperation;
	private List<Integer> upvoterIDs;
	private List<Integer> downvoterIDs;
	private List<Integer> commentIDs;
	private int difficulty;
	private int timeInMinutes;
	
	
	
	
	public Post(int id, String title, String description, int idAuthor, Date creationDate, List<String> ingredients,
			String preperation, List<Integer> upvoterIDs, List<Integer> downvoterIDs, List<Integer> commentIDs,
			int difficulty, int timeInMinutes) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.idAuthor = idAuthor;
		this.creationDate = creationDate;
		this.ingredients = ingredients;
		this.preperation = preperation;
		this.upvoterIDs = upvoterIDs;
		this.downvoterIDs = downvoterIDs;
		this.commentIDs = commentIDs;
		this.difficulty = difficulty;
		this.timeInMinutes = timeInMinutes;
	}
	
	
	public Post(int id, String title, String description, int idAuthor) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.idAuthor = idAuthor;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getIdAuthor() {
		return idAuthor;
	}
	public void setIdAuthor(int idAuthor) {
		this.idAuthor = idAuthor;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public List<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}
	public String getPreperation() {
		return preperation;
	}
	public void setPreperation(String preperation) {
		this.preperation = preperation;
	}
	public List<Integer> getUpvoterIDs() {
		return upvoterIDs;
	}
	public void setUpvoterIDs(List<Integer> upvoterIDs) {
		this.upvoterIDs = upvoterIDs;
	}
	public List<Integer> getDownvoterIDs() {
		return downvoterIDs;
	}
	public void setDownvoterIDs(List<Integer> downvoterIDs) {
		this.downvoterIDs = downvoterIDs;
	}
	public List<Integer> getCommentIDs() {
		return commentIDs;
	}
	public void setCommentIDs(List<Integer> commentIDs) {
		this.commentIDs = commentIDs;
	}
	public int getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	public int getTimeInMinutes() {
		return timeInMinutes;
	}
	public void setTimeInMinutes(int timeInMinutes) {
		this.timeInMinutes = timeInMinutes;
	}
}
