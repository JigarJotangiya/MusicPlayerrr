package p082e.p157y;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: e.y.b */
/* compiled from: ViewBindings */
public class C4258b {
    /* renamed from: a */
    public static <T extends View> T m18705a(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            T findViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }
}
