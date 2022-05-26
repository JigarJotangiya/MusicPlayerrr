package p159f.p243f.p245b.p304b.p315w;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: f.f.b.b.w.b */
/* compiled from: AdjustedCornerSize */
public final class C7535b implements C7536c {

    /* renamed from: a */
    private final C7536c f32780a;

    /* renamed from: b */
    private final float f32781b;

    public C7535b(float f, C7536c cVar) {
        while (cVar instanceof C7535b) {
            cVar = ((C7535b) cVar).f32780a;
            f += ((C7535b) cVar).f32781b;
        }
        this.f32780a = cVar;
        this.f32781b = f;
    }

    /* renamed from: a */
    public float mo28437a(RectF rectF) {
        return Math.max(0.0f, this.f32780a.mo28437a(rectF) + this.f32781b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7535b)) {
            return false;
        }
        C7535b bVar = (C7535b) obj;
        if (!this.f32780a.equals(bVar.f32780a) || this.f32781b != bVar.f32781b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32780a, Float.valueOf(this.f32781b)});
    }
}
