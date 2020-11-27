package com.company.task21_22.redact;

import java.io.FileWriter;
import java.io.IOException;

public class TextDocument implements IDocument {
    FileWriter fw;
    @Override
    public void save() throws IOException {
        fw.close();
    }

    @Override
    public void create() throws IOException {
        fw = new FileWriter( "sample1.txt" );
    }

    @Override
    public void open() throws IOException {
        fw = new FileWriter( "sample1.txt" );
    }

    @Override
    public void close() throws IOException {
        fw.close();
    }
}
