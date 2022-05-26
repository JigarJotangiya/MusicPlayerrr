package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.ads.internal.util.s */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class C3034s implements DialogInterface.OnClickListener {

    /* renamed from: g */
    public final /* synthetic */ AtomicInteger f10101g;

    public /* synthetic */ C3034s(AtomicInteger atomicInteger) {
        this.f10101g = atomicInteger;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10101g.set(i);
    }
}
