package model;

import control.DocumentVisitor;

public class Paragraph extends DocElement {
	private String paragraphText = "";

	public Paragraph(String s) {
		this.paragraphText = s;
	}

	@Override
	public String getText() {
		return paragraphText;
	}

	@Override
	public void accept(DocumentVisitor v) {
		v.visitParagraph(this);

	}

	public String toString() {
		return paragraphText;
	}

}
