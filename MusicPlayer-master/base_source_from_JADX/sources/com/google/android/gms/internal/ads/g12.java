package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.C2971s;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class g12 implements ys2 {

    /* renamed from: a */
    public final /* synthetic */ h12 f16851a;

    /* renamed from: b */
    public final /* synthetic */ boolean f16852b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f16853c;

    /* renamed from: d */
    public final /* synthetic */ C5792yr f16854d;

    /* renamed from: e */
    public final /* synthetic */ C5126gs f16855e;

    public /* synthetic */ g12(h12 h12, boolean z, ArrayList arrayList, C5792yr yrVar, C5126gs gsVar) {
        this.f16851a = h12;
        this.f16852b = z;
        this.f16853c = arrayList;
        this.f16854d = yrVar;
        this.f16855e = gsVar;
    }

    /* renamed from: b */
    public final Object mo15625b(Object obj) {
        h12 h12 = this.f16851a;
        boolean z = this.f16852b;
        ArrayList arrayList = this.f16853c;
        C5792yr yrVar = this.f16854d;
        C5126gs gsVar = this.f16855e;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (!h12.f17488b.f17864f.mo11065E()) {
            byte[] f = i12.m25011f(h12.f17488b, z, arrayList, yrVar, gsVar);
            ContentValues contentValues = new ContentValues();
            contentValues.put("timestamp", Long.valueOf(C2971s.m13198a().mo11988a()));
            contentValues.put("serialized_proto_data", f);
            sQLiteDatabase.insert("offline_signal_contents", (String) null, contentValues);
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[]{"total_requests"}));
            if (!z) {
                sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[]{"failed_requests"}));
            }
        }
        return null;
    }
}
