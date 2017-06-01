package hai.bk.webjava.model;

public class UserSubComment {
	private int id;
	private int userCommentId;
	private int userSubCommentId;
	
	public UserSubComment(){}

	public UserSubComment(int id, int userCommentId, int userSubCommentId) {
		super();
		this.id = id;
		this.userCommentId = userCommentId;
		this.userSubCommentId = userSubCommentId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserCommentId() {
		return userCommentId;
	}

	public void setUserCommentId(int userCommentId) {
		this.userCommentId = userCommentId;
	}

	public int getUserSubCommentId() {
		return userSubCommentId;
	}

	public void setUserSubCommentId(int userSubCommentId) {
		this.userSubCommentId = userSubCommentId;
	}
	
	

}
