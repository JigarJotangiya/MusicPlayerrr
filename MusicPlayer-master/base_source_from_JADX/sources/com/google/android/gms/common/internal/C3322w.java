package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.internal.w */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C3322w extends C3324x {

    /* renamed from: g */
    final /* synthetic */ Intent f10668g;

    /* renamed from: h */
    final /* synthetic */ Activity f10669h;

    /* renamed from: i */
    final /* synthetic */ int f10670i;

    C3322w(Intent intent, Activity activity, int i) {
        this.f10668g = intent;
        this.f10669h = activity;
        this.f10670i = i;
    }

    /* renamed from: a */
    public final void mo11885a() {
        Intent intent = this.f10668g;
        if (intent != null) {
            this.f10669h.startActivityForResult(intent, this.f10670i);
        }
    }
}
