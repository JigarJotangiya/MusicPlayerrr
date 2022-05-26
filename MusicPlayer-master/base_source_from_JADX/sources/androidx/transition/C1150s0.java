package androidx.transition;

import android.view.View;
import android.view.WindowId;

/* renamed from: androidx.transition.s0 */
/* compiled from: WindowIdApi18 */
class C1150s0 implements C1152t0 {

    /* renamed from: a */
    private final WindowId f4728a;

    C1150s0(View view) {
        this.f4728a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1150s0) && ((C1150s0) obj).f4728a.equals(this.f4728a);
    }

    public int hashCode() {
        return this.f4728a.hashCode();
    }
}
