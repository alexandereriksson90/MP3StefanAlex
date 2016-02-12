package model;

import docParser.DocumentBuilder;
import docParser.StructuredTextDocumentParser;
import document.StructuredTextDocument;
import document.TextDocument;
import factories.StructuredTextElementFactory;
import factories.DocumentBuilderFactory;
import factories.ElementFactory;

public class test
{

	public void testRun()
	{
		ElementFactory factory = StructuredTextElementFactory.getInstance();
		TextDocument document = new StructuredTextDocument();
		buildDocument(document, factory);
		document.print();
		DocumentBuilder converter = DocumentBuilderFactory.getInstance("ToHTML");
		StructuredTextDocumentParser parser = new StructuredTextDocumentParser();
		parser.parse(document, converter);
		converter.build().print();
		DocumentBuilder converter2 = DocumentBuilderFactory.getInstance("ToLaTeX");
		parser.parse(document, converter2);
		converter.build().print();
	}

	public void buildDocument(TextDocument doc, ElementFactory factory)
	{ // jfr Builder
		doc.addElement(factory.createHeading("Uppdraget"));
		doc.addElement(factory.createParagraph("Det här är ett roligt miniprojekt ..."));
		doc.addElement(factory.createHeading("Lista ¨over viktiga saker"));
		// BulletList list = factory.createBulletList();
		// list.add("F¨or det f¨orsta...");
		// list.add("F¨or det andra...");
		// list.add("F¨or det tredje...");
		// doc.add(list);
		doc.addElement(factory.createParagraph("Multiplikationstabell"));
		// Table table = factory.createTable(10,10);
		// for(int row = 0; row<10; row++)
		// for(int col=0;col<10;col++)
		// table.set(row,col,row*col);
		// doc.addElement(table);
	}

}
