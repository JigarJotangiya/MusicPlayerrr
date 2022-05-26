package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.common.util.C3358c;
import com.google.android.gms.internal.ads.C4880a5;
import com.google.android.gms.internal.ads.C4882a7;
import com.google.android.gms.internal.ads.C5054ev;
import com.google.android.gms.internal.ads.C5141h6;
import com.google.android.gms.internal.ads.C5399o5;
import com.google.android.gms.internal.ads.C5503qz;
import com.google.android.gms.internal.ads.C5658v5;
import com.google.android.gms.internal.ads.d93;
import com.google.android.gms.internal.ads.mm0;
import com.google.android.gms.internal.ads.tl0;
import com.google.android.gms.internal.ads.ul0;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.util.r0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C3032r0 {

    /* renamed from: a */
    private static C5658v5 f10072a;

    /* renamed from: b */
    private static final Object f10073b = new Object();

    public C3032r0(Context context) {
        C5658v5 v5Var;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f10073b) {
            if (f10072a == null) {
                C5503qz.m29790c(context);
                if (!C3358c.m14436a()) {
                    if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22301C2)).booleanValue()) {
                        v5Var = C2985d0.m13313b(context);
                        f10072a = v5Var;
                    }
                }
                v5Var = C4882a7.m20612a(context, (C5141h6) null);
                f10072a = v5Var;
            }
        }
    }

    /* renamed from: a */
    public final d93<C5399o5> mo11109a(String str) {
        mm0 mm0 = new mm0();
        f10072a.mo21427a(new C3029q0(str, (Map<String, String>) null, mm0));
        return mm0;
    }

    /* renamed from: b */
    public final d93<String> mo11110b(int i, String str, Map<String, String> map, byte[] bArr) {
        String str2 = str;
        C3023o0 o0Var = new C3023o0((C3020n0) null);
        C3014l0 l0Var = new C3014l0(this, str2, o0Var);
        tl0 tl0 = new tl0((String) null);
        C3017m0 m0Var = new C3017m0(this, i, str, o0Var, l0Var, bArr, map, tl0);
        if (tl0.m31314l()) {
            try {
                tl0.mo21106d(str2, "GET", m0Var.mo11058s(), m0Var.mo11056E());
            } catch (C4880a5 e) {
                ul0.m31862g(e.getMessage());
            }
        }
        f10072a.mo21427a(m0Var);
        return o0Var;
    }
}
