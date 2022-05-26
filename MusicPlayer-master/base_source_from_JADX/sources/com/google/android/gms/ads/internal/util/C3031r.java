package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.ads.internal.util.r */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class C3031r implements DialogInterface.OnClickListener {

    /* renamed from: g */
    public final /* synthetic */ C3049x f10067g;

    /* renamed from: h */
    public final /* synthetic */ AtomicInteger f10068h;

    /* renamed from: i */
    public final /* synthetic */ int f10069i;

    /* renamed from: j */
    public final /* synthetic */ int f10070j;

    /* renamed from: k */
    public final /* synthetic */ int f10071k;

    public /* synthetic */ C3031r(C3049x xVar, AtomicInteger atomicInteger, int i, int i2, int i3) {
        this.f10067g = xVar;
        this.f10068h = atomicInteger;
        this.f10069i = i;
        this.f10070j = i2;
        this.f10071k = i3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10067g.mo11133h(this.f10068h, this.f10069i, this.f10070j, this.f10071k, dialogInterface, i);
    }
}
