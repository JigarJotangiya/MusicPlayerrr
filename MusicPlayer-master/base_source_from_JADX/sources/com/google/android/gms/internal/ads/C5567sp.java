package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.C3261d;

/* renamed from: com.google.android.gms.internal.ads.sp */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5567sp implements C3261d.C3262a {

    /* renamed from: a */
    final /* synthetic */ zzbak f23570a;

    /* renamed from: b */
    final /* synthetic */ mm0 f23571b;

    /* renamed from: c */
    final /* synthetic */ C5641up f23572c;

    C5567sp(C5641up upVar, zzbak zzbak, mm0 mm0) {
        this.f23572c = upVar;
        this.f23570a = zzbak;
        this.f23571b = mm0;
    }

    /* renamed from: K0 */
    public final void mo11813K0(Bundle bundle) {
        synchronized (this.f23572c.f24390d) {
            if (!this.f23572c.f24388b) {
                this.f23572c.f24388b = true;
                C5271kp a = this.f23572c.f24387a;
                if (a != null) {
                    d93<?> F0 = hm0.f17708a.mo17139F0(new C5456pp(this, a, this.f23570a, this.f23571b));
                    mm0 mm0 = this.f23571b;
                    mm0.mo15945h(new C5493qp(mm0, F0), hm0.f17713f);
                }
            }
        }
    }

    /* renamed from: z */
    public final void mo11814z(int i) {
    }
}
