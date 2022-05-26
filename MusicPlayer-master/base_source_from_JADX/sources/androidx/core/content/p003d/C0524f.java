package androidx.core.content.p003d;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p082e.p109h.p118o.C3698d;
import p082e.p109h.p118o.C3703i;

/* renamed from: androidx.core.content.d.f */
/* compiled from: ResourcesCompat */
public final class C0524f {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f2711a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<C0526b, SparseArray<C0525a>> f2712b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f2713c = new Object();

    /* renamed from: androidx.core.content.d.f$a */
    /* compiled from: ResourcesCompat */
    private static class C0525a {

        /* renamed from: a */
        final ColorStateList f2714a;

        /* renamed from: b */
        final Configuration f2715b;

        C0525a(ColorStateList colorStateList, Configuration configuration) {
            this.f2714a = colorStateList;
            this.f2715b = configuration;
        }
    }

    /* renamed from: androidx.core.content.d.f$b */
    /* compiled from: ResourcesCompat */
    private static final class C0526b {

        /* renamed from: a */
        final Resources f2716a;

        /* renamed from: b */
        final Resources.Theme f2717b;

        C0526b(Resources resources, Resources.Theme theme) {
            this.f2716a = resources;
            this.f2717b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0526b.class != obj.getClass()) {
                return false;
            }
            C0526b bVar = (C0526b) obj;
            if (!this.f2716a.equals(bVar.f2716a) || !C3698d.m15814a(this.f2717b, bVar.f2717b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C3698d.m15815b(this.f2716a, this.f2717b);
        }
    }

    /* renamed from: androidx.core.content.d.f$c */
    /* compiled from: ResourcesCompat */
    public static abstract class C0527c {

        /* renamed from: androidx.core.content.d.f$c$a */
        /* compiled from: ResourcesCompat */
        class C0528a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ Typeface f2718g;

            C0528a(Typeface typeface) {
                this.f2718g = typeface;
            }

            public void run() {
                C0527c.this.mo2085e(this.f2718g);
            }
        }

        /* renamed from: androidx.core.content.d.f$c$b */
        /* compiled from: ResourcesCompat */
        class C0529b implements Runnable {

            /* renamed from: g */
            final /* synthetic */ int f2720g;

            C0529b(int i) {
                this.f2720g = i;
            }

            public void run() {
                C0527c.this.mo2084d(this.f2720g);
            }
        }

        /* renamed from: c */
        public static Handler m3234c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* renamed from: a */
        public final void mo3289a(int i, Handler handler) {
            m3234c(handler).post(new C0529b(i));
        }

        /* renamed from: b */
        public final void mo3290b(Typeface typeface, Handler handler) {
            m3234c(handler).post(new C0528a(typeface));
        }

        /* renamed from: d */
        public abstract void mo2084d(int i);

        /* renamed from: e */
        public abstract void mo2085e(Typeface typeface);
    }

    /* renamed from: androidx.core.content.d.f$d */
    /* compiled from: ResourcesCompat */
    public static final class C0530d {

        /* renamed from: androidx.core.content.d.f$d$a */
        /* compiled from: ResourcesCompat */
        static class C0531a {

            /* renamed from: a */
            private static final Object f2722a = new Object();

            /* renamed from: b */
            private static Method f2723b;

            /* renamed from: c */
            private static boolean f2724c;

            /* renamed from: a */
            static void m3240a(Resources.Theme theme) {
                synchronized (f2722a) {
                    if (!f2724c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f2723b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                        }
                        f2724c = true;
                    }
                    Method method = f2723b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                            f2723b = null;
                        }
                    }
                }
            }
        }

        /* renamed from: androidx.core.content.d.f$d$b */
        /* compiled from: ResourcesCompat */
        static class C0532b {
            /* renamed from: a */
            static void m3241a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m3239a(Resources.Theme theme) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                C0532b.m3241a(theme);
            } else if (i >= 23) {
                C0531a.m3240a(theme);
            }
        }
    }

    /* renamed from: a */
    private static void m3220a(C0526b bVar, int i, ColorStateList colorStateList) {
        synchronized (f2713c) {
            WeakHashMap<C0526b, SparseArray<C0525a>> weakHashMap = f2712b;
            SparseArray sparseArray = weakHashMap.get(bVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(bVar, sparseArray);
            }
            sparseArray.append(i, new C0525a(colorStateList, bVar.f2716a.getConfiguration()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m3221b(androidx.core.content.p003d.C0524f.C0526b r4, int r5) {
        /*
            java.lang.Object r0 = f2713c
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.d.f$b, android.util.SparseArray<androidx.core.content.d.f$a>> r1 = f2712b     // Catch:{ all -> 0x0033 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0033 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0030
            int r2 = r1.size()     // Catch:{ all -> 0x0033 }
            if (r2 <= 0) goto L_0x0030
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0033 }
            androidx.core.content.d.f$a r2 = (androidx.core.content.p003d.C0524f.C0525a) r2     // Catch:{ all -> 0x0033 }
            if (r2 == 0) goto L_0x0030
            android.content.res.Configuration r3 = r2.f2715b     // Catch:{ all -> 0x0033 }
            android.content.res.Resources r4 = r4.f2716a     // Catch:{ all -> 0x0033 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0033 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x002d
            android.content.res.ColorStateList r4 = r2.f2714a     // Catch:{ all -> 0x0033 }
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x002d:
            r1.remove(r5)     // Catch:{ all -> 0x0033 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            r4 = 0
            return r4
        L_0x0033:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p003d.C0524f.m3221b(androidx.core.content.d.f$b, int):android.content.res.ColorStateList");
    }

    /* renamed from: c */
    public static Typeface m3222c(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m3232m(context, i, new TypedValue(), 0, (C0527c) null, (Handler) null, false, true);
    }

    /* renamed from: d */
    public static int m3223d(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColor(i, theme);
        }
        return resources.getColor(i);
    }

    /* renamed from: e */
    public static ColorStateList m3224e(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColorStateList(i, theme);
        }
        C0526b bVar = new C0526b(resources, theme);
        ColorStateList b = m3221b(bVar, i);
        if (b != null) {
            return b;
        }
        ColorStateList k = m3230k(resources, i, theme);
        if (k == null) {
            return resources.getColorStateList(i);
        }
        m3220a(bVar, i, k);
        return k;
    }

    /* renamed from: f */
    public static Drawable m3225f(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    /* renamed from: g */
    public static Typeface m3226g(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m3232m(context, i, new TypedValue(), 0, (C0527c) null, (Handler) null, false, false);
    }

    /* renamed from: h */
    public static Typeface m3227h(Context context, int i, TypedValue typedValue, int i2, C0527c cVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m3232m(context, i, typedValue, i2, cVar, (Handler) null, true, false);
    }

    /* renamed from: i */
    public static void m3228i(Context context, int i, C0527c cVar, Handler handler) throws Resources.NotFoundException {
        C3703i.m15827d(cVar);
        if (context.isRestricted()) {
            cVar.mo3289a(-4, handler);
            return;
        }
        m3232m(context, i, new TypedValue(), 0, cVar, handler, false, false);
    }

    /* renamed from: j */
    private static TypedValue m3229j() {
        ThreadLocal<TypedValue> threadLocal = f2711a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: k */
    private static ColorStateList m3230k(Resources resources, int i, Resources.Theme theme) {
        if (m3231l(resources, i)) {
            return null;
        }
        try {
            return C0514a.m3174a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: l */
    private static boolean m3231l(Resources resources, int i) {
        TypedValue j = m3229j();
        resources.getValue(i, j, true);
        int i2 = j.type;
        if (i2 < 28 || i2 > 31) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private static Typeface m3232m(Context context, int i, TypedValue typedValue, int i2, C0527c cVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        int i3 = i;
        resources.getValue(i, typedValue, true);
        Typeface n = m3233n(context, resources, typedValue, i, i2, cVar, handler, z, z2);
        if (n != null || cVar != null || z2) {
            return n;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface m3233n(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, androidx.core.content.p003d.C0524f.C0527c r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x00aa
            java.lang.String r12 = r2.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = -3
            r14 = 0
            if (r1 != 0) goto L_0x0026
            if (r9 == 0) goto L_0x0025
            r9.mo3289a(r13, r10)
        L_0x0025:
            return r14
        L_0x0026:
            android.graphics.Typeface r1 = p082e.p109h.p110h.C3626d.m15621f(r0, r4, r5)
            if (r1 == 0) goto L_0x0032
            if (r9 == 0) goto L_0x0031
            r9.mo3290b(r1, r10)
        L_0x0031:
            return r1
        L_0x0032:
            if (r23 == 0) goto L_0x0035
            return r14
        L_0x0035:
            java.lang.String r1 = r12.toLowerCase()     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
            if (r1 == 0) goto L_0x0068
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
            androidx.core.content.d.c$a r2 = androidx.core.content.p003d.C0516c.m3195b(r1, r0)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
            if (r2 != 0) goto L_0x0056
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
            if (r9 == 0) goto L_0x0055
            r9.mo3289a(r13, r10)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
        L_0x0055:
            return r14
        L_0x0056:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = p082e.p109h.p110h.C3626d.m15618c(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
            return r0
        L_0x0068:
            r1 = r15
            android.graphics.Typeface r0 = p082e.p109h.p110h.C3626d.m15619d(r15, r0, r4, r12, r5)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
            if (r9 == 0) goto L_0x0078
            if (r0 == 0) goto L_0x0075
            r9.mo3290b(r0, r10)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
            goto L_0x0078
        L_0x0075:
            r9.mo3289a(r13, r10)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x0079 }
        L_0x0078:
            return r0
        L_0x0079:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            goto L_0x00a4
        L_0x008f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
        L_0x00a4:
            if (r9 == 0) goto L_0x00a9
            r9.mo3289a(r13, r10)
        L_0x00a9:
            return r14
        L_0x00aa:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p003d.C0524f.m3233n(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.d.f$c, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
