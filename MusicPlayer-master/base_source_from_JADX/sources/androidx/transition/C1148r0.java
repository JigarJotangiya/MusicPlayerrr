package androidx.transition;

import android.os.IBinder;

/* renamed from: androidx.transition.r0 */
/* compiled from: WindowIdApi14 */
class C1148r0 implements C1152t0 {

    /* renamed from: a */
    private final IBinder f4725a;

    C1148r0(IBinder iBinder) {
        this.f4725a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1148r0) && ((C1148r0) obj).f4725a.equals(this.f4725a);
    }

    public int hashCode() {
        return this.f4725a.hashCode();
    }
}
