package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.C3292l;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class sn0 {

    /* renamed from: a */
    private final Context f23553a;

    /* renamed from: b */
    private final eo0 f23554b;

    /* renamed from: c */
    private final ViewGroup f23555c;

    /* renamed from: d */
    private rn0 f23556d;

    public sn0(Context context, ViewGroup viewGroup, pr0 pr0) {
        this.f23553a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f23555c = viewGroup;
        this.f23554b = pr0;
        this.f23556d = null;
    }

    /* renamed from: a */
    public final rn0 mo20882a() {
        C3292l.m14236d("getAdVideoUnderlay must be called from the UI thread.");
        return this.f23556d;
    }

    /* renamed from: b */
    public final void mo20883b(int i, int i2, int i3, int i4) {
        C3292l.m14236d("The underlay may only be modified from the UI thread.");
        rn0 rn0 = this.f23556d;
        if (rn0 != null) {
            rn0.mo20710l(i, i2, i3, i4);
        }
    }

    /* renamed from: c */
    public final void mo20884c(int i, int i2, int i3, int i4, int i5, boolean z, do0 do0) {
        if (this.f23556d == null) {
            C5762xz.m33910a(this.f23554b.mo17244l().mo16805a(), this.f23554b.mo17242k(), "vpr2");
            Context context = this.f23553a;
            eo0 eo0 = this.f23554b;
            rn0 rn0 = new rn0(context, eo0, i5, z, eo0.mo17244l().mo16805a(), do0);
            this.f23556d = rn0;
            this.f23555c.addView(rn0, 0, new ViewGroup.LayoutParams(-1, -1));
            int i6 = i;
            int i7 = i2;
            int i8 = i3;
            int i9 = i4;
            this.f23556d.mo20710l(i, i2, i3, i4);
            this.f23554b.mo17229L(false);
        }
    }

    /* renamed from: d */
    public final void mo20885d() {
        C3292l.m14236d("onDestroy must be called from the UI thread.");
        rn0 rn0 = this.f23556d;
        if (rn0 != null) {
            rn0.mo20716u();
            this.f23555c.removeView(this.f23556d);
            this.f23556d = null;
        }
    }

    /* renamed from: e */
    public final void mo20886e() {
        C3292l.m14236d("onPause must be called from the UI thread.");
        rn0 rn0 = this.f23556d;
        if (rn0 != null) {
            rn0.mo20721z();
        }
    }

    /* renamed from: f */
    public final void mo20887f(int i) {
        C3292l.m14236d("setPlayerBackgroundColor must be called from the UI thread.");
        rn0 rn0 = this.f23556d;
        if (rn0 != null) {
            rn0.mo20707h(i);
        }
    }
}
