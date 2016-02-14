package docParser;

import document.TextDocument;
import documentElements.BulletList;
import documentElements.CompositeElement;
import documentElements.Element;
import documentElements.Heading;
import documentElements.Paragraph;
import documentElements.Table;
import documentElements.TextElement;

public class StructuredTextDocumentParser implements DocumentVisitor
{
	DocumentBuilder converter = null;

	public void parse(TextDocument document, DocumentBuilder converter)
	{
		this.converter = converter;
		converter.preamble();
		for (Element element : document.getElements())
			element.accept(this);
		converter.postamble();
	}

	@Override
	public void visit(Paragraph p)
	{
		converter.addParagraph(p);
	}

	@Override
	public void visit(BulletList b)
	{
		converter.addBulletList(b);
	}

	@Override
	public void visit(Heading h)
	{
		converter.addHeading(h);
	}

	@Override
	public void visit(Table t)
	{
		converter.addTable(t);
	}

	@Override
	public void visit(CompositeElement ce)
	{
		converter.addCompositeElement(ce);
	}

	@Override
	public void visit(TextElement te)
	{
		converter.addTextElement(te);
	}

}
