package springstudy.mapboard.test;

public class Test {

	public static void main(String[] args) {

		String title = "[aaaaaaaa][aaaaaaaa][aaaaaaaa]a";
		if(title.length() > 30) {
			title = title.substring(0, 30) + "...";
		}
		System.out.println(title);
	}
}

class Manual {
	private String contents;
	private String contentsText;

	Manual(String contents) {
		this.contents = contents;
	}

	String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getContentsText() {
		return contentsText;
	}

	void setContentsText(String contentsText) {
		this.contentsText = contentsText;
	}
}