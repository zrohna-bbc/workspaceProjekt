package ch.bbcag.barkeeper.controller;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.context.RequestContext;

import ch.bbcag.barkeeper.model.Post;
import ch.bbcag.barkeeper.model.UserSpecificPostData;

@Named
@SessionScoped
public class PostController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public List<UserSpecificPostData> getPosts(String sort){
		List<UserSpecificPostData> result = new ArrayList<UserSpecificPostData>();
		List<Integer> upvoters = new ArrayList<Integer>();
		upvoters.add(1);
		upvoters.add(2);
		upvoters.add(3);
		List<Integer> downvoters = new ArrayList<Integer>();
		downvoters.add(4);
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
		System.out.println(postId+"|"+voteValue);
		RequestContext.getCurrentInstance().execute("votePost("+postId+", "+voteValue + ")");
	}
}

