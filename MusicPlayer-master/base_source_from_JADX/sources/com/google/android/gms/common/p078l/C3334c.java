package com.google.android.gms.common.p078l;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;

/* renamed from: com.google.android.gms.common.l.c */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C3334c {

    /* renamed from: b */
    private static C3334c f10703b = new C3334c();

    /* renamed from: a */
    private C3333b f10704a = null;

    @RecentlyNonNull
    /* renamed from: a */
    public static C3333b m14368a(@RecentlyNonNull Context context) {
        return f10703b.mo11915b(context);
    }

    @RecentlyNonNull
    /* renamed from: b */
    public final synchronized C3333b mo11915b(@RecentlyNonNull Context context) {
        if (this.f10704a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f10704a = new C3333b(context);
        }
        return this.f10704a;
    }
}
