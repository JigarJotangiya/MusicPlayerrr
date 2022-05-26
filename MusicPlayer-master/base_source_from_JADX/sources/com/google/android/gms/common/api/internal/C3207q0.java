package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C3147a;
import com.google.android.gms.common.api.internal.C3199n;
import p159f.p243f.p245b.p246a.p303f.C7471i;

/* renamed from: com.google.android.gms.common.api.internal.q0 */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C3207q0 extends C3199n {

    /* renamed from: d */
    final /* synthetic */ C3199n.C3200a f10443d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3207q0(C3199n.C3200a aVar, Feature[] featureArr, boolean z, int i) {
        super(featureArr, z, i);
        this.f10443d = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo11606b(C3147a.C3149b bVar, C7471i iVar) throws RemoteException {
        this.f10443d.f10429a.accept(bVar, iVar);
    }
}
