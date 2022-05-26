package p402l.p406b.p407a.p417j;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.logging.Logger;
import p402l.p406b.p407a.C8942a;
import p402l.p406b.p407a.p413g.C9018d;

/* renamed from: l.b.a.j.g */
/* compiled from: VbriFrame */
public class C9064g {

    /* renamed from: e */
    private static final byte[] f35589e = {86, 66, 82, 73};

    /* renamed from: a */
    private ByteBuffer f35590a;

    /* renamed from: b */
    private boolean f35591b = false;

    /* renamed from: c */
    private int f35592c = -1;

    /* renamed from: d */
    private int f35593d = -1;

    private C9064g(ByteBuffer byteBuffer) {
        this.f35590a = byteBuffer;
        byteBuffer.rewind();
        byteBuffer.position(10);
        m48390f();
        m48391g();
    }

    /* renamed from: d */
    public static ByteBuffer m48388d(ByteBuffer byteBuffer, C9063f fVar) {
        int position = byteBuffer.position();
        Logger logger = C8942a.f35327d;
        logger.finest("Checking VBRI Frame at" + position);
        byteBuffer.position(position + 36);
        ByteBuffer slice = byteBuffer.slice();
        byteBuffer.position(position);
        byte[] bArr = new byte[4];
        slice.get(bArr);
        if (!Arrays.equals(bArr, f35589e)) {
            return null;
        }
        C8942a.f35327d.finest("Found VBRI Frame");
        return slice;
    }

    /* renamed from: e */
    public static C9064g m48389e(ByteBuffer byteBuffer) throws C9018d {
        return new C9064g(byteBuffer);
    }

    /* renamed from: f */
    private void m48390f() {
        byte[] bArr = new byte[4];
        this.f35590a.get(bArr);
        this.f35593d = (bArr[3] & 255) | ((bArr[0] << 24) & -16777216) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280);
    }

    /* renamed from: g */
    private void m48391g() {
        byte[] bArr = new byte[4];
        this.f35590a.get(bArr);
        this.f35592c = (bArr[3] & 255) | ((bArr[0] << 24) & -16777216) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280);
    }

    /* renamed from: a */
    public final int mo31597a() {
        return this.f35593d;
    }

    /* renamed from: b */
    public String mo31598b() {
        return "Fraunhofer";
    }

    /* renamed from: c */
    public final int mo31599c() {
        return this.f35592c;
    }

    public String toString() {
        return "VBRIheader vbr:" + this.f35591b + " frameCount:" + this.f35592c + " audioFileSize:" + this.f35593d + " encoder:" + mo31598b();
    }
}
