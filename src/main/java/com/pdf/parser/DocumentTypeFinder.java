package com.pdf.parser;

import java.io.File;

public class DocumentTypeFinder {

    public String findDocumentType(File file){

        OCRReader ocr = new OCRReader();
        String textFromFile = ocr.doOCR(file);
        return textFromFile;
    }
}
