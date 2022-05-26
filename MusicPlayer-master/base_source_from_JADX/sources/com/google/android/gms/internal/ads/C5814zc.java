package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.zc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5814zc extends C5111gd {

    /* renamed from: h */
    private final C4998dc f26735h;

    /* renamed from: i */
    private long f26736i;

    public C5814zc(C5701wb wbVar, String str, String str2, C4920b8 b8Var, int i, int i2, C4998dc dcVar) {
        super(wbVar, "e3op4R4hYomHt8fD4e46pNuu/60OumzY4fWht1zvNw/PVRGde3uP5Y0px+X+3p+E", "jLlOehpoNgAQzvuHrTyBcudcfwOhFguv/E47mcpJrto=", b8Var, i, 53);
        this.f26735h = dcVar;
        if (dcVar != null) {
            this.f26736i = dcVar.mo16891a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15751a() throws IllegalAccessException, InvocationTargetException {
        if (this.f26735h != null) {
            this.f17019d.mo16095D(((Long) this.f17020e.invoke((Object) null, new Object[]{Long.valueOf(this.f26736i)})).longValue());
        }
    }
}
