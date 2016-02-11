package docParser;

import document.TextDocument;
import documentElements.BulletListElement;
import documentElements.CompositeElement;
import documentElements.Element;
import documentElements.HeadingElement;
import documentElements.ParagraphElement;
import documentElements.TableElement;
import documentElements.TextElement;

public class StructuredTextDocumentParser implements DocumentVisitor
{
	DocumentBuilder converter = null;
	public void parse(TextDocument document, DocumentBuilder converter)
	{
		this.converter = converter;
		converter.preamble();
			for(Element element : document.getElements())
				element.accept(this);
				converter.postamble();
	}
	public void visit(ParagraphElement p)
	{
		converter.addParagraph(p);
	}
	public void visit(BulletListElement b)
	{
		converter.addBulletList(b);
	}
	public void visit(HeadingElement h)
	{
		converter.addHeading(h);
	}
	public void visit(TableElement t)
	{
		converter.addTable(t);
	}
	public void visit(TextElement t)
	{
		converter.addText(t);
	}
	@Override
	public void visit(CompositeElement ce)
	{
		//
		
	}

}
