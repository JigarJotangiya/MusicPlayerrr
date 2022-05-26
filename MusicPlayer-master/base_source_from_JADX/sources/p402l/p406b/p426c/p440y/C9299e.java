package p402l.p406b.p426c.p440y;

import java.io.UnsupportedEncodingException;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p426c.C9135o;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.y.e */
/* compiled from: VorbisCommentTagField */
public class C9299e implements C9135o {

    /* renamed from: g */
    private boolean f36011g;

    /* renamed from: h */
    private String f36012h;

    /* renamed from: i */
    private String f36013i;

    public C9299e(byte[] bArr) throws UnsupportedEncodingException {
        String str = new String(bArr, "UTF-8");
        int indexOf = str.indexOf("=");
        if (indexOf == -1) {
            this.f36013i = "ERRONEOUS";
            this.f36012h = str;
        } else {
            this.f36013i = str.substring(0, indexOf).toUpperCase();
            if (str.length() > indexOf) {
                this.f36012h = str.substring(indexOf + 1);
            } else {
                this.f36012h = BuildConfig.FLAVOR;
            }
        }
        m49292a();
    }

    /* renamed from: a */
    private void m49292a() {
        this.f36011g = this.f36013i.equals(C9296b.TITLE.getFieldName()) || this.f36013i.equals(C9296b.ALBUM.getFieldName()) || this.f36013i.equals(C9296b.ARTIST.getFieldName()) || this.f36013i.equals(C9296b.GENRE.getFieldName()) || this.f36013i.equals(C9296b.TRACKNUMBER.getFieldName()) || this.f36013i.equals(C9296b.DATE.getFieldName()) || this.f36013i.equals(C9296b.DESCRIPTION.getFieldName()) || this.f36013i.equals(C9296b.COMMENT.getFieldName());
    }

    /* renamed from: D */
    public String mo31497D() {
        return this.f36013i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo32146b(byte[] bArr, byte[] bArr2, int i) {
        System.arraycopy(bArr, 0, bArr2, i, bArr.length);
    }

    /* renamed from: c */
    public byte[] mo31499c() throws UnsupportedEncodingException {
        byte[] bArr = new byte[4];
        byte[] c = C9057i.m48300c(this.f36013i, "ISO-8859-1");
        byte[] d = mo32147d(this.f36012h, "UTF-8");
        byte[] bArr2 = new byte[(c.length + 4 + 1 + d.length)];
        int length = c.length + 1 + d.length;
        bArr[3] = (byte) ((-16777216 & length) >> 24);
        bArr[2] = (byte) ((16711680 & length) >> 16);
        bArr[1] = (byte) ((65280 & length) >> 8);
        bArr[0] = (byte) (length & 255);
        mo32146b(bArr, bArr2, 0);
        mo32146b(c, bArr2, 4);
        int length2 = 4 + c.length;
        bArr2[length2] = 61;
        mo32146b(d, bArr2, length2 + 1);
        return bArr2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public byte[] mo32147d(String str, String str2) throws UnsupportedEncodingException {
        return str.getBytes(str2);
    }

    /* renamed from: f */
    public boolean mo31500f() {
        return this.f36011g;
    }

    public String getContent() {
        return this.f36012h;
    }

    public boolean isEmpty() {
        return this.f36012h.equals(BuildConfig.FLAVOR);
    }

    public String toString() {
        return getContent();
    }

    public C9299e(String str, String str2) {
        this.f36013i = str.toUpperCase();
        this.f36012h = str2;
        m49292a();
    }
}
