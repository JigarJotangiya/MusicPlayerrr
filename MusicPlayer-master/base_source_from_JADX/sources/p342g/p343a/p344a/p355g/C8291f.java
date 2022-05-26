package p342g.p343a.p344a.p355g;

import com.google.android.gms.ads.C2894c;
import com.google.android.gms.ads.C2900e;
import com.google.android.gms.ads.C2903f;
import com.google.android.gms.ads.C3060l;
import com.google.android.gms.ads.C3116u;
import com.google.android.gms.ads.formats.C2908c;
import com.google.android.gms.ads.nativead.C3098a;
import net.coocent.android.xmlparser.application.AbstractApplication;
import p342g.p343a.p344a.p358i.C8345u;
import p369i.p387z.p389d.C8594l;

/* renamed from: g.a.a.g.f */
/* compiled from: NativeAd.kt */
public final class C8291f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C2900e f34689a;

    /* renamed from: g.a.a.g.f$a */
    /* compiled from: NativeAd.kt */
    public static final class C8292a extends C2894c {

        /* renamed from: a */
        final /* synthetic */ C8291f f34690a;

        /* renamed from: b */
        final /* synthetic */ C8293g f34691b;

        C8292a(C8291f fVar, C8293g gVar) {
            this.f34690a = fVar;
            this.f34691b = gVar;
        }

        /* renamed from: g */
        public void mo10629g(C3060l lVar) {
            C8594l.m46771e(lVar, "p0");
            super.mo10629g(lVar);
            C2900e a = this.f34690a.f34689a;
            if (a != null) {
                C8293g gVar = this.f34691b;
                if (!a.mo10723a()) {
                    gVar.mo26894b();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m45885d(C8291f fVar, C8293g gVar, C3098a aVar) {
        C8594l.m46771e(fVar, "this$0");
        C8594l.m46771e(gVar, "$nativeLoadCallBack");
        C8594l.m46771e(aVar, "unifiedNativeAd");
        if (fVar.f34689a != null) {
            gVar.mo26893a(aVar);
        }
    }

    /* renamed from: c */
    public final void mo29992c(int i, C8293g gVar) {
        C8594l.m46771e(gVar, "nativeLoadCallBack");
        C2900e.C2901a aVar = new C2900e.C2901a(C8345u.m46327h().getApplicationContext(), AbstractApplication.get(4325));
        aVar.mo10728c(new C8281a(this, gVar));
        C2908c.C2909a aVar2 = new C2908c.C2909a();
        C3116u.C3117a aVar3 = new C3116u.C3117a();
        aVar3.mo11372b(true);
        aVar2.mo10771h(aVar3.mo11371a());
        aVar2.mo10769f(true);
        aVar2.mo10765b(1);
        aVar2.mo10767d(3);
        aVar.mo10731f(aVar2.mo10764a());
        aVar.mo10730e(new C8292a(this, gVar));
        this.f34689a = aVar.mo10726a();
        C2903f.C2904a aVar4 = new C2903f.C2904a();
        C2900e eVar = this.f34689a;
        if (eVar != null) {
            eVar.mo10725c(aVar4.mo10736c(), i);
        }
    }
}
