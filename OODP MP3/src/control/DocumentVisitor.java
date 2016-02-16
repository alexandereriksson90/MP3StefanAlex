package control;

import model.Header;
import model.Paragraph;
import model.Text;

public interface DocumentVisitor {

	public void visitParagraph(Paragraph p);

	public void visitHeader(Header h);

	public void visitText(Text t);

}
