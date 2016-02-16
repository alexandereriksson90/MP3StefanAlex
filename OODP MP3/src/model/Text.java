package model;

import control.DocumentVisitor;

public class Text extends DocElement {
	private String text = "";

	public Text(String s) {
		this.text = s;
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public void accept(DocumentVisitor v) {
		v.visitText(this);

	}

	public String toString() {
		return text;
	}

}
