package control;

import model.Document;
import model.HTMLDocument;
import model.Header;
import model.Paragraph;
import model.Text;

public class HTMLConverter extends DocConverter {
	protected HTMLDocument HTMLDoc = new HTMLDocument();

	@Override
	public void buildParagraph(String s) {
		Paragraph p = new Paragraph("<p>" + s + "</p>");
		HTMLDoc.addElement(p);
	}

	@Override
	public void buildHeader(String s) {
		Header h = new Header("<h1>" + s + "</h1>");
		HTMLDoc.addElement(h);
	}

	@Override
	public void preamble() {
		buildText("<!DOCTYPE html>\n<html>\n<head>\n<title>Page Title</title>\n</head>\n<body>\n");

	}

	@Override
	public void postamble() {
		buildText("</body>\n</html>\n");

	}

	public Document getDocument() {
		return HTMLDoc;
	}

	@Override
	public void buildText(String s) {
		Text t = new Text(s);
		HTMLDoc.addElement(t);

	}
}
