package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p159f.p243f.p245b.p318c.p319a.p320a.C7577a;
import p159f.p243f.p245b.p318c.p319a.p320a.C7589g;
import p159f.p243f.p245b.p318c.p319a.p320a.C7601m;
import p159f.p243f.p245b.p318c.p319a.p320a.C7604n0;
import p159f.p243f.p245b.p318c.p319a.p320a.C7607p;
import p159f.p243f.p245b.p318c.p319a.p320a.C7611r;
import p159f.p243f.p245b.p318c.p319a.p323d.C7632e;
import p159f.p243f.p245b.p318c.p319a.p323d.C7634g;
import p159f.p243f.p245b.p318c.p319a.p323d.C7643p;

/* renamed from: com.google.android.play.core.assetpacks.u */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6424u implements C6347e4 {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7577a f29660g = new C7577a("AssetPackServiceImpl");

    /* renamed from: h */
    private static final Intent f29661h = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f29662a;

    /* renamed from: b */
    private final C6381l1 f29663b;

    /* renamed from: c */
    private final C6432v2 f29664c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C7601m<C7604n0> f29665d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C7601m<C7604n0> f29666e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final AtomicBoolean f29667f = new AtomicBoolean();

    C6424u(Context context, C6381l1 l1Var, C6432v2 v2Var) {
        this.f29662a = context.getPackageName();
        this.f29663b = l1Var;
        this.f29664c = v2Var;
        if (C7611r.m42412b(context)) {
            Context a = C7607p.m42395a(context);
            C7577a aVar = f29660g;
            Intent intent = f29661h;
            C6353f4 f4Var = C6353f4.f29454a;
            this.f29665d = new C7601m(a, aVar, "AssetPackService", intent, f4Var, (C7589g) null);
            this.f29666e = new C7601m(C7607p.m42395a(context), aVar, "AssetPackService-keepAlive", intent, f4Var, (C7589g) null);
        }
        f29660g.mo28574a("AssetPackService initiated.", new Object[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static Bundle m37785g() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11002);
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(1);
        arrayList2.add(2);
        bundle.putIntegerArrayList("supported_patch_formats", arrayList2);
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static Bundle m37786h(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i);
        return bundle;
    }

    /* renamed from: i */
    private static <T> C7632e<T> m37787i() {
        f29660g.mo28575b("onError(%d)", -11);
        return C7634g.m42449b(new C6317a(-11));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m37788j(int i, String str, int i2) {
        if (this.f29665d != null) {
            f29660g.mo28577d("notifyModuleCompleted", new Object[0]);
            C7643p pVar = new C7643p();
            this.f29665d.mo28604q(new C6364i(this, pVar, i, str, pVar, i2), pVar);
            return;
        }
        throw new C6361h1("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: k */
    static /* bridge */ /* synthetic */ Bundle m37789k(int i, String str, String str2, int i2) {
        Bundle x = m37802x(i, str);
        x.putString("slice_id", str2);
        x.putInt("chunk_number", i2);
        return x;
    }

    /* renamed from: n */
    static /* bridge */ /* synthetic */ Bundle m37792n(Map map) {
        Bundle g = m37785g();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        g.putParcelableArrayList("installed_asset_module", arrayList);
        return g;
    }

    /* renamed from: t */
    static /* bridge */ /* synthetic */ ArrayList m37798t(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: u */
    static /* bridge */ /* synthetic */ List m37799u(C6424u uVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AssetPackState next = C6329c.m37583c((Bundle) it.next(), uVar.f29663b, uVar.f29664c).mo25219a().values().iterator().next();
            if (next == null) {
                f29660g.mo28575b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (C6349f0.m37610a(next.mo25186d())) {
                arrayList.add(next.mo25185c());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static Bundle m37802x(int i, String str) {
        Bundle h = m37786h(i);
        h.putString("module_name", str);
        return h;
    }

    /* renamed from: H */
    public final void mo25227H(int i) {
        if (this.f29665d != null) {
            f29660g.mo28577d("notifySessionFailed", new Object[0]);
            C7643p pVar = new C7643p();
            this.f29665d.mo28604q(new C6369j(this, pVar, i, pVar), pVar);
            return;
        }
        throw new C6361h1("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: a */
    public final void mo25228a(int i, String str) {
        m37788j(i, str, 10);
    }

    /* renamed from: b */
    public final C7632e<ParcelFileDescriptor> mo25229b(int i, String str, String str2, int i2) {
        if (this.f29665d == null) {
            return m37787i();
        }
        f29660g.mo28577d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        C7643p pVar = new C7643p();
        this.f29665d.mo28604q(new C6374k(this, pVar, i, str, str2, i2, pVar), pVar);
        return pVar.mo28632a();
    }

    /* renamed from: c */
    public final synchronized void mo25230c() {
        if (this.f29666e == null) {
            f29660g.mo28578e("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        C7577a aVar = f29660g;
        aVar.mo28577d("keepAlive", new Object[0]);
        if (!this.f29667f.compareAndSet(false, true)) {
            aVar.mo28577d("Service is already kept alive.", new Object[0]);
            return;
        }
        C7643p pVar = new C7643p();
        this.f29666e.mo28604q(new C6379l(this, pVar, pVar), pVar);
    }

    /* renamed from: d */
    public final void mo25231d(int i, String str, String str2, int i2) {
        if (this.f29665d != null) {
            f29660g.mo28577d("notifyChunkTransferred", new Object[0]);
            C7643p pVar = new C7643p();
            this.f29665d.mo28604q(new C6359h(this, pVar, i, str, str2, i2, pVar), pVar);
            return;
        }
        throw new C6361h1("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: e */
    public final C7632e<List<String>> mo25232e(Map<String, Long> map) {
        if (this.f29665d == null) {
            return m37787i();
        }
        f29660g.mo28577d("syncPacks", new Object[0]);
        C7643p pVar = new C7643p();
        this.f29665d.mo28604q(new C6354g(this, pVar, map, pVar), pVar);
        return pVar.mo28632a();
    }

    /* renamed from: f */
    public final void mo25233f(List<String> list) {
        if (this.f29665d != null) {
            f29660g.mo28577d("cancelDownloads(%s)", list);
            C7643p pVar = new C7643p();
            this.f29665d.mo28604q(new C6348f(this, pVar, list, pVar), pVar);
        }
    }
}
