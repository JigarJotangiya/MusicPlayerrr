package p082e.p147t.p148e;

import android.view.MotionEvent;
import java.util.Arrays;
import java.util.List;
import p082e.p109h.p118o.C3703i;

/* renamed from: e.t.e.l0 */
/* compiled from: ToolHandlerRegistry */
final class C4183l0<T> {

    /* renamed from: a */
    private final List<T> f12529a = Arrays.asList(new Object[]{null, null, null, null, null});

    /* renamed from: b */
    private final T f12530b;

    C4183l0(T t) {
        boolean z = false;
        C3703i.m15824a(t != null ? true : z);
        this.f12530b = t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public T mo14336a(MotionEvent motionEvent) {
        T t = this.f12529a.get(motionEvent.getToolType(0));
        return t != null ? t : this.f12530b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo14337b(int i, T t) {
        boolean z = true;
        C3703i.m15824a(i >= 0 && i <= 4);
        if (this.f12529a.get(i) != null) {
            z = false;
        }
        C3703i.m15829f(z);
        this.f12529a.set(i, t);
    }
}
