package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import p079d.p080a.p081a.C3395b;

/* renamed from: androidx.browser.customtabs.d */
/* compiled from: CustomTabsServiceConnection */
public abstract class C0348d implements ServiceConnection {

    /* renamed from: androidx.browser.customtabs.d$a */
    /* compiled from: CustomTabsServiceConnection */
    class C0349a extends C0339b {
        C0349a(C0348d dVar, C3395b bVar, ComponentName componentName) {
            super(bVar, componentName);
        }
    }

    /* renamed from: a */
    public abstract void mo2277a(ComponentName componentName, C0339b bVar);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        mo2277a(componentName, new C0349a(this, C3395b.C3396a.m14535z(iBinder), componentName));
    }
}
