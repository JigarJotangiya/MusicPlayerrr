package com.airbnb.lottie.p015t.p016b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.C1473f;
import com.airbnb.lottie.C1493k;
import com.airbnb.lottie.p015t.p017c.C1529a;
import com.airbnb.lottie.p015t.p017c.C1536b;
import com.airbnb.lottie.p015t.p017c.C1552q;
import com.airbnb.lottie.p019v.p021k.C1598q;
import com.airbnb.lottie.p019v.p022l.C1604a;
import com.airbnb.lottie.p027z.C1690c;

/* renamed from: com.airbnb.lottie.t.b.r */
/* compiled from: StrokeContent */
public class C1527r extends C1506a {

    /* renamed from: r */
    private final C1604a f5895r;

    /* renamed from: s */
    private final String f5896s;

    /* renamed from: t */
    private final boolean f5897t;

    /* renamed from: u */
    private final C1529a<Integer, Integer> f5898u;

    /* renamed from: v */
    private C1529a<ColorFilter, ColorFilter> f5899v;

    public C1527r(C1473f fVar, C1604a aVar, C1598q qVar) {
        super(fVar, aVar, qVar.mo7340b().toPaintCap(), qVar.mo7343e().toPaintJoin(), qVar.mo7345g(), qVar.mo7347i(), qVar.mo7348j(), qVar.mo7344f(), qVar.mo7342d());
        this.f5895r = aVar;
        this.f5896s = qVar.mo7346h();
        this.f5897t = qVar.mo7349k();
        C1529a<Integer, Integer> a = qVar.mo7341c().mo7245a();
        this.f5898u = a;
        a.mo7151a(this);
        aVar.mo7366i(a);
    }

    /* renamed from: f */
    public void mo7136f(Canvas canvas, Matrix matrix, int i) {
        if (!this.f5897t) {
            this.f5772i.setColor(((C1536b) this.f5898u).mo7170p());
            C1529a<ColorFilter, ColorFilter> aVar = this.f5899v;
            if (aVar != null) {
                this.f5772i.setColorFilter(aVar.mo7157h());
            }
            super.mo7136f(canvas, matrix, i);
        }
    }

    /* renamed from: g */
    public <T> void mo7137g(T t, C1690c<T> cVar) {
        super.mo7137g(t, cVar);
        if (t == C1493k.f5726b) {
            this.f5898u.mo7163n(cVar);
        } else if (t == C1493k.f5721K) {
            C1529a<ColorFilter, ColorFilter> aVar = this.f5899v;
            if (aVar != null) {
                this.f5895r.mo7360F(aVar);
            }
            if (cVar == null) {
                this.f5899v = null;
                return;
            }
            C1552q qVar = new C1552q(cVar);
            this.f5899v = qVar;
            qVar.mo7151a(this);
            this.f5895r.mo7366i(this.f5898u);
        }
    }

    public String getName() {
        return this.f5896s;
    }
}
