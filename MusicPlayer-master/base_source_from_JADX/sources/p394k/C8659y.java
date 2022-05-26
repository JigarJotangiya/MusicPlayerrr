package p394k;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* renamed from: k.y */
/* compiled from: Sink.kt */
public interface C8659y extends Closeable, Flushable {
    /* renamed from: b0 */
    void mo29321b0(C8633e eVar, long j) throws IOException;

    void close() throws IOException;

    void flush() throws IOException;

    C8622b0 timeout();
}
