package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import p079d.p080a.p081a.C3392a;
import p079d.p080a.p081a.C3395b;

/* renamed from: androidx.browser.customtabs.b */
/* compiled from: CustomTabsClient */
public class C0339b {

    /* renamed from: a */
    private final C3395b f1482a;

    /* renamed from: b */
    private final ComponentName f1483b;

    /* renamed from: androidx.browser.customtabs.b$a */
    /* compiled from: CustomTabsClient */
    class C0340a extends C3392a.C3393a {

        /* renamed from: g */
        private Handler f1484g = new Handler(Looper.getMainLooper());

        /* renamed from: h */
        final /* synthetic */ C0338a f1485h;

        /* renamed from: androidx.browser.customtabs.b$a$a */
        /* compiled from: CustomTabsClient */
        class C0341a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ int f1486g;

            /* renamed from: h */
            final /* synthetic */ Bundle f1487h;

            C0341a(int i, Bundle bundle) {
                this.f1486g = i;
                this.f1487h = bundle;
            }

            public void run() {
                C0340a.this.f1485h.mo2260c(this.f1486g, this.f1487h);
                throw null;
            }
        }

        /* renamed from: androidx.browser.customtabs.b$a$b */
        /* compiled from: CustomTabsClient */
        class C0342b implements Runnable {

            /* renamed from: g */
            final /* synthetic */ String f1489g;

            /* renamed from: h */
            final /* synthetic */ Bundle f1490h;

            C0342b(String str, Bundle bundle) {
                this.f1489g = str;
                this.f1490h = bundle;
            }

            public void run() {
                C0340a.this.f1485h.mo2258a(this.f1489g, this.f1490h);
                throw null;
            }
        }

        /* renamed from: androidx.browser.customtabs.b$a$c */
        /* compiled from: CustomTabsClient */
        class C0343c implements Runnable {

            /* renamed from: g */
            final /* synthetic */ Bundle f1492g;

            C0343c(Bundle bundle) {
                this.f1492g = bundle;
            }

            public void run() {
                C0340a.this.f1485h.mo2259b(this.f1492g);
                throw null;
            }
        }

        /* renamed from: androidx.browser.customtabs.b$a$d */
        /* compiled from: CustomTabsClient */
        class C0344d implements Runnable {

            /* renamed from: g */
            final /* synthetic */ String f1494g;

            /* renamed from: h */
            final /* synthetic */ Bundle f1495h;

            C0344d(String str, Bundle bundle) {
                this.f1494g = str;
                this.f1495h = bundle;
            }

            public void run() {
                C0340a.this.f1485h.mo2261d(this.f1494g, this.f1495h);
                throw null;
            }
        }

        /* renamed from: androidx.browser.customtabs.b$a$e */
        /* compiled from: CustomTabsClient */
        class C0345e implements Runnable {

            /* renamed from: g */
            final /* synthetic */ int f1497g;

            /* renamed from: h */
            final /* synthetic */ Uri f1498h;

            /* renamed from: i */
            final /* synthetic */ boolean f1499i;

            /* renamed from: j */
            final /* synthetic */ Bundle f1500j;

            C0345e(int i, Uri uri, boolean z, Bundle bundle) {
                this.f1497g = i;
                this.f1498h = uri;
                this.f1499i = z;
                this.f1500j = bundle;
            }

            public void run() {
                C0340a.this.f1485h.mo2262e(this.f1497g, this.f1498h, this.f1499i, this.f1500j);
                throw null;
            }
        }

        C0340a(C0339b bVar, C0338a aVar) {
            this.f1485h = aVar;
        }

        /* renamed from: e6 */
        public void mo2265e6(String str, Bundle bundle) throws RemoteException {
            if (this.f1485h != null) {
                this.f1484g.post(new C0344d(str, bundle));
            }
        }

        /* renamed from: h5 */
        public void mo2266h5(int i, Bundle bundle) {
            if (this.f1485h != null) {
                this.f1484g.post(new C0341a(i, bundle));
            }
        }

        /* renamed from: m6 */
        public void mo2267m6(Bundle bundle) throws RemoteException {
            if (this.f1485h != null) {
                this.f1484g.post(new C0343c(bundle));
            }
        }

        /* renamed from: t6 */
        public void mo2268t6(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
            if (this.f1485h != null) {
                this.f1484g.post(new C0345e(i, uri, z, bundle));
            }
        }

        /* renamed from: y4 */
        public void mo2269y4(String str, Bundle bundle) throws RemoteException {
            if (this.f1485h != null) {
                this.f1484g.post(new C0342b(str, bundle));
            }
        }
    }

    C0339b(C3395b bVar, ComponentName componentName) {
        this.f1482a = bVar;
        this.f1483b = componentName;
    }

    /* renamed from: a */
    public static boolean m1952a(Context context, String str, C0348d dVar) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, dVar, 33);
    }

    /* renamed from: b */
    public C0350e mo2263b(C0338a aVar) {
        C0340a aVar2 = new C0340a(this, aVar);
        try {
            if (!this.f1482a.mo2250l4(aVar2)) {
                return null;
            }
            return new C0350e(this.f1482a, aVar2, this.f1483b);
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public boolean mo2264c(long j) {
        try {
            return this.f1482a.mo2248i3(j);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
