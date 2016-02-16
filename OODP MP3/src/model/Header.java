package model;

import control.DocumentVisitor;

public class Header extends DocElement {
	private String headerText = "";

	public Header(String s) {
		this.headerText = s;
	}

	@Override
	public String getText() {
		return headerText;
	}

	@Override
	public void accept(DocumentVisitor v) {
		v.visitHeader(this);

	}

	public String toString() {
		return headerText;

	}

}
