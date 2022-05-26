package p394k;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

/* renamed from: k.g */
/* compiled from: BufferedSource.kt */
public interface C8637g extends C8620a0, ReadableByteChannel {
    /* renamed from: A */
    boolean mo30664A() throws IOException;

    /* renamed from: E0 */
    void mo30668E0(long j) throws IOException;

    /* renamed from: I */
    long mo30672I(C8638h hVar) throws IOException;

    /* renamed from: K0 */
    long mo30676K0() throws IOException;

    /* renamed from: M0 */
    int mo30678M0(C8648q qVar) throws IOException;

    /* renamed from: e */
    C8633e mo30702e();

    /* renamed from: g0 */
    boolean mo30708g0(long j) throws IOException;

    /* renamed from: h */
    C8633e mo30710h();

    InputStream inputStream();

    /* renamed from: j */
    void mo30715j(long j) throws IOException;

    /* renamed from: l0 */
    String mo30716l0() throws IOException;

    /* renamed from: o */
    C8638h mo30719o(long j) throws IOException;

    /* renamed from: p0 */
    byte[] mo30721p0(long j) throws IOException;

    C8637g peek();

    byte readByte() throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    /* renamed from: z */
    long mo30735z(C8638h hVar) throws IOException;
}
