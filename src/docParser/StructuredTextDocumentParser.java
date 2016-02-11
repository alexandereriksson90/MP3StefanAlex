package docParser;

import document.StructuredTextDocument;
import documentElements.BulletListElement;
import documentElements.Element;
import documentElements.HeadingElement;
import documentElements.ParagraphElement;
import documentElements.TableElement;
import documentElements.TextElement;

public class StructuredTextDocumentParser implements DocumentVisitor
{
	DocumentBuilder converter = null;
	public void parse(StructuredTextDocument document, DocumentBuilder converter)
	{
		this.converter = converter;
		converter.preamble();
			for(Element element : document.getElements())
				element.accept(this);
				converter.postamble();
	
	}
	public void visitParagraph(ParagraphElement p) // callback from Element
	{
		converter.addParagraph(p);
	}
	public void visitBulletList(BulletListElement b) // callback from Element
	{
		converter.addBulletList(b);
	}
	public void visitHeading(HeadingElement h)
	{
		converter.addHeading(h);
	}
	public void visitTable(TableElement t)
	{
		converter.addTable(t);
	}
	public void visitText(TextElement t)
	{
		converter.addText(t);
	}

}
