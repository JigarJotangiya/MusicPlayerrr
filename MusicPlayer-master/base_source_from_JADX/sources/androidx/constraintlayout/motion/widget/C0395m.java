package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.C0424a;
import androidx.constraintlayout.widget.C0430c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import p082e.p099f.p100a.p101k.p102a.C3500c;
import p082e.p099f.p106b.p107a.C3580c;

/* renamed from: androidx.constraintlayout.motion.widget.m */
/* compiled from: MotionConstrainedPoint */
class C0395m implements Comparable<C0395m> {

    /* renamed from: g */
    private float f1840g = 1.0f;

    /* renamed from: h */
    int f1841h = 0;

    /* renamed from: i */
    int f1842i;

    /* renamed from: j */
    private float f1843j = 0.0f;

    /* renamed from: k */
    private float f1844k = 0.0f;

    /* renamed from: l */
    private float f1845l = 0.0f;

    /* renamed from: m */
    public float f1846m = 0.0f;

    /* renamed from: n */
    private float f1847n = 1.0f;

    /* renamed from: o */
    private float f1848o = 1.0f;

    /* renamed from: p */
    private float f1849p = Float.NaN;

    /* renamed from: q */
    private float f1850q = Float.NaN;

    /* renamed from: r */
    private float f1851r = 0.0f;

    /* renamed from: s */
    private float f1852s = 0.0f;

    /* renamed from: t */
    private float f1853t = 0.0f;

    /* renamed from: u */
    private float f1854u;

    /* renamed from: v */
    private float f1855v = Float.NaN;

    /* renamed from: w */
    private float f1856w = Float.NaN;

    /* renamed from: x */
    LinkedHashMap<String, C0424a> f1857x = new LinkedHashMap<>();

    /* renamed from: k */
    private boolean m2422k(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (Float.isNaN(f) != Float.isNaN(f2)) {
                return true;
            }
            return false;
        } else if (Math.abs(f - f2) > 1.0E-6f) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public void mo2563c(HashMap<String, C3580c> hashMap, int i) {
        for (String next : hashMap.keySet()) {
            C3580c cVar = hashMap.get(next);
            next.hashCode();
            char c = 65535;
            switch (next.hashCode()) {
                case -1249320806:
                    if (next.equals("rotationX")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (next.equals("rotationY")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (next.equals("translationX")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (next.equals("translationY")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (next.equals("translationZ")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (next.equals("progress")) {
                        c = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (next.equals("scaleX")) {
                        c = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (next.equals("scaleY")) {
                        c = 7;
                        break;
                    }
                    break;
                case -760884510:
                    if (next.equals("transformPivotX")) {
                        c = 8;
                        break;
                    }
                    break;
                case -760884509:
                    if (next.equals("transformPivotY")) {
                        c = 9;
                        break;
                    }
                    break;
                case -40300674:
                    if (next.equals("rotation")) {
                        c = 10;
                        break;
                    }
                    break;
                case -4379043:
                    if (next.equals("elevation")) {
                        c = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (next.equals("transitionPathRotate")) {
                        c = 12;
                        break;
                    }
                    break;
                case 92909918:
                    if (next.equals("alpha")) {
                        c = 13;
                        break;
                    }
                    break;
            }
            float f = 1.0f;
            float f2 = 0.0f;
            switch (c) {
                case 0:
                    if (!Float.isNaN(this.f1845l)) {
                        f2 = this.f1845l;
                    }
                    cVar.mo12553c(i, f2);
                    break;
                case 1:
                    if (!Float.isNaN(this.f1846m)) {
                        f2 = this.f1846m;
                    }
                    cVar.mo12553c(i, f2);
                    break;
                case 2:
                    if (!Float.isNaN(this.f1851r)) {
                        f2 = this.f1851r;
                    }
                    cVar.mo12553c(i, f2);
                    break;
                case 3:
                    if (!Float.isNaN(this.f1852s)) {
                        f2 = this.f1852s;
                    }
                    cVar.mo12553c(i, f2);
                    break;
                case 4:
                    if (!Float.isNaN(this.f1853t)) {
                        f2 = this.f1853t;
                    }
                    cVar.mo12553c(i, f2);
                    break;
                case 5:
                    if (!Float.isNaN(this.f1856w)) {
                        f2 = this.f1856w;
                    }
                    cVar.mo12553c(i, f2);
                    break;
                case 6:
                    if (!Float.isNaN(this.f1847n)) {
                        f = this.f1847n;
                    }
                    cVar.mo12553c(i, f);
                    break;
                case 7:
                    if (!Float.isNaN(this.f1848o)) {
                        f = this.f1848o;
                    }
                    cVar.mo12553c(i, f);
                    break;
                case 8:
                    if (!Float.isNaN(this.f1849p)) {
                        f2 = this.f1849p;
                    }
                    cVar.mo12553c(i, f2);
                    break;
                case 9:
                    if (!Float.isNaN(this.f1850q)) {
                        f2 = this.f1850q;
                    }
                    cVar.mo12553c(i, f2);
                    break;
                case 10:
                    if (!Float.isNaN(this.f1844k)) {
                        f2 = this.f1844k;
                    }
                    cVar.mo12553c(i, f2);
                    break;
                case 11:
                    if (!Float.isNaN(this.f1843j)) {
                        f2 = this.f1843j;
                    }
                    cVar.mo12553c(i, f2);
                    break;
                case 12:
                    if (!Float.isNaN(this.f1855v)) {
                        f2 = this.f1855v;
                    }
                    cVar.mo12553c(i, f2);
                    break;
                case 13:
                    if (!Float.isNaN(this.f1840g)) {
                        f = this.f1840g;
                    }
                    cVar.mo12553c(i, f);
                    break;
                default:
                    if (!next.startsWith("CUSTOM")) {
                        String valueOf = String.valueOf(next);
                        Log.e("MotionPaths", valueOf.length() != 0 ? "UNKNOWN spline ".concat(valueOf) : new String("UNKNOWN spline "));
                        break;
                    } else {
                        String str = next.split(",")[1];
                        if (!this.f1857x.containsKey(str)) {
                            break;
                        } else {
                            C0424a aVar = this.f1857x.get(str);
                            if (!(cVar instanceof C3580c.C3582b)) {
                                float e = aVar.mo2933e();
                                String valueOf2 = String.valueOf(cVar);
                                StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 69 + String.valueOf(valueOf2).length());
                                sb.append(next);
                                sb.append(" ViewSpline not a CustomSet frame = ");
                                sb.append(i);
                                sb.append(", value");
                                sb.append(e);
                                sb.append(valueOf2);
                                Log.e("MotionPaths", sb.toString());
                                break;
                            } else {
                                ((C3580c.C3582b) cVar).mo12870i(i, aVar);
                                break;
                            }
                        }
                    }
            }
        }
    }

    /* renamed from: d */
    public void mo2565d(View view) {
        this.f1842i = view.getVisibility();
        this.f1840g = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            this.f1843j = view.getElevation();
        }
        this.f1844k = view.getRotation();
        this.f1845l = view.getRotationX();
        this.f1846m = view.getRotationY();
        this.f1847n = view.getScaleX();
        this.f1848o = view.getScaleY();
        this.f1849p = view.getPivotX();
        this.f1850q = view.getPivotY();
        this.f1851r = view.getTranslationX();
        this.f1852s = view.getTranslationY();
        if (i >= 21) {
            this.f1853t = view.getTranslationZ();
        }
    }

    /* renamed from: h */
    public void mo2566h(C0430c.C0431a aVar) {
        float f;
        C0430c.C0435d dVar = aVar.f2327c;
        int i = dVar.f2430c;
        this.f1841h = i;
        int i2 = dVar.f2429b;
        this.f1842i = i2;
        if (i2 == 0 || i != 0) {
            f = dVar.f2431d;
        } else {
            f = 0.0f;
        }
        this.f1840g = f;
        C0430c.C0436e eVar = aVar.f2330f;
        boolean z = eVar.f2446m;
        this.f1843j = eVar.f2447n;
        this.f1844k = eVar.f2435b;
        this.f1845l = eVar.f2436c;
        this.f1846m = eVar.f2437d;
        this.f1847n = eVar.f2438e;
        this.f1848o = eVar.f2439f;
        this.f1849p = eVar.f2440g;
        this.f1850q = eVar.f2441h;
        this.f1851r = eVar.f2443j;
        this.f1852s = eVar.f2444k;
        this.f1853t = eVar.f2445l;
        C3500c.m15017c(aVar.f2328d.f2417d);
        C0430c.C0434c cVar = aVar.f2328d;
        this.f1855v = cVar.f2422i;
        int i3 = cVar.f2419f;
        int i4 = cVar.f2415b;
        this.f1856w = aVar.f2327c.f2432e;
        for (String next : aVar.f2331g.keySet()) {
            C0424a aVar2 = aVar.f2331g.get(next);
            if (aVar2.mo2935g()) {
                this.f1857x.put(next, aVar2);
            }
        }
    }

    /* renamed from: j */
    public int compareTo(C0395m mVar) {
        return Float.compare(this.f1854u, mVar.f1854u);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo2568l(C0395m mVar, HashSet<String> hashSet) {
        if (m2422k(this.f1840g, mVar.f1840g)) {
            hashSet.add("alpha");
        }
        if (m2422k(this.f1843j, mVar.f1843j)) {
            hashSet.add("elevation");
        }
        int i = this.f1842i;
        int i2 = mVar.f1842i;
        if (i != i2 && this.f1841h == 0 && (i == 0 || i2 == 0)) {
            hashSet.add("alpha");
        }
        if (m2422k(this.f1844k, mVar.f1844k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f1855v) || !Float.isNaN(mVar.f1855v)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f1856w) || !Float.isNaN(mVar.f1856w)) {
            hashSet.add("progress");
        }
        if (m2422k(this.f1845l, mVar.f1845l)) {
            hashSet.add("rotationX");
        }
        if (m2422k(this.f1846m, mVar.f1846m)) {
            hashSet.add("rotationY");
        }
        if (m2422k(this.f1849p, mVar.f1849p)) {
            hashSet.add("transformPivotX");
        }
        if (m2422k(this.f1850q, mVar.f1850q)) {
            hashSet.add("transformPivotY");
        }
        if (m2422k(this.f1847n, mVar.f1847n)) {
            hashSet.add("scaleX");
        }
        if (m2422k(this.f1848o, mVar.f1848o)) {
            hashSet.add("scaleY");
        }
        if (m2422k(this.f1851r, mVar.f1851r)) {
            hashSet.add("translationX");
        }
        if (m2422k(this.f1852s, mVar.f1852s)) {
            hashSet.add("translationY");
        }
        if (m2422k(this.f1853t, mVar.f1853t)) {
            hashSet.add("translationZ");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo2569o(float f, float f2, float f3, float f4) {
    }

    /* renamed from: p */
    public void mo2570p(Rect rect, View view, int i, float f) {
        mo2569o((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        mo2565d(view);
        this.f1849p = Float.NaN;
        this.f1850q = Float.NaN;
        if (i == 1) {
            this.f1844k = f - 90.0f;
        } else if (i == 2) {
            this.f1844k = f + 90.0f;
        }
    }

    /* renamed from: q */
    public void mo2571q(Rect rect, C0430c cVar, int i, int i2) {
        mo2569o((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        mo2566h(cVar.mo2968z(i2));
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.f1844k + 90.0f;
            this.f1844k = f;
            if (f > 180.0f) {
                this.f1844k = f - 360.0f;
                return;
            }
            return;
        }
        this.f1844k -= 90.0f;
    }

    /* renamed from: r */
    public void mo2572r(View view) {
        mo2569o(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        mo2565d(view);
    }
}
