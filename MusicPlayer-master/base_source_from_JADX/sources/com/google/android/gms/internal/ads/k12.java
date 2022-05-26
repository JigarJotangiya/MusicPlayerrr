package com.google.android.gms.internal.ads;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class k12 {
    /* renamed from: a */
    public static int m26062a(SQLiteDatabase sQLiteDatabase, int i) {
        int i2;
        Cursor d = m26065d(sQLiteDatabase, i);
        if (d.getCount() > 0) {
            d.moveToNext();
            i2 = d.getInt(d.getColumnIndexOrThrow("value"));
        } else {
            i2 = 0;
        }
        d.close();
        return i2;
    }

    /* renamed from: b */
    public static long m26063b(SQLiteDatabase sQLiteDatabase, int i) {
        long j;
        Cursor d = m26065d(sQLiteDatabase, 2);
        if (d.getCount() > 0) {
            d.moveToNext();
            j = d.getLong(d.getColumnIndexOrThrow("value"));
        } else {
            j = 0;
        }
        d.close();
        return j;
    }

    /* renamed from: c */
    public static ArrayList<C5014ds> m26064c(SQLiteDatabase sQLiteDatabase) {
        ArrayList<C5014ds> arrayList = new ArrayList<>();
        Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        while (query.moveToNext()) {
            try {
                arrayList.add(C5014ds.m22666M(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (bn3 e) {
                ul0.m31859d("Unable to deserialize proto from offline signals database:");
                ul0.m31859d(e.getMessage());
            }
        }
        query.close();
        return arrayList;
    }

    /* renamed from: d */
    private static Cursor m26065d(SQLiteDatabase sQLiteDatabase, int i) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i == 0) {
            strArr2[0] = "failed_requests";
        } else if (i != 1) {
            strArr2[0] = "last_successful_request_time";
        } else {
            strArr2[0] = "total_requests";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, (String) null, (String) null, (String) null);
    }
}
