package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.C2971s;
import p082e.p098e.C3465a;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class w31 implements u91, z81 {

    /* renamed from: g */
    private final Context f25213g;

    /* renamed from: h */
    private final pr0 f25214h;

    /* renamed from: i */
    private final bp2 f25215i;

    /* renamed from: j */
    private final zzcjf f25216j;

    /* renamed from: k */
    private C4863a f25217k;

    /* renamed from: l */
    private boolean f25218l;

    public w31(Context context, pr0 pr0, bp2 bp2, zzcjf zzcjf) {
        this.f25213g = context;
        this.f25214h = pr0;
        this.f25215i = bp2;
        this.f25216j = zzcjf;
    }

    /* renamed from: a */
    private final synchronized void m32892a() {
        se0 se0;
        te0 te0;
        if (this.f25215i.f14625Q) {
            if (this.f25214h != null) {
                if (C2971s.m13206i().mo18281V(this.f25213g)) {
                    zzcjf zzcjf = this.f25216j;
                    int i = zzcjf.f27377h;
                    int i2 = zzcjf.f27378i;
                    StringBuilder sb = new StringBuilder(23);
                    sb.append(i);
                    sb.append(".");
                    sb.append(i2);
                    String sb2 = sb.toString();
                    String a = this.f25215i.f14627S.mo22062a();
                    if (this.f25215i.f14627S.mo22063b() == 1) {
                        se0 = se0.VIDEO;
                        te0 = te0.DEFINED_BY_JAVASCRIPT;
                    } else {
                        se0 = se0.HTML_DISPLAY;
                        if (this.f25215i.f14645f == 1) {
                            te0 = te0.ONE_PIXEL;
                        } else {
                            te0 = te0.BEGIN_TO_RENDER;
                        }
                    }
                    C4863a S = C2971s.m13206i().mo18278S(sb2, this.f25214h.mo17664K(), BuildConfig.FLAVOR, "javascript", a, te0, se0, this.f25215i.f14654j0);
                    this.f25217k = S;
                    pr0 pr0 = this.f25214h;
                    if (S != null) {
                        C2971s.m13206i().mo18279T(this.f25217k, (View) pr0);
                        this.f25214h.mo17680V0(this.f25217k);
                        C2971s.m13206i().mo18275P(this.f25217k);
                        this.f25218l = true;
                        this.f25214h.mo16880n0("onSdkLoaded", new C3465a());
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo15614j() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f25218l     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0008
            r3.m32892a()     // Catch:{ all -> 0x0024 }
        L_0x0008:
            com.google.android.gms.internal.ads.bp2 r0 = r3.f25215i     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.f14625Q     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            f.f.b.a.b.a r0 = r3.f25217k     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.internal.ads.pr0 r0 = r3.f25214h     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            e.e.a r1 = new e.e.a     // Catch:{ all -> 0x0024 }
            r1.<init>()     // Catch:{ all -> 0x0024 }
            java.lang.String r2 = "onSdkImpression"
            r0.mo16880n0(r2, r1)     // Catch:{ all -> 0x0024 }
            monitor-exit(r3)
            return
        L_0x0022:
            monitor-exit(r3)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w31.mo15614j():void");
    }

    /* renamed from: k */
    public final synchronized void mo15615k() {
        if (!this.f25218l) {
            m32892a();
        }
    }
}
