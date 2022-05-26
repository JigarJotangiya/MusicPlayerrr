package androidx.browser.customtabs;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.C0478d;
import androidx.core.content.C0506a;
import java.util.ArrayList;

/* renamed from: androidx.browser.customtabs.c */
/* compiled from: CustomTabsIntent */
public final class C0346c {

    /* renamed from: a */
    public final Intent f1502a;

    /* renamed from: b */
    public final Bundle f1503b;

    /* renamed from: androidx.browser.customtabs.c$a */
    /* compiled from: CustomTabsIntent */
    public static final class C0347a {

        /* renamed from: a */
        private final Intent f1504a;

        /* renamed from: b */
        private ArrayList<Bundle> f1505b;

        /* renamed from: c */
        private Bundle f1506c;

        /* renamed from: d */
        private ArrayList<Bundle> f1507d;

        /* renamed from: e */
        private boolean f1508e;

        public C0347a() {
            this((C0350e) null);
        }

        /* renamed from: a */
        public C0346c mo2276a() {
            ArrayList<Bundle> arrayList = this.f1505b;
            if (arrayList != null) {
                this.f1504a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f1507d;
            if (arrayList2 != null) {
                this.f1504a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f1504a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f1508e);
            return new C0346c(this.f1504a, this.f1506c);
        }

        public C0347a(C0350e eVar) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f1504a = intent;
            IBinder iBinder = null;
            this.f1505b = null;
            this.f1506c = null;
            this.f1507d = null;
            this.f1508e = true;
            if (eVar != null) {
                intent.setPackage(eVar.mo2280b().getPackageName());
            }
            Bundle bundle = new Bundle();
            C0478d.m3005b(bundle, "android.support.customtabs.extra.SESSION", eVar != null ? eVar.mo2279a() : iBinder);
            intent.putExtras(bundle);
        }
    }

    C0346c(Intent intent, Bundle bundle) {
        this.f1502a = intent;
        this.f1503b = bundle;
    }

    /* renamed from: a */
    public void mo2275a(Context context, Uri uri) {
        this.f1502a.setData(uri);
        C0506a.m3156h(context, this.f1502a, this.f1503b);
    }
}
