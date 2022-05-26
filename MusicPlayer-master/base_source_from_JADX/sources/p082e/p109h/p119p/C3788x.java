package p082e.p109h.p119p;

import android.os.Build;
import android.view.ViewGroup;
import p082e.p109h.C3617d;

/* renamed from: e.h.p.x */
/* compiled from: ViewGroupCompat */
public final class C3788x {
    /* renamed from: a */
    public static boolean m16293a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(C3617d.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C3774v.m16169K(viewGroup) == null) ? false : true;
    }
}
