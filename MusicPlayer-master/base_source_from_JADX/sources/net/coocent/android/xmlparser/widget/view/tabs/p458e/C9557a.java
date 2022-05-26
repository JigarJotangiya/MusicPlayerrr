package net.coocent.android.xmlparser.widget.view.tabs.p458e;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;

/* renamed from: net.coocent.android.xmlparser.widget.view.tabs.e.a */
/* compiled from: ViewUtils */
public class C9557a {
    /* renamed from: a */
    public static float m50156a(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public static PorterDuff.Mode m50157b(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
