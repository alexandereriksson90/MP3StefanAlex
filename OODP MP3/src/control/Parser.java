package control;

import model.DocElement;
import model.Document;
import model.Header;
import model.Paragraph;
import model.Text;

public class Parser implements DocumentVisitor {
	DocConverter converter;
	Document doc;

	@Override
	public void visitParagraph(Paragraph p) {
		converter.buildParagraph(p.getText());

	}

	@Override
	public void visitHeader(Header h) {
		converter.buildHeader(h.getText());

	}

	public void parse(DocConverter converter, Document doc) {
		this.converter = converter;
		this.doc = doc;
		converter.preamble();
		for (DocElement e : doc.getElementList())
			e.accept(this);
		converter.postamble();

	}

	@Override
	public void visitText(Text t) {
		converter.buildText(t.getText());

	}

}
