package com.google.android.gms.common.internal.p077q;

import android.content.Context;
import com.google.android.gms.common.api.C3147a;
import com.google.android.gms.common.api.C3161e;
import com.google.android.gms.common.api.internal.C3199n;
import com.google.android.gms.common.internal.C3298o;
import com.google.android.gms.common.internal.C3300p;
import com.google.android.gms.common.internal.TelemetryData;
import p159f.p243f.p245b.p246a.p293c.p296c.C7442d;
import p159f.p243f.p245b.p246a.p303f.C7470h;

/* renamed from: com.google.android.gms.common.internal.q.d */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3306d extends C3161e<C3300p> implements C3298o {

    /* renamed from: i */
    private static final C3147a.C3157g<C3307e> f10653i;

    /* renamed from: j */
    private static final C3147a.C3148a<C3307e, C3300p> f10654j;

    /* renamed from: k */
    private static final C3147a<C3300p> f10655k;

    /* renamed from: l */
    public static final /* synthetic */ int f10656l = 0;

    static {
        C3147a.C3157g<C3307e> gVar = new C3147a.C3157g<>();
        f10653i = gVar;
        C3305c cVar = new C3305c();
        f10654j = cVar;
        f10655k = new C3147a<>("ClientTelemetry.API", cVar, gVar);
    }

    public C3306d(Context context, C3300p pVar) {
        super(context, f10655k, pVar, C3161e.C3162a.f10334c);
    }

    /* renamed from: b */
    public final C7470h<Void> mo11864b(TelemetryData telemetryData) {
        C3199n.C3200a a = C3199n.m13912a();
        a.mo11613d(C7442d.f32616a);
        a.mo11612c(false);
        a.mo11611b(new C3304b(telemetryData));
        return mo11525e(a.mo11610a());
    }
}
