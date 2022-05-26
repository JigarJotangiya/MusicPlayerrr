package com.google.android.gms.common.internal.p077q;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C3179d;
import com.google.android.gms.common.api.internal.C3191j;
import com.google.android.gms.common.internal.C3269e;
import com.google.android.gms.common.internal.C3273f;
import com.google.android.gms.common.internal.C3300p;
import p159f.p243f.p245b.p246a.p293c.p296c.C7442d;

/* renamed from: com.google.android.gms.common.internal.q.e */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3307e extends C3273f<C3303a> {

    /* renamed from: G */
    private final C3300p f10657G;

    public C3307e(Context context, Looper looper, C3269e eVar, C3300p pVar, C3179d dVar, C3191j jVar) {
        super(context, looper, 270, eVar, dVar, jVar);
        this.f10657G = pVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final String mo11773D() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final String mo11774E() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final boolean mo11777H() {
        return true;
    }

    /* renamed from: l */
    public final int mo11799l() {
        return 203390000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ IInterface mo11805s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof C3303a ? (C3303a) queryLocalInterface : new C3303a(iBinder);
    }

    /* renamed from: v */
    public final Feature[] mo11808v() {
        return C7442d.f32617b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Bundle mo11812z() {
        return this.f10657G.mo11866b();
    }
}
