package com.pdf.parser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileType {

    private static final String FILE_TYPE_UNDETERMINED = "FILE_TYPE_UNDETERMINED";

    public String getFileType(File file) {
        String fileType = FILE_TYPE_UNDETERMINED;
        try {
            Path path = file.toPath();
            fileType = Files.probeContentType(path);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return fileType;
    }
}
