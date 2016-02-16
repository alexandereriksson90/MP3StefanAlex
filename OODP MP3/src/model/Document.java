package model;

import java.util.List;

public abstract class Document {

	public abstract void addElement(DocElement e);

	public abstract List<DocElement> getElementList();

}
