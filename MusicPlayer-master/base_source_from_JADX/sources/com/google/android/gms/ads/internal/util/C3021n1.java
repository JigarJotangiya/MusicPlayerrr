package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.internal.ads.w03;

/* renamed from: com.google.android.gms.ads.internal.util.n1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C3021n1 extends w03 {
    public C3021n1(Looper looper) {
        super(looper);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11061a(Message message) {
        try {
            super.mo11061a(message);
        } catch (Throwable th) {
            C2971s.m13214q();
            C2979b2.m13268p(C2971s.m13213p().mo17558c(), th);
            throw th;
        }
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            C2971s.m13213p().mo17571s(e, "AdMobHandler.handleMessage");
        }
    }
}
