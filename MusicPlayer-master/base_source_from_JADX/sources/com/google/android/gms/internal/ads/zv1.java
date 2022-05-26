package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zv1 {

    /* renamed from: a */
    private final mv1 f26924a;

    /* renamed from: b */
    private final yq1 f26925b;

    /* renamed from: c */
    private final Object f26926c = new Object();

    /* renamed from: d */
    private final List<yv1> f26927d;

    /* renamed from: e */
    private boolean f26928e;

    zv1(mv1 mv1, yq1 yq1) {
        this.f26924a = mv1;
        this.f26925b = yq1;
        this.f26927d = new ArrayList();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m34841d(List<zzbtn> list) {
        String zzcab;
        synchronized (this.f26926c) {
            if (!this.f26928e) {
                for (zzbtn next : list) {
                    List<yv1> list2 = this.f26927d;
                    String str = next.f27267g;
                    xq1 a = this.f26925b.mo22275a(str);
                    if (a == null) {
                        zzcab = BuildConfig.FLAVOR;
                    } else {
                        zzcab zzcab2 = a.f25930b;
                        if (zzcab2 == null) {
                            zzcab = BuildConfig.FLAVOR;
                        } else {
                            zzcab = zzcab2.toString();
                        }
                    }
                    String str2 = zzcab;
                    boolean z = next.f27268h;
                    list2.add(new yv1(str, str2, z ? 1 : 0, next.f27270j, next.f27269i));
                }
                this.f26928e = true;
            }
        }
    }

    /* renamed from: a */
    public final JSONArray mo22438a() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f26926c) {
            if (!this.f26928e) {
                if (this.f26924a.mo19562s()) {
                    m34841d(this.f26924a.mo19553f());
                } else {
                    mo22439c();
                    return jSONArray;
                }
            }
            for (yv1 a : this.f26927d) {
                jSONArray.put(a.mo22297a());
            }
            return jSONArray;
        }
    }

    /* renamed from: c */
    public final void mo22439c() {
        this.f26924a.mo19561r(new xv1(this));
    }
}
