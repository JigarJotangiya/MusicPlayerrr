package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class x12 implements o83<SQLiteDatabase> {

    /* renamed from: a */
    final /* synthetic */ ys2 f25625a;

    x12(y12 y12, ys2 ys2) {
        this.f25625a = ys2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10677a(Object obj) {
        String str;
        try {
            this.f25625a.mo15625b((SQLiteDatabase) obj);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str = "Error executing function on offline buffered ping database: ".concat(valueOf);
            } else {
                str = new String("Error executing function on offline buffered ping database: ");
            }
            ul0.m31859d(str);
        }
    }

    /* renamed from: b */
    public final void mo10678b(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        ul0.m31859d(valueOf.length() != 0 ? "Failed to get offline buffered ping database: ".concat(valueOf) : new String("Failed to get offline buffered ping database: "));
    }
}
