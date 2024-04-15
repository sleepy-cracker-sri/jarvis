//multilevel inheritance

package org.all;
import org.tamil.Tamil;

public class LanguageClass extends Tamil {
	public void allLanguage() {
		System.out.println("All Languages");
	}
	public static void main(String[] args) {
		LanguageClass a= new LanguageClass();
		a.allLanguage();
		a.tamilLanguage();
		a.englishLanguage();
		a.telguLanguage();
		
	}

}
