package control;

import model.Document;
import model.Header;
import model.LaTeXDocument;
import model.Paragraph;
import model.Text;

public class LaTeXConverter extends DocConverter {
	protected LaTeXDocument LaTeXDoc = new LaTeXDocument();

	@Override
	public void buildParagraph(String s) {
		Paragraph p = new Paragraph(s + "\\par");
		LaTeXDoc.addElement(p);

	}

	@Override
	public void buildHeader(String s) {
		Header h = new Header("\\section{" + s + "}");
		LaTeXDoc.addElement(h);

	}

	@Override
	public void preamble() {
		buildText("\\documentclass{article}\n\\usepackage[utf8]{inputenc}\n\\begin{document}");

	}

	@Override
	public void postamble() {
		buildText("\\end{document}");

	}

	@Override
	public Document getDocument() {
		return LaTeXDoc;
	}

	@Override
	public void buildText(String s) {
		Text t = new Text(s);
		LaTeXDoc.addElement(t);

	}

}
