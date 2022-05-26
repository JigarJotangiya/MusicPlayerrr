package p443m.p444a.p447e.p448a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.C0136e;
import p082e.p083a.p084k.p085a.C3410a;

/* renamed from: m.a.e.a.g */
/* compiled from: SkinCompatVectorResources */
public class C9335g implements C9336h {

    /* renamed from: a */
    private static C9335g f36114a;

    private C9335g() {
        C9332d.m49408e().mo32322a(this);
    }

    /* renamed from: a */
    public static Drawable m49448a(Context context, int i) {
        return m49449b().m49450c(context, i);
    }

    /* renamed from: b */
    public static C9335g m49449b() {
        if (f36114a == null) {
            synchronized (C9335g.class) {
                if (f36114a == null) {
                    f36114a = new C9335g();
                }
            }
        }
        return f36114a;
    }

    /* renamed from: c */
    private Drawable m49450c(Context context, int i) {
        int m;
        Drawable l;
        ColorStateList k;
        Drawable l2;
        ColorStateList k2;
        if (C0136e.m730q()) {
            if (!C9332d.m49408e().mo32326p()) {
                try {
                    return C9326b.m49382n().mo32316p(context, i);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (!C9334f.m49436g().mo32334n() && (k2 = C9334f.m49436g().mo32332k(i)) != null) {
                return new ColorDrawable(k2.getDefaultColor());
            }
            if (!C9334f.m49436g().mo32335o() && (l2 = C9334f.m49436g().mo32333l(i)) != null) {
                return l2;
            }
            Drawable l3 = C9332d.m49408e().mo32324l(context, i);
            if (l3 != null) {
                return l3;
            }
            return C3410a.m14543d(context, i);
        } else if (!C9334f.m49436g().mo32334n() && (k = C9334f.m49436g().mo32332k(i)) != null) {
            return new ColorDrawable(k.getDefaultColor());
        } else {
            if (!C9334f.m49436g().mo32335o() && (l = C9334f.m49436g().mo32333l(i)) != null) {
                return l;
            }
            Drawable l4 = C9332d.m49408e().mo32324l(context, i);
            if (l4 != null) {
                return l4;
            }
            if (C9332d.m49408e().mo32326p() || (m = C9332d.m49408e().mo32325m(context, i)) == 0) {
                return C3410a.m14543d(context, i);
            }
            return C9332d.m49408e().mo32323i().getDrawable(m);
        }
    }

    public void clear() {
        C9326b.m49382n().mo32315f();
    }
}
