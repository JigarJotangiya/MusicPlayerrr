package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class t42 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ CopyOnWriteArraySet f23744g;

    /* renamed from: h */
    public final /* synthetic */ int f23745h;

    /* renamed from: i */
    public final /* synthetic */ u52 f23746i;

    public /* synthetic */ t42(CopyOnWriteArraySet copyOnWriteArraySet, int i, u52 u52) {
        this.f23744g = copyOnWriteArraySet;
        this.f23745h = i;
        this.f23746i = u52;
    }

    public final void run() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.f23744g;
        int i = this.f23745h;
        u52 u52 = this.f23746i;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((w72) it.next()).mo21738a(i, u52);
        }
    }
}
