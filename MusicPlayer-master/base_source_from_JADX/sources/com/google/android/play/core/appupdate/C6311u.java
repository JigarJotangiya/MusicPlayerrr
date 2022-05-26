package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.play.core.common.C6456c;
import com.google.android.play.core.install.C6460a;
import p159f.p243f.p245b.p318c.p319a.p320a.C7577a;
import p159f.p243f.p245b.p318c.p319a.p320a.C7589g;
import p159f.p243f.p245b.p318c.p319a.p320a.C7594i0;
import p159f.p243f.p245b.p318c.p319a.p320a.C7601m;
import p159f.p243f.p245b.p318c.p319a.p320a.C7607p;
import p159f.p243f.p245b.p318c.p319a.p320a.C7611r;
import p159f.p243f.p245b.p318c.p319a.p323d.C7632e;
import p159f.p243f.p245b.p318c.p319a.p323d.C7634g;
import p159f.p243f.p245b.p318c.p319a.p323d.C7643p;

/* renamed from: com.google.android.play.core.appupdate.u */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6311u {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C7577a f29312e = new C7577a("AppUpdateService");

    /* renamed from: f */
    private static final Intent f29313f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    C7601m<C7594i0> f29314a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f29315b;

    /* renamed from: c */
    private final Context f29316c;

    /* renamed from: d */
    private final C6313w f29317d;

    C6311u(Context context, C6313w wVar) {
        this.f29315b = context.getPackageName();
        this.f29316c = context;
        this.f29317d = wVar;
        if (C7611r.m42412b(context)) {
            this.f29314a = new C7601m(C7607p.m42395a(context), f29312e, "AppUpdateService", f29313f, C6305o.f29300a, (C7589g) null);
        }
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ Bundle m37526b(C6311u uVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(m37531i());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(uVar.f29316c.getPackageManager().getPackageInfo(uVar.f29316c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f29312e.mo28575b("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    /* renamed from: d */
    static /* bridge */ /* synthetic */ C6286a m37528d(C6311u uVar, Bundle bundle, String str) {
        Integer num;
        Bundle bundle2 = bundle;
        int i = bundle2.getInt("version.code", -1);
        int i2 = bundle2.getInt("update.availability");
        int i3 = bundle2.getInt("install.status", 0);
        if (bundle2.getInt("client.version.staleness", -1) == -1) {
            num = null;
        } else {
            num = Integer.valueOf(bundle2.getInt("client.version.staleness"));
        }
        return C6286a.m37479f(str, i, i2, i3, num, bundle2.getInt("in.app.update.priority", 0), bundle2.getLong("bytes.downloaded"), bundle2.getLong("total.bytes.to.download"), bundle2.getLong("additional.size.required"), uVar.f29317d.mo25178a(), (PendingIntent) bundle2.getParcelable("blocking.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.intent"), (PendingIntent) bundle2.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.destructive.intent"));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static Bundle m37531i() {
        Bundle bundle = new Bundle();
        bundle.putAll(C6456c.m37825a("app_update"));
        bundle.putInt("playcore.version.code", 11002);
        return bundle;
    }

    /* renamed from: j */
    private static <T> C7632e<T> m37532j() {
        f29312e.mo28575b("onError(%d)", -9);
        return C7634g.m42449b(new C6460a(-9));
    }

    /* renamed from: f */
    public final C7632e<Void> mo25176f(String str) {
        if (this.f29314a == null) {
            return m37532j();
        }
        f29312e.mo28577d("completeUpdate(%s)", str);
        C7643p pVar = new C7643p();
        this.f29314a.mo28604q(new C6307q(this, pVar, pVar, str), pVar);
        return pVar.mo28632a();
    }

    /* renamed from: g */
    public final C7632e<C6286a> mo25177g(String str) {
        if (this.f29314a == null) {
            return m37532j();
        }
        f29312e.mo28577d("requestUpdateInfo(%s)", str);
        C7643p pVar = new C7643p();
        this.f29314a.mo28604q(new C6306p(this, pVar, str, pVar), pVar);
        return pVar.mo28632a();
    }
}
