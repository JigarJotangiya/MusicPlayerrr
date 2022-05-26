package p402l.p406b.p426c.p431t;

import java.io.UnsupportedEncodingException;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p426c.C9135o;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.t.s */
/* compiled from: ID3v1TagField */
public class C9246s implements C9135o {

    /* renamed from: g */
    private boolean f35943g;

    /* renamed from: h */
    private String f35944h;

    /* renamed from: i */
    private String f35945i;

    public C9246s(String str, String str2) {
        this.f35945i = str.toUpperCase();
        this.f35944h = str2;
        m49124a();
    }

    /* renamed from: a */
    private void m49124a() {
        this.f35943g = this.f35945i.equals(C9243q.TITLE.name()) || this.f35945i.equals(C9243q.ALBUM.name()) || this.f35945i.equals(C9243q.ARTIST.name()) || this.f35945i.equals(C9243q.GENRE.name()) || this.f35945i.equals(C9243q.YEAR.name()) || this.f35945i.equals(C9243q.COMMENT.name()) || this.f35945i.equals(C9243q.TRACK.name());
    }

    /* renamed from: D */
    public String mo31497D() {
        return this.f35945i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo32060b(byte[] bArr, byte[] bArr2, int i) {
        System.arraycopy(bArr, 0, bArr2, i, bArr.length);
    }

    /* renamed from: c */
    public byte[] mo31499c() throws UnsupportedEncodingException {
        byte[] bArr = new byte[4];
        byte[] bytes = this.f35945i.getBytes("ISO-8859-1");
        byte[] c = C9057i.m48300c(this.f35944h, "ISO-8859-1");
        byte[] bArr2 = new byte[(bytes.length + 4 + 1 + c.length)];
        int length = bytes.length + 1 + c.length;
        bArr[3] = (byte) ((-16777216 & length) >> 24);
        bArr[2] = (byte) ((16711680 & length) >> 16);
        bArr[1] = (byte) ((65280 & length) >> 8);
        bArr[0] = (byte) (length & 255);
        mo32060b(bArr, bArr2, 0);
        mo32060b(bytes, bArr2, 4);
        int length2 = 4 + bytes.length;
        bArr2[length2] = 61;
        mo32060b(c, bArr2, length2 + 1);
        return bArr2;
    }

    /* renamed from: f */
    public boolean mo31500f() {
        return this.f35943g;
    }

    public String getContent() {
        return this.f35944h;
    }

    public boolean isEmpty() {
        return this.f35944h.equals(BuildConfig.FLAVOR);
    }

    public String toString() {
        return getContent();
    }
}
