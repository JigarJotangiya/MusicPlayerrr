package p159f.p243f.p327d.p329b;

import java.util.function.Consumer;
import java.util.function.Function;

/* renamed from: f.f.d.b.g */
/* compiled from: lambda */
public final /* synthetic */ class C7680g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f33033a;

    /* renamed from: b */
    public final /* synthetic */ Function f33034b;

    public /* synthetic */ C7680g(Consumer consumer, Function function) {
        this.f33033a = consumer;
        this.f33034b = function;
    }

    public final void accept(Object obj) {
        this.f33033a.accept(this.f33034b.apply(obj));
    }
}
