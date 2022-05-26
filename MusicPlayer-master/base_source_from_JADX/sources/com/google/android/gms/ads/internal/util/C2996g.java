package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: com.google.android.gms.ads.internal.util.g */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C2996g {

    /* renamed from: a */
    private boolean f10005a = false;

    /* renamed from: b */
    private float f10006b = 1.0f;

    /* renamed from: b */
    public static float m13346b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return ((float) streamVolume) / ((float) streamMaxVolume);
    }

    /* renamed from: f */
    private final synchronized boolean m13347f() {
        return this.f10006b >= 0.0f;
    }

    /* renamed from: a */
    public final synchronized float mo11029a() {
        if (!m13347f()) {
            return 1.0f;
        }
        return this.f10006b;
    }

    /* renamed from: c */
    public final synchronized void mo11030c(boolean z) {
        this.f10005a = z;
    }

    /* renamed from: d */
    public final synchronized void mo11031d(float f) {
        this.f10006b = f;
    }

    /* renamed from: e */
    public final synchronized boolean mo11032e() {
        return this.f10005a;
    }
}
