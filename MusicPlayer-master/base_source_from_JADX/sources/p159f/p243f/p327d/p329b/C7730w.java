package p159f.p243f.p327d.p329b;

import p159f.p243f.p327d.p328a.C7656e;

/* renamed from: f.f.d.b.w */
/* compiled from: CollectPreconditions */
final class C7730w {
    /* renamed from: a */
    static int m42604a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    static void m42605b(boolean z) {
        C7656e.m42493d(z, "no calls to next() since the last call to remove()");
    }
}
