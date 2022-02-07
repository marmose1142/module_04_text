package by.epam.text.main;

import by.epam.text.entity.Sentence;
import by.epam.text.entity.Text;
import by.epam.text.entity.Word;
import by.epam.text.logic.TextLogic;
import by.epam.text.view.View;

/*Создать объект класса Текст, используя классы предложение и слово.Методы:дополнить текст,
 *  вывести на консоль текст, заголовок текста.*/

public class Main {

	public static void main(String[] args) {
		TextLogic textLogic = new TextLogic();
		Word word = new Word(textLogic.enteringWord("Please, insert word"));
		Sentence sentence = new Sentence(textLogic.enteringWord("Please, insert sentence"));
		Text text = new Text(word, sentence);
		View view = new View();
		view.printTitle(text.getTitle());
		view.printSentence(text.getBody());
		textLogic.addText(text, "Please, insert additional text");
		view.printSentence(text.getBody());
	}

}
