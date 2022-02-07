package by.epam.text.view;

import by.epam.text.entity.Sentence;
import by.epam.text.entity.Word;

public class View {
	public void printTitle(Word title) {
		System.out.println(title);
	}

	public void printSentence(Sentence body) {
        System.out.println(body);
	}

}
