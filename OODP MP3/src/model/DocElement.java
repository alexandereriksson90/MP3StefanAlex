package model;

import control.DocumentVisitor;

public abstract class DocElement {

	public abstract String getText();

	public abstract void accept(DocumentVisitor v);

}
