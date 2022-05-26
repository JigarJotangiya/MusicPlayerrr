package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class v12 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ SQLiteDatabase f24540g;

    /* renamed from: h */
    public final /* synthetic */ String f24541h;

    /* renamed from: i */
    public final /* synthetic */ am0 f24542i;

    public /* synthetic */ v12(SQLiteDatabase sQLiteDatabase, String str, am0 am0) {
        this.f24540g = sQLiteDatabase;
        this.f24541h = str;
        this.f24542i = am0;
    }

    public final void run() {
        y12.m33958H(this.f24540g, this.f24541h, this.f24542i);
    }
}
