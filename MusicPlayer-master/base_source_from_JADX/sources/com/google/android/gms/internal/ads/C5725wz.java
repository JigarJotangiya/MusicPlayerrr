package com.google.android.gms.internal.ads;

import android.text.TextUtils;

@Deprecated
/* renamed from: com.google.android.gms.internal.ads.wz */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5725wz {
    /* renamed from: a */
    public static final void m33467a(C5688vz vzVar, C5614tz tzVar) {
        if (tzVar.mo21191a() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(tzVar.mo21192b())) {
            vzVar.mo21651d(tzVar.mo21191a(), tzVar.mo21192b(), tzVar.mo21193c(), tzVar.mo21194d());
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
