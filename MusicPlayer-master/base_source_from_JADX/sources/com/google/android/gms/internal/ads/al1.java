package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class al1 implements e20 {

    /* renamed from: a */
    final /* synthetic */ wl1 f13962a;

    /* renamed from: b */
    final /* synthetic */ ViewGroup f13963b;

    al1(wl1 wl1, ViewGroup viewGroup) {
        this.f13962a = wl1;
        this.f13963b = viewGroup;
    }

    /* renamed from: a */
    public final JSONObject mo15856a() {
        return this.f13962a.zzp();
    }

    /* renamed from: b */
    public final void mo15857b() {
        wl1 wl1 = this.f13962a;
        g43<String> g43 = wk1.f25438t;
        Map<String, WeakReference<View>> m = wl1.mo21294m();
        if (m != null) {
            int size = g43.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (m.get(g43.get(i)) == null) {
                    i = i2;
                } else {
                    this.f13962a.onClick(this.f13963b);
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo15858c(MotionEvent motionEvent) {
        this.f13962a.onTouch((View) null, motionEvent);
    }

    public final JSONObject zza() {
        return this.f13962a.mo21293l();
    }
}
