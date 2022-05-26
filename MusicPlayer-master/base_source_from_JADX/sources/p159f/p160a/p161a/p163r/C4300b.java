package p159f.p160a.p161a.p163r;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;

@TargetApi(21)
/* renamed from: f.a.a.r.b */
/* compiled from: RippleHelper */
public class C4300b {
    /* renamed from: a */
    public static void m18808a(Drawable drawable, int i) {
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(ColorStateList.valueOf(i));
        }
    }
}
