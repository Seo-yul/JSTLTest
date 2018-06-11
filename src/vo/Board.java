package vo;

public class Board {
	private int boardNum;
	private String userId;
	private String title;
	private String content;
	private int hitCount;
	private String regDate;
	
	public Board() {
		super();
	}

	public Board(int boardNum, String userId, String title, String content, int hitCount, String regDate) {
		super();
		this.boardNum = boardNum;
		this.userId = userId;
		this.title = title;
		this.content = content;
		this.hitCount = hitCount;
		this.regDate = regDate;
	}

	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getHitCount() {
		return hitCount;
	}

	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "board [boardNum=" + boardNum + ", userId=" + userId + ", title=" + title + ", content=" + content
				+ ", hitCount=" + hitCount + ", regDate=" + regDate + "]";
	}

}
