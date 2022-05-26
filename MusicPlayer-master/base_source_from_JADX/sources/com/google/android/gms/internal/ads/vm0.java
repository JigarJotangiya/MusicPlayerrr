package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class vm0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f24834a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f24835b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f24836c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final g43<String> f24837d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final g43<String> f24838e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final g43<String> f24839f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public g43<String> f24840g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f24841h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final k43<xh0, xo0> f24842i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final r43<Integer> f24843j;

    @Deprecated
    public vm0() {
        this.f24834a = Integer.MAX_VALUE;
        this.f24835b = Integer.MAX_VALUE;
        this.f24836c = true;
        this.f24837d = g43.zzo();
        this.f24838e = g43.zzo();
        this.f24839f = g43.zzo();
        this.f24840g = g43.zzo();
        this.f24841h = 0;
        this.f24842i = k43.zzd();
        this.f24843j = r43.zzl();
    }

    protected vm0(yp0 yp0) {
        this.f24834a = yp0.f26474i;
        this.f24835b = yp0.f26475j;
        this.f24836c = yp0.f26476k;
        this.f24837d = yp0.f26477l;
        this.f24838e = yp0.f26478m;
        this.f24839f = yp0.f26482q;
        this.f24840g = yp0.f26483r;
        this.f24841h = yp0.f26484s;
        this.f24842i = yp0.f26488w;
        this.f24843j = yp0.f26489x;
    }

    /* renamed from: d */
    public final vm0 mo21563d(Context context) {
        CaptioningManager captioningManager;
        int i = wy2.f25579a;
        if (i >= 19 && ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
            this.f24841h = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f24840g = g43.zzp(wy2.m33446i(locale));
            }
        }
        return this;
    }

    /* renamed from: e */
    public vm0 mo20395e(int i, int i2, boolean z) {
        this.f24834a = i;
        this.f24835b = i2;
        this.f24836c = true;
        return this;
    }
}
