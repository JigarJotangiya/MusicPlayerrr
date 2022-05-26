package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class j74 implements DisplayManager.DisplayListener, g74 {

    /* renamed from: a */
    private final DisplayManager f18387a;

    /* renamed from: b */
    private e74 f18388b;

    private j74(DisplayManager displayManager) {
        this.f18387a = displayManager;
    }

    /* renamed from: b */
    public static g74 m25558b(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new j74(displayManager);
        }
        return null;
    }

    /* renamed from: c */
    private final Display m25559c() {
        return this.f18387a.getDisplay(0);
    }

    /* renamed from: a */
    public final void mo17872a(e74 e74) {
        this.f18388b = e74;
        this.f18387a.registerDisplayListener(this, wy2.m33443f0((Handler.Callback) null));
        l74.m26560b(e74.f15890a, m25559c());
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayChanged(int i) {
        e74 e74 = this.f18388b;
        if (e74 != null && i == 0) {
            l74.m26560b(e74.f15890a, m25559c());
        }
    }

    public final void onDisplayRemoved(int i) {
    }

    public final void zza() {
        this.f18387a.unregisterDisplayListener(this);
        this.f18388b = null;
    }
}
