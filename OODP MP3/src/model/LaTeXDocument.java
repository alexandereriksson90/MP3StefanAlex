package model;

import java.util.ArrayList;
import java.util.List;

public class LaTeXDocument extends PlainTextDocument {
	private List<DocElement> elementList;

	public LaTeXDocument() {
		elementList = new ArrayList<DocElement>();
	}

	@Override
	public void addElement(DocElement e) {
		elementList.add(e);

	}

	public List<DocElement> getElementList() {
		return elementList;
	}

}