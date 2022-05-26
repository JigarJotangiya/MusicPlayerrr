package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import p079d.p080a.p081a.C3392a;
import p079d.p080a.p081a.C3395b;
import p082e.p098e.C3465a;

public abstract class CustomTabsService extends Service {

    /* renamed from: g */
    final Map<IBinder, IBinder.DeathRecipient> f1476g = new C3465a();

    /* renamed from: h */
    private C3395b.C3396a f1477h = new C0335a();

    /* renamed from: androidx.browser.customtabs.CustomTabsService$a */
    class C0335a extends C3395b.C3396a {

        /* renamed from: androidx.browser.customtabs.CustomTabsService$a$a */
        class C0336a implements IBinder.DeathRecipient {

            /* renamed from: a */
            final /* synthetic */ C0351f f1479a;

            C0336a(C0351f fVar) {
                this.f1479a = fVar;
            }

            public void binderDied() {
                CustomTabsService.this.mo2236a(this.f1479a);
            }
        }

        C0335a() {
        }

        /* renamed from: X3 */
        public int mo2246X3(C3392a aVar, String str, Bundle bundle) {
            return CustomTabsService.this.mo2240e(new C0351f(aVar), str, bundle);
        }

        /* renamed from: Z4 */
        public boolean mo2247Z4(C3392a aVar, Bundle bundle) {
            return CustomTabsService.this.mo2242g(new C0351f(aVar), bundle);
        }

        /* renamed from: i3 */
        public boolean mo2248i3(long j) {
            return CustomTabsService.this.mo2244i(j);
        }

        /* renamed from: j1 */
        public boolean mo2249j1(C3392a aVar, Uri uri, Bundle bundle, List<Bundle> list) {
            return CustomTabsService.this.mo2238c(new C0351f(aVar), uri, bundle, list);
        }

        /* renamed from: l4 */
        public boolean mo2250l4(C3392a aVar) {
            C0351f fVar = new C0351f(aVar);
            try {
                C0336a aVar2 = new C0336a(fVar);
                synchronized (CustomTabsService.this.f1476g) {
                    aVar.asBinder().linkToDeath(aVar2, 0);
                    CustomTabsService.this.f1476g.put(aVar.asBinder(), aVar2);
                }
                return CustomTabsService.this.mo2239d(fVar);
            } catch (RemoteException unused) {
                return false;
            }
        }

        /* renamed from: n1 */
        public boolean mo2251n1(C3392a aVar, int i, Uri uri, Bundle bundle) {
            return CustomTabsService.this.mo2243h(new C0351f(aVar), i, uri, bundle);
        }

        /* renamed from: s2 */
        public Bundle mo2252s2(String str, Bundle bundle) {
            return CustomTabsService.this.mo2237b(str, bundle);
        }

        /* renamed from: u5 */
        public boolean mo2253u5(C3392a aVar, Uri uri) {
            return CustomTabsService.this.mo2241f(new C0351f(aVar), uri);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo2236a(C0351f fVar) {
        try {
            synchronized (this.f1476g) {
                IBinder a = fVar.mo2281a();
                a.unlinkToDeath(this.f1476g.get(a), 0);
                this.f1476g.remove(a);
            }
            return true;
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Bundle mo2237b(String str, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo2238c(C0351f fVar, Uri uri, Bundle bundle, List<Bundle> list);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo2239d(C0351f fVar);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo2240e(C0351f fVar, String str, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo2241f(C0351f fVar, Uri uri);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo2242g(C0351f fVar, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract boolean mo2243h(C0351f fVar, int i, Uri uri, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract boolean mo2244i(long j);

    public IBinder onBind(Intent intent) {
        return this.f1477h;
    }
}
