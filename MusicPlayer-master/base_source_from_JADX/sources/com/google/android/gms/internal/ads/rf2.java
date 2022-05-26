package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rf2 implements sg2<sf2> {

    /* renamed from: a */
    private final e93 f22832a;

    /* renamed from: b */
    private final ScheduledExecutorService f22833b;

    /* renamed from: c */
    private final r82 f22834c;

    /* renamed from: d */
    private final Context f22835d;

    /* renamed from: e */
    private final up2 f22836e;

    /* renamed from: f */
    private final n82 f22837f;

    /* renamed from: g */
    private final br1 f22838g;

    /* renamed from: h */
    final String f22839h;

    public rf2(e93 e93, ScheduledExecutorService scheduledExecutorService, String str, r82 r82, Context context, up2 up2, n82 n82, br1 br1) {
        this.f22832a = e93;
        this.f22833b = scheduledExecutorService;
        this.f22839h = str;
        this.f22834c = r82;
        this.f22835d = context;
        this.f22836e = up2;
        this.f22837f = n82;
        this.f22838g = br1;
    }

    /* renamed from: b */
    public static /* synthetic */ d93 m30107b(rf2 rf2) {
        String str;
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22329F6)).booleanValue()) {
            str = rf2.f22836e.f24397f.toLowerCase(Locale.ROOT);
        } else {
            str = rf2.f22836e.f24397f;
        }
        Map<String, List<Bundle>> a = rf2.f22834c.mo20608a(rf2.f22839h, str);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((k43) a).entrySet().iterator();
        while (true) {
            Bundle bundle = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            Bundle bundle2 = rf2.f22836e.f24395d.f27207s;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str2);
            }
            arrayList.add(s83.m30604f((j83) s83.m30613o(j83.m25564E(s83.m30610l(new pf2(rf2, str2, list, bundle), rf2.f22832a)), ((Long) C5054ev.m23225c().mo20153b(C5503qz.f22438V0)).longValue(), TimeUnit.MILLISECONDS, rf2.f22833b), Throwable.class, new lf2(str2), rf2.f22832a));
        }
        for (Map.Entry value : ((k43) rf2.f22834c.mo20609b()).entrySet()) {
            v82 v82 = (v82) value.getValue();
            String str3 = v82.f24634a;
            Bundle bundle3 = rf2.f22836e.f24395d.f27207s;
            arrayList.add(s83.m30604f((j83) s83.m30613o(j83.m25564E(s83.m30610l(new of2(rf2, str3, v82, bundle3 != null ? bundle3.getBundle(str3) : null), rf2.f22832a)), ((Long) C5054ev.m23225c().mo20153b(C5503qz.f22438V0)).longValue(), TimeUnit.MILLISECONDS, rf2.f22833b), Throwable.class, new mf2(str3), rf2.f22832a));
        }
        return s83.m30601c(arrayList).mo20613a(new qf2(arrayList), rf2.f22832a);
    }

    /* renamed from: e */
    private final d93<JSONObject> m30108e(String str, List<Bundle> list, Bundle bundle, boolean z, boolean z2) throws RemoteException {
        bd0 bd0;
        mm0 mm0 = new mm0();
        if (z2) {
            this.f22837f.mo19654b(str);
            bd0 = this.f22837f.mo19653a(str);
        } else {
            try {
                bd0 = this.f22838g.mo16360a(str);
            } catch (RemoteException e) {
                ul0.m31860e("Couldn't create RTB adapter : ", e);
                bd0 = null;
            }
        }
        bd0 bd02 = bd0;
        Objects.requireNonNull(bd02);
        u82 u82 = new u82(str, bd02, mm0);
        if (z) {
            bd02.mo16210g3(C4865b.m20503f2(this.f22835d), this.f22839h, bundle, list.get(0), this.f22836e.f24396e, u82);
        } else {
            u82.mo21235a();
        }
        return mm0;
    }

    /* renamed from: a */
    public final d93<sf2> mo15767a() {
        return s83.m30610l(new nf2(this), this.f22832a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ d93 mo20647c(String str, List list, Bundle bundle) throws Exception {
        return m30108e(str, list, bundle, true, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ d93 mo20648d(String str, v82 v82, Bundle bundle) throws Exception {
        return m30108e(str, Collections.singletonList(v82.f24637d), bundle, v82.f24635b, v82.f24636c);
    }
}
