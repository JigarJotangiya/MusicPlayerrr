package com.google.android.gms.ads.p068a0.p069a;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.nf0;
import com.google.android.gms.internal.ads.o83;
import com.google.android.gms.internal.ads.ul0;
import java.util.ArrayList;
import java.util.Iterator;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.ads.a0.a.c0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C2857c0 implements o83<ArrayList<Uri>> {

    /* renamed from: a */
    final /* synthetic */ nf0 f9683a;

    /* renamed from: b */
    final /* synthetic */ C2863f0 f9684b;

    C2857c0(C2863f0 f0Var, nf0 nf0) {
        this.f9684b = f0Var;
        this.f9683a = nf0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10677a(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.f9683a.mo19163G1(arrayList);
            if (this.f9684b.f9716u) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    if (C2863f0.m12865j7(uri)) {
                        C2863f0 f0Var = this.f9684b;
                        this.f9684b.f9715t.mo19285b(C2863f0.m12871p7(uri, f0Var.f9701D, "1").toString());
                    }
                }
            }
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
        }
    }

    /* renamed from: b */
    public final void mo10678b(Throwable th) {
        try {
            nf0 nf0 = this.f9683a;
            String valueOf = String.valueOf(th.getMessage());
            nf0.mo19164q(valueOf.length() != 0 ? "Internal error: ".concat(valueOf) : new String("Internal error: "));
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
        }
    }
}
