package retrofit.mime;

import java.io.IOException;
import java.io.InputStream;

public interface TypedInput {
    /* renamed from: in */
    InputStream mo33641in() throws IOException;

    long length();

    String mimeType();
}
