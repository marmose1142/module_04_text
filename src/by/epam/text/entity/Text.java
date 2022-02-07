package by.epam.text.entity;

import java.util.Objects;

public class Text {
	private Word title;
	private Sentence body;

	public Text() {

	}

	public Text(Word title, Sentence body) {
		this.title = title;
		this.body = body;
	}

	public Word getTitle() {
		return title;
	}

	public void setTitle(Word title) {
		this.title = title;
	}

	public Sentence getBody() {
		return body;
	}

	public void setBody(Sentence body) {
		this.body = body;
	}

	@Override
	public int hashCode() {
		return Objects.hash(body, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		return Objects.equals(body, other.body) && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Text [title=" + title + ", body=" + body + "]";
	}

}
