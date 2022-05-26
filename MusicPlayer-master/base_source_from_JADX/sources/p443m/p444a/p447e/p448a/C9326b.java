package p443m.p444a.p447e.p448a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.graphics.drawable.C0534a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p082e.p083a.C3400a;
import p082e.p083a.C3402c;
import p082e.p083a.C3404e;
import p082e.p098e.C3465a;
import p082e.p098e.C3470d;
import p082e.p098e.C3471e;
import p082e.p109h.p110h.C3621a;
import p082e.p154x.p155a.p156a.C4237c;
import p082e.p154x.p155a.p156a.C4247i;

/* renamed from: m.a.e.a.b */
/* compiled from: SkinCompatDrawableManager */
final class C9326b {

    /* renamed from: h */
    private static final String f36066h = "b";

    /* renamed from: i */
    private static final PorterDuff.Mode f36067i = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    private static C9326b f36068j;

    /* renamed from: k */
    private static final C9328b f36069k = new C9328b(6);

    /* renamed from: l */
    private static final int[] f36070l = {C3404e.abc_textfield_search_default_mtrl_alpha, C3404e.abc_textfield_default_mtrl_alpha, C3404e.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: m */
    private static final int[] f36071m = {C3404e.abc_ic_commit_search_api_mtrl_alpha, C3404e.abc_seekbar_tick_mark_material, C3404e.abc_ic_menu_share_mtrl_alpha, C3404e.abc_ic_menu_copy_mtrl_am_alpha, C3404e.abc_ic_menu_cut_mtrl_alpha, C3404e.abc_ic_menu_selectall_mtrl_alpha, C3404e.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: n */
    private static final int[] f36072n = {C3404e.abc_textfield_activated_mtrl_alpha, C3404e.abc_textfield_search_activated_mtrl_alpha, C3404e.abc_cab_background_top_mtrl_alpha, C3404e.abc_text_cursor_material, C3404e.abc_text_select_handle_left_mtrl_dark, C3404e.abc_text_select_handle_middle_mtrl_dark, C3404e.abc_text_select_handle_right_mtrl_dark, C3404e.abc_text_select_handle_left_mtrl_light, C3404e.abc_text_select_handle_middle_mtrl_light, C3404e.abc_text_select_handle_right_mtrl_light};

    /* renamed from: o */
    private static final int[] f36073o = {C3404e.abc_popup_background_mtrl_mult, C3404e.abc_cab_background_internal_bg, C3404e.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: p */
    private static final int[] f36074p = {C3404e.abc_tab_indicator_material, C3404e.abc_textfield_search_material};

    /* renamed from: q */
    private static final int[] f36075q = {C3404e.abc_btn_check_material, C3404e.abc_btn_radio_material};

    /* renamed from: a */
    private WeakHashMap<Context, SparseArray<ColorStateList>> f36076a;

    /* renamed from: b */
    private C3465a<String, C9329c> f36077b;

    /* renamed from: c */
    private SparseArray<String> f36078c;

    /* renamed from: d */
    private final Object f36079d = new Object();

    /* renamed from: e */
    private final WeakHashMap<Context, C3470d<WeakReference<Drawable.ConstantState>>> f36080e = new WeakHashMap<>(0);

    /* renamed from: f */
    private TypedValue f36081f;

    /* renamed from: g */
    private boolean f36082g;

    @TargetApi(11)
    /* renamed from: m.a.e.a.b$a */
    /* compiled from: SkinCompatDrawableManager */
    private static class C9327a implements C9329c {
        C9327a() {
        }

        @SuppressLint({"NewApi"})
        /* renamed from: a */
        public Drawable mo32319a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C4237c.m18628a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: m.a.e.a.b$b */
    /* compiled from: SkinCompatDrawableManager */
    private static class C9328b extends C3471e<Integer, PorterDuffColorFilter> {
        public C9328b(int i) {
            super(i);
        }

        /* renamed from: i */
        private static int m49397i(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public PorterDuffColorFilter mo32320j(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) mo12318d(Integer.valueOf(m49397i(i, mode)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public PorterDuffColorFilter mo32321k(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo12319e(Integer.valueOf(m49397i(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: m.a.e.a.b$c */
    /* compiled from: SkinCompatDrawableManager */
    private interface C9329c {
        /* renamed from: a */
        Drawable mo32319a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: m.a.e.a.b$d */
    /* compiled from: SkinCompatDrawableManager */
    private static class C9330d implements C9329c {
        C9330d() {
        }

        @SuppressLint({"NewApi"})
        /* renamed from: a */
        public Drawable mo32319a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C4247i.m18661c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    C9326b() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f A[RETURN] */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m49369A(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = f36067i
            int[] r1 = f36070l
            boolean r1 = m49373d(r1, r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0015
            int r2 = p082e.p083a.C3400a.colorControlNormal
        L_0x0012:
            r7 = -1
        L_0x0013:
            r1 = 1
            goto L_0x0042
        L_0x0015:
            int[] r1 = f36072n
            boolean r1 = m49373d(r1, r7)
            if (r1 == 0) goto L_0x0020
            int r2 = p082e.p083a.C3400a.colorControlActivated
            goto L_0x0012
        L_0x0020:
            int[] r1 = f36073o
            boolean r1 = m49373d(r1, r7)
            if (r1 == 0) goto L_0x002b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0012
        L_0x002b:
            int r1 = p082e.p083a.C3404e.abc_list_divider_mtrl_alpha
            if (r7 != r1) goto L_0x003a
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            goto L_0x0013
        L_0x003a:
            int r1 = p082e.p083a.C3404e.abc_dialog_material_background
            if (r7 != r1) goto L_0x003f
            goto L_0x0012
        L_0x003f:
            r7 = -1
            r1 = 0
            r2 = 0
        L_0x0042:
            if (r1 == 0) goto L_0x005f
            boolean r1 = p443m.p444a.p447e.p448a.C9331c.m49402a(r8)
            if (r1 == 0) goto L_0x004e
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L_0x004e:
            int r6 = p443m.p444a.p447e.p448a.C9333e.m49426c(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = m49384r(r6, r0)
            r8.setColorFilter(r6)
            if (r7 == r3) goto L_0x005e
            r8.setAlpha(r7)
        L_0x005e:
            return r5
        L_0x005f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p443m.p444a.p447e.p448a.C9326b.m49369A(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    /* renamed from: a */
    private void m49370a(String str, C9329c cVar) {
        if (this.f36077b == null) {
            this.f36077b = new C3465a<>();
        }
        this.f36077b.put(str, cVar);
    }

    /* renamed from: b */
    private boolean m49371b(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        synchronized (this.f36079d) {
            C3470d dVar = this.f36080e.get(context);
            if (dVar == null) {
                dVar = new C3470d();
                this.f36080e.put(context, dVar);
            }
            dVar.mo12309m(j, new WeakReference(constantState));
        }
        return true;
    }

    /* renamed from: c */
    private void m49372c(Context context, int i, ColorStateList colorStateList) {
        if (this.f36076a == null) {
            this.f36076a = new WeakHashMap<>();
        }
        SparseArray sparseArray = this.f36076a.get(context);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            this.f36076a.put(context, sparseArray);
        }
        sparseArray.append(i, colorStateList);
    }

    /* renamed from: d */
    private static boolean m49373d(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private void m49374e(Context context) {
        if (!this.f36082g) {
            this.f36082g = true;
            Drawable p = mo32316p(context, C3404e.abc_vector_test);
            if (p == null || !m49388w(p)) {
                this.f36082g = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: g */
    private ColorStateList m49375g(Context context) {
        return m49376h(context, 0);
    }

    /* renamed from: h */
    private ColorStateList m49376h(Context context, int i) {
        int c = C9333e.m49426c(context, C3400a.colorControlHighlight);
        int a = C9333e.m49424a(context, C3400a.colorButtonNormal);
        return new ColorStateList(new int[][]{C9333e.f36091b, C9333e.f36100k, C9333e.f36094e, C9333e.f36103n}, new int[]{a, C3621a.m15591i(c, i), C3621a.m15591i(c, i), i});
    }

    /* renamed from: i */
    private static long m49377i(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: j */
    private ColorStateList m49378j(Context context) {
        return m49376h(context, C9333e.m49426c(context, C3400a.colorAccent));
    }

    /* renamed from: k */
    private ColorStateList m49379k(Context context) {
        return m49376h(context, C9333e.m49426c(context, C3400a.colorButtonNormal));
    }

    /* renamed from: l */
    private Drawable m49380l(Context context, int i) {
        if (this.f36081f == null) {
            this.f36081f = new TypedValue();
        }
        TypedValue typedValue = this.f36081f;
        C9332d.m49414n(context, i, typedValue, true);
        long i2 = m49377i(typedValue);
        Drawable o = m49383o(context, i2);
        if (o != null) {
            return o;
        }
        if (i == C3404e.abc_cab_background_top_material) {
            o = new LayerDrawable(new Drawable[]{mo32316p(context, C3404e.abc_cab_background_internal_bg), mo32316p(context, C3404e.abc_cab_background_top_mtrl_alpha)});
        }
        if (o != null) {
            o.setChangingConfigurations(typedValue.changingConfigurations);
            m49371b(context, i2, o);
        }
        return o;
    }

    /* renamed from: m */
    private ColorStateList m49381m(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        int i = C3400a.colorSwitchThumbNormal;
        ColorStateList e = C9333e.m49428e(context, i);
        if (e == null || !e.isStateful()) {
            iArr[0] = C9333e.f36091b;
            iArr2[0] = C9333e.m49424a(context, i);
            iArr[1] = C9333e.f36101l;
            iArr2[1] = C9333e.m49426c(context, C3400a.colorControlActivated);
            iArr[2] = C9333e.f36103n;
            iArr2[2] = C9333e.m49426c(context, i);
        } else {
            iArr[0] = C9333e.f36091b;
            iArr2[0] = e.getColorForState(iArr[0], 0);
            iArr[1] = C9333e.f36101l;
            iArr2[1] = C9333e.m49426c(context, C3400a.colorControlActivated);
            iArr[2] = C9333e.f36103n;
            iArr2[2] = e.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: n */
    public static C9326b m49382n() {
        if (f36068j == null) {
            C9326b bVar = new C9326b();
            f36068j = bVar;
            m49387v(bVar);
        }
        return f36068j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        return null;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m49383o(android.content.Context r5, long r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f36079d
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, e.e.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r1 = r4.f36080e     // Catch:{ all -> 0x002f }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x002f }
            e.e.d r1 = (p082e.p098e.C3470d) r1     // Catch:{ all -> 0x002f }
            r2 = 0
            if (r1 != 0) goto L_0x0010
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return r2
        L_0x0010:
            java.lang.Object r3 = r1.mo12304h(r6)     // Catch:{ all -> 0x002f }
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x002d
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x002f }
            android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x002a
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ all -> 0x002f }
            android.graphics.drawable.Drawable r5 = r3.newDrawable(r5)     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return r5
        L_0x002a:
            r1.mo12303f(r6)     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return r2
        L_0x002f:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p443m.p444a.p447e.p448a.C9326b.m49383o(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: r */
    public static PorterDuffColorFilter m49384r(int i, PorterDuff.Mode mode) {
        C9328b bVar = f36069k;
        PorterDuffColorFilter j = bVar.mo32320j(i, mode);
        if (j != null) {
            return j;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        bVar.mo32321k(i, mode, porterDuffColorFilter);
        return porterDuffColorFilter;
    }

    /* renamed from: t */
    private ColorStateList m49385t(Context context, int i) {
        SparseArray sparseArray;
        WeakHashMap<Context, SparseArray<ColorStateList>> weakHashMap = this.f36076a;
        if (weakHashMap == null || (sparseArray = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) sparseArray.get(i);
    }

    /* renamed from: u */
    static PorterDuff.Mode m49386u(int i) {
        if (i == C3404e.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    /* renamed from: v */
    private static void m49387v(C9326b bVar) {
        if (Build.VERSION.SDK_INT < 24) {
            bVar.m49370a("vector", new C9330d());
            bVar.m49370a("animated-vector", new C9327a());
        }
    }

    /* renamed from: w */
    private static boolean m49388w(Drawable drawable) {
        return (drawable instanceof C4247i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f A[Catch:{ Exception -> 0x009a }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0092 A[Catch:{ Exception -> 0x009a }] */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m49389x(android.content.Context r12, int r13) {
        /*
            r11 = this;
            e.e.a<java.lang.String, m.a.e.a.b$c> r0 = r11.f36077b
            r1 = 0
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00aa
            android.util.SparseArray<java.lang.String> r0 = r11.f36078c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.get(r13)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            e.e.a<java.lang.String, m.a.e.a.b$c> r3 = r11.f36077b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r11.f36078c = r0
        L_0x002f:
            android.util.TypedValue r0 = r11.f36081f
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r11.f36081f = r0
        L_0x003a:
            android.util.TypedValue r0 = r11.f36081f
            r3 = 1
            p443m.p444a.p447e.p448a.C9332d.m49414n(r12, r13, r0, r3)
            long r4 = m49377i(r0)
            android.graphics.drawable.Drawable r6 = r11.m49383o(r12, r4)
            if (r6 == 0) goto L_0x004b
            return r6
        L_0x004b:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00a2
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00a2
            android.content.res.XmlResourceParser r7 = p443m.p444a.p447e.p448a.C9332d.m49415o(r12, r13)     // Catch:{ Exception -> 0x009a }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r7)     // Catch:{ Exception -> 0x009a }
        L_0x0063:
            int r9 = r7.next()     // Catch:{ Exception -> 0x009a }
            r10 = 2
            if (r9 == r10) goto L_0x006d
            if (r9 == r3) goto L_0x006d
            goto L_0x0063
        L_0x006d:
            if (r9 != r10) goto L_0x0092
            java.lang.String r3 = r7.getName()     // Catch:{ Exception -> 0x009a }
            android.util.SparseArray<java.lang.String> r9 = r11.f36078c     // Catch:{ Exception -> 0x009a }
            r9.append(r13, r3)     // Catch:{ Exception -> 0x009a }
            e.e.a<java.lang.String, m.a.e.a.b$c> r9 = r11.f36077b     // Catch:{ Exception -> 0x009a }
            java.lang.Object r3 = r9.get(r3)     // Catch:{ Exception -> 0x009a }
            m.a.e.a.b$c r3 = (p443m.p444a.p447e.p448a.C9326b.C9329c) r3     // Catch:{ Exception -> 0x009a }
            if (r3 == 0) goto L_0x0087
            android.graphics.drawable.Drawable r1 = r3.mo32319a(r12, r7, r8, r1)     // Catch:{ Exception -> 0x009a }
            r6 = r1
        L_0x0087:
            if (r6 == 0) goto L_0x00a2
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x009a }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x009a }
            r11.m49371b(r12, r4, r6)     // Catch:{ Exception -> 0x009a }
            goto L_0x00a2
        L_0x0092:
            org.xmlpull.v1.XmlPullParserException r12 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x009a }
            java.lang.String r0 = "No start tag found"
            r12.<init>(r0)     // Catch:{ Exception -> 0x009a }
            throw r12     // Catch:{ Exception -> 0x009a }
        L_0x009a:
            r12 = move-exception
            java.lang.String r0 = f36066h
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r12)
        L_0x00a2:
            if (r6 != 0) goto L_0x00a9
            android.util.SparseArray<java.lang.String> r12 = r11.f36078c
            r12.append(r13, r2)
        L_0x00a9:
            return r6
        L_0x00aa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p443m.p444a.p447e.p448a.C9326b.m49389x(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: y */
    private static void m49390y(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (C9331c.m49402a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f36067i;
        }
        drawable.setColorFilter(m49384r(i, mode));
    }

    /* renamed from: z */
    private Drawable m49391z(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList s = mo32318s(context, i);
        if (s != null) {
            if (C9331c.m49402a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r = C0534a.m3292r(drawable);
            C0534a.m3289o(r, s);
            PorterDuff.Mode u = m49386u(i);
            if (u == null) {
                return r;
            }
            C0534a.m3290p(r, u);
            return r;
        } else if (i == C3404e.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
            int i2 = C3400a.colorControlNormal;
            int c = C9333e.m49426c(context, i2);
            PorterDuff.Mode mode = f36067i;
            m49390y(findDrawableByLayerId, c, mode);
            m49390y(layerDrawable.findDrawableByLayerId(16908303), C9333e.m49426c(context, i2), mode);
            m49390y(layerDrawable.findDrawableByLayerId(16908301), C9333e.m49426c(context, C3400a.colorControlActivated), mode);
            return drawable;
        } else if (i == C3404e.abc_ratingbar_material || i == C3404e.abc_ratingbar_indicator_material || i == C3404e.abc_ratingbar_small_material) {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
            int a = C9333e.m49424a(context, C3400a.colorControlNormal);
            PorterDuff.Mode mode2 = f36067i;
            m49390y(findDrawableByLayerId2, a, mode2);
            Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(16908303);
            int i3 = C3400a.colorControlActivated;
            m49390y(findDrawableByLayerId3, C9333e.m49426c(context, i3), mode2);
            m49390y(layerDrawable2.findDrawableByLayerId(16908301), C9333e.m49426c(context, i3), mode2);
            return drawable;
        } else if (m49369A(context, i, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo32315f() {
        this.f36080e.clear();
        SparseArray<String> sparseArray = this.f36078c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
        WeakHashMap<Context, SparseArray<ColorStateList>> weakHashMap = this.f36076a;
        if (weakHashMap != null) {
            weakHashMap.clear();
        }
        f36069k.mo12317c();
    }

    /* renamed from: p */
    public Drawable mo32316p(Context context, int i) {
        return mo32317q(context, i, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Drawable mo32317q(Context context, int i, boolean z) {
        m49374e(context);
        Drawable x = m49389x(context, i);
        if (x == null) {
            x = m49380l(context, i);
        }
        if (x == null) {
            x = C9332d.m49407d(context, i);
        }
        if (x != null) {
            x = m49391z(context, i, z, x);
        }
        if (x != null) {
            C9331c.m49403b(x);
        }
        return x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public ColorStateList mo32318s(Context context, int i) {
        ColorStateList t = m49385t(context, i);
        if (t == null) {
            if (i == C3404e.abc_edit_text_material) {
                t = C9332d.m49406c(context, C3402c.abc_tint_edittext);
            } else if (i == C3404e.abc_switch_track_mtrl_alpha) {
                t = C9332d.m49406c(context, C3402c.abc_tint_switch_track);
            } else if (i == C3404e.abc_switch_thumb_material) {
                t = m49381m(context);
            } else if (i == C3404e.abc_btn_default_mtrl_shape) {
                t = m49379k(context);
            } else if (i == C3404e.abc_btn_borderless_material) {
                t = m49375g(context);
            } else if (i == C3404e.abc_btn_colored_material) {
                t = m49378j(context);
            } else if (i == C3404e.abc_spinner_mtrl_am_alpha || i == C3404e.abc_spinner_textfield_background_material) {
                t = C9332d.m49406c(context, C3402c.abc_tint_spinner);
            } else if (m49373d(f36071m, i)) {
                t = C9333e.m49428e(context, C3400a.colorControlNormal);
            } else if (m49373d(f36074p, i)) {
                t = C9332d.m49406c(context, C3402c.abc_tint_default);
            } else if (m49373d(f36075q, i)) {
                t = C9332d.m49406c(context, C3402c.abc_tint_btn_checkable);
            } else if (i == C3404e.abc_seekbar_thumb_material) {
                t = C9332d.m49406c(context, C3402c.abc_tint_seek_thumb);
            }
            if (t != null) {
                m49372c(context, i, t);
            }
        }
        return t;
    }
}
