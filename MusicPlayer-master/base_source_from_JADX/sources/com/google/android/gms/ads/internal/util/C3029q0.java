package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.C5399o5;
import com.google.android.gms.internal.ads.C5474q6;
import com.google.android.gms.internal.ads.C5547s5;
import com.google.android.gms.internal.ads.C5769y5;
import com.google.android.gms.internal.ads.mm0;
import com.google.android.gms.internal.ads.tl0;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.util.q0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C3029q0 extends C5547s5<C5399o5> {

    /* renamed from: s */
    private final mm0<C5399o5> f10062s;

    /* renamed from: t */
    private final tl0 f10063t;

    public C3029q0(String str, Map<String, String> map, mm0<C5399o5> mm0) {
        super(0, str, new C3026p0(mm0));
        this.f10062s = mm0;
        tl0 tl0 = new tl0((String) null);
        this.f10063t = tl0;
        tl0.mo21106d(str, "GET", (Map<String, ?>) null, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final C5769y5<C5399o5> mo11106o(C5399o5 o5Var) {
        return C5769y5.m34034b(o5Var, C5474q6.m29372b(o5Var));
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final /* bridge */ /* synthetic */ void mo11059v(Object obj) {
        C5399o5 o5Var = (C5399o5) obj;
        this.f10063t.mo21108f(o5Var.f20923c, o5Var.f20921a);
        tl0 tl0 = this.f10063t;
        byte[] bArr = o5Var.f20922b;
        if (tl0.m31314l() && bArr != null) {
            tl0.mo21110h(bArr);
        }
        this.f10062s.mo19449c(o5Var);
    }
}
