package com.code;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Code {

	public static void main(String[] args) throws IOException {
		
		
		File file = new File("himanshi dec 21.pdf");
	
		
		PDFParser parser =new PDFParser(new org.apache.pdfbox.io.RandomAccessFile(file, "r"));
		parser.parse();
		
		COSDocument cosdoc = parser.getDocument();
		PDDocument pddoc = new PDDocument(cosdoc);		
		
		PDFTextStripper str = new PDFTextStripper();
		String data = str.getText(pddoc);
		System.out.println(data);

	}

}
