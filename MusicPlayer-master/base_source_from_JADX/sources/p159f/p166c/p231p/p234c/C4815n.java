package p159f.p166c.p231p.p234c;

import android.annotation.TargetApi;
import android.app.Application;
import android.net.Uri;
import androidx.lifecycle.C0653a;
import androidx.lifecycle.C0670e0;
import androidx.lifecycle.C0692l0;
import androidx.lifecycle.LiveData;
import com.coocent.videostore.p067po.Video;
import java.util.List;
import p159f.p166c.p231p.p232a.C4793f;
import p369i.C8446k;
import p369i.C8452o;
import p369i.C8457t;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.p.c.n */
/* compiled from: VideoStoreViewModel.kt */
public final class C4815n extends C0653a {

    /* renamed from: c */
    private final C4793f f13606c;

    /* renamed from: d */
    private final C0670e0<C8457t> f13607d;

    /* renamed from: e */
    private final LiveData<Exception> f13608e;

    /* renamed from: f */
    private final C0670e0<C8446k<C8446k<String, Boolean>, Boolean>> f13609f;

    /* renamed from: g */
    private final LiveData<List<Video>> f13610g;

    /* renamed from: h */
    private final C0670e0<C8452o<String, C8446k<String, Boolean>, Boolean>> f13611h;

    /* renamed from: i */
    private final LiveData<List<Video>> f13612i;

    /* renamed from: j */
    private final C0670e0<C8452o<String, C8446k<String, Boolean>, Boolean>> f13613j;

    /* renamed from: k */
    private final LiveData<List<Video>> f13614k;

    /* renamed from: l */
    private final C0670e0<C8446k<List<C8446k<String, Boolean>>, Boolean>> f13615l;

    /* renamed from: m */
    private final LiveData<List<Video>> f13616m;

    /* renamed from: n */
    private final C0670e0<List<String>> f13617n;

    /* renamed from: o */
    private final LiveData<List<Video>> f13618o;

    /* renamed from: p */
    private final C0670e0<Uri> f13619p;

    /* renamed from: q */
    private final LiveData<Video> f13620q;

    /* renamed from: r */
    private final C0670e0<Long> f13621r;

    /* renamed from: s */
    private final C0670e0<C8446k<String, Video>> f13622s;

    /* renamed from: t */
    private final C0670e0<List<Video>> f13623t;

    /* renamed from: u */
    private final LiveData<Object> f13624u;

    /* renamed from: v */
    private final C0670e0<C8446k<List<Video>, String>> f13625v;

    /* renamed from: w */
    private final LiveData<Object> f13626w;

    /* renamed from: x */
    private final C0670e0<List<String>> f13627x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4815n(Application application) {
        super(application);
        C8594l.m46771e(application, "application");
        this.f13606c = (C4793f) C4793f.f13587b.mo15566a(application);
        C0670e0<C8457t> e0Var = new C0670e0<>();
        this.f13607d = e0Var;
        LiveData<Exception> a = C0692l0.m4249a(e0Var, new C4807f(this));
        C8594l.m46770d(a, "switchMap(mScanVideoLive…ository.scanVideo()\n    }");
        this.f13608e = a;
        C0670e0<C8446k<C8446k<String, Boolean>, Boolean>> e0Var2 = new C0670e0<>();
        this.f13609f = e0Var2;
        LiveData<List<Video>> a2 = C0692l0.m4249a(e0Var2, new C4805d(this));
        C8594l.m46770d(a2, "switchMap(mAllVideosLive…it.second\n        )\n    }");
        this.f13610g = a2;
        C0670e0<C8452o<String, C8446k<String, Boolean>, Boolean>> e0Var3 = new C0670e0<>();
        this.f13611h = e0Var3;
        LiveData<List<Video>> a3 = C0692l0.m4249a(e0Var3, new C4808g(this));
        C8594l.m46770d(a3, "switchMap(mSearchVideosL…cond, it.third)\n        }");
        this.f13612i = a3;
        C0670e0<C8452o<String, C8446k<String, Boolean>, Boolean>> e0Var4 = new C0670e0<>();
        this.f13613j = e0Var4;
        LiveData<List<Video>> a4 = C0692l0.m4249a(e0Var4, new C4812k(this));
        C8594l.m46770d(a4, "switchMap(mVideosInFolde…d\n            )\n        }");
        this.f13614k = a4;
        C0670e0<C8446k<List<C8446k<String, Boolean>>, Boolean>> e0Var5 = new C0670e0<>();
        this.f13615l = e0Var5;
        LiveData<List<Video>> a5 = C0692l0.m4249a(e0Var5, new C4803b(this));
        C8594l.m46770d(a5, "switchMap(mFolderVideosL…d\n            )\n        }");
        this.f13616m = a5;
        C0670e0<List<String>> e0Var6 = new C0670e0<>();
        this.f13617n = e0Var6;
        LiveData<List<Video>> a6 = C0692l0.m4249a(e0Var6, new C4809h(this));
        C8594l.m46770d(a6, "switchMap(mDeleteVideosI…eosInFolder(it)\n        }");
        this.f13618o = a6;
        C0670e0<Uri> e0Var7 = new C0670e0<>();
        this.f13619p = e0Var7;
        LiveData<Video> a7 = C0692l0.m4249a(e0Var7, new C4806e(this));
        C8594l.m46770d(a7, "switchMap(mVideoByUriLiv…y.getVideoByUri(it)\n    }");
        this.f13620q = a7;
        C0670e0<Long> e0Var8 = new C0670e0<>();
        this.f13621r = e0Var8;
        C8594l.m46770d(C0692l0.m4249a(e0Var8, new C4804c(this)), "switchMap(mVideoByVideoI…eoByVideoId(it)\n        }");
        C0670e0<C8446k<String, Video>> e0Var9 = new C0670e0<>();
        this.f13622s = e0Var9;
        C8594l.m46770d(C0692l0.m4249a(e0Var9, new C4811j(this)), "switchMap(mRenameVideoLi…cond, it.first)\n        }");
        C0670e0<List<Video>> e0Var10 = new C0670e0<>();
        this.f13623t = e0Var10;
        LiveData<Object> a8 = C0692l0.m4249a(e0Var10, new C4802a(this));
        C8594l.m46770d(a8, "switchMap(mDeleteVideosA…ndThumbnail(it)\n        }");
        this.f13624u = a8;
        C0670e0<C8446k<List<Video>, String>> e0Var11 = new C0670e0<>();
        this.f13625v = e0Var11;
        LiveData<Object> a9 = C0692l0.m4249a(e0Var11, new C4810i(this));
        C8594l.m46770d(a9, "switchMap(mEncryptedDele…rst, it.second)\n        }");
        this.f13626w = a9;
        C0670e0<List<String>> e0Var12 = new C0670e0<>();
        this.f13627x = e0Var12;
        C8594l.m46770d(C0692l0.m4249a(e0Var12, new C4813l(this)), "switchMap(mDeleteFolderL…ry.deleteFolder(it)\n    }");
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public static final LiveData m20403P(C4815n nVar, Uri uri) {
        C8594l.m46771e(nVar, "this$0");
        C4793f fVar = nVar.f13606c;
        C8594l.m46770d(uri, "it");
        return fVar.mo15523g(uri);
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public static final LiveData m20404R(C4815n nVar, C8446k kVar) {
        C8594l.m46771e(nVar, "this$0");
        return nVar.f13606c.mo15528l((Video) kVar.getSecond(), (String) kVar.getFirst());
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public static final LiveData m20405T(C4815n nVar, C8457t tVar) {
        C8594l.m46771e(nVar, "this$0");
        return nVar.f13606c.mo15529m();
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public static final LiveData m20406V(C4815n nVar, C8452o oVar) {
        C8594l.m46771e(nVar, "this$0");
        return nVar.f13606c.mo15530n((String) oVar.getFirst(), (String) ((C8446k) oVar.getSecond()).getFirst(), ((Boolean) ((C8446k) oVar.getSecond()).getSecond()).booleanValue(), ((Boolean) oVar.getThird()).booleanValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public static final LiveData m20407Z(C4815n nVar, Long l) {
        C8594l.m46771e(nVar, "this$0");
        C4793f fVar = nVar.f13606c;
        C8594l.m46770d(l, "it");
        return fVar.mo15524h(l.longValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public static final LiveData m20408a0(C4815n nVar, C8452o oVar) {
        C8594l.m46771e(nVar, "this$0");
        return nVar.f13606c.mo15525i((String) oVar.getFirst(), (String) ((C8446k) oVar.getSecond()).getFirst(), ((Boolean) ((C8446k) oVar.getSecond()).getSecond()).booleanValue(), ((Boolean) oVar.getThird()).booleanValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final LiveData m20409f(C4815n nVar, C8446k kVar) {
        C8594l.m46771e(nVar, "this$0");
        return nVar.f13606c.mo15520d((String) ((C8446k) kVar.getFirst()).getFirst(), ((Boolean) ((C8446k) kVar.getFirst()).getSecond()).booleanValue(), ((Boolean) kVar.getSecond()).booleanValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final LiveData m20410g(C4815n nVar, List list) {
        C8594l.m46771e(nVar, "this$0");
        C4793f fVar = nVar.f13606c;
        C8594l.m46770d(list, "it");
        return fVar.mo15517a(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final LiveData m20411i(C4815n nVar, List list) {
        C8594l.m46771e(nVar, "this$0");
        C4793f fVar = nVar.f13606c;
        C8594l.m46770d(list, "it");
        return fVar.mo15518b(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final LiveData m20412j(C4815n nVar, List list) {
        C8594l.m46771e(nVar, "this$0");
        C4793f fVar = nVar.f13606c;
        C8594l.m46770d(list, "it");
        return fVar.mo15526j(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final LiveData m20413l(C4815n nVar, C8446k kVar) {
        C8594l.m46771e(nVar, "this$0");
        return nVar.f13606c.mo15519c((List) kVar.getFirst(), (String) kVar.getSecond());
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final LiveData m20414m(C4815n nVar, C8446k kVar) {
        C8594l.m46771e(nVar, "this$0");
        return nVar.f13606c.mo15521e((String) ((C8446k) ((List) kVar.getFirst()).get(0)).getFirst(), ((Boolean) ((C8446k) ((List) kVar.getFirst()).get(0)).getSecond()).booleanValue(), (String) ((C8446k) ((List) kVar.getFirst()).get(1)).getFirst(), ((Boolean) ((C8446k) ((List) kVar.getFirst()).get(1)).getSecond()).booleanValue(), ((Boolean) kVar.getSecond()).booleanValue());
    }

    /* renamed from: A */
    public final void mo15539A(String str, C8446k<String, Boolean> kVar, boolean z) {
        C8594l.m46771e(str, "folderPath");
        C8594l.m46771e(kVar, "sortPair");
        this.f13613j.mo4156o(new C8452o(str, kVar, Boolean.valueOf(z)));
    }

    /* renamed from: B */
    public final LiveData<List<Video>> mo15540B() {
        return this.f13614k;
    }

    /* renamed from: C */
    public final LiveData<List<Video>> mo15541C(String str, C8446k<String, Boolean> kVar, boolean z) {
        C8594l.m46771e(str, "folderPath");
        C8594l.m46771e(kVar, "sortPair");
        return this.f13606c.mo15525i(str, kVar.getFirst(), kVar.getSecond().booleanValue(), z);
    }

    @TargetApi(30)
    /* renamed from: Q */
    public final void mo15542Q(List<Video> list) {
        C8594l.m46771e(list, "videoList");
        this.f13606c.mo15527k(list);
    }

    /* renamed from: S */
    public final void mo15543S() {
        this.f13607d.mo4156o(C8457t.f34900a);
    }

    /* renamed from: U */
    public final void mo15544U(String str, C8446k<String, Boolean> kVar, boolean z) {
        C8594l.m46771e(str, "query");
        C8594l.m46771e(kVar, "sortPair");
        this.f13611h.mo4156o(new C8452o(str, kVar, Boolean.valueOf(z)));
    }

    /* renamed from: W */
    public final void mo15545W(Video video, Uri uri) {
        C8594l.m46771e(video, "video");
        this.f13606c.mo15531o(video, uri);
    }

    /* renamed from: X */
    public final void mo15546X(List<Video> list, String str) {
        C8594l.m46771e(list, "videoList");
        C8594l.m46771e(str, "path");
        this.f13606c.mo15532p(list, str);
    }

    /* renamed from: Y */
    public final void mo15547Y(long j, String str, String str2, String str3) {
        C8594l.m46771e(str, "title");
        C8594l.m46771e(str2, "displayName");
        C8594l.m46771e(str3, "path");
        this.f13606c.mo15533q(j, str, str2, str3);
    }

    /* renamed from: h */
    public final void mo15548h(List<? extends Video> list) {
        C8594l.m46771e(list, "videoList");
        this.f13623t.mo4156o(list);
    }

    /* renamed from: k */
    public final void mo15549k(List<? extends Video> list, String str) {
        C8594l.m46771e(list, "videoList");
        C8594l.m46771e(str, "path");
        this.f13625v.mo4156o(new C8446k(list, str));
    }

    /* renamed from: n */
    public final LiveData<List<Video>> mo15550n() {
        return this.f13610g;
    }

    /* renamed from: o */
    public final void mo15551o(C8446k<String, Boolean> kVar, boolean z) {
        C8594l.m46771e(kVar, "sortPair");
        this.f13609f.mo4156o(new C8446k(kVar, Boolean.valueOf(z)));
    }

    /* renamed from: p */
    public final LiveData<Object> mo15552p() {
        return this.f13624u;
    }

    /* renamed from: q */
    public final void mo15553q(List<String> list) {
        C8594l.m46771e(list, "folderPathList");
        this.f13617n.mo4156o(list);
    }

    /* renamed from: r */
    public final LiveData<List<Video>> mo15554r() {
        return this.f13618o;
    }

    /* renamed from: s */
    public final LiveData<Object> mo15555s() {
        return this.f13626w;
    }

    /* renamed from: t */
    public final void mo15556t(List<C8446k<String, Boolean>> list, boolean z) {
        C8594l.m46771e(list, "sortPairList");
        this.f13615l.mo4156o(new C8446k(list, Boolean.valueOf(z)));
    }

    /* renamed from: u */
    public final LiveData<List<Video>> mo15557u() {
        return this.f13616m;
    }

    /* renamed from: v */
    public final Video mo15558v(boolean z) {
        return this.f13606c.mo15522f(z);
    }

    /* renamed from: w */
    public final LiveData<Video> mo15559w() {
        return this.f13620q;
    }

    /* renamed from: x */
    public final LiveData<Exception> mo15560x() {
        return this.f13608e;
    }

    /* renamed from: y */
    public final LiveData<List<Video>> mo15561y() {
        return this.f13612i;
    }

    /* renamed from: z */
    public final void mo15562z(Uri uri) {
        C8594l.m46771e(uri, "uri");
        this.f13619p.mo4156o(uri);
    }
}
