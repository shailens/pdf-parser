package com.pdf.parser;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.awt.*;
import java.io.File;

public class PDFParser {

    public String readPDF(File file) throws Exception{
        PDDocument document = PDDocument.load(file);
        PDFTextStripperByArea stripper = new PDFTextStripperByArea();
        stripper.setSortByPosition(true);
        Rectangle rect = new Rectangle(354, 216, 18, 7);
        stripper.addRegion("address1", rect);
        stripper.extractRegions(document.getPage(0));
        String retVal = stripper.getTextForRegion("address1");
        return retVal;

    }
}
