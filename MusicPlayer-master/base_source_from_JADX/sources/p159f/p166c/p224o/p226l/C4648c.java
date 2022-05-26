package p159f.p166c.p224o.p226l;

import android.content.Context;
import android.content.res.TypedArray;
import p159f.p166c.p224o.C4619a;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.o.l.c */
/* compiled from: ContextExtensions.kt */
public final class C4648c {
    /* renamed from: a */
    public static final boolean m20154a(Context context) {
        C8594l.m46771e(context, "<this>");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C4619a.isFlat});
        C8594l.m46770d(obtainStyledAttributes, "obtainStyledAttributes(intArrayOf(R.attr.isFlat))");
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* renamed from: b */
    public static final boolean m20155b(Context context) {
        C8594l.m46771e(context, "<this>");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C4619a.isLightStatusBar});
        C8594l.m46770d(obtainStyledAttributes, "obtainStyledAttributes(i…R.attr.isLightStatusBar))");
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }
}
