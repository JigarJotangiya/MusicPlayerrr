package p159f.p166c.p231p.p232a;

import android.app.Application;
import android.net.Uri;
import androidx.lifecycle.LiveData;
import com.coocent.videostore.p067po.Video;
import java.util.List;
import p159f.p166c.p231p.p235d.C4819b;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8592j;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.p.a.f */
/* compiled from: VideoStoreRepository.kt */
public final class C4793f {

    /* renamed from: b */
    public static final C4794a f13587b = new C4794a((C8589g) null);

    /* renamed from: a */
    private final C4752d f13588a;

    /* renamed from: f.c.p.a.f$a */
    /* compiled from: VideoStoreRepository.kt */
    public static final class C4794a extends C4819b<C4793f, Application> {

        /* renamed from: f.c.p.a.f$a$a */
        /* compiled from: VideoStoreRepository.kt */
        /* synthetic */ class C4795a extends C8592j implements C8570l<Application, C4793f> {
            public static final C4795a INSTANCE = new C4795a();

            C4795a() {
                super(1, C4793f.class, "<init>", "<init>(Landroid/app/Application;)V", 0);
            }

            public final C4793f invoke(Application application) {
                C8594l.m46771e(application, "p0");
                return new C4793f(application);
            }
        }

        private C4794a() {
            super(C4795a.INSTANCE);
        }

        public /* synthetic */ C4794a(C8589g gVar) {
            this();
        }
    }

    public C4793f(Application application) {
        C8594l.m46771e(application, "application");
        this.f13588a = (C4752d) C4752d.f13568e.mo15566a(application);
    }

    /* renamed from: a */
    public final LiveData<Object> mo15517a(List<String> list) {
        C8594l.m46771e(list, "folderPathList");
        return this.f13588a.mo15484m(list);
    }

    /* renamed from: b */
    public final LiveData<Object> mo15518b(List<? extends Video> list) {
        C8594l.m46771e(list, "videos");
        return this.f13588a.mo15483l(list);
    }

    /* renamed from: c */
    public final LiveData<Object> mo15519c(List<? extends Video> list, String str) {
        C8594l.m46771e(list, "videos");
        C8594l.m46771e(str, "path");
        return this.f13588a.mo15485n(list, str);
    }

    /* renamed from: d */
    public final LiveData<List<Video>> mo15520d(String str, boolean z, boolean z2) {
        C8594l.m46771e(str, "order");
        return this.f13588a.mo15486p(str, z, z2);
    }

    /* renamed from: e */
    public final LiveData<List<Video>> mo15521e(String str, boolean z, String str2, boolean z2, boolean z3) {
        C8594l.m46771e(str, "folderOrder");
        C8594l.m46771e(str2, "videoOrder");
        return this.f13588a.mo15487q(str, z, str2, z2, z3);
    }

    /* renamed from: f */
    public final Video mo15522f(boolean z) {
        return this.f13588a.mo15488r(z);
    }

    /* renamed from: g */
    public final LiveData<Video> mo15523g(Uri uri) {
        C8594l.m46771e(uri, "uri");
        return this.f13588a.mo15489s(uri);
    }

    /* renamed from: h */
    public final LiveData<Video> mo15524h(long j) {
        return this.f13588a.mo15490t(j);
    }

    /* renamed from: i */
    public final LiveData<List<Video>> mo15525i(String str, String str2, boolean z, boolean z2) {
        C8594l.m46771e(str, "folderPath");
        C8594l.m46771e(str2, "order");
        return this.f13588a.mo15492v(str, str2, z, z2);
    }

    /* renamed from: j */
    public final LiveData<List<Video>> mo15526j(List<String> list) {
        C8594l.m46771e(list, "folderPathList");
        return this.f13588a.mo15491u(list);
    }

    /* renamed from: k */
    public final void mo15527k(List<Video> list) {
        C8594l.m46771e(list, "videos");
        this.f13588a.mo15476B(list);
    }

    /* renamed from: l */
    public final LiveData<Exception> mo15528l(Video video, String str) {
        C8594l.m46771e(video, "video");
        C8594l.m46771e(str, "title");
        return this.f13588a.mo15477C(video, str);
    }

    /* renamed from: m */
    public final LiveData<Exception> mo15529m() {
        return this.f13588a.mo15478L();
    }

    /* renamed from: n */
    public final LiveData<List<Video>> mo15530n(String str, String str2, boolean z, boolean z2) {
        C8594l.m46771e(str, "query");
        C8594l.m46771e(str2, "order");
        return this.f13588a.mo15479N(str, str2, z, z2);
    }

    /* renamed from: o */
    public final void mo15531o(Video video, Uri uri) {
        C8594l.m46771e(video, "video");
        this.f13588a.mo15480O(video, uri);
    }

    /* renamed from: p */
    public final void mo15532p(List<Video> list, String str) {
        C8594l.m46771e(list, "videoList");
        C8594l.m46771e(str, "path");
        this.f13588a.mo15481P(list, str);
    }

    /* renamed from: q */
    public final void mo15533q(long j, String str, String str2, String str3) {
        C8594l.m46771e(str, "title");
        C8594l.m46771e(str2, "displayName");
        C8594l.m46771e(str3, "path");
        this.f13588a.mo15482Q(j, str, str2, str3);
    }
}
