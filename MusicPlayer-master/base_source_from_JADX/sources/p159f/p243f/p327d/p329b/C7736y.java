package p159f.p243f.p327d.p329b;

import java.util.Collection;
import p159f.p243f.p327d.p328a.C7656e;

/* renamed from: f.f.d.b.y */
/* compiled from: Collections2 */
public final class C7736y {
    /* renamed from: a */
    static boolean m42615a(Collection<?> collection, Object obj) {
        C7656e.m42492c(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
