package p402l.p406b.p407a.p409f.p410c;

import java.math.BigInteger;
import p402l.p406b.p407a.p409f.p412e.C9014c;

/* renamed from: l.b.a.f.c.s */
/* compiled from: StreamChunk */
public abstract class C8986s extends C8970d {

    /* renamed from: d */
    private boolean f35433d;

    /* renamed from: e */
    private int f35434e;

    /* renamed from: f */
    private long f35435f;

    /* renamed from: g */
    private long f35436g;

    /* renamed from: h */
    private long f35437h;

    public C8986s(C8978l lVar, BigInteger bigInteger) {
        super(C8978l.f35406r, bigInteger);
    }

    /* renamed from: e */
    public String mo31303e(String str) {
        StringBuilder sb = new StringBuilder(super.mo31303e(str));
        sb.append(str);
        sb.append("  |-> Stream number: ");
        sb.append(mo31433g());
        String str2 = C9014c.f35470a;
        sb.append(str2);
        sb.append(str);
        sb.append("  |-> Type specific data size  : ");
        sb.append(mo31436j());
        sb.append(str2);
        sb.append(str);
        sb.append("  |-> Stream specific data size: ");
        sb.append(mo31434h());
        sb.append(str2);
        sb.append(str);
        sb.append("  |-> Time Offset              : ");
        sb.append(mo31435i());
        sb.append(str2);
        sb.append(str);
        sb.append("  |-> Content Encryption       : ");
        sb.append(mo31437k());
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: g */
    public int mo31433g() {
        return this.f35434e;
    }

    /* renamed from: h */
    public long mo31434h() {
        return this.f35435f;
    }

    /* renamed from: i */
    public long mo31435i() {
        return this.f35436g;
    }

    /* renamed from: j */
    public long mo31436j() {
        return this.f35437h;
    }

    /* renamed from: k */
    public boolean mo31437k() {
        return this.f35433d;
    }

    /* renamed from: l */
    public void mo31438l(boolean z) {
        this.f35433d = z;
    }

    /* renamed from: m */
    public void mo31439m(int i) {
        this.f35434e = i;
    }

    /* renamed from: n */
    public void mo31440n(long j) {
        this.f35435f = j;
    }

    /* renamed from: o */
    public void mo31441o(long j) {
        this.f35436g = j;
    }

    /* renamed from: p */
    public void mo31442p(long j) {
        this.f35437h = j;
    }
}
