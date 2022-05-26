package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.formats.C2908c;
import com.google.android.gms.ads.formats.C2910d;
import com.google.android.gms.ads.formats.C2913e;
import com.google.android.gms.ads.nativead.C3098a;
import com.google.android.gms.ads.nativead.C3102b;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.internal.ads.C4980cv;
import com.google.android.gms.internal.ads.C5016du;
import com.google.android.gms.internal.ads.C5280ky;
import com.google.android.gms.internal.ads.C5573sv;
import com.google.android.gms.internal.ads.C5645ut;
import com.google.android.gms.internal.ads.C5684vv;
import com.google.android.gms.internal.ads.C5686vx;
import com.google.android.gms.internal.ads.ie0;
import com.google.android.gms.internal.ads.u40;
import com.google.android.gms.internal.ads.ul0;
import com.google.android.gms.internal.ads.v40;
import com.google.android.gms.internal.ads.za0;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzbnw;

/* renamed from: com.google.android.gms.ads.e */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class C2900e {

    /* renamed from: a */
    private final C5016du f9764a;

    /* renamed from: b */
    private final Context f9765b;

    /* renamed from: c */
    private final C5573sv f9766c;

    /* renamed from: com.google.android.gms.ads.e$a */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public static class C2901a {

        /* renamed from: a */
        private final Context f9767a;

        /* renamed from: b */
        private final C5684vv f9768b;

        public C2901a(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
            C3292l.m14241i(context, "context cannot be null");
            C5684vv c = C4980cv.m22122a().mo15965c(context, str, new za0());
            this.f9767a = context;
            this.f9768b = c;
        }

        @RecentlyNonNull
        /* renamed from: a */
        public C2900e mo10726a() {
            try {
                return new C2900e(this.f9767a, this.f9768b.zze(), C5016du.f15749a);
            } catch (RemoteException e) {
                ul0.m31860e("Failed to build AdLoader.", e);
                return new C2900e(this.f9767a, new C5280ky().mo19030f7(), C5016du.f15749a);
            }
        }

        @RecentlyNonNull
        @Deprecated
        /* renamed from: b */
        public C2901a mo10727b(@RecentlyNonNull String str, @RecentlyNonNull C2910d.C2912b bVar, C2910d.C2911a aVar) {
            u40 u40 = new u40(bVar, aVar);
            try {
                this.f9768b.mo19033w2(str, u40.mo21217e(), u40.mo21216d());
            } catch (RemoteException e) {
                ul0.m31863h("Failed to add custom template ad listener", e);
            }
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public C2901a mo10728c(@RecentlyNonNull C3098a.C3101c cVar) {
            try {
                this.f9768b.mo19026T2(new ie0(cVar));
            } catch (RemoteException e) {
                ul0.m31863h("Failed to add google native ad listener", e);
            }
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        /* renamed from: d */
        public C2901a mo10729d(@RecentlyNonNull C2913e.C2914a aVar) {
            try {
                this.f9768b.mo19026T2(new v40(aVar));
            } catch (RemoteException e) {
                ul0.m31863h("Failed to add google native ad listener", e);
            }
            return this;
        }

        @RecentlyNonNull
        /* renamed from: e */
        public C2901a mo10730e(@RecentlyNonNull C2894c cVar) {
            try {
                this.f9768b.mo19032v6(new C5645ut(cVar));
            } catch (RemoteException e) {
                ul0.m31863h("Failed to set AdListener.", e);
            }
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        /* renamed from: f */
        public C2901a mo10731f(@RecentlyNonNull C2908c cVar) {
            try {
                this.f9768b.mo19022D2(new zzbnw(cVar));
            } catch (RemoteException e) {
                ul0.m31863h("Failed to specify native ad options", e);
            }
            return this;
        }

        @RecentlyNonNull
        /* renamed from: g */
        public C2901a mo10732g(@RecentlyNonNull C3102b bVar) {
            try {
                this.f9768b.mo19022D2(new zzbnw(4, bVar.mo11329e(), -1, bVar.mo11328d(), bVar.mo11325a(), bVar.mo11327c() != null ? new zzbkq(bVar.mo11327c()) : null, bVar.mo11330f(), bVar.mo11326b()));
            } catch (RemoteException e) {
                ul0.m31863h("Failed to specify native ad options", e);
            }
            return this;
        }
    }

    C2900e(Context context, C5573sv svVar, C5016du duVar) {
        this.f9765b = context;
        this.f9766c = svVar;
        this.f9764a = duVar;
    }

    /* renamed from: d */
    private final void m12948d(C5686vx vxVar) {
        try {
            this.f9766c.mo15719r4(this.f9764a.mo17016a(this.f9765b, vxVar));
        } catch (RemoteException e) {
            ul0.m31860e("Failed to load ad.", e);
        }
    }

    /* renamed from: a */
    public boolean mo10723a() {
        try {
            return this.f9766c.mo15718g();
        } catch (RemoteException e) {
            ul0.m31863h("Failed to check if ad is loading.", e);
            return false;
        }
    }

    /* renamed from: b */
    public void mo10724b(@RecentlyNonNull C2903f fVar) {
        m12948d(fVar.mo10733a());
    }

    /* renamed from: c */
    public void mo10725c(@RecentlyNonNull C2903f fVar, int i) {
        try {
            this.f9766c.mo15716Y0(this.f9764a.mo17016a(this.f9765b, fVar.mo10733a()), i);
        } catch (RemoteException e) {
            ul0.m31860e("Failed to load ads.", e);
        }
    }
}
