package p159f.p166c.p231p.p235d.p236c;

import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.c.p.d.c.a */
/* compiled from: DeleteFailedException.kt */
public final class C4820a extends Exception {
    public C4820a() {
        this((String) null, 1, (C8589g) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4820a(String str) {
        super(str);
        C8594l.m46771e(str, "msg");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4820a(String str, int i, C8589g gVar) {
        this((i & 1) != 0 ? BuildConfig.FLAVOR : str);
    }
}
