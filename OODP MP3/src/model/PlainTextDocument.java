package model;

import java.util.ArrayList;
import java.util.List;

public class PlainTextDocument extends Document {
	private List<DocElement> elementList;

	public PlainTextDocument() {
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
