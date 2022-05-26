package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.d0 */
/* compiled from: TintContextWrapper */
public class C0272d0 extends ContextWrapper {

    /* renamed from: c */
    private static final Object f1269c = new Object();

    /* renamed from: d */
    private static ArrayList<WeakReference<C0272d0>> f1270d;

    /* renamed from: a */
    private final Resources f1271a;

    /* renamed from: b */
    private final Resources.Theme f1272b;

    private C0272d0(Context context) {
        super(context);
        if (C0294l0.m1754c()) {
            C0294l0 l0Var = new C0294l0(this, context.getResources());
            this.f1271a = l0Var;
            Resources.Theme newTheme = l0Var.newTheme();
            this.f1272b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1271a = new C0277f0(this, context.getResources());
        this.f1272b = null;
    }

    /* renamed from: a */
    private static boolean m1592a(Context context) {
        if ((context instanceof C0272d0) || (context.getResources() instanceof C0277f0) || (context.getResources() instanceof C0294l0)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 21 || C0294l0.m1754c()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static Context m1593b(Context context) {
        if (!m1592a(context)) {
            return context;
        }
        synchronized (f1269c) {
            ArrayList<WeakReference<C0272d0>> arrayList = f1270d;
            if (arrayList == null) {
                f1270d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f1270d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1270d.remove(size);
                    }
                }
                for (int size2 = f1270d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f1270d.get(size2);
                    C0272d0 d0Var = weakReference2 != null ? (C0272d0) weakReference2.get() : null;
                    if (d0Var != null && d0Var.getBaseContext() == context) {
                        return d0Var;
                    }
                }
            }
            C0272d0 d0Var2 = new C0272d0(context);
            f1270d.add(new WeakReference(d0Var2));
            return d0Var2;
        }
    }

    public AssetManager getAssets() {
        return this.f1271a.getAssets();
    }

    public Resources getResources() {
        return this.f1271a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1272b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.f1272b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
