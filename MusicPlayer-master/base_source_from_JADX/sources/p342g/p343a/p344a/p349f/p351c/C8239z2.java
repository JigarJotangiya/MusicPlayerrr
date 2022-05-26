package p342g.p343a.p344a.p349f.p351c;

import androidx.fragment.app.Fragment;
import java.util.HashMap;

/* renamed from: g.a.a.f.c.z2 */
/* compiled from: LibraryFragmentFactory */
public class C8239z2 {
    static {
        new HashMap();
    }

    /* renamed from: a */
    public static Fragment m45496a(int i) {
        Fragment fragment;
        if (i == 0) {
            fragment = new C8105g3();
        } else if (i == 1) {
            fragment = new C8167p2();
        } else {
            fragment = i == 2 ? new C8143m2() : null;
        }
        if (i == 4) {
            return new C8209v2();
        }
        return i == 3 ? new C8049a3() : fragment;
    }
}
