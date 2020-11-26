package redact;

public class CreateTextDocument extends ICreateDocument {


    @Override
    IDocument CreateNew() {
        return new TextDocument();
    }

    @Override
    IDocument CreateOpen() {
        return new TextDocument();
    }
}
