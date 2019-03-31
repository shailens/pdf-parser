package com.pdf.parser;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.TextPosition;

import java.io.*;
import java.util.List;

public class TextCoordinateLocator extends PDFTextStripper {

    public TextCoordinateLocator() throws Exception{

    }

    /**
     * @throws IOException If there is an error parsing the document.
     */
    public static void main( String[] args ) throws Exception {
        PDDocument document = null;
        String fileName = "C:\\workspace\\documents\\Form 15 V6.pdf";
        try {
            document = PDDocument.load( new File(fileName) );
            PDFTextStripper stripper = new TextCoordinateLocator();
            stripper.setSortByPosition( true );
            stripper.setStartPage( 0 );
            stripper.setEndPage( 1);
            Writer dummy = new OutputStreamWriter(new ByteArrayOutputStream());
            stripper.writeText(document, dummy);
        }
        finally {
            if( document != null ) {
                document.close();
            }
        }
    }


    protected void writeString(String string, List<TextPosition> textPositions) throws IOException {
        for (TextPosition text : textPositions) {
            System.out.println(text.getUnicode()+ " [(X=" + text.getXDirAdj() + ",Y=" +
                    text.getYDirAdj() + ") height=" + text.getHeightDir() + " width=" +
                    text.getWidthDirAdj() + "]");
        }
    }
}
