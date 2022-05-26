package p082e.p109h.p110h;

import android.graphics.Insets;
import android.graphics.Rect;

/* renamed from: e.h.h.b */
/* compiled from: Insets */
public final class C3622b {

    /* renamed from: e */
    public static final C3622b f11588e = new C3622b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f11589a;

    /* renamed from: b */
    public final int f11590b;

    /* renamed from: c */
    public final int f11591c;

    /* renamed from: d */
    public final int f11592d;

    private C3622b(int i, int i2, int i3, int i4) {
        this.f11589a = i;
        this.f11590b = i2;
        this.f11591c = i3;
        this.f11592d = i4;
    }

    /* renamed from: a */
    public static C3622b m15596a(C3622b bVar, C3622b bVar2) {
        return m15597b(Math.max(bVar.f11589a, bVar2.f11589a), Math.max(bVar.f11590b, bVar2.f11590b), Math.max(bVar.f11591c, bVar2.f11591c), Math.max(bVar.f11592d, bVar2.f11592d));
    }

    /* renamed from: b */
    public static C3622b m15597b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return f11588e;
        }
        return new C3622b(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static C3622b m15598c(Rect rect) {
        return m15597b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static C3622b m15599d(Insets insets) {
        return m15597b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: e */
    public Insets mo12878e() {
        return Insets.of(this.f11589a, this.f11590b, this.f11591c, this.f11592d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3622b.class != obj.getClass()) {
            return false;
        }
        C3622b bVar = (C3622b) obj;
        return this.f11592d == bVar.f11592d && this.f11589a == bVar.f11589a && this.f11591c == bVar.f11591c && this.f11590b == bVar.f11590b;
    }

    public int hashCode() {
        return (((((this.f11589a * 31) + this.f11590b) * 31) + this.f11591c) * 31) + this.f11592d;
    }

    public String toString() {
        return "Insets{left=" + this.f11589a + ", top=" + this.f11590b + ", right=" + this.f11591c + ", bottom=" + this.f11592d + '}';
    }
}
