package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class r03 extends j03 {

    /* renamed from: g */
    private e23<Integer> f22696g;

    /* renamed from: h */
    private e23<Integer> f22697h;

    /* renamed from: i */
    private q03 f22698i;

    /* renamed from: j */
    private HttpURLConnection f22699j;

    r03() {
        this(o03.f20783g, p03.f21274g, (q03) null);
    }

    r03(e23<Integer> e23, e23<Integer> e232, q03 q03) {
        this.f22696g = e23;
        this.f22697h = e232;
        this.f22698i = q03;
    }

    /* renamed from: Q */
    public static void m29814Q(HttpURLConnection httpURLConnection) {
        k03.m26043a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* renamed from: d */
    static /* synthetic */ Integer m29815d() {
        return -1;
    }

    /* renamed from: p */
    static /* synthetic */ Integer m29816p() {
        return -1;
    }

    /* renamed from: H */
    public HttpURLConnection mo20543H() throws IOException {
        k03.m26044b(this.f22696g.zza().intValue(), this.f22697h.zza().intValue());
        q03 q03 = this.f22698i;
        Objects.requireNonNull(q03);
        HttpURLConnection httpURLConnection = (HttpURLConnection) q03.zza();
        this.f22699j = httpURLConnection;
        return httpURLConnection;
    }

    /* renamed from: K */
    public HttpURLConnection mo20544K(q03 q03, int i, int i2) throws IOException {
        this.f22696g = new l03(i);
        this.f22697h = new n03(i2);
        this.f22698i = q03;
        return mo20543H();
    }

    public void close() {
        m29814Q(this.f22699j);
    }
}
