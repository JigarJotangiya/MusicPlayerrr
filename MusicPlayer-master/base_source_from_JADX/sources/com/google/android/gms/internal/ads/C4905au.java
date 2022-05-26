package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.au */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C4905au {

    /* renamed from: a */
    private Bundle f14067a = new Bundle();

    /* renamed from: b */
    private List<String> f14068b = new ArrayList();

    /* renamed from: c */
    private boolean f14069c = false;

    /* renamed from: d */
    private int f14070d = -1;

    /* renamed from: e */
    private final Bundle f14071e = new Bundle();

    /* renamed from: f */
    private final Bundle f14072f = new Bundle();

    /* renamed from: g */
    private final List<String> f14073g = new ArrayList();

    /* renamed from: h */
    private int f14074h = -1;

    /* renamed from: i */
    private String f14075i = null;

    /* renamed from: j */
    private final List<String> f14076j = new ArrayList();

    /* renamed from: k */
    private int f14077k = 60000;

    /* renamed from: a */
    public final zzbfd mo15950a() {
        return new zzbfd(8, -1, this.f14067a, -1, this.f14068b, this.f14069c, this.f14070d, false, (String) null, (zzbkm) null, (Location) null, (String) null, this.f14071e, this.f14072f, this.f14073g, (String) null, (String) null, false, (zzbeu) null, this.f14074h, this.f14075i, this.f14076j, this.f14077k, (String) null);
    }

    /* renamed from: b */
    public final C4905au mo15951b(Bundle bundle) {
        this.f14067a = bundle;
        return this;
    }

    /* renamed from: c */
    public final C4905au mo15952c(int i) {
        this.f14077k = i;
        return this;
    }

    /* renamed from: d */
    public final C4905au mo15953d(boolean z) {
        this.f14069c = z;
        return this;
    }

    /* renamed from: e */
    public final C4905au mo15954e(List<String> list) {
        this.f14068b = list;
        return this;
    }

    /* renamed from: f */
    public final C4905au mo15955f(String str) {
        this.f14075i = str;
        return this;
    }

    /* renamed from: g */
    public final C4905au mo15956g(int i) {
        this.f14070d = i;
        return this;
    }

    /* renamed from: h */
    public final C4905au mo15957h(int i) {
        this.f14074h = i;
        return this;
    }
}
