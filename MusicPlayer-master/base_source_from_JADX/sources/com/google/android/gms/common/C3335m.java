package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p159f.p243f.p245b.p246a.p293c.p296c.C7444f;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.google.android.gms.common.m */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C3335m extends C7444f {

    /* renamed from: a */
    private final Context f10705a;

    /* renamed from: b */
    final /* synthetic */ C3235b f10706b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3335m(C3235b bVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f10706b = bVar;
        this.f10705a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int g = this.f10706b.mo11679g(this.f10705a);
        if (this.f10706b.mo11681i(g)) {
            this.f10706b.mo11685n(this.f10705a, g);
        }
    }
}
