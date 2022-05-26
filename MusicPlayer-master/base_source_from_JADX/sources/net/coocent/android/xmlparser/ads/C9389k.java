package net.coocent.android.xmlparser.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C2903f;
import com.google.android.gms.ads.C3060l;
import com.google.android.gms.ads.p071c0.C2896b;
import com.google.android.gms.ads.p071c0.C2897c;
import net.coocent.android.xmlparser.application.AbstractApplication;
import net.coocent.android.xmlparser.p461z.C9564d;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: net.coocent.android.xmlparser.ads.k */
/* compiled from: RewardedVideoAdCreator */
public class C9389k {

    /* renamed from: a */
    private final Context f36251a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f36252b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final boolean f36253c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C9391b f36254d;

    /* renamed from: e */
    private final C2897c f36255e = new C9390a();

    /* renamed from: net.coocent.android.xmlparser.ads.k$a */
    /* compiled from: RewardedVideoAdCreator */
    class C9390a extends C2897c {
        C9390a() {
        }

        /* renamed from: a */
        public void mo10633a(C3060l lVar) {
            super.mo10633a(lVar);
            int i = 4340;
            if (C9389k.this.f36252b == 4329 || C9389k.this.f36252b == 4341) {
                Log.i("PromotionGmsAds", "High quality video ads load failed " + lVar.mo10665a());
                C9389k kVar = C9389k.this;
                if (!kVar.f36253c) {
                    i = 4328;
                }
                int unused = kVar.f36252b = i;
            } else if (C9389k.this.f36252b == 4328 || C9389k.this.f36252b == 4340) {
                Log.i("PromotionGmsAds", "Common quality video ads load failed " + lVar.mo10665a());
                C9389k kVar2 = C9389k.this;
                int unused2 = kVar2.f36252b = kVar2.f36253c ? 4339 : 4327;
            } else {
                Log.i("PromotionGmsAds", "Low quality video ads load failed " + lVar.mo10665a());
                if (C9389k.this.f36254d != null) {
                    C9389k.this.f36254d.mo32462a(lVar);
                    return;
                }
                return;
            }
            C9389k.this.mo32491f();
        }

        /* renamed from: c */
        public void mo10634b(C2896b bVar) {
            super.mo10634b(bVar);
            C9389k.this.m49639g();
            if (C9389k.this.f36254d != null) {
                C9389k.this.f36254d.mo32463b(bVar);
            }
        }
    }

    /* renamed from: net.coocent.android.xmlparser.ads.k$b */
    /* compiled from: RewardedVideoAdCreator */
    public interface C9391b {
        /* renamed from: a */
        void mo32462a(C3060l lVar);

        /* renamed from: b */
        void mo32463b(C2896b bVar);
    }

    public C9389k(Context context, boolean z, C9391b bVar) {
        this.f36251a = context.getApplicationContext();
        this.f36253c = z;
        this.f36254d = bVar;
        m49639g();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m49639g() {
        this.f36252b = this.f36253c ? 4341 : 4329;
    }

    /* renamed from: f */
    public void mo32491f() {
        String str;
        try {
            str = AbstractApplication.get(this.f36252b);
        } catch (UnsatisfiedLinkError unused) {
            C9564d.m50188n(this.f36251a);
            str = BuildConfig.FLAVOR;
        }
        C2903f.C2904a aVar = new C2903f.C2904a();
        Bundle bundle = new Bundle();
        bundle.putString("npa", "1");
        aVar.mo10735b(AdMobAdapter.class, bundle);
        C2896b.m12935a(this.f36251a, str, aVar.mo10736c(), this.f36255e);
    }
}
