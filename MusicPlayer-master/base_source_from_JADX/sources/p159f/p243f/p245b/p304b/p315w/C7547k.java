package p159f.p243f.p245b.p304b.p315w;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: f.f.b.b.w.k */
/* compiled from: RelativeCornerSize */
public final class C7547k implements C7536c {

    /* renamed from: a */
    private final float f32834a;

    public C7547k(float f) {
        this.f32834a = f;
    }

    /* renamed from: a */
    public float mo28437a(RectF rectF) {
        return this.f32834a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C7547k) && this.f32834a == ((C7547k) obj).f32834a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f32834a)});
    }
}
