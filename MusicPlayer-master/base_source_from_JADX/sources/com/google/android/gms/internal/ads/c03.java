package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class c03 {

    /* renamed from: a */
    final f03 f14754a;

    /* renamed from: b */
    final boolean f14755b;

    private c03(f03 f03) {
        this.f14754a = f03;
        this.f14755b = f03 != null;
    }

    /* renamed from: b */
    public static c03 m21622b(Context context, String str, String str2) {
        f03 f03;
        try {
            IBinder d = DynamiteModule.m14489e(context, DynamiteModule.f10792b, ModuleDescriptor.MODULE_ID).mo11998d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
            if (d == null) {
                f03 = null;
            } else {
                IInterface queryLocalInterface = d.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                f03 = queryLocalInterface instanceof f03 ? (f03) queryLocalInterface : new d03(d);
            }
            try {
                f03.mo16811i6(C4865b.m20503f2(context), str, (String) null);
                Log.i("GASS", "GassClearcutLogger Initialized.");
                return new c03(f03);
            } catch (RemoteException | iz2 | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new c03(new g03());
            }
        } catch (Exception e) {
            throw new iz2(e);
        } catch (Exception e2) {
            throw new iz2(e2);
        }
    }

    /* renamed from: c */
    public static c03 m21623c() {
        g03 g03 = new g03();
        Log.d("GASS", "Clearcut logging disabled");
        return new c03(g03);
    }

    /* renamed from: a */
    public final b03 mo16444a(byte[] bArr) {
        return new b03(this, bArr, (a03) null);
    }
}
