package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class uf1 {

    /* renamed from: a */
    public final Uri f24320a;

    /* renamed from: b */
    public final int f24321b;

    /* renamed from: c */
    public final byte[] f24322c;

    /* renamed from: d */
    public final Map<String, String> f24323d;
    @Deprecated

    /* renamed from: e */
    public final long f24324e;

    /* renamed from: f */
    public final long f24325f;

    /* renamed from: g */
    public final long f24326g;

    /* renamed from: h */
    public final String f24327h;

    /* renamed from: i */
    public final int f24328i;

    private uf1(Uri uri, long j, int i, byte[] bArr, Map<String, String> map, long j2, long j3, String str, int i2, Object obj) {
        long j4 = j + j2;
        boolean z = false;
        gs1.m24486d(j4 >= 0);
        gs1.m24486d(j2 >= 0);
        gs1.m24486d((j3 > 0 || j3 == -1) ? true : z);
        this.f24320a = uri;
        this.f24321b = 1;
        this.f24322c = null;
        this.f24323d = Collections.unmodifiableMap(new HashMap(map));
        this.f24325f = j2;
        this.f24324e = j4;
        this.f24326g = j3;
        this.f24327h = null;
        this.f24328i = i2;
    }

    /* synthetic */ uf1(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj, te1 te1) {
        this(uri, 0, 1, (byte[]) null, map, j2, -1, (String) null, i2, (Object) null);
    }

    /* renamed from: a */
    public static String m31805a(int i) {
        return "GET";
    }

    /* renamed from: b */
    public final boolean mo21262b(int i) {
        return (this.f24328i & i) == i;
    }

    public final String toString() {
        String a = m31805a(1);
        String valueOf = String.valueOf(this.f24320a);
        long j = this.f24325f;
        long j2 = this.f24326g;
        int i = this.f24328i;
        StringBuilder sb = new StringBuilder(a.length() + 70 + String.valueOf(valueOf).length() + 4);
        sb.append("DataSpec[");
        sb.append(a);
        sb.append(" ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", null, ");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    @Deprecated
    public uf1(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        this(uri, j - j2, 1, (byte[]) null, Collections.emptyMap(), j2, j3, (String) null, i, (Object) null);
    }
}
