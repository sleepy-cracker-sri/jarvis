package org.lang;

public class StateDetails extends LanguageInfo{
	public void southIndia() {
	System.out.println("South India : Majority of Tamilans");
	}
	public void northIndia() {
	System.out.println("North India : Majority of vadakans");
	}
	public static void main(String[] args) {
		StateDetails z = new StateDetails();
		z.northIndia();
		z.southIndia();
		z.englishLanguage();
		z.tamilLanguage();
		z.hindiLanguage();
	}

}
