package view;

import control.HTMLConverter;
import control.LaTeXConverter;
import control.Parser;
import control.PlainTextConverter;
import model.DocElement;

public class Main {

	public static void main(String[] args) {
		Parser p = new Parser();
		PlainTextConverter ptc = new PlainTextConverter();
		HTMLConverter HTMLc = new HTMLConverter();
		LaTeXConverter LaTeXc = new LaTeXConverter();
		ptc.buildHeader("Det här är en header");
		ptc.buildParagraph("Det här är en paragraf");
		ptc.buildParagraph("Det var passande med ytterliggare en paragraf");
		ptc.buildParagraph("Helgen kommer inte spenderas med att programmera.");
		ptc.buildHeader("Bra att se om det funkar med en andra header");
		ptc.buildParagraph("Lika bra med en sista paragraf.");

		for (DocElement de : ptc.getDocument().getElementList()) {
			System.out.println(de);

		}
		p.parse(HTMLc, ptc.getDocument());
		for (DocElement de : HTMLc.getDocument().getElementList()) {
			System.out.println(de);
		}
		p.parse(LaTeXc, ptc.getDocument());
		for (DocElement de : LaTeXc.getDocument().getElementList()) {
			System.out.println(de);
		}
	}

}
