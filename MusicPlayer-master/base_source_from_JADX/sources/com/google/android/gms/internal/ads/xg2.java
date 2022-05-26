package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xg2 implements rg2<Bundle> {

    /* renamed from: a */
    public final boolean f25784a;

    /* renamed from: b */
    public final boolean f25785b;

    /* renamed from: c */
    public final String f25786c;

    /* renamed from: d */
    public final boolean f25787d;

    /* renamed from: e */
    public final boolean f25788e;

    /* renamed from: f */
    public final boolean f25789f;

    /* renamed from: g */
    public final String f25790g;

    /* renamed from: h */
    public final ArrayList<String> f25791h;

    /* renamed from: i */
    public final String f25792i;

    /* renamed from: j */
    public final String f25793j;

    /* renamed from: k */
    public final String f25794k;

    /* renamed from: l */
    public final boolean f25795l;

    /* renamed from: m */
    public final String f25796m;

    /* renamed from: n */
    public final long f25797n;

    public xg2(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList<String> arrayList, String str3, String str4, String str5, boolean z6, String str6, long j) {
        this.f25784a = z;
        this.f25785b = z2;
        this.f25786c = str;
        this.f25787d = z3;
        this.f25788e = z4;
        this.f25789f = z5;
        this.f25790g = str2;
        this.f25791h = arrayList;
        this.f25792i = str3;
        this.f25793j = str4;
        this.f25794k = str5;
        this.f25795l = z6;
        this.f25796m = str6;
        this.f25797n = j;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.f25784a);
        bundle.putBoolean("coh", this.f25785b);
        bundle.putString("gl", this.f25786c);
        bundle.putBoolean("simulator", this.f25787d);
        bundle.putBoolean("is_latchsky", this.f25788e);
        bundle.putBoolean("is_sidewinder", this.f25789f);
        bundle.putString("hl", this.f25790g);
        if (!this.f25791h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.f25791h);
        }
        bundle.putString("mv", this.f25792i);
        bundle.putString("submodel", this.f25796m);
        Bundle a = fq2.m23777a(bundle, "device");
        bundle.putBundle("device", a);
        a.putString("build", this.f25794k);
        a.putLong("remaining_data_partition_space", this.f25797n);
        Bundle a2 = fq2.m23777a(a, "browser");
        a.putBundle("browser", a2);
        a2.putBoolean("is_browser_custom_tabs_capable", this.f25795l);
        if (!TextUtils.isEmpty(this.f25793j)) {
            Bundle a3 = fq2.m23777a(a, "play_store");
            a.putBundle("play_store", a3);
            a3.putString("package_version", this.f25793j);
        }
    }
}
