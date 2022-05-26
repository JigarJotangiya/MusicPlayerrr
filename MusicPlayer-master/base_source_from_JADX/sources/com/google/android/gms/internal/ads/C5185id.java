package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.id */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class C5185id implements PackageManager.OnChecksumsReadyListener {

    /* renamed from: a */
    public final /* synthetic */ l93 f17954a;

    public /* synthetic */ C5185id(l93 l93) {
        this.f17954a = l93;
    }

    public final void onChecksumsReady(List list) {
        l93 l93 = this.f17954a;
        if (list == null) {
            l93.mo18105w(null);
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum apkChecksum = (ApkChecksum) list.get(i);
                if (apkChecksum.getType() == 8) {
                    l93.mo18105w(C5813zb.m34500c(apkChecksum.getValue()));
                    return;
                }
            }
            l93.mo18105w(null);
        } catch (Throwable unused) {
            l93.mo18105w(null);
        }
    }
}
