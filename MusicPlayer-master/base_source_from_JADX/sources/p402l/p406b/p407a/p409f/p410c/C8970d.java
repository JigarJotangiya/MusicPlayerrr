package p402l.p406b.p407a.p409f.p410c;

import java.math.BigInteger;
import p402l.p406b.p407a.p409f.p412e.C9014c;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.a.f.c.d */
/* compiled from: Chunk */
public class C8970d {

    /* renamed from: a */
    protected final BigInteger f35375a;

    /* renamed from: b */
    protected final C8978l f35376b;

    /* renamed from: c */
    protected long f35377c;

    public C8970d(C8978l lVar, BigInteger bigInteger) {
        if (lVar == null) {
            throw new IllegalArgumentException("GUID must not be null.");
        } else if (bigInteger == null || bigInteger.compareTo(BigInteger.ZERO) < 0) {
            throw new IllegalArgumentException("chunkLen must not be null nor negative.");
        } else {
            this.f35376b = lVar;
            this.f35375a = bigInteger;
        }
    }

    /* renamed from: b */
    public C8978l mo31326b() {
        return this.f35376b;
    }

    /* renamed from: c */
    public long mo31327c() {
        return this.f35377c + this.f35375a.longValue();
    }

    /* renamed from: d */
    public long mo31328d() {
        return this.f35377c;
    }

    /* renamed from: e */
    public String mo31303e(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-> GUID: ");
        sb.append(C8978l.m48015f(this.f35376b));
        String str2 = C9014c.f35470a;
        sb.append(str2);
        sb.append(str);
        sb.append("  | : Starts at position: ");
        sb.append(mo31328d());
        sb.append(str2);
        sb.append(str);
        sb.append("  | : Last byte at: ");
        sb.append(mo31327c() - 1);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: f */
    public void mo31329f(long j) {
        this.f35377c = j;
    }

    public String toString() {
        return mo31303e(BuildConfig.FLAVOR);
    }

    public C8970d(C8978l lVar, long j, BigInteger bigInteger) {
        if (lVar == null) {
            throw new IllegalArgumentException("GUID must not be null");
        } else if (j < 0) {
            throw new IllegalArgumentException("Position of header can't be negative.");
        } else if (bigInteger == null || bigInteger.compareTo(BigInteger.ZERO) < 0) {
            throw new IllegalArgumentException("chunkLen must not be null nor negative.");
        } else {
            this.f35376b = lVar;
            this.f35377c = j;
            this.f35375a = bigInteger;
        }
    }
}
