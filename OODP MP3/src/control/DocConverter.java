package control;

import model.Document;

public abstract class DocConverter {
	public abstract void buildParagraph(String s);

	public abstract void buildHeader(String s);

	public abstract void preamble();

	public abstract void postamble();

	public abstract Document getDocument();

	public abstract void buildText(String s);

}
