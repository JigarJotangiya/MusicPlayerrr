package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* renamed from: com.google.android.gms.internal.ads.k7 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5253k7 extends hr3 {

    /* renamed from: p */
    private Date f18812p;

    /* renamed from: q */
    private Date f18813q;

    /* renamed from: r */
    private long f18814r;

    /* renamed from: s */
    private long f18815s;

    /* renamed from: t */
    private double f18816t = 1.0d;

    /* renamed from: u */
    private float f18817u = 1.0f;

    /* renamed from: v */
    private rr3 f18818v = rr3.f22964j;

    /* renamed from: w */
    private long f18819w;

    public C5253k7() {
        super("mvhd");
    }

    /* renamed from: b */
    public final void mo17277b(ByteBuffer byteBuffer) {
        mo18208f(byteBuffer);
        if (mo18207e() == 1) {
            this.f18812p = mr3.m27399a(C5105g7.m24188f(byteBuffer));
            this.f18813q = mr3.m27399a(C5105g7.m24188f(byteBuffer));
            this.f18814r = C5105g7.m24187e(byteBuffer);
            this.f18815s = C5105g7.m24188f(byteBuffer);
        } else {
            this.f18812p = mr3.m27399a(C5105g7.m24187e(byteBuffer));
            this.f18813q = mr3.m27399a(C5105g7.m24187e(byteBuffer));
            this.f18814r = C5105g7.m24187e(byteBuffer);
            this.f18815s = C5105g7.m24187e(byteBuffer);
        }
        this.f18816t = C5105g7.m24184b(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.f18817u = ((float) ((short) ((bArr[1] & 255) | ((short) ((bArr[0] << 8) & 65280))))) / 256.0f;
        C5105g7.m24186d(byteBuffer);
        C5105g7.m24187e(byteBuffer);
        C5105g7.m24187e(byteBuffer);
        double b = C5105g7.m24184b(byteBuffer);
        double b2 = C5105g7.m24184b(byteBuffer);
        double a = C5105g7.m24183a(byteBuffer);
        this.f18818v = new rr3(b, b2, C5105g7.m24184b(byteBuffer), C5105g7.m24184b(byteBuffer), a, C5105g7.m24183a(byteBuffer), C5105g7.m24183a(byteBuffer), C5105g7.m24184b(byteBuffer), C5105g7.m24184b(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f18819w = C5105g7.m24187e(byteBuffer);
    }

    /* renamed from: g */
    public final long mo18857g() {
        return this.f18815s;
    }

    /* renamed from: h */
    public final long mo18858h() {
        return this.f18814r;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f18812p + ";modificationTime=" + this.f18813q + ";timescale=" + this.f18814r + ";duration=" + this.f18815s + ";rate=" + this.f18816t + ";volume=" + this.f18817u + ";matrix=" + this.f18818v + ";nextTrackId=" + this.f18819w + "]";
    }
}
