package p159f.p166c.p224o.p227m;

import android.app.Application;
import androidx.lifecycle.C0696m0;
import androidx.lifecycle.C0703o0;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.o.m.h */
/* compiled from: VideoLibraryViewModel.kt */
public final class C4680h extends C0703o0.C0704a {

    /* renamed from: d */
    private final Application f13464d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4680h(Application application) {
        super(application);
        C8594l.m46771e(application, "mApplication");
        this.f13464d = application;
    }

    /* renamed from: a */
    public <T extends C0696m0> T mo4019a(Class<T> cls) {
        C8594l.m46771e(cls, "modelClass");
        return new C4681i(this.f13464d);
    }
}
