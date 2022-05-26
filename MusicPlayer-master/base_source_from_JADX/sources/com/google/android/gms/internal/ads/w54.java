package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class w54 implements qb1 {

    /* renamed from: a */
    private final Context f25233a;

    /* renamed from: b */
    private final List<fr1> f25234b = new ArrayList();

    /* renamed from: c */
    private final qb1 f25235c;

    /* renamed from: d */
    private qb1 f25236d;

    /* renamed from: e */
    private qb1 f25237e;

    /* renamed from: f */
    private qb1 f25238f;

    /* renamed from: g */
    private qb1 f25239g;

    /* renamed from: h */
    private qb1 f25240h;

    /* renamed from: i */
    private qb1 f25241i;

    /* renamed from: j */
    private qb1 f25242j;

    /* renamed from: k */
    private qb1 f25243k;

    public w54(Context context, qb1 qb1) {
        this.f25233a = context.getApplicationContext();
        this.f25235c = qb1;
    }

    /* renamed from: n */
    private final qb1 m32913n() {
        if (this.f25237e == null) {
            f54 f54 = new f54(this.f25233a);
            this.f25237e = f54;
            m32914o(f54);
        }
        return this.f25237e;
    }

    /* renamed from: o */
    private final void m32914o(qb1 qb1) {
        for (int i = 0; i < this.f25234b.size(); i++) {
            qb1.mo19648l(this.f25234b.get(i));
        }
    }

    /* renamed from: p */
    private static final void m32915p(qb1 qb1, fr1 fr1) {
        if (qb1 != null) {
            qb1.mo19648l(fr1);
        }
    }

    /* renamed from: c */
    public final int mo15695c(byte[] bArr, int i, int i2) throws IOException {
        qb1 qb1 = this.f25243k;
        Objects.requireNonNull(qb1);
        return qb1.mo15695c(bArr, i, i2);
    }

    /* renamed from: g */
    public final Uri mo15696g() {
        qb1 qb1 = this.f25243k;
        if (qb1 == null) {
            return null;
        }
        return qb1.mo15696g();
    }

    /* renamed from: h */
    public final void mo15697h() throws IOException {
        qb1 qb1 = this.f25243k;
        if (qb1 != null) {
            try {
                qb1.mo15697h();
            } finally {
                this.f25243k = null;
            }
        }
    }

    /* renamed from: l */
    public final void mo19648l(fr1 fr1) {
        Objects.requireNonNull(fr1);
        this.f25235c.mo19648l(fr1);
        this.f25234b.add(fr1);
        m32915p(this.f25236d, fr1);
        m32915p(this.f25237e, fr1);
        m32915p(this.f25238f, fr1);
        m32915p(this.f25239g, fr1);
        m32915p(this.f25240h, fr1);
        m32915p(this.f25241i, fr1);
        m32915p(this.f25242j, fr1);
    }

    /* renamed from: m */
    public final long mo15698m(uf1 uf1) throws IOException {
        qb1 qb1;
        gs1.m24488f(this.f25243k == null);
        String scheme = uf1.f24320a.getScheme();
        if (wy2.m33456s(uf1.f24320a)) {
            String path = uf1.f24320a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f25236d == null) {
                    a64 a64 = new a64();
                    this.f25236d = a64;
                    m32914o(a64);
                }
                this.f25243k = this.f25236d;
            } else {
                this.f25243k = m32913n();
            }
        } else if ("asset".equals(scheme)) {
            this.f25243k = m32913n();
        } else if ("content".equals(scheme)) {
            if (this.f25238f == null) {
                p54 p54 = new p54(this.f25233a);
                this.f25238f = p54;
                m32914o(p54);
            }
            this.f25243k = this.f25238f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f25239g == null) {
                try {
                    qb1 qb12 = (qb1) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.f25239g = qb12;
                    m32914o(qb12);
                } catch (ClassNotFoundException unused) {
                    Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.f25239g == null) {
                    this.f25239g = this.f25235c;
                }
            }
            this.f25243k = this.f25239g;
        } else if ("udp".equals(scheme)) {
            if (this.f25240h == null) {
                v64 v64 = new v64(2000);
                this.f25240h = v64;
                m32914o(v64);
            }
            this.f25243k = this.f25240h;
        } else if ("data".equals(scheme)) {
            if (this.f25241i == null) {
                q54 q54 = new q54();
                this.f25241i = q54;
                m32914o(q54);
            }
            this.f25243k = this.f25241i;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f25242j == null) {
                    n64 n64 = new n64(this.f25233a);
                    this.f25242j = n64;
                    m32914o(n64);
                }
                qb1 = this.f25242j;
            } else {
                qb1 = this.f25235c;
            }
            this.f25243k = qb1;
        }
        return this.f25243k.mo15698m(uf1);
    }

    public final Map<String, List<String>> zza() {
        qb1 qb1 = this.f25243k;
        return qb1 == null ? Collections.emptyMap() : qb1.zza();
    }
}
