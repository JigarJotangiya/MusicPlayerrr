package p159f.p166c.p231p.p234c;

import android.app.Application;
import androidx.lifecycle.C0696m0;
import androidx.lifecycle.C0703o0;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.p.c.m */
/* compiled from: VideoStoreViewModel.kt */
public final class C4814m extends C0703o0.C0704a {

    /* renamed from: d */
    private final Application f13605d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4814m(Application application) {
        super(application);
        C8594l.m46771e(application, "mApplication");
        this.f13605d = application;
    }

    /* renamed from: a */
    public <T extends C0696m0> T mo4019a(Class<T> cls) {
        C8594l.m46771e(cls, "modelClass");
        return new C4815n(this.f13605d);
    }
}
