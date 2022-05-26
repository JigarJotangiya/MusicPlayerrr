package p402l.p406b.p407a.p409f.p410c;

import java.math.BigInteger;
import p402l.p406b.p407a.p409f.p412e.C9014c;

/* renamed from: l.b.a.f.c.t */
/* compiled from: VideoStreamChunk */
public class C8987t extends C8986s {

    /* renamed from: i */
    private byte[] f35438i = new byte[0];

    /* renamed from: j */
    private long f35439j;

    /* renamed from: k */
    private long f35440k;

    public C8987t(BigInteger bigInteger) {
        super(C8978l.f35410v, bigInteger);
    }

    /* renamed from: e */
    public String mo31303e(String str) {
        StringBuilder sb = new StringBuilder(super.mo31303e(str));
        StringBuilder sb2 = new StringBuilder();
        String str2 = C9014c.f35470a;
        sb2.append(str2);
        sb2.append(str);
        sb2.append("|->VideoStream");
        sb.insert(0, sb2.toString());
        sb.append(str);
        sb.append("Video info:");
        sb.append(str2);
        sb.append(str);
        sb.append("      |->Width  : ");
        sb.append(mo31446t());
        sb.append(str2);
        sb.append(str);
        sb.append("      |->Heigth : ");
        sb.append(mo31445s());
        sb.append(str2);
        sb.append(str);
        sb.append("      |->Codec  : ");
        sb.append(mo31444r());
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: q */
    public byte[] mo31443q() {
        return (byte[]) this.f35438i.clone();
    }

    /* renamed from: r */
    public String mo31444r() {
        if (this.f35438i == null) {
            return "Unknown";
        }
        return new String(mo31443q());
    }

    /* renamed from: s */
    public long mo31445s() {
        return this.f35439j;
    }

    /* renamed from: t */
    public long mo31446t() {
        return this.f35440k;
    }

    /* renamed from: u */
    public void mo31447u(byte[] bArr) {
        this.f35438i = (byte[]) bArr.clone();
    }

    /* renamed from: v */
    public void mo31448v(long j) {
        this.f35439j = j;
    }

    /* renamed from: w */
    public void mo31449w(long j) {
        this.f35440k = j;
    }
}
