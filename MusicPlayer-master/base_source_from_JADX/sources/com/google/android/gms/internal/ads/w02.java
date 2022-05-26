package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class w02 implements o83<SQLiteDatabase> {

    /* renamed from: a */
    final /* synthetic */ ys2 f25168a;

    w02(x02 x02, ys2 ys2) {
        this.f25168a = ys2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10677a(Object obj) {
        try {
            this.f25168a.mo15625b((SQLiteDatabase) obj);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            ul0.m31859d(valueOf.length() != 0 ? "Error executing function on offline signal database: ".concat(valueOf) : new String("Error executing function on offline signal database: "));
        }
    }

    /* renamed from: b */
    public final void mo10678b(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        ul0.m31859d(valueOf.length() != 0 ? "Failed to get offline signal database: ".concat(valueOf) : new String("Failed to get offline signal database: "));
    }
}
