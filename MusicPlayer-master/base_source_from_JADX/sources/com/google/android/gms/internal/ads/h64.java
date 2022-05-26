package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class h64 {

    /* renamed from: a */
    private final SparseBooleanArray f17557a = new SparseBooleanArray();

    /* renamed from: b */
    private boolean f17558b;

    /* renamed from: a */
    public final h64 mo18093a(int i) {
        gs1.m24488f(!this.f17558b);
        this.f17557a.append(i, true);
        return this;
    }

    /* renamed from: b */
    public final i84 mo18094b() {
        gs1.m24488f(!this.f17558b);
        this.f17558b = true;
        return new i84(this.f17557a, (h74) null);
    }
}
