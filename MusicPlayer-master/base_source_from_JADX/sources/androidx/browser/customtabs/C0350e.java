package androidx.browser.customtabs;

import android.content.ComponentName;
import android.os.IBinder;
import p079d.p080a.p081a.C3392a;
import p079d.p080a.p081a.C3395b;

/* renamed from: androidx.browser.customtabs.e */
/* compiled from: CustomTabsSession */
public final class C0350e {

    /* renamed from: a */
    private final C3395b f1509a;

    /* renamed from: b */
    private final C3392a f1510b;

    /* renamed from: c */
    private final ComponentName f1511c;

    C0350e(C3395b bVar, C3392a aVar, ComponentName componentName) {
        this.f1509a = bVar;
        this.f1510b = aVar;
        this.f1511c = componentName;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public IBinder mo2279a() {
        return this.f1510b.asBinder();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ComponentName mo2280b() {
        return this.f1511c;
    }
}
