package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.C0339b;
import androidx.browser.customtabs.C0348d;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class os3 extends C0348d {

    /* renamed from: g */
    private final WeakReference<p00> f21139g;

    public os3(p00 p00, byte[] bArr) {
        this.f21139g = new WeakReference<>(p00);
    }

    /* renamed from: a */
    public final void mo2277a(ComponentName componentName, C0339b bVar) {
        p00 p00 = (p00) this.f21139g.get();
        if (p00 != null) {
            p00.mo20164c(bVar);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        p00 p00 = (p00) this.f21139g.get();
        if (p00 != null) {
            p00.mo20165d();
        }
    }
}
