package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.C8919v0;
import p369i.p387z.p389d.C8589g;

/* renamed from: kotlinx.coroutines.internal.l */
/* compiled from: InlineList.kt */
public final class C8839l<E> {
    /* renamed from: a */
    public static <E> Object m47574a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static /* synthetic */ Object m47575b(Object obj, int i, C8589g gVar) {
        if ((i & 1) != 0) {
            obj = null;
        }
        m47574a(obj);
        return obj;
    }

    /* renamed from: c */
    public static final Object m47576c(Object obj, E e) {
        if (C8919v0.m47824a() && !(!(e instanceof List))) {
            throw new AssertionError();
        } else if (obj == null) {
            m47574a(e);
            return e;
        } else if (obj instanceof ArrayList) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList) obj).add(e);
            m47574a(obj);
            return obj;
        } else {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(e);
            m47574a(arrayList);
            return arrayList;
        }
    }
}
