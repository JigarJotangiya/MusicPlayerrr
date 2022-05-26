package net.coocent.android.xmlparser.update;

import androidx.lifecycle.C0670e0;

/* renamed from: net.coocent.android.xmlparser.update.e */
/* compiled from: lambda */
public final /* synthetic */ class C9501e implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ UpdateSource f36492g;

    /* renamed from: h */
    public final /* synthetic */ String f36493h;

    /* renamed from: i */
    public final /* synthetic */ C0670e0 f36494i;

    public /* synthetic */ C9501e(UpdateSource updateSource, String str, C0670e0 e0Var) {
        this.f36492g = updateSource;
        this.f36493h = str;
        this.f36494i = e0Var;
    }

    public final void run() {
        this.f36492g.mo32737b(this.f36493h, this.f36494i);
    }
}
