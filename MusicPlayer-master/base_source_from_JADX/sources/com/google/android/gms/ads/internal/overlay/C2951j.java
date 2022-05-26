package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.pr0;

/* renamed from: com.google.android.gms.ads.internal.overlay.j */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C2951j {

    /* renamed from: a */
    public final int f9874a;

    /* renamed from: b */
    public final ViewGroup.LayoutParams f9875b;

    /* renamed from: c */
    public final ViewGroup f9876c;

    /* renamed from: d */
    public final Context f9877d;

    public C2951j(pr0 pr0) throws C2949h {
        this.f9875b = pr0.getLayoutParams();
        ViewParent parent = pr0.getParent();
        this.f9877d = pr0.mo17653C();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new C2949h("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f9876c = viewGroup;
        this.f9874a = viewGroup.indexOfChild(pr0.mo15939Z());
        viewGroup.removeView(pr0.mo15939Z());
        pr0.mo17719z0(true);
    }
}
