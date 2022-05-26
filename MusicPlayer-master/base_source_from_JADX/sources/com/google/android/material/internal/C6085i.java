package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import p082e.p109h.p118o.C3703i;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.material.internal.i */
/* compiled from: StaticLayoutBuilderCompat */
final class C6085i {

    /* renamed from: n */
    static final int f28511n = (Build.VERSION.SDK_INT >= 23 ? 1 : 0);

    /* renamed from: o */
    private static boolean f28512o;

    /* renamed from: p */
    private static Constructor<StaticLayout> f28513p;

    /* renamed from: q */
    private static Object f28514q;

    /* renamed from: a */
    private CharSequence f28515a;

    /* renamed from: b */
    private final TextPaint f28516b;

    /* renamed from: c */
    private final int f28517c;

    /* renamed from: d */
    private int f28518d = 0;

    /* renamed from: e */
    private int f28519e;

    /* renamed from: f */
    private Layout.Alignment f28520f;

    /* renamed from: g */
    private int f28521g;

    /* renamed from: h */
    private float f28522h;

    /* renamed from: i */
    private float f28523i;

    /* renamed from: j */
    private int f28524j;

    /* renamed from: k */
    private boolean f28525k;

    /* renamed from: l */
    private boolean f28526l;

    /* renamed from: m */
    private TextUtils.TruncateAt f28527m;

    /* renamed from: com.google.android.material.internal.i$a */
    /* compiled from: StaticLayoutBuilderCompat */
    static class C6086a extends Exception {
        C6086a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    private C6085i(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f28515a = charSequence;
        this.f28516b = textPaint;
        this.f28517c = i;
        this.f28519e = charSequence.length();
        this.f28520f = Layout.Alignment.ALIGN_NORMAL;
        this.f28521g = Integer.MAX_VALUE;
        this.f28522h = 0.0f;
        this.f28523i = 1.0f;
        this.f28524j = f28511n;
        this.f28525k = true;
        this.f28527m = null;
    }

    /* renamed from: b */
    private void m36529b() throws C6086a {
        Class cls;
        if (!f28512o) {
            try {
                boolean z = this.f28526l && Build.VERSION.SDK_INT >= 23;
                if (Build.VERSION.SDK_INT >= 18) {
                    cls = TextDirectionHeuristic.class;
                    f28514q = z ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                } else {
                    ClassLoader classLoader = C6085i.class.getClassLoader();
                    String str = this.f28526l ? "RTL" : "LTR";
                    Class<?> loadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                    Class<?> loadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                    f28514q = loadClass2.getField(str).get(loadClass2);
                    cls = loadClass;
                }
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2});
                f28513p = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f28512o = true;
            } catch (Exception e) {
                throw new C6086a(e);
            }
        }
    }

    /* renamed from: c */
    public static C6085i m36530c(CharSequence charSequence, TextPaint textPaint, int i) {
        return new C6085i(charSequence, textPaint, i);
    }

    /* renamed from: a */
    public StaticLayout mo24207a() throws C6086a {
        if (this.f28515a == null) {
            this.f28515a = BuildConfig.FLAVOR;
        }
        int max = Math.max(0, this.f28517c);
        CharSequence charSequence = this.f28515a;
        if (this.f28521g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f28516b, (float) max, this.f28527m);
        }
        int min = Math.min(charSequence.length(), this.f28519e);
        this.f28519e = min;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.f28526l && this.f28521g == 1) {
                this.f28520f = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f28518d, min, this.f28516b, max);
            obtain.setAlignment(this.f28520f);
            obtain.setIncludePad(this.f28525k);
            obtain.setTextDirection(this.f28526l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.f28527m;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f28521g);
            float f = this.f28522h;
            if (!(f == 0.0f && this.f28523i == 1.0f)) {
                obtain.setLineSpacing(f, this.f28523i);
            }
            if (this.f28521g > 1) {
                obtain.setHyphenationFrequency(this.f28524j);
            }
            return obtain.build();
        }
        m36529b();
        try {
            Constructor<StaticLayout> constructor = f28513p;
            C3703i.m15827d(constructor);
            Object obj = f28514q;
            C3703i.m15827d(obj);
            return (StaticLayout) constructor.newInstance(new Object[]{charSequence, Integer.valueOf(this.f28518d), Integer.valueOf(this.f28519e), this.f28516b, Integer.valueOf(max), this.f28520f, obj, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f28525k), null, Integer.valueOf(max), Integer.valueOf(this.f28521g)});
        } catch (Exception e) {
            throw new C6086a(e);
        }
    }

    /* renamed from: d */
    public C6085i mo24208d(Layout.Alignment alignment) {
        this.f28520f = alignment;
        return this;
    }

    /* renamed from: e */
    public C6085i mo24209e(TextUtils.TruncateAt truncateAt) {
        this.f28527m = truncateAt;
        return this;
    }

    /* renamed from: f */
    public C6085i mo24210f(int i) {
        this.f28524j = i;
        return this;
    }

    /* renamed from: g */
    public C6085i mo24211g(boolean z) {
        this.f28525k = z;
        return this;
    }

    /* renamed from: h */
    public C6085i mo24212h(boolean z) {
        this.f28526l = z;
        return this;
    }

    /* renamed from: i */
    public C6085i mo24213i(float f, float f2) {
        this.f28522h = f;
        this.f28523i = f2;
        return this;
    }

    /* renamed from: j */
    public C6085i mo24214j(int i) {
        this.f28521g = i;
        return this;
    }
}
