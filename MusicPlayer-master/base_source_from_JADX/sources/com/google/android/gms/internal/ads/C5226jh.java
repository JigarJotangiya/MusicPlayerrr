package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.jh */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5226jh extends C5300lh {

    /* renamed from: P0 */
    public final long f18485P0;

    /* renamed from: Q0 */
    public final List<C5263kh> f18486Q0 = new ArrayList();

    /* renamed from: R0 */
    public final List<C5226jh> f18487R0 = new ArrayList();

    public C5226jh(int i, long j) {
        super(i);
        this.f18485P0 = j;
    }

    /* renamed from: d */
    public final C5226jh mo18626d(int i) {
        int size = this.f18487R0.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5226jh jhVar = this.f18487R0.get(i2);
            if (jhVar.f19437a == i) {
                return jhVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final C5263kh mo18627e(int i) {
        int size = this.f18486Q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5263kh khVar = this.f18486Q0.get(i2);
            if (khVar.f19437a == i) {
                return khVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void mo18628f(C5226jh jhVar) {
        this.f18487R0.add(jhVar);
    }

    /* renamed from: g */
    public final void mo18629g(C5263kh khVar) {
        this.f18486Q0.add(khVar);
    }

    public final String toString() {
        String c = C5300lh.m26728c(this.f19437a);
        String arrays = Arrays.toString(this.f18486Q0.toArray());
        String arrays2 = Arrays.toString(this.f18487R0.toArray());
        int length = String.valueOf(arrays).length();
        StringBuilder sb = new StringBuilder(c.length() + 22 + length + String.valueOf(arrays2).length());
        sb.append(c);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
