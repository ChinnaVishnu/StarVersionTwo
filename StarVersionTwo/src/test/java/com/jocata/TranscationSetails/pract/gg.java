package com.jocata.TranscationSetails.pract;

import java.io.File;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.apache.pdfbox.util.PDFTextStripperByArea;

public class gg {

	public static void main(String[] args) {
		try{
	    PDDocument document = null;
	    document = PDDocument.load(new File("D:\\AUTOMATION REQUIRED DOCS\\AadharUpload\\l1_user_User_Case_Details_Report_130717_115839_1499970519894_182704.pdf"));
	    document.getClass();
	    if (!document.isEncrypted()) {
	        PDFTextStripperByArea stripper = new PDFTextStripperByArea();
	        stripper.setSortByPosition(true);
	        PDFTextStripper Tstripper = new PDFTextStripper();
	        String st = Tstripper.getText(document);
	        System.out.println("Text:" + st);
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}

		
	}
	
}
