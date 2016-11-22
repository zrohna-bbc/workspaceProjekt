package ch.bbcag.barkeeper.controller;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import ch.bbcag.barkeeper.model.Post;
import ch.bbcag.barkeeper.model.UserSpecificPostData;

@Named
@SessionScoped
public class PostController implements Serializable{

	private static final long serialVersionUID = 1L;
	private static List<Integer> upvoters = new ArrayList<Integer>();
	private static List<Integer> downvoters = new ArrayList<Integer>();
	
	
	static{
		upvoters.add(1);
		upvoters.add(2);
		upvoters.add(3);
		downvoters.add(4);
	}
	
	public List<UserSpecificPostData> getPosts(String sort){
		List<UserSpecificPostData> result = new ArrayList<UserSpecificPostData>();
		String s = "apioafaöwsepfjawhug0pasngdböanjrgipaefra dvgkjbhaoeuifgbawegknaspigpvas vökadjbrfpainv puhr";
		switch (sort) {
		case "top":
			UserSpecificPostData post1 = new UserSpecificPostData(new Post(1, "Post 1", s+s+s+s+s+s+s+s+s+s, 1, new Date(System.currentTimeMillis()), upvoters, downvoters));
			result.add(post1);
			UserSpecificPostData post2 = new UserSpecificPostData(new Post(2, "Post 2", s+s+s+s+s+s+s+s+s+s+s+s+s+s, 2, new Date(System.currentTimeMillis()), upvoters, downvoters));
			result.add(post2);
			UserSpecificPostData post3 = new UserSpecificPostData(new Post(3, "Post 3", s+s+s+s+s, 3, new Date(System.currentTimeMillis()), upvoters, downvoters));
			result.add(post3);
			UserSpecificPostData post4 = new UserSpecificPostData(new Post(4, "Post 4", "ag9rhaegrj", 4, new Date(System.currentTimeMillis()), upvoters, downvoters));
			result.add(post4);
			break;

		case "new":
			break;
			
		case "duscussed":
			break;
		}
		return result;
	}
	
	/**
	 * 
	 * @param postId ID of the post to vote for.
	 * @param voteValue Upvote: > 0, Downvote: < 0, Remove Vote: 0
	 */
	public void votePost(int postId, int voteValue){
		if (voteValue > 0){
			if (downvoters.contains(new Integer(1))){
				downvoters.remove(new Integer(1));
			}if (!upvoters.contains(new Integer(1))){
				upvoters.add(new Integer(1));
			}
		}else if (voteValue < 0){
			if (upvoters.contains(new Integer(1))){
				upvoters.remove(new Integer(1));
			}if (!downvoters.contains(new Integer(1))){
				downvoters.add(new Integer(1));
			}
		}else{
			if (upvoters.contains(new Integer(1))){
				upvoters.remove(new Integer(1));
			}if (downvoters.contains(new Integer(1))){
				downvoters.remove(new Integer(1));
			}
		}
	}
	
	public void upvoteButtonPress(int postId, boolean alreadyClicked){
		if (alreadyClicked) votePost(postId, 0);
		else votePost(postId, 1);
	}
	
	public void downvoteButtonPress(int postId, boolean alreadyClicked){
		if (alreadyClicked) votePost(postId, 0);
		else votePost(postId, -1);
	}
}

