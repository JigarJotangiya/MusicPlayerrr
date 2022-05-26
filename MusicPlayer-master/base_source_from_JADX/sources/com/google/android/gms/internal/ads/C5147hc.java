package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.hc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5147hc extends C5111gd {

    /* renamed from: i */
    private static final C5148hd<String> f17611i = new C5148hd<>();

    /* renamed from: h */
    private final Context f17612h;

    public C5147hc(C5701wb wbVar, String str, String str2, C4920b8 b8Var, int i, int i2, Context context) {
        super(wbVar, "t7YLiNn9wSLVfNzBPSP796qGY15c9YWt19X86sjfqa1MN8DTMOAxKskDGE2b7plQ", "lEEnhl5euaIfSg9vXz1JH43pBH/xGM9fvSrfPaUZwEI=", b8Var, i, 29);
        this.f17612h = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15751a() throws IllegalAccessException, InvocationTargetException {
        this.f17019d.mo16122g0("E");
        AtomicReference<String> a = f17611i.mo18123a(this.f17612h.getPackageName());
        if (a.get() == null) {
            synchronized (a) {
                if (a.get() == null) {
                    a.set((String) this.f17020e.invoke((Object) null, new Object[]{this.f17612h}));
                }
            }
        }
        String str = a.get();
        synchronized (this.f17019d) {
            this.f17019d.mo16122g0(C5144h9.m24731a(str.getBytes(), true));
        }
    }
}
