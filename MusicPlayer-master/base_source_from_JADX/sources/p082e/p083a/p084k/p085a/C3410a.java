package p082e.p083a.p084k.p085a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C0320w;
import androidx.core.content.C0506a;
import androidx.core.content.p003d.C0514a;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* renamed from: e.a.k.a.a */
/* compiled from: AppCompatResources */
public final class C3410a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f10812a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C3411a>> f10813b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f10814c = new Object();

    /* renamed from: e.a.k.a.a$a */
    /* compiled from: AppCompatResources */
    private static class C3411a {

        /* renamed from: a */
        final ColorStateList f10815a;

        /* renamed from: b */
        final Configuration f10816b;

        C3411a(ColorStateList colorStateList, Configuration configuration) {
            this.f10815a = colorStateList;
            this.f10816b = configuration;
        }
    }

    /* renamed from: a */
    private static void m14540a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f10814c) {
            WeakHashMap<Context, SparseArray<C3411a>> weakHashMap = f10813b;
            SparseArray sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i, new C3411a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m14541b(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = f10814c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<e.a.k.a.a$a>> r1 = f10813b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            e.a.k.a.a$a r2 = (p082e.p083a.p084k.p085a.C3410a.C3411a) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f10816b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.f10815a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p083a.p084k.p085a.C3410a.m14541b(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: c */
    public static ColorStateList m14542c(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList b = m14541b(context, i);
        if (b != null) {
            return b;
        }
        ColorStateList f = m14545f(context, i);
        if (f == null) {
            return C0506a.m3151c(context, i);
        }
        m14540a(context, i, f);
        return f;
    }

    /* renamed from: d */
    public static Drawable m14543d(Context context, int i) {
        return C0320w.m1882h().mo2147j(context, i);
    }

    /* renamed from: e */
    private static TypedValue m14544e() {
        ThreadLocal<TypedValue> threadLocal = f10812a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: f */
    private static ColorStateList m14545f(Context context, int i) {
        if (m14546g(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C0514a.m3174a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m14546g(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue e = m14544e();
        resources.getValue(i, e, true);
        int i2 = e.type;
        if (i2 < 28 || i2 > 31) {
            return false;
        }
        return true;
    }
}
