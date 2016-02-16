package model;

import java.util.ArrayList;
import java.util.List;

public class HTMLDocument extends PlainTextDocument {
	private List<DocElement> elementList;

	public HTMLDocument() {
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