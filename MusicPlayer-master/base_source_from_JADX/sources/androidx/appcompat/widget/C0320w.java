package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.content.C0506a;
import androidx.core.graphics.drawable.C0534a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p082e.p083a.p086l.p087a.C3412a;
import p082e.p083a.p088m.C3428a;
import p082e.p098e.C3470d;
import p082e.p098e.C3471e;
import p082e.p098e.C3478g;
import p082e.p098e.C3479h;
import p082e.p154x.p155a.p156a.C4237c;
import p082e.p154x.p155a.p156a.C4247i;

/* renamed from: androidx.appcompat.widget.w */
/* compiled from: ResourceManagerInternal */
public final class C0320w {

    /* renamed from: h */
    private static final PorterDuff.Mode f1432h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i */
    private static C0320w f1433i;

    /* renamed from: j */
    private static final C0323c f1434j = new C0323c(6);

    /* renamed from: a */
    private WeakHashMap<Context, C3479h<ColorStateList>> f1435a;

    /* renamed from: b */
    private C3478g<String, C0324d> f1436b;

    /* renamed from: c */
    private C3479h<String> f1437c;

    /* renamed from: d */
    private final WeakHashMap<Context, C3470d<WeakReference<Drawable.ConstantState>>> f1438d = new WeakHashMap<>(0);

    /* renamed from: e */
    private TypedValue f1439e;

    /* renamed from: f */
    private boolean f1440f;

    /* renamed from: g */
    private C0325e f1441g;

    /* renamed from: androidx.appcompat.widget.w$a */
    /* compiled from: ResourceManagerInternal */
    static class C0321a implements C0324d {
        C0321a() {
        }

        /* renamed from: a */
        public Drawable mo2155a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C3412a.m14547m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.w$b */
    /* compiled from: ResourceManagerInternal */
    private static class C0322b implements C0324d {
        C0322b() {
        }

        /* renamed from: a */
        public Drawable mo2155a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C4237c.m18628a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.w$c */
    /* compiled from: ResourceManagerInternal */
    private static class C0323c extends C3471e<Integer, PorterDuffColorFilter> {
        public C0323c(int i) {
            super(i);
        }

        /* renamed from: i */
        private static int m1901i(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public PorterDuffColorFilter mo2156j(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) mo12318d(Integer.valueOf(m1901i(i, mode)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public PorterDuffColorFilter mo2157k(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo12319e(Integer.valueOf(m1901i(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: androidx.appcompat.widget.w$d */
    /* compiled from: ResourceManagerInternal */
    private interface C0324d {
        /* renamed from: a */
        Drawable mo2155a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.w$e */
    /* compiled from: ResourceManagerInternal */
    interface C0325e {
        /* renamed from: a */
        boolean mo1970a(Context context, int i, Drawable drawable);

        /* renamed from: b */
        PorterDuff.Mode mo1971b(int i);

        /* renamed from: c */
        Drawable mo1972c(C0320w wVar, Context context, int i);

        /* renamed from: d */
        ColorStateList mo1973d(Context context, int i);

        /* renamed from: e */
        boolean mo1974e(Context context, int i, Drawable drawable);
    }

    /* renamed from: androidx.appcompat.widget.w$f */
    /* compiled from: ResourceManagerInternal */
    private static class C0326f implements C0324d {
        C0326f() {
        }

        /* renamed from: a */
        public Drawable mo2155a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C4247i.m18661c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private void m1875a(String str, C0324d dVar) {
        if (this.f1436b == null) {
            this.f1436b = new C3478g<>();
        }
        this.f1436b.put(str, dVar);
    }

    /* renamed from: b */
    private synchronized boolean m1876b(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        C3470d dVar = this.f1438d.get(context);
        if (dVar == null) {
            dVar = new C3470d();
            this.f1438d.put(context, dVar);
        }
        dVar.mo12309m(j, new WeakReference(constantState));
        return true;
    }

    /* renamed from: c */
    private void m1877c(Context context, int i, ColorStateList colorStateList) {
        if (this.f1435a == null) {
            this.f1435a = new WeakHashMap<>();
        }
        C3479h hVar = this.f1435a.get(context);
        if (hVar == null) {
            hVar = new C3479h();
            this.f1435a.put(context, hVar);
        }
        hVar.mo12405a(i, colorStateList);
    }

    /* renamed from: d */
    private void m1878d(Context context) {
        if (!this.f1440f) {
            this.f1440f = true;
            Drawable j = mo2147j(context, C3428a.abc_vector_test);
            if (j == null || !m1887q(j)) {
                this.f1440f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: e */
    private static long m1879e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: f */
    private Drawable m1880f(Context context, int i) {
        Drawable drawable;
        if (this.f1439e == null) {
            this.f1439e = new TypedValue();
        }
        TypedValue typedValue = this.f1439e;
        context.getResources().getValue(i, typedValue, true);
        long e = m1879e(typedValue);
        Drawable i2 = m1883i(context, e);
        if (i2 != null) {
            return i2;
        }
        C0325e eVar = this.f1441g;
        if (eVar == null) {
            drawable = null;
        } else {
            drawable = eVar.mo1972c(this, context, i);
        }
        if (drawable != null) {
            drawable.setChangingConfigurations(typedValue.changingConfigurations);
            m1876b(context, e, drawable);
        }
        return drawable;
    }

    /* renamed from: g */
    private static PorterDuffColorFilter m1881g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m1884l(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: h */
    public static synchronized C0320w m1882h() {
        C0320w wVar;
        synchronized (C0320w.class) {
            if (f1433i == null) {
                C0320w wVar2 = new C0320w();
                f1433i = wVar2;
                m1886p(wVar2);
            }
            wVar = f1433i;
        }
        return wVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable m1883i(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, e.e.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1438d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            e.e.d r0 = (p082e.p098e.C3470d) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo12304h(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.mo12310n(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0320w.m1883i(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: l */
    public static synchronized PorterDuffColorFilter m1884l(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter j;
        synchronized (C0320w.class) {
            C0323c cVar = f1434j;
            j = cVar.mo2156j(i, mode);
            if (j == null) {
                j = new PorterDuffColorFilter(i, mode);
                cVar.mo2157k(i, mode, j);
            }
        }
        return j;
    }

    /* renamed from: n */
    private ColorStateList m1885n(Context context, int i) {
        C3479h hVar;
        WeakHashMap<Context, C3479h<ColorStateList>> weakHashMap = this.f1435a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) hVar.mo12409f(i);
    }

    /* renamed from: p */
    private static void m1886p(C0320w wVar) {
        if (Build.VERSION.SDK_INT < 24) {
            wVar.m1875a("vector", new C0326f());
            wVar.m1875a("animated-vector", new C0322b());
            wVar.m1875a("animated-selector", new C0321a());
        }
    }

    /* renamed from: q */
    private static boolean m1887q(Drawable drawable) {
        return (drawable instanceof C4247i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m1888r(android.content.Context r11, int r12) {
        /*
            r10 = this;
            e.e.g<java.lang.String, androidx.appcompat.widget.w$d> r0 = r10.f1436b
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            e.e.h<java.lang.String> r0 = r10.f1437c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.mo12409f(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            e.e.g<java.lang.String, androidx.appcompat.widget.w$d> r3 = r10.f1436b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            e.e.h r0 = new e.e.h
            r0.<init>()
            r10.f1437c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f1439e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f1439e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f1439e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = m1879e(r0)
            android.graphics.drawable.Drawable r6 = r10.m1883i(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00aa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            e.e.h<java.lang.String> r8 = r10.f1437c     // Catch:{ Exception -> 0x00a2 }
            r8.mo12405a(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            e.e.g<java.lang.String, androidx.appcompat.widget.w$d> r8 = r10.f1436b     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.appcompat.widget.w$d r3 = (androidx.appcompat.widget.C0320w.C0324d) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.mo2155a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00aa
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.m1876b(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00aa
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00aa:
            if (r6 != 0) goto L_0x00b1
            e.e.h<java.lang.String> r11 = r10.f1437c
            r11.mo12405a(r12, r2)
        L_0x00b1:
            return r6
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0320w.m1888r(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: v */
    private Drawable m1889v(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList m = mo2149m(context, i);
        if (m != null) {
            if (C0303p.m1828a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r = C0534a.m3292r(drawable);
            C0534a.m3289o(r, m);
            PorterDuff.Mode o = mo2150o(i);
            if (o == null) {
                return r;
            }
            C0534a.m3290p(r, o);
            return r;
        }
        C0325e eVar = this.f1441g;
        if ((eVar == null || !eVar.mo1974e(context, i, drawable)) && !mo2154x(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* renamed from: w */
    static void m1890w(Drawable drawable, C0274e0 e0Var, int[] iArr) {
        if (!C0303p.m1828a(drawable) || drawable.mutate() == drawable) {
            boolean z = e0Var.f1282d;
            if (z || e0Var.f1281c) {
                drawable.setColorFilter(m1881g(z ? e0Var.f1279a : null, e0Var.f1281c ? e0Var.f1280b : f1432h, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: j */
    public synchronized Drawable mo2147j(Context context, int i) {
        return mo2148k(context, i, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized Drawable mo2148k(Context context, int i, boolean z) {
        Drawable r;
        m1878d(context);
        r = m1888r(context, i);
        if (r == null) {
            r = m1880f(context, i);
        }
        if (r == null) {
            r = C0506a.m3152d(context, i);
        }
        if (r != null) {
            r = m1889v(context, i, z, r);
        }
        if (r != null) {
            C0303p.m1829b(r);
        }
        return r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public synchronized ColorStateList mo2149m(Context context, int i) {
        ColorStateList n;
        n = m1885n(context, i);
        if (n == null) {
            C0325e eVar = this.f1441g;
            n = eVar == null ? null : eVar.mo1973d(context, i);
            if (n != null) {
                m1877c(context, i, n);
            }
        }
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public PorterDuff.Mode mo2150o(int i) {
        C0325e eVar = this.f1441g;
        if (eVar == null) {
            return null;
        }
        return eVar.mo1971b(i);
    }

    /* renamed from: s */
    public synchronized void mo2151s(Context context) {
        C3470d dVar = this.f1438d.get(context);
        if (dVar != null) {
            dVar.mo12299b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public synchronized Drawable mo2152t(Context context, C0294l0 l0Var, int i) {
        Drawable r = m1888r(context, i);
        if (r == null) {
            r = l0Var.mo2086d(i);
        }
        if (r == null) {
            return null;
        }
        return m1889v(context, i, false, r);
    }

    /* renamed from: u */
    public synchronized void mo2153u(C0325e eVar) {
        this.f1441g = eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo2154x(Context context, int i, Drawable drawable) {
        C0325e eVar = this.f1441g;
        return eVar != null && eVar.mo1970a(context, i, drawable);
    }
}
