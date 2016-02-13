package model;

import java.util.ArrayList;

import docParser.DocumentBuilder;
import docParser.StructuredTextDocumentParser;
import document.StructuredTextDocument;
import document.TextDocument;
import documentElements.BulletList;
import documentElements.CompositeElement;
import documentElements.Element;
import documentElements.TextElement;
import factories.StructuredTextElementFactory;
import factories.DocumentBuilderFactory;
import factories.ElementFactory;

public class Test
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
		converter2.build().print();
	}

	private void buildDocument(TextDocument doc, ElementFactory factory)
	{ // jfr Builder
		
		
		
		doc.addElement(factory.createHeading("Uppdraget"));
		doc.addElement(factory.createParagraph("Det här är ett roligt miniprojekt ..."));
		doc.addElement(factory.createHeading("Lista över viktiga saker"));		
		
//		CompositeElement ce = new CompositeElement();
//		ce.addElement(factory.createHeading("Lista över viktiga saker"));
		
		
		Element list = factory.createBulletList();
		list.addElement(factory.createTextElement("För det första..."));
		list.addElement(factory.createTextElement("För det andra..."));
		list.addElement(factory.createTextElement("För det tredje..."));
//		ce.addElement(list);
		
		
		doc.addElement(list);
		doc.addElement(factory.createParagraph("Multiplikationstabell"));
		
		// Table table = factory.createTable(10,10);
		// for(int row = 0; row<10; row++)
		// for(int col=0;col<10;col++)
		// table.set(row,col,row*col);
		// doc.addElement(table);
	}

}
