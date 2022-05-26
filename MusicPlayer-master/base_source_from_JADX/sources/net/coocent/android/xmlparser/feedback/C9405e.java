package net.coocent.android.xmlparser.feedback;

import androidx.lifecycle.C0670e0;
import java.util.List;
import java.util.concurrent.CompletionService;

/* renamed from: net.coocent.android.xmlparser.feedback.e */
/* compiled from: lambda */
public final /* synthetic */ class C9405e implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C9412j f36289g;

    /* renamed from: h */
    public final /* synthetic */ List f36290h;

    /* renamed from: i */
    public final /* synthetic */ CompletionService f36291i;

    /* renamed from: j */
    public final /* synthetic */ C0670e0 f36292j;

    /* renamed from: k */
    public final /* synthetic */ String f36293k;

    public /* synthetic */ C9405e(C9412j jVar, List list, CompletionService completionService, C0670e0 e0Var, String str) {
        this.f36289g = jVar;
        this.f36290h = list;
        this.f36291i = completionService;
        this.f36292j = e0Var;
        this.f36293k = str;
    }

    public final void run() {
        this.f36289g.mo32530h(this.f36290h, this.f36291i, this.f36292j, this.f36293k);
    }
}
