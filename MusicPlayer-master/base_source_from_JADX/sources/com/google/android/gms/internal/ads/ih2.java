package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.p073w.C3120a;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ih2 implements sg2<jh2> {

    /* renamed from: a */
    private final Context f17999a;

    /* renamed from: b */
    private final ScheduledExecutorService f18000b;

    /* renamed from: c */
    private final Executor f18001c;

    /* renamed from: d */
    private final int f18002d;

    /* renamed from: e */
    private final xk0 f18003e;

    public ih2(xk0 xk0, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, byte[] bArr) {
        this.f18003e = xk0;
        this.f17999a = context;
        this.f18000b = scheduledExecutorService;
        this.f18001c = executor;
        this.f18002d = i;
    }

    /* renamed from: a */
    public final d93<jh2> mo15767a() {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22291B0)).booleanValue()) {
            return s83.m30606h(new Exception("Did not ad Ad ID into query param."));
        }
        return s83.m30604f((j83) s83.m30613o(s83.m30611m(j83.m25564E(this.f18003e.mo22046a(this.f17999a, this.f18002d)), hh2.f17666a, this.f18001c), ((Long) C5054ev.m23225c().mo20153b(C5503qz.f22299C0)).longValue(), TimeUnit.MILLISECONDS, this.f18000b), Throwable.class, new gh2(this), this.f18001c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ jh2 mo18354b(Throwable th) {
        String str;
        C4980cv.m22123b();
        ContentResolver contentResolver = this.f17999a.getContentResolver();
        if (contentResolver == null) {
            str = null;
        } else {
            str = Settings.Secure.getString(contentResolver, "android_id");
        }
        return new jh2((C3120a.C3121a) null, str);
    }
}
