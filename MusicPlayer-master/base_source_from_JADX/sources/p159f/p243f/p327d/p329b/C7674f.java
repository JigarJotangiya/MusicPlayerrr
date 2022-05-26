package p159f.p243f.p327d.p329b;

import java.util.function.Consumer;
import java.util.function.Function;

/* renamed from: f.f.d.b.f */
/* compiled from: lambda */
public final /* synthetic */ class C7674f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f33029a;

    /* renamed from: b */
    public final /* synthetic */ Function f33030b;

    public /* synthetic */ C7674f(Consumer consumer, Function function) {
        this.f33029a = consumer;
        this.f33030b = function;
    }

    public final void accept(Object obj) {
        this.f33029a.accept(this.f33030b.apply(obj));
    }
}
