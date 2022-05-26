package p402l.p406b.p426c.p434u;

import java.io.IOException;
import java.io.RandomAccessFile;
import p402l.p406b.p426c.p431t.C9238m;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.u.j */
/* compiled from: Lyrics3v1 */
public class C9265j extends C9256a {

    /* renamed from: h */
    private String f35962h = BuildConfig.FLAVOR;

    public boolean equals(Object obj) {
        if ((obj instanceof C9265j) && this.f35962h.equals(((C9265j) obj).f35962h) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public String mo31857g() {
        return "Lyrics3v1.00";
    }

    /* renamed from: h */
    public int mo31919h() {
        return 11 + this.f35962h.length() + 9;
    }

    /* renamed from: j */
    public void mo31917j(RandomAccessFile randomAccessFile) throws IOException {
        mo32088k(randomAccessFile);
        randomAccessFile.seek(randomAccessFile.length());
        byte[] bArr = new byte[(this.f35962h.length() + 11 + 9)];
        for (int i = 0; i < 11; i++) {
            bArr[i] = (byte) "LYRICSBEGIN".charAt(i);
        }
        String o = C9238m.m49076o(this.f35962h, 5100);
        for (int i2 = 0; i2 < o.length(); i2++) {
            bArr[i2 + 11] = (byte) o.charAt(i2);
        }
        int length = 11 + o.length();
        for (int i3 = 0; i3 < 9; i3++) {
            bArr[i3 + length] = (byte) "LYRICSEND".charAt(i3);
        }
        randomAccessFile.write(bArr, 0, length + 9);
    }

    /* renamed from: l */
    public String mo32097l() {
        return this.f35962h;
    }

    public String toString() {
        return (mo31857g() + " " + mo31919h() + "\n") + this.f35962h;
    }
}
