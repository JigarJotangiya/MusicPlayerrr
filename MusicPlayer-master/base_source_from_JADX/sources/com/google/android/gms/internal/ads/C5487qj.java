package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.qj */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5487qj implements C5339mj {

    /* renamed from: g */
    private final C5339mj[] f21931g;

    /* renamed from: h */
    private final ArrayList<C5339mj> f21932h;

    /* renamed from: i */
    private final C5704we f21933i = new C5704we();

    /* renamed from: j */
    private C5302lj f21934j;

    /* renamed from: k */
    private C5741xe f21935k;

    /* renamed from: l */
    private int f21936l = -1;

    /* renamed from: m */
    private C5450pj f21937m;

    public C5487qj(C5339mj... mjVarArr) {
        this.f21931g = mjVarArr;
        this.f21932h = new ArrayList<>(Arrays.asList(mjVarArr));
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m29538b(C5487qj qjVar, int i, C5741xe xeVar, Object obj) {
        C5450pj pjVar;
        if (qjVar.f21937m == null) {
            for (int i2 = 0; i2 <= 0; i2++) {
                xeVar.mo22026g(i2, qjVar.f21933i, false);
            }
            int i3 = qjVar.f21936l;
            if (i3 == -1) {
                qjVar.f21936l = 1;
            } else if (i3 != 1) {
                pjVar = new C5450pj(1);
                qjVar.f21937m = pjVar;
            }
            pjVar = null;
            qjVar.f21937m = pjVar;
        }
        if (qjVar.f21937m == null) {
            qjVar.f21932h.remove(qjVar.f21931g[i]);
            if (i == 0) {
                qjVar.f21935k = xeVar;
            }
            if (qjVar.f21932h.isEmpty()) {
                qjVar.f21934j.mo18382b(qjVar.f21935k, (Object) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo18381a(C5265kj kjVar) {
        C5376nj njVar = (C5376nj) kjVar;
        int i = 0;
        while (true) {
            C5339mj[] mjVarArr = this.f21931g;
            if (i < mjVarArr.length) {
                mjVarArr[i].mo18381a(njVar.f20631g[i]);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final C5265kj mo18383c(int i, C5785yk ykVar) {
        int length = this.f21931g.length;
        C5265kj[] kjVarArr = new C5265kj[length];
        for (int i2 = 0; i2 < length; i2++) {
            kjVarArr[i2] = this.f21931g[i2].mo18383c(i, ykVar);
        }
        return new C5376nj(kjVarArr);
    }

    /* renamed from: d */
    public final void mo18384d(C4963ce ceVar, boolean z, C5302lj ljVar) {
        this.f21934j = ljVar;
        int i = 0;
        while (true) {
            C5339mj[] mjVarArr = this.f21931g;
            if (i < mjVarArr.length) {
                mjVarArr[i].mo18384d(ceVar, false, new C5413oj(this, i));
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public final void mo18385f() {
        for (C5339mj f : this.f21931g) {
            f.mo18385f();
        }
    }

    public final void zza() throws IOException {
        C5450pj pjVar = this.f21937m;
        if (pjVar == null) {
            for (C5339mj zza : this.f21931g) {
                zza.zza();
            }
            return;
        }
        throw pjVar;
    }
}
