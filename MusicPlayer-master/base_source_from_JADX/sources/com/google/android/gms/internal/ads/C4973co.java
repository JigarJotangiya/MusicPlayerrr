package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.co */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C4973co implements Comparator<C5196io> {
    C4973co(C5047eo eoVar) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C5196io ioVar = (C5196io) obj;
        C5196io ioVar2 = (C5196io) obj2;
        int i = ioVar.f18124c - ioVar2.f18124c;
        if (i != 0) {
            return i;
        }
        return (int) (ioVar.f18122a - ioVar2.f18122a);
    }
}
