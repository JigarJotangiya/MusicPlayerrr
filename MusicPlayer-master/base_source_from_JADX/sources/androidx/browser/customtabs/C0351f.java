package androidx.browser.customtabs;

import android.os.IBinder;
import p079d.p080a.p081a.C3392a;

/* renamed from: androidx.browser.customtabs.f */
/* compiled from: CustomTabsSessionToken */
public class C0351f {

    /* renamed from: a */
    final C3392a f1512a;

    C0351f(C3392a aVar) {
        this.f1512a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public IBinder mo2281a() {
        return this.f1512a.asBinder();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0351f)) {
            return false;
        }
        return ((C0351f) obj).mo2281a().equals(this.f1512a.asBinder());
    }

    public int hashCode() {
        return mo2281a().hashCode();
    }
}
