package p159f.p243f.p245b.p304b.p312t;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: f.f.b.b.t.b */
/* compiled from: MaterialAttributes */
public class C7521b {
    /* renamed from: a */
    public static TypedValue m42009a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m42010b(Context context, int i, boolean z) {
        TypedValue a = m42009a(context, i);
        if (a == null || a.type != 18) {
            return z;
        }
        return a.data != 0;
    }

    /* renamed from: c */
    public static int m42011c(Context context, int i, int i2) {
        TypedValue a = m42009a(context, i);
        return (a == null || a.type != 16) ? i2 : a.data;
    }

    /* renamed from: d */
    public static int m42012d(Context context, int i, String str) {
        TypedValue a = m42009a(context, i);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }

    /* renamed from: e */
    public static int m42013e(View view, int i) {
        return m42012d(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
