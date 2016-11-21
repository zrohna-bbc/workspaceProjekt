function votePost(postId, voteValue){
	if (voteValue > 0){
		document.getElementsByClassName("upvote-button-" + postId)[0].style.color = "orange";
	}else if (voteValue < 0){
		document.getElementsByClassName("downvote-button-" + postId)[0].style.color = "orange";
	}else{
		document.getElementsByClassName("upvote-button-" + postId)[0].style.color = "black";
		document.getElementsByClassName("downvote-button-" + postId)[0].style.color = "black";
	}
}