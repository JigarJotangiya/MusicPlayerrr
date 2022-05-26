package p402l.p406b.p407a.p418k.p419j;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p407a.p418k.C9067b;

/* renamed from: l.b.a.k.j.f */
/* compiled from: Mp4FreeBox */
public class C9082f extends C9075a {
    public C9082f(int i) {
        try {
            this.f35628a = new C9077c();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(C9057i.m48311n(i + 8));
            byteArrayOutputStream.write(C9057i.m48300c(C9067b.FREE.getFieldName(), "ISO-8859-1"));
            this.f35628a.mo31647k(ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            for (int i2 = 0; i2 < i; i2++) {
                byteArrayOutputStream2.write(0);
            }
            this.f35629b = ByteBuffer.wrap(byteArrayOutputStream2.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
