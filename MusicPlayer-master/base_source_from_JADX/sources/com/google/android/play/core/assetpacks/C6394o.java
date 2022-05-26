package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import p159f.p243f.p245b.p318c.p319a.p323d.C7643p;

/* renamed from: com.google.android.play.core.assetpacks.o */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6394o extends C6384m<ParcelFileDescriptor> {
    C6394o(C6424u uVar, C7643p<ParcelFileDescriptor> pVar) {
        super(uVar, pVar);
    }

    /* renamed from: R0 */
    public final void mo25315R0(Bundle bundle, Bundle bundle2) throws RemoteException {
        super.mo25315R0(bundle, bundle2);
        this.f29568g.mo28636e((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
