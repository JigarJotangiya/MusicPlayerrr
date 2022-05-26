package p402l.p406b.p426c.p429r;

import java.util.Objects;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p426c.C9124d;
import p402l.p406b.p426c.p431t.C9190g;

/* renamed from: l.b.c.r.j */
/* compiled from: Lyrics3TimeStamp */
public class C9155j extends C9146a {

    /* renamed from: f */
    private long f35785f = 0;

    /* renamed from: g */
    private long f35786g = 0;

    public C9155j(String str, C9190g gVar) {
        super(str, gVar);
    }

    /* renamed from: c */
    public int mo31776c() {
        return 7;
    }

    /* renamed from: e */
    public void mo31778e(byte[] bArr, int i) throws C9124d {
        mo31807j(bArr.toString(), i);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9155j)) {
            return false;
        }
        C9155j jVar = (C9155j) obj;
        if (this.f35785f == jVar.f35785f && this.f35786g == jVar.f35786g && super.equals(obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public byte[] mo31782h() {
        return C9057i.m48300c(mo31809l(), "ISO8859-1");
    }

    /* renamed from: i */
    public void mo31806i(String str) {
    }

    /* renamed from: j */
    public void mo31807j(String str, int i) {
        Objects.requireNonNull(str, "Image is null");
        if (i < 0 || i >= str.length()) {
            throw new IndexOutOfBoundsException("Offset to timeStamp is out of bounds: offset = " + i + ", timeStamp.length()" + str.length());
        }
        String substring = str.substring(i);
        if (substring.length() == 7) {
            this.f35785f = (long) Integer.parseInt(substring.substring(1, 3));
            this.f35786g = (long) Integer.parseInt(substring.substring(4, 6));
            return;
        }
        this.f35785f = 0;
        this.f35786g = 0;
    }

    /* renamed from: k */
    public void mo31808k(long j, byte b) {
        long j2 = j / 1000;
        this.f35785f = j2 / 60;
        this.f35786g = j2 % 60;
    }

    /* renamed from: l */
    public String mo31809l() {
        String str;
        String str2;
        long j = this.f35785f;
        String str3 = "[";
        if (j < 0) {
            str = str3 + "00";
        } else {
            if (j < 10) {
                str3 = str3 + '0';
            }
            str = str3 + Long.toString(this.f35785f);
        }
        String str4 = str + ':';
        long j2 = this.f35786g;
        if (j2 < 0) {
            str2 = str4 + "00";
        } else {
            if (j2 < 10) {
                str4 = str4 + '0';
            }
            str2 = str4 + Long.toString(this.f35786g);
        }
        return str2 + ']';
    }

    public String toString() {
        return mo31809l();
    }

    public C9155j(String str) {
        super(str, (C9190g) null);
    }
}
