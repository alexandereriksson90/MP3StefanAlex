package src.control;

import model.Document;
import model.Header;
import model.Paragraph;
import model.PlainTextDocument;
import model.Text;

public class PlainTextConverter extends DocConverter {
	protected PlainTextDocument ptd = new PlainTextDocument();

	@Override
	public void buildParagraph(String s) {
		Paragraph p = new Paragraph(s);
		ptd.addElement(p);

	}

	@Override
	public void buildHeader(String s) {
		Header h = new Header(s);
		ptd.addElement(h);

	}

	@Override
	public void preamble() {

	}

	@Override
	public void postamble() {

	}

	@Override
	public Document getDocument() {
		return ptd;
	}

	@Override
	public void buildText(String s) {
		Text t = new Text(s);
		ptd.addElement(t);

	}
}
