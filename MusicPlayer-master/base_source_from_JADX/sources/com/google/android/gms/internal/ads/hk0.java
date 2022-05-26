package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class hk0 {

    /* renamed from: a */
    private final Map<String, gk0> f17688a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<fk0> f17689b = new ArrayList();

    /* renamed from: c */
    private final Context f17690c;

    /* renamed from: d */
    private final ej0 f17691d;

    hk0(Context context, ej0 ej0) {
        this.f17690c = context;
        this.f17691d = ej0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo18160b(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.f17691d.mo17199e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo18161c(String str) {
        SharedPreferences sharedPreferences;
        if (!this.f17688a.containsKey(str)) {
            if ("__default__".equals(str)) {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f17690c);
            } else {
                sharedPreferences = this.f17690c.getSharedPreferences(str, 0);
            }
            gk0 gk0 = new gk0(this, str);
            this.f17688a.put(str, gk0);
            sharedPreferences.registerOnSharedPreferenceChangeListener(gk0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo18162d(fk0 fk0) {
        this.f17689b.add(fk0);
    }
}
