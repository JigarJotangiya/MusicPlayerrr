package p402l.p406b.p407a.p422m;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p407a.p416i.C9057i;

/* renamed from: l.b.a.m.a */
/* compiled from: RealChunk */
public class C9108a {

    /* renamed from: a */
    private final String f35713a;

    /* renamed from: b */
    private final int f35714b;

    /* renamed from: c */
    private final byte[] f35715c;

    public C9108a(String str, int i, byte[] bArr) {
        this.f35713a = str;
        this.f35714b = i;
        this.f35715c = bArr;
    }

    /* renamed from: d */
    public static C9108a m48532d(RandomAccessFile randomAccessFile) throws C9015a, IOException {
        String u = C9057i.m48318u(randomAccessFile, 4);
        int A = C9057i.m48296A(randomAccessFile);
        if (A < 8) {
            throw new C9015a("Corrupt file: RealAudio chunk length at position " + (randomAccessFile.getFilePointer() - 4) + " cannot be less than 8");
        } else if (((long) A) <= (randomAccessFile.length() - randomAccessFile.getFilePointer()) + 8) {
            byte[] bArr = new byte[(A - 8)];
            randomAccessFile.readFully(bArr);
            return new C9108a(u, A, bArr);
        } else {
            throw new C9015a("Corrupt file: RealAudio chunk length of " + A + " at position " + (randomAccessFile.getFilePointer() - 4) + " extends beyond the end of the file");
        }
    }

    /* renamed from: a */
    public byte[] mo31710a() {
        return this.f35715c;
    }

    /* renamed from: b */
    public DataInputStream mo31711b() {
        return new DataInputStream(new ByteArrayInputStream(mo31710a()));
    }

    /* renamed from: c */
    public boolean mo31712c() {
        return "CONT".equals(this.f35713a);
    }

    public String toString() {
        return this.f35713a + "\t" + this.f35714b;
    }
}
