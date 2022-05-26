package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class sd1 {

    /* renamed from: a */
    private Uri f23422a;

    /* renamed from: b */
    private Map<String, String> f23423b = Collections.emptyMap();

    /* renamed from: c */
    private long f23424c;

    /* renamed from: d */
    private int f23425d;

    /* renamed from: a */
    public final sd1 mo20830a(int i) {
        this.f23425d = 6;
        return this;
    }

    /* renamed from: b */
    public final sd1 mo20831b(Map<String, String> map) {
        this.f23423b = map;
        return this;
    }

    /* renamed from: c */
    public final sd1 mo20832c(long j) {
        this.f23424c = j;
        return this;
    }

    /* renamed from: d */
    public final sd1 mo20833d(Uri uri) {
        this.f23422a = uri;
        return this;
    }

    /* renamed from: e */
    public final uf1 mo20834e() {
        Uri uri = this.f23422a;
        if (uri != null) {
            return new uf1(uri, 0, 1, (byte[]) null, this.f23423b, this.f23424c, -1, (String) null, this.f23425d, (Object) null, (te1) null);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
