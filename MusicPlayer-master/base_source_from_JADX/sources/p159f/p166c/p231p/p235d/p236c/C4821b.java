package p159f.p166c.p231p.p235d.p236c;

import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.c.p.d.c.b */
/* compiled from: RenameFailedException.kt */
public final class C4821b extends Exception {
    public C4821b() {
        this((String) null, 1, (C8589g) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4821b(String str) {
        super(str);
        C8594l.m46771e(str, "msg");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4821b(String str, int i, C8589g gVar) {
        this((i & 1) != 0 ? BuildConfig.FLAVOR : str);
    }
}
