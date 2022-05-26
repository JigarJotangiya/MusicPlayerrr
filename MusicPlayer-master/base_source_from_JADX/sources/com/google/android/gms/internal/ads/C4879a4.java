package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.a4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4879a4 {

    /* renamed from: a */
    public final int f13771a;

    /* renamed from: b */
    public final String f13772b;

    /* renamed from: c */
    public final List<C5805z3> f13773c;

    /* renamed from: d */
    public final byte[] f13774d;

    public C4879a4(int i, String str, List<C5805z3> list, byte[] bArr) {
        List<C5805z3> list2;
        this.f13771a = i;
        this.f13772b = str;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.f13773c = list2;
        this.f13774d = bArr;
    }
}
