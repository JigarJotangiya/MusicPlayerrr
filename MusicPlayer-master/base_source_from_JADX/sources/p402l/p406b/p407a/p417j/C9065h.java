package p402l.p406b.p407a.p417j;

import java.nio.ByteBuffer;
import java.util.Arrays;
import p402l.p406b.p407a.C8942a;
import p402l.p406b.p407a.p413g.C9018d;

/* renamed from: l.b.a.j.h */
/* compiled from: XingFrame */
public class C9065h {

    /* renamed from: h */
    private static final byte[] f35594h = {88, 105, 110, 103};

    /* renamed from: i */
    private static final byte[] f35595i = {73, 110, 102, 111};

    /* renamed from: a */
    private ByteBuffer f35596a;

    /* renamed from: b */
    private boolean f35597b = false;

    /* renamed from: c */
    private boolean f35598c = false;

    /* renamed from: d */
    private int f35599d = -1;

    /* renamed from: e */
    private boolean f35600e = false;

    /* renamed from: f */
    private int f35601f = -1;

    /* renamed from: g */
    private C9058a f35602g;

    private C9065h(ByteBuffer byteBuffer) {
        this.f35596a = byteBuffer;
        byteBuffer.rewind();
        m48399k();
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        if ((bArr[3] & 1) != 0) {
            m48398j();
        }
        if ((bArr[3] & 2) != 0) {
            m48397i();
        }
        if (byteBuffer.limit() >= 156) {
            byteBuffer.position(120);
            this.f35602g = C9058a.m48324b(byteBuffer);
        }
    }

    /* renamed from: g */
    public static ByteBuffer m48395g(ByteBuffer byteBuffer, C9063f fVar) {
        int position = byteBuffer.position();
        if (fVar.mo31593k() == 3) {
            if (fVar.mo31584b() == 3) {
                byteBuffer.position(position + 21);
            } else {
                byteBuffer.position(position + 36);
            }
        } else if (fVar.mo31584b() == 3) {
            byteBuffer.position(position + 13);
        } else {
            byteBuffer.position(position + 21);
        }
        ByteBuffer slice = byteBuffer.slice();
        byteBuffer.position(position);
        byte[] bArr = new byte[4];
        slice.get(bArr);
        if (!Arrays.equals(bArr, f35594h) && !Arrays.equals(bArr, f35595i)) {
            return null;
        }
        C8942a.f35327d.finest("Found Xing Frame");
        return slice;
    }

    /* renamed from: h */
    public static C9065h m48396h(ByteBuffer byteBuffer) throws C9018d {
        return new C9065h(byteBuffer);
    }

    /* renamed from: i */
    private void m48397i() {
        byte[] bArr = new byte[4];
        this.f35596a.get(bArr);
        this.f35600e = true;
        byte b = (bArr[1] << 16) & 16711680;
        this.f35601f = (bArr[3] & 255) | b | ((bArr[0] << 24) & -16777216) | ((bArr[2] << 8) & 65280);
    }

    /* renamed from: j */
    private void m48398j() {
        byte[] bArr = new byte[4];
        this.f35596a.get(bArr);
        this.f35598c = true;
        byte b = (bArr[1] << 16) & 16711680;
        this.f35599d = (bArr[3] & 255) | b | ((bArr[0] << 24) & -16777216) | ((bArr[2] << 8) & 65280);
    }

    /* renamed from: k */
    private void m48399k() {
        byte[] bArr = new byte[4];
        this.f35596a.get(bArr);
        if (Arrays.equals(bArr, f35594h)) {
            C8942a.f35327d.finest("Is Vbr");
            this.f35597b = true;
        }
    }

    /* renamed from: a */
    public final int mo31601a() {
        return this.f35601f;
    }

    /* renamed from: b */
    public final int mo31602b() {
        return this.f35599d;
    }

    /* renamed from: c */
    public C9058a mo31603c() {
        return this.f35602g;
    }

    /* renamed from: d */
    public final boolean mo31604d() {
        return this.f35600e;
    }

    /* renamed from: e */
    public final boolean mo31605e() {
        return this.f35598c;
    }

    /* renamed from: f */
    public final boolean mo31606f() {
        return this.f35597b;
    }

    public String toString() {
        return "xingheader vbr:" + this.f35597b + " frameCountEnabled:" + this.f35598c + " frameCount:" + this.f35599d + " audioSizeEnabled:" + this.f35600e + " audioFileSize:" + this.f35601f;
    }
}
