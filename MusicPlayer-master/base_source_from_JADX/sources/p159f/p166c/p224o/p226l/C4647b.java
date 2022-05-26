package p159f.p166c.p224o.p226l;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

/* renamed from: f.c.o.l.b */
/* compiled from: ColorUtils.kt */
public final class C4647b {
    /* renamed from: a */
    public static final int m20152a(Context context, int i, int i2) {
        Resources.Theme theme;
        TypedValue typedValue = new TypedValue();
        Boolean bool = null;
        if (!(context == null || (theme = context.getTheme()) == null)) {
            bool = Boolean.valueOf(theme.resolveAttribute(i, typedValue, true));
        }
        return bool != null ? typedValue.data : i2;
    }

    /* renamed from: b */
    public static /* synthetic */ int m20153b(Context context, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        return m20152a(context, i, i2);
    }
}
