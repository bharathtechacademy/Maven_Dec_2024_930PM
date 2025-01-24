package com.framework.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PdfUtil {
	
	public static String getText(String fileName) {
		String text = "";
		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Files\\"+fileName);
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdf = new PDFTextStripper();
			text = pdf.getText(document);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		return text;
	}

}
