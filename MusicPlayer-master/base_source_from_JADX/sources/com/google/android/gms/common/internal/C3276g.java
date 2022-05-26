package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import androidx.annotation.RecentlyNonNull;

/* renamed from: com.google.android.gms.common.internal.g */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class C3276g {

    /* renamed from: a */
    private static int f10629a = 4225;

    /* renamed from: b */
    private static final Object f10630b = new Object();

    /* renamed from: c */
    private static C3276g f10631c;

    /* renamed from: a */
    public static int m14203a() {
        return f10629a;
    }

    @RecentlyNonNull
    /* renamed from: b */
    public static C3276g m14204b(@RecentlyNonNull Context context) {
        synchronized (f10630b) {
            if (f10631c == null) {
                f10631c = new C3260c1(context.getApplicationContext());
            }
        }
        return f10631c;
    }

    /* renamed from: c */
    public final void mo11841c(@RecentlyNonNull String str, @RecentlyNonNull String str2, int i, @RecentlyNonNull ServiceConnection serviceConnection, @RecentlyNonNull String str3, boolean z) {
        mo11769e(new C3327y0(str, str2, i, z), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo11768d(C3327y0 y0Var, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo11769e(C3327y0 y0Var, ServiceConnection serviceConnection, String str);
}
