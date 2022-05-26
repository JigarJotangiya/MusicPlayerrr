package net.coocent.android.xmlparser.widget.view.tabs.p456c;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import p082e.p083a.p084k.p085a.C3410a;

/* renamed from: net.coocent.android.xmlparser.widget.view.tabs.c.a */
/* compiled from: MaterialResources */
public class C9555a {
    /* renamed from: a */
    public static ColorStateList m50151a(Context context, TypedArray typedArray, int i) {
        int color;
        int resourceId;
        ColorStateList c;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (c = C3410a.m14542c(context, resourceId)) != null) {
            return c;
        }
        if (Build.VERSION.SDK_INT > 15 || (color = typedArray.getColor(i, -1)) == -1) {
            return typedArray.getColorStateList(i);
        }
        return ColorStateList.valueOf(color);
    }

    /* renamed from: b */
    public static Drawable m50152b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable d;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (d = C3410a.m14543d(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return d;
    }
}
