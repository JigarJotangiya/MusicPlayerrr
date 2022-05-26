package net.coocent.android.xmlparser.feedback;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: net.coocent.android.xmlparser.feedback.f */
/* compiled from: lambda */
public final /* synthetic */ class C9406f implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C9424o f36294g;

    /* renamed from: h */
    public final /* synthetic */ Context f36295h;

    /* renamed from: i */
    public final /* synthetic */ SharedPreferences f36296i;

    public /* synthetic */ C9406f(C9424o oVar, Context context, SharedPreferences sharedPreferences) {
        this.f36294g = oVar;
        this.f36295h = context;
        this.f36296i = sharedPreferences;
    }

    public final void run() {
        this.f36294g.mo32540i(this.f36295h, this.f36296i);
    }
}
