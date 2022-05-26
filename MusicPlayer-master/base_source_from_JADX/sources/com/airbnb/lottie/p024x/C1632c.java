package com.airbnb.lottie.p024x;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C1464d;
import com.airbnb.lottie.p019v.p020j.C1566b;
import com.airbnb.lottie.p019v.p020j.C1568d;
import com.airbnb.lottie.p019v.p020j.C1569e;
import com.airbnb.lottie.p019v.p020j.C1571g;
import com.airbnb.lottie.p019v.p020j.C1573i;
import com.airbnb.lottie.p019v.p020j.C1576l;
import com.airbnb.lottie.p019v.p020j.C1577m;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import com.airbnb.lottie.p027z.C1688a;
import com.airbnb.lottie.p027z.C1691d;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.x.c */
/* compiled from: AnimatableTransformParser */
public class C1632c {

    /* renamed from: a */
    private static final C1657c.C1658a f6230a = C1657c.C1658a.m8335a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b */
    private static final C1657c.C1658a f6231b = C1657c.C1658a.m8335a("k");

    /* renamed from: a */
    private static boolean m8266a(C1569e eVar) {
        return eVar == null || (eVar.mo7247c() && ((PointF) eVar.mo7246b().get(0).f6334b).equals(0.0f, 0.0f));
    }

    /* renamed from: b */
    private static boolean m8267b(C1577m<PointF, PointF> mVar) {
        if (mVar == null || (!(mVar instanceof C1573i) && mVar.mo7247c() && ((PointF) mVar.mo7246b().get(0).f6334b).equals(0.0f, 0.0f))) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m8268c(C1566b bVar) {
        return bVar == null || (bVar.mo7247c() && ((Float) ((C1688a) bVar.mo7246b().get(0)).f6334b).floatValue() == 0.0f);
    }

    /* renamed from: d */
    private static boolean m8269d(C1571g gVar) {
        return gVar == null || (gVar.mo7247c() && ((C1691d) ((C1688a) gVar.mo7246b().get(0)).f6334b).mo7510a(1.0f, 1.0f));
    }

    /* renamed from: e */
    private static boolean m8270e(C1566b bVar) {
        return bVar == null || (bVar.mo7247c() && ((Float) ((C1688a) bVar.mo7246b().get(0)).f6334b).floatValue() == 0.0f);
    }

    /* renamed from: f */
    private static boolean m8271f(C1566b bVar) {
        return bVar == null || (bVar.mo7247c() && ((Float) ((C1688a) bVar.mo7246b().get(0)).f6334b).floatValue() == 0.0f);
    }

    /* renamed from: g */
    public static C1576l m8272g(C1657c cVar, C1464d dVar) throws IOException {
        C1657c cVar2 = cVar;
        C1464d dVar2 = dVar;
        boolean z = false;
        boolean z2 = cVar.mo7436n0() == C1657c.C1659b.BEGIN_OBJECT;
        if (z2) {
            cVar.mo7438p();
        }
        C1566b bVar = null;
        C1569e eVar = null;
        C1577m<PointF, PointF> mVar = null;
        C1571g gVar = null;
        C1566b bVar2 = null;
        C1566b bVar3 = null;
        C1568d dVar3 = null;
        C1566b bVar4 = null;
        C1566b bVar5 = null;
        while (cVar.mo7427H()) {
            switch (cVar2.mo7439v0(f6230a)) {
                case 0:
                    cVar.mo7438p();
                    while (cVar.mo7427H()) {
                        if (cVar2.mo7439v0(f6231b) != 0) {
                            cVar.mo7441z0();
                            cVar.mo7425A0();
                        } else {
                            eVar = C1628a.m8258a(cVar, dVar);
                        }
                    }
                    cVar.mo7426E();
                    break;
                case 1:
                    mVar = C1628a.m8259b(cVar, dVar);
                    break;
                case 2:
                    gVar = C1634d.m8283j(cVar, dVar);
                    break;
                case 3:
                    dVar2.mo7002a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    dVar3 = C1634d.m8281h(cVar, dVar);
                    continue;
                case 6:
                    bVar4 = C1634d.m8279f(cVar2, dVar2, z);
                    continue;
                case 7:
                    bVar5 = C1634d.m8279f(cVar2, dVar2, z);
                    continue;
                case 8:
                    bVar2 = C1634d.m8279f(cVar2, dVar2, z);
                    continue;
                case 9:
                    bVar3 = C1634d.m8279f(cVar2, dVar2, z);
                    continue;
                default:
                    cVar.mo7441z0();
                    cVar.mo7425A0();
                    break;
            }
            C1566b f = C1634d.m8279f(cVar2, dVar2, z);
            if (f.mo7246b().isEmpty()) {
                C1688a aVar = r1;
                C1688a aVar2 = new C1688a(dVar, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(dVar.mo7007f()));
                f.mo7246b().add(aVar);
            } else if (((C1688a) f.mo7246b().get(0)).f6334b == null) {
                f.mo7246b().set(0, new C1688a(dVar, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(dVar.mo7007f())));
                bVar = f;
                z = false;
            }
            bVar = f;
            z = false;
        }
        if (z2) {
            cVar.mo7426E();
        }
        C1569e eVar2 = m8266a(eVar) ? null : eVar;
        C1577m<PointF, PointF> mVar2 = m8267b(mVar) ? null : mVar;
        C1566b bVar6 = m8268c(bVar) ? null : bVar;
        if (m8269d(gVar)) {
            gVar = null;
        }
        return new C1576l(eVar2, mVar2, gVar, bVar6, dVar3, bVar4, bVar5, m8271f(bVar2) ? null : bVar2, m8270e(bVar3) ? null : bVar3);
    }
}
