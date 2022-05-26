package p369i.p386y;

import java.io.InputStream;
import java.io.OutputStream;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.y.a */
/* compiled from: IOStreams.kt */
public final class C8546a {
    /* renamed from: a */
    public static final long m46748a(InputStream inputStream, OutputStream outputStream, int i) {
        C8594l.m46771e(inputStream, "$this$copyTo");
        C8594l.m46771e(outputStream, "out");
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += (long) read;
            read = inputStream.read(bArr);
        }
        return j;
    }
}
