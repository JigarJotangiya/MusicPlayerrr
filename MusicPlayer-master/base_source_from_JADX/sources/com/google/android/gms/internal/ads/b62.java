package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.C3359d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class b62 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3359d f14338a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final c62 f14339b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final lv2 f14340c;

    /* renamed from: d */
    private final List<String> f14341d = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final boolean f14342e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final p22 f14343f;

    public b62(C3359d dVar, c62 c62, p22 p22, lv2 lv2) {
        this.f14338a = dVar;
        this.f14339b = c62;
        this.f14342e = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22327F4)).booleanValue();
        this.f14343f = p22;
        this.f14340c = lv2;
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ void m21114g(b62 b62, String str, int i, long j, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 33);
        sb.append(str);
        sb.append(".");
        sb.append(i);
        sb.append(".");
        sb.append(j);
        String sb2 = sb.toString();
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb3 = new StringBuilder(sb2.length() + 1 + String.valueOf(str2).length());
            sb3.append(sb2);
            sb3.append(".");
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        b62.f14341d.add(sb2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final <T> d93<T> mo16083e(np2 np2, bp2 bp2, d93<T> d93, iv2 iv2) {
        ep2 ep2 = np2.f20683b.f20121b;
        long b = this.f14338a.mo11989b();
        String str = bp2.f14669x;
        if (str != null) {
            s83.m30616r(d93, new a62(this, b, str, bp2, ep2, iv2, np2), hm0.f17713f);
        }
        return d93;
    }

    /* renamed from: f */
    public final String mo16084f() {
        return TextUtils.join("_", this.f14341d);
    }
}
