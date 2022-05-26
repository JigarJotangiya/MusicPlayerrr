package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.p073w.C3120a;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p159f.p243f.p245b.p246a.p303f.C7470h;
import p159f.p243f.p245b.p246a.p303f.C7473k;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xy2 {

    /* renamed from: a */
    private final Context f26122a;

    /* renamed from: b */
    private final Executor f26123b;

    /* renamed from: c */
    private final dy2 f26124c;

    /* renamed from: d */
    private final fy2 f26125d;

    /* renamed from: e */
    private final vy2 f26126e;

    /* renamed from: f */
    private final vy2 f26127f;

    /* renamed from: g */
    private C7470h<C5513r8> f26128g;

    /* renamed from: h */
    private C7470h<C5513r8> f26129h;

    xy2(Context context, Executor executor, dy2 dy2, fy2 fy2, ty2 ty2, uy2 uy2) {
        this.f26122a = context;
        this.f26123b = executor;
        this.f26124c = dy2;
        this.f26125d = fy2;
        this.f26126e = ty2;
        this.f26127f = uy2;
    }

    /* renamed from: e */
    public static xy2 m33902e(Context context, Executor executor, dy2 dy2, fy2 fy2) {
        xy2 xy2 = new xy2(context, executor, dy2, fy2, new ty2(), new uy2());
        if (xy2.f26125d.mo17771d()) {
            xy2.f26128g = xy2.m33904h(new ry2(xy2));
        } else {
            xy2.f26128g = C7473k.m41915c(xy2.f26126e.zza());
        }
        xy2.f26129h = xy2.m33904h(new sy2(xy2));
        return xy2;
    }

    /* renamed from: g */
    private static C5513r8 m33903g(C7470h<C5513r8> hVar, C5513r8 r8Var) {
        if (!hVar.mo28343m()) {
            return r8Var;
        }
        return hVar.mo28340j();
    }

    /* renamed from: h */
    private final C7470h<C5513r8> m33904h(Callable<C5513r8> callable) {
        return C7473k.m41913a(this.f26123b, callable).mo28334d(this.f26123b, new qy2(this));
    }

    /* renamed from: a */
    public final C5513r8 mo22117a() {
        return m33903g(this.f26128g, this.f26126e.zza());
    }

    /* renamed from: b */
    public final C5513r8 mo22118b() {
        return m33903g(this.f26129h, this.f26127f.zza());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ C5513r8 mo22119c() throws Exception {
        Context context = this.f26122a;
        C4920b8 f0 = C5513r8.m29957f0();
        C3120a.C3121a b = C3120a.m13692b(context);
        String a = b.mo11379a();
        if (a != null && a.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(a);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            a = Base64.encodeToString(bArr, 11);
        }
        if (a != null) {
            f0.mo16127l0(a);
            f0.mo16126k0(b.mo11380b());
            f0.mo16106O(6);
        }
        return (C5513r8) f0.mo19761n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ C5513r8 mo22120d() throws Exception {
        Context context = this.f26122a;
        return ly2.m27006a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo22121f(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f26124c.mo17048c(2025, -1, exc);
    }
}
