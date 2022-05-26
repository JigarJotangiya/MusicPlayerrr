package com.airbnb.lottie.p024x;

import android.graphics.Rect;
import com.airbnb.lottie.C1464d;
import com.airbnb.lottie.C1489g;
import com.airbnb.lottie.p019v.C1558c;
import com.airbnb.lottie.p019v.C1559d;
import com.airbnb.lottie.p019v.C1563h;
import com.airbnb.lottie.p019v.p022l.C1610d;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import com.airbnb.lottie.p026y.C1679d;
import com.airbnb.lottie.p026y.C1683h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p082e.p098e.C3470d;
import p082e.p098e.C3479h;

/* renamed from: com.airbnb.lottie.x.w */
/* compiled from: LottieCompositionMoshiParser */
public class C1672w {

    /* renamed from: a */
    private static final C1657c.C1658a f6306a = C1657c.C1658a.m8335a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b */
    static C1657c.C1658a f6307b = C1657c.C1658a.m8335a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c */
    private static final C1657c.C1658a f6308c = C1657c.C1658a.m8335a("list");

    /* renamed from: d */
    private static final C1657c.C1658a f6309d = C1657c.C1658a.m8335a("cm", "tm", "dr");

    /* renamed from: a */
    public static C1464d m8392a(C1657c cVar) throws IOException {
        ArrayList arrayList;
        HashMap hashMap;
        C1657c cVar2 = cVar;
        float e = C1683h.m8459e();
        C3470d dVar = new C3470d();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        C3479h hVar = new C3479h();
        C1464d dVar2 = new C1464d();
        cVar.mo7438p();
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        while (cVar.mo7427H()) {
            switch (cVar2.mo7439v0(f6306a)) {
                case 0:
                    HashMap hashMap5 = hashMap4;
                    ArrayList arrayList4 = arrayList3;
                    i = cVar.mo7431T();
                    continue;
                case 1:
                    HashMap hashMap6 = hashMap4;
                    ArrayList arrayList5 = arrayList3;
                    i2 = cVar.mo7431T();
                    continue;
                case 2:
                    HashMap hashMap7 = hashMap4;
                    ArrayList arrayList6 = arrayList3;
                    f = (float) cVar.mo7430Q();
                    continue;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = ((float) cVar.mo7430Q()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = (float) cVar.mo7430Q();
                    break;
                case 5:
                    String[] split = cVar.mo7435i0().split("\\.");
                    if (!C1683h.m8464j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        dVar2.mo7002a("Lottie only supports bodymovin >= 4.4.0");
                        break;
                    }
                    break;
                case 6:
                    m8396e(cVar2, dVar2, arrayList2, dVar);
                    break;
                case 7:
                    m8393b(cVar2, dVar2, hashMap2, hashMap3);
                    break;
                case 8:
                    m8395d(cVar2, hashMap4);
                    break;
                case 9:
                    m8394c(cVar2, dVar2, hVar);
                    break;
                case 10:
                    m8397f(cVar2, dVar2, arrayList3);
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    cVar.mo7441z0();
                    cVar.mo7425A0();
                    break;
            }
            hashMap = hashMap4;
            arrayList = arrayList3;
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            cVar2 = cVar;
        }
        ArrayList arrayList7 = arrayList3;
        dVar2.mo7020s(new Rect(0, 0, (int) (((float) i) * e), (int) (((float) i2) * e)), f, f2, f3, arrayList2, dVar, hashMap2, hashMap3, hVar, hashMap4, arrayList3);
        return dVar2;
    }

    /* renamed from: b */
    private static void m8393b(C1657c cVar, C1464d dVar, Map<String, List<C1610d>> map, Map<String, C1489g> map2) throws IOException {
        cVar.mo7433d();
        while (cVar.mo7427H()) {
            ArrayList arrayList = new ArrayList();
            C3470d dVar2 = new C3470d();
            cVar.mo7438p();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            int i2 = 0;
            while (cVar.mo7427H()) {
                int v0 = cVar.mo7439v0(f6307b);
                if (v0 == 0) {
                    str = cVar.mo7435i0();
                } else if (v0 == 1) {
                    cVar.mo7433d();
                    while (cVar.mo7427H()) {
                        C1610d b = C1670v.m8391b(cVar, dVar);
                        dVar2.mo12309m(b.mo7376d(), b);
                        arrayList.add(b);
                    }
                    cVar.mo7440x();
                } else if (v0 == 2) {
                    i = cVar.mo7431T();
                } else if (v0 == 3) {
                    i2 = cVar.mo7431T();
                } else if (v0 == 4) {
                    str2 = cVar.mo7435i0();
                } else if (v0 != 5) {
                    cVar.mo7441z0();
                    cVar.mo7425A0();
                } else {
                    str3 = cVar.mo7435i0();
                }
            }
            cVar.mo7426E();
            if (str2 != null) {
                C1489g gVar = new C1489g(i, i2, str, str2, str3);
                map2.put(gVar.mo7109d(), gVar);
            } else {
                map.put(str, arrayList);
            }
        }
        cVar.mo7440x();
    }

    /* renamed from: c */
    private static void m8394c(C1657c cVar, C1464d dVar, C3479h<C1559d> hVar) throws IOException {
        cVar.mo7433d();
        while (cVar.mo7427H()) {
            C1559d a = C1652m.m8313a(cVar, dVar);
            hVar.mo12414k(a.hashCode(), a);
        }
        cVar.mo7440x();
    }

    /* renamed from: d */
    private static void m8395d(C1657c cVar, Map<String, C1558c> map) throws IOException {
        cVar.mo7438p();
        while (cVar.mo7427H()) {
            if (cVar.mo7439v0(f6308c) != 0) {
                cVar.mo7441z0();
                cVar.mo7425A0();
            } else {
                cVar.mo7433d();
                while (cVar.mo7427H()) {
                    C1558c a = C1654n.m8315a(cVar);
                    map.put(a.mo7224b(), a);
                }
                cVar.mo7440x();
            }
        }
        cVar.mo7426E();
    }

    /* renamed from: e */
    private static void m8396e(C1657c cVar, C1464d dVar, List<C1610d> list, C3470d<C1610d> dVar2) throws IOException {
        cVar.mo7433d();
        int i = 0;
        while (cVar.mo7427H()) {
            C1610d b = C1670v.m8391b(cVar, dVar);
            if (b.mo7378f() == C1610d.C1611a.IMAGE) {
                i++;
            }
            list.add(b);
            dVar2.mo12309m(b.mo7376d(), b);
            if (i > 4) {
                C1679d.m8416c("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        cVar.mo7440x();
    }

    /* renamed from: f */
    private static void m8397f(C1657c cVar, C1464d dVar, List<C1563h> list) throws IOException {
        cVar.mo7433d();
        while (cVar.mo7427H()) {
            String str = null;
            cVar.mo7438p();
            float f = 0.0f;
            float f2 = 0.0f;
            while (cVar.mo7427H()) {
                int v0 = cVar.mo7439v0(f6309d);
                if (v0 == 0) {
                    str = cVar.mo7435i0();
                } else if (v0 == 1) {
                    f = (float) cVar.mo7430Q();
                } else if (v0 != 2) {
                    cVar.mo7441z0();
                    cVar.mo7425A0();
                } else {
                    f2 = (float) cVar.mo7430Q();
                }
            }
            cVar.mo7426E();
            list.add(new C1563h(str, f, f2));
        }
        cVar.mo7440x();
    }
}
