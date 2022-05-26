package p159f.p243f.p327d.p329b;

import java.util.Collection;
import java.util.function.BiConsumer;

/* renamed from: f.f.d.b.e */
/* compiled from: lambda */
public final /* synthetic */ class C7672e implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ BiConsumer f33028a;

    public /* synthetic */ C7672e(BiConsumer biConsumer) {
        this.f33028a = biConsumer;
    }

    public final void accept(Object obj, Object obj2) {
        ((Collection) obj2).forEach(new C7664d(this.f33028a, obj));
    }
}
