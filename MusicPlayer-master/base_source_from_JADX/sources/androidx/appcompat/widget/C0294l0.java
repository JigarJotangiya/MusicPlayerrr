package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.l0 */
/* compiled from: VectorEnabledTintResources */
public class C0294l0 extends Resources {

    /* renamed from: b */
    private static boolean f1370b = false;

    /* renamed from: a */
    private final WeakReference<Context> f1371a;

    public C0294l0(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1371a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static boolean m1752a() {
        return f1370b;
    }

    /* renamed from: b */
    public static void m1753b(boolean z) {
        f1370b = z;
    }

    /* renamed from: c */
    public static boolean m1754c() {
        return m1752a() && Build.VERSION.SDK_INT <= 20;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Drawable mo2086d(int i) {
        return super.getDrawable(i);
    }

    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Context context = (Context) this.f1371a.get();
        if (context != null) {
            return C0320w.m1882h().mo2152t(context, this, i);
        }
        return super.getDrawable(i);
    }
}
