package p082e.p126k.p127b;

import java.io.IOException;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: e.k.b.a */
/* compiled from: Serializer.kt */
public final class C3813a extends IOException {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3813a(String str, Throwable th, int i, C8589g gVar) {
        this(str, (i & 2) != 0 ? null : th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3813a(String str, Throwable th) {
        super(str, th);
        C8594l.m46771e(str, "message");
    }
}
