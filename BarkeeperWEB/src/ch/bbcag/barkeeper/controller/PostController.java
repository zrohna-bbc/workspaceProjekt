package ch.bbcag.barkeeper.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import ch.bbcag.barkeeper.model.Post;

@Named
@SessionScoped
public class PostController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public List<Post> getPosts(String sort){
		List<Post> result = new ArrayList<Post>();
		switch (sort) {
		case "top":
			Post post1 = new Post(1, "Post 1", "111111111", 1);
			result.add(post1);
//			result.add(post1);
//			result.add(post1);
//			result.add(post1);
//			result.add(post1);
//			result.add(post1);
//			result.add(post1);
//			result.add(post1);
//			result.add(post1);
//			result.add(post1);
//			result.add(post1);
//			result.add(post1);
//			result.add(post1);
//			result.add(post1);
//			result.add(post1);
//			result.add(post1);
//			result.add(post1);
//			result.add(post1);
//			result.add(post1);
//			result.add(post1);
//			result.add(post1);
//			result.add(post1);
//			result.add(post1);
//			result.add(post1);
			Post post2 = new Post(2, "Post 2", "222222222", 2);
			result.add(post2);
			Post post3 = new Post(3, "Post 3", "333333333", 3);
			result.add(post3);
			Post post4 = new Post(4, "Post 4", "444444444", 4);
			result.add(post4);
			break;

		case "new":
			break;
			
		case "duscussed":
			break;
		}
		return result;
	}
}

