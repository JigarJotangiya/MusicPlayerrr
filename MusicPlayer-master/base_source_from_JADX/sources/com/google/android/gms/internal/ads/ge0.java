package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.C3061m;
import com.google.android.gms.ads.nativead.C3098a;
import java.util.ArrayList;
import java.util.List;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class ge0 extends C3098a {

    /* renamed from: a */
    private final m40 f17027a;

    /* renamed from: b */
    private final List<C3098a.C3100b> f17028b = new ArrayList();

    /* renamed from: c */
    private final fe0 f17029c;

    /* renamed from: d */
    private final List<Object> f17030d = new ArrayList();

    public ge0(m40 m40) {
        this.f17027a = m40;
        fe0 fe0 = null;
        try {
            List u = m40.mo18814u();
            if (u != null) {
                for (Object next : u) {
                    q20 e7 = next instanceof IBinder ? p20.m28834e7((IBinder) next) : null;
                    if (e7 != null) {
                        this.f17028b.add(new fe0(e7));
                    }
                }
            }
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
        }
        try {
            List t = this.f17027a.mo18813t();
            if (t != null) {
                for (Object next2 : t) {
                    C5797yw e72 = next2 instanceof IBinder ? C5759xw.m33857e7((IBinder) next2) : null;
                    if (e72 != null) {
                        this.f17030d.add(new C5834zw(e72));
                    }
                }
            }
        } catch (RemoteException e2) {
            ul0.m31860e(BuildConfig.FLAVOR, e2);
        }
        try {
            q20 i = this.f17027a.mo18806i();
            if (i != null) {
                fe0 = new fe0(i);
            }
        } catch (RemoteException e3) {
            ul0.m31860e(BuildConfig.FLAVOR, e3);
        }
        this.f17029c = fe0;
        try {
            if (this.f17027a.mo18804g() != null) {
                new ee0(this.f17027a.mo18804g());
            }
        } catch (RemoteException e4) {
            ul0.m31860e(BuildConfig.FLAVOR, e4);
        }
    }

    /* renamed from: a */
    public final String mo11313a() {
        try {
            return this.f17027a.mo18808k();
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    /* renamed from: b */
    public final String mo11314b() {
        try {
            return this.f17027a.mo18809l();
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    /* renamed from: c */
    public final String mo11315c() {
        try {
            return this.f17027a.zzp();
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    /* renamed from: d */
    public final String mo11316d() {
        try {
            return this.f17027a.mo18812o();
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    /* renamed from: e */
    public final C3098a.C3100b mo11317e() {
        return this.f17029c;
    }

    /* renamed from: f */
    public final List<C3098a.C3100b> mo11318f() {
        return this.f17028b;
    }

    /* renamed from: g */
    public final C3061m mo11319g() {
        try {
            if (this.f17027a.mo18805h() != null) {
                return new C5095fy(this.f17027a.mo18805h());
            }
            return null;
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    /* renamed from: h */
    public final Double mo11320h() {
        try {
            double zze = this.f17027a.zze();
            if (zze == -1.0d) {
                return null;
            }
            return Double.valueOf(zze);
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    /* renamed from: i */
    public final String mo11321i() {
        try {
            return this.f17027a.mo18811n();
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ Object mo11322j() {
        try {
            return this.f17027a.mo18810m();
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
            return null;
        }
    }
}
