package docParser;

import document.TextDocument;
import documentElements.BulletList;
import documentElements.CompositeElement;
import documentElements.Heading;
import documentElements.Paragraph;
import documentElements.Table;
import documentElements.TextElement;

public interface DocumentBuilder
{

	void preamble();

	void postamble();

	void addParagraph(Paragraph p);

	void addBulletList(BulletList b);

	void addHeading(Heading h);

	void addTable(Table t);

	TextDocument build();

	void addCompositeElement(CompositeElement ce);

	void addTextElement(TextElement te);

}
