package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class p22 {

    /* renamed from: a */
    private final List<zzbfm> f21298a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private final Map<String, zzbfm> f21299b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    private ep2 f21300c = null;

    /* renamed from: d */
    private bp2 f21301d = null;

    /* renamed from: a */
    public final x71 mo20180a() {
        return new x71(this.f21301d, BuildConfig.FLAVOR, this, this.f21300c);
    }

    /* renamed from: b */
    public final List<zzbfm> mo20181b() {
        return this.f21298a;
    }

    /* renamed from: c */
    public final void mo20182c(bp2 bp2) {
        String str = bp2.f14669x;
        if (!this.f21299b.containsKey(str)) {
            Bundle bundle = new Bundle();
            Iterator<String> keys = bp2.f14668w.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    bundle.putString(next, bp2.f14668w.getString(next));
                } catch (JSONException unused) {
                }
            }
            zzbfm zzbfm = new zzbfm(bp2.f14614F, 0, (zzbew) null, bundle);
            this.f21298a.add(zzbfm);
            this.f21299b.put(str, zzbfm);
        }
    }

    /* renamed from: d */
    public final void mo20183d(bp2 bp2, long j, zzbew zzbew) {
        String str = bp2.f14669x;
        if (this.f21299b.containsKey(str)) {
            if (this.f21301d == null) {
                this.f21301d = bp2;
            }
            zzbfm zzbfm = this.f21299b.get(str);
            zzbfm.f27235h = j;
            zzbfm.f27236i = zzbew;
        }
    }

    /* renamed from: e */
    public final void mo20184e(ep2 ep2) {
        this.f21300c = ep2;
    }
}
