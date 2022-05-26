package kotlinx.coroutines;

import kotlinx.coroutines.p400h3.C8780b;
import p369i.p379w.C8508d;
import p369i.p379w.C8509e;
import p369i.p379w.C8513g;
import p369i.p379w.p381j.p382a.C8532e;

/* renamed from: kotlinx.coroutines.l0 */
/* compiled from: CoroutineContext.kt */
public final class C8869l0 {

    /* renamed from: a */
    private static final boolean f35270a;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r0.equals("on") != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r0.equals(p453me.zhanghai.android.materialprogressbar.BuildConfig.FLAVOR) != false) goto L_0x0053;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = kotlinx.coroutines.internal.C8811a0.m47508d(r0)
            if (r0 == 0) goto L_0x0053
            int r1 = r0.hashCode()
            if (r1 == 0) goto L_0x002a
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L_0x0021
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L_0x0033
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0033
            r0 = 0
            goto L_0x0054
        L_0x0021:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0033
            goto L_0x0053
        L_0x002a:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0033
            goto L_0x0053
        L_0x0033:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0053:
            r0 = 1
        L_0x0054:
            f35270a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C8869l0.<clinit>():void");
    }

    /* renamed from: a */
    public static final C8876m0 m47692a() {
        return f35270a ? C8780b.f35147m : C8934z.f35320h;
    }

    /* renamed from: b */
    public static final String m47693b(C8513g gVar) {
        C8890p0 p0Var;
        String N0;
        if (!C8919v0.m47826c() || (p0Var = (C8890p0) gVar.get(C8890p0.f35285h)) == null) {
            return null;
        }
        C8895q0 q0Var = (C8895q0) gVar.get(C8895q0.f35287h);
        String str = "coroutine";
        if (!(q0Var == null || (N0 = q0Var.mo31221N0()) == null)) {
            str = N0;
        }
        return str + '#' + p0Var.mo31209N0();
    }

    /* renamed from: c */
    public static final C8513g m47694c(C8902r0 r0Var, C8513g gVar) {
        C8513g plus = r0Var.mo4135x().plus(gVar);
        C8513g plus2 = C8919v0.m47826c() ? plus.plus(new C8890p0(C8919v0.m47825b().incrementAndGet())) : plus;
        return (plus == C8768g1.m47301a() || plus.get(C8509e.f34913d) != null) ? plus2 : plus2.plus(C8768g1.m47301a());
    }

    /* renamed from: d */
    public static final C8678b3<?> m47695d(C8532e eVar) {
        while (!(eVar instanceof C8681c1) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof C8678b3) {
                return (C8678b3) eVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final C8678b3<?> m47696e(C8508d<?> dVar, C8513g gVar, Object obj) {
        if (!(dVar instanceof C8532e)) {
            return null;
        }
        if (!(gVar.get(C8683c3.f35046g) != null)) {
            return null;
        }
        C8678b3<?> d = m47695d((C8532e) dVar);
        if (d != null) {
            d.mo30887D0(gVar, obj);
        }
        return d;
    }
}
