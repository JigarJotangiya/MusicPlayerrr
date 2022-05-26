package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class gk0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: g */
    private final String f17161g;

    /* renamed from: h */
    final /* synthetic */ hk0 f17162h;

    public gk0(hk0 hk0, String str) {
        this.f17162h = hk0;
        this.f17161g = str;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f17162h) {
            for (fk0 fk0 : this.f17162h.f17689b) {
                fk0.f16653a.mo18160b(fk0.f16654b, sharedPreferences, this.f17161g, str);
            }
        }
    }
}
