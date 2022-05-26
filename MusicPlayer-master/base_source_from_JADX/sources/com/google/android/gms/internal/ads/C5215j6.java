package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.j6 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5215j6 implements Comparator<byte[]> {
    C5215j6() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((byte[]) obj).length - ((byte[]) obj2).length;
    }
}
