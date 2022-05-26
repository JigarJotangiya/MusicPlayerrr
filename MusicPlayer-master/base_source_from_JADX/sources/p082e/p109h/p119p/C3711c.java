package p082e.p109h.p119p;

import android.os.Build;
import android.view.DisplayCutout;
import p082e.p109h.p118o.C3698d;

/* renamed from: e.h.p.c */
/* compiled from: DisplayCutoutCompat */
public final class C3711c {

    /* renamed from: a */
    private final Object f11724a;

    private C3711c(Object obj) {
        this.f11724a = obj;
    }

    /* renamed from: e */
    static C3711c m15861e(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C3711c(obj);
    }

    /* renamed from: a */
    public int mo13013a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f11724a).getSafeInsetBottom();
        }
        return 0;
    }

    /* renamed from: b */
    public int mo13014b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f11724a).getSafeInsetLeft();
        }
        return 0;
    }

    /* renamed from: c */
    public int mo13015c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f11724a).getSafeInsetRight();
        }
        return 0;
    }

    /* renamed from: d */
    public int mo13016d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f11724a).getSafeInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3711c.class != obj.getClass()) {
            return false;
        }
        return C3698d.m15814a(this.f11724a, ((C3711c) obj).f11724a);
    }

    public int hashCode() {
        Object obj = this.f11724a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f11724a + "}";
    }
}
