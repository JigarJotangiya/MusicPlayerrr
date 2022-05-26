package p342g.p343a.p344a.p349f.p350b;

import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.Map;

/* renamed from: g.a.a.f.b.c */
/* compiled from: EQFragmentFactory */
public class C8028c {

    /* renamed from: a */
    public static Map<Integer, Fragment> f33892a = new HashMap();

    /* renamed from: a */
    public static Fragment m43966a(int i) {
        Fragment fragment = f33892a.get(Integer.valueOf(i));
        if (fragment == null) {
            if (i == 0) {
                fragment = new C8029d();
            } else if (i == 1) {
                fragment = new C8037f();
            } else if (i == 2) {
                fragment = new C8035e();
            }
            f33892a.put(Integer.valueOf(i), fragment);
        }
        return fragment;
    }
}
