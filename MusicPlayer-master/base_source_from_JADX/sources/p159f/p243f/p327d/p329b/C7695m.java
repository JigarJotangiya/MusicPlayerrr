package p159f.p243f.p327d.p329b;

import java.util.Map;
import java.util.function.Consumer;

/* renamed from: f.f.d.b.m */
/* compiled from: lambda */
public final /* synthetic */ class C7695m implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f33041a;

    public /* synthetic */ C7695m(Consumer consumer) {
        this.f33041a = consumer;
    }

    public final void accept(Object obj) {
        this.f33041a.accept(((Map.Entry) obj).getKey());
    }
}
