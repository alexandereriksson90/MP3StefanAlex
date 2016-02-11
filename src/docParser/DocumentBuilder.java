package docParser;


import document.TextDocument;
import documentElements.BulletListElement;
import documentElements.HeadingElement;
import documentElements.ParagraphElement;
import documentElements.TableElement;
import documentElements.TextElement;

public abstract class DocumentBuilder
{
	
	public abstract void preamble();

	public abstract void postamble();
	
	public abstract void addParagraph(ParagraphElement p);

	public abstract void addBulletList(BulletListElement b);

	public abstract void addHeading(HeadingElement h);

	public abstract void addTable(TableElement t);

	public abstract void addText(TextElement t);

	public abstract TextDocument build();


}
