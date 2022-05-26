package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.y3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5767y3 {

    /* renamed from: a */
    private String f26237a;

    /* renamed from: b */
    private Uri f26238b;

    /* renamed from: c */
    private final C4881a6 f26239c = new C4881a6();

    /* renamed from: d */
    private final List f26240d;

    /* renamed from: e */
    private final g43<C5823zl> f26241e;

    /* renamed from: f */
    private final C5113gf f26242f;

    public C5767y3() {
        new C5035ec((C5034eb) null);
        this.f26240d = Collections.emptyList();
        this.f26241e = g43.zzo();
        this.f26242f = new C5113gf();
    }

    /* renamed from: a */
    public final C5767y3 mo22158a(String str) {
        this.f26237a = str;
        return this;
    }

    /* renamed from: b */
    public final C5767y3 mo22159b(Uri uri) {
        this.f26238b = uri;
        return this;
    }

    /* renamed from: c */
    public final C5825zn mo22160c() {
        Uri uri = this.f26238b;
        C5822zk zkVar = uri != null ? new C5822zk(uri, (String) null, (C5074fd) null, (C5729x2) null, this.f26240d, (String) null, this.f26241e, (Object) null, (C5784yj) null) : null;
        String str = this.f26237a;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        return new C5825zn(str, new C4996da(this.f26239c, (C4958c9) null), zkVar, new C5040eh(this.f26242f), C5755xs.f25939s, (C5787ym) null);
    }
}
