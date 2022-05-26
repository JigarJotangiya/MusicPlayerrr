package net.coocent.android.xmlparser.feedback;

import android.content.Context;
import p082e.p109h.p118o.C3699e;

/* renamed from: net.coocent.android.xmlparser.feedback.h */
/* compiled from: lambda */
public final /* synthetic */ class C9408h implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C9424o f36300g;

    /* renamed from: h */
    public final /* synthetic */ C3699e f36301h;

    /* renamed from: i */
    public final /* synthetic */ Context f36302i;

    /* renamed from: j */
    public final /* synthetic */ String f36303j;

    public /* synthetic */ C9408h(C9424o oVar, C3699e eVar, Context context, String str) {
        this.f36300g = oVar;
        this.f36301h = eVar;
        this.f36302i = context;
        this.f36303j = str;
    }

    public final void run() {
        this.f36300g.mo32538e(this.f36301h, this.f36302i, this.f36303j);
    }
}
