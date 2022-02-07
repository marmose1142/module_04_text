package by.epam.text.logic;

import java.util.Scanner;

import by.epam.text.entity.Text;

public class TextLogic {
	public String enteringWord(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		if (!sc.hasNextLine()) {
			sc.hasNext();
			System.out.println(message);
		}
		return sc.nextLine();
	}

	public String enteringSentence(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		if (!sc.hasNextLine()) {
			sc.hasNext();
			System.out.println(message);
		}
		return sc.nextLine();
	}

	public void addText(Text text, String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		if (!sc.hasNextLine()) {
			sc.hasNext();
			System.out.println(message);
		}
		String textFinish = text.getBody().getSentence() + sc.nextLine();
		text.getBody().setSentence(textFinish);
	}

}
