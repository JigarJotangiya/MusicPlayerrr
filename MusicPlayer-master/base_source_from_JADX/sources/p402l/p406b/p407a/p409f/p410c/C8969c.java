package p402l.p406b.p407a.p409f.p410c;

import java.math.BigInteger;
import p402l.p406b.p407a.p409f.p412e.C9014c;

/* renamed from: l.b.a.f.c.c */
/* compiled from: AudioStreamChunk */
public final class C8969c extends C8986s {

    /* renamed from: n */
    public static final String[][] f35369n = {new String[]{"161", " (Windows Media Audio (ver 7,8,9))"}, new String[]{"162", " (Windows Media Audio 9 series (Professional))"}, new String[]{"163", "(Windows Media Audio 9 series (Lossless))"}, new String[]{"7A21", " (GSM-AMR (CBR))"}, new String[]{"7A22", " (GSM-AMR (VBR))"}};

    /* renamed from: i */
    private long f35370i;

    /* renamed from: j */
    private int f35371j;

    /* renamed from: k */
    private long f35372k;

    /* renamed from: l */
    private long f35373l;

    /* renamed from: m */
    private long f35374m;

    public C8969c(BigInteger bigInteger) {
        super(C8978l.f35393e, bigInteger);
    }

    /* renamed from: A */
    public void mo31311A(long j) {
        this.f35372k = j;
    }

    /* renamed from: B */
    public void mo31312B(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = (byte[]) bArr.clone();
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: C */
    public void mo31313C(long j) {
        this.f35373l = j;
    }

    /* renamed from: D */
    public void mo31314D(C8978l lVar) {
    }

    /* renamed from: E */
    public void mo31315E(long j) {
        this.f35374m = j;
    }

    /* renamed from: e */
    public String mo31303e(String str) {
        StringBuilder sb = new StringBuilder(super.mo31303e(str));
        sb.append(str);
        sb.append("  |-> Audio info:");
        String str2 = C9014c.f35470a;
        sb.append(str2);
        sb.append(str);
        sb.append("  |  : Bitrate : ");
        sb.append(mo31321v());
        sb.append(str2);
        sb.append(str);
        sb.append("  |  : Channels : ");
        sb.append(mo31318s());
        sb.append(" at ");
        sb.append(mo31322w());
        sb.append(" Hz");
        sb.append(str2);
        sb.append(str);
        sb.append("  |  : Bits per Sample: ");
        sb.append(mo31317r());
        sb.append(str2);
        sb.append(str);
        sb.append("  |  : Formatcode: ");
        sb.append(mo31319t());
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: q */
    public long mo31316q() {
        return this.f35370i;
    }

    /* renamed from: r */
    public int mo31317r() {
        return this.f35371j;
    }

    /* renamed from: s */
    public long mo31318s() {
        return this.f35372k;
    }

    /* renamed from: t */
    public String mo31319t() {
        String str;
        StringBuilder sb = new StringBuilder(Long.toHexString(mo31320u()));
        String[][] strArr = f35369n;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str = " (Unknown)";
                break;
            }
            String[] strArr2 = strArr[i];
            if (strArr2[0].equalsIgnoreCase(sb.toString())) {
                str = strArr2[1];
                break;
            }
            i++;
        }
        if (sb.length() % 2 == 0) {
            sb.insert(0, "0x");
        } else {
            sb.insert(0, "0x0");
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: u */
    public long mo31320u() {
        return this.f35373l;
    }

    /* renamed from: v */
    public int mo31321v() {
        return (((int) mo31316q()) * 8) / 1000;
    }

    /* renamed from: w */
    public long mo31322w() {
        return this.f35374m;
    }

    /* renamed from: x */
    public void mo31323x(long j) {
        this.f35370i = j;
    }

    /* renamed from: y */
    public void mo31324y(int i) {
        this.f35371j = i;
    }

    /* renamed from: z */
    public void mo31325z(long j) {
    }
}
