package p159f.p243f.p245b.p304b.p315w;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: f.f.b.b.w.a */
/* compiled from: AbsoluteCornerSize */
public final class C7534a implements C7536c {

    /* renamed from: a */
    private final float f32779a;

    public C7534a(float f) {
        this.f32779a = f;
    }

    /* renamed from: a */
    public float mo28437a(RectF rectF) {
        return this.f32779a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C7534a) && this.f32779a == ((C7534a) obj).f32779a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f32779a)});
    }
}
