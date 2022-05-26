package p402l.p406b.p407a.p409f.p410c;

import java.math.BigInteger;
import java.util.Date;
import p402l.p406b.p407a.p409f.p412e.C9014c;

/* renamed from: l.b.a.f.c.k */
/* compiled from: FileHeader */
public class C8977k extends C8970d {

    /* renamed from: d */
    private final BigInteger f35389d;

    /* renamed from: e */
    private final Date f35390e;

    /* renamed from: f */
    private final BigInteger f35391f;

    public C8977k(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, long j, long j2, long j3, long j4) {
        super(C8978l.f35399k, bigInteger);
        this.f35391f = bigInteger2;
        this.f35389d = bigInteger5;
        this.f35390e = C9014c.m48171e(bigInteger3).getTime();
    }

    /* renamed from: e */
    public String mo31303e(String str) {
        StringBuilder sb = new StringBuilder(super.mo31303e(str));
        sb.append(str);
        sb.append("  |-> Filesize      = ");
        sb.append(mo31373i().toString());
        sb.append(" Bytes");
        String str2 = C9014c.f35470a;
        sb.append(str2);
        sb.append(str);
        sb.append("  |-> Media duration= ");
        sb.append(mo31371g().divide(new BigInteger("10000")).toString());
        sb.append(" ms");
        sb.append(str2);
        sb.append(str);
        sb.append("  |-> Created at    = ");
        sb.append(mo31372h());
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: g */
    public BigInteger mo31371g() {
        return this.f35389d;
    }

    /* renamed from: h */
    public Date mo31372h() {
        return new Date(this.f35390e.getTime());
    }

    /* renamed from: i */
    public BigInteger mo31373i() {
        return this.f35391f;
    }

    /* renamed from: j */
    public float mo31374j() {
        return (float) (mo31371g().doubleValue() / 1.0E7d);
    }
}
