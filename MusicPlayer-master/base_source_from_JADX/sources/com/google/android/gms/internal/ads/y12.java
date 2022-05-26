package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.ads.internal.util.C3018m1;
import com.google.android.gms.ads.internal.util.C3041u0;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class y12 extends SQLiteOpenHelper {

    /* renamed from: g */
    private final Context f26201g;

    /* renamed from: h */
    private final e93 f26202h;

    public y12(Context context, e93 e93) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22678z5)).intValue());
        this.f26201g = context;
        this.f26202h = e93;
    }

    /* renamed from: H */
    static /* synthetic */ void m33958H(SQLiteDatabase sQLiteDatabase, String str, am0 am0) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        m33960Y(sQLiteDatabase, am0);
    }

    /* renamed from: T */
    static final void m33959T(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public static void m33960Y(SQLiteDatabase sQLiteDatabase, am0 am0) {
        sQLiteDatabase.beginTransaction();
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("event_state = ");
            sb.append(1);
            String sb2 = sb.toString();
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, sb2, (String[]) null, (String) null, (String) null, "timestamp ASC", (String) null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i] = query.getString(columnIndex);
                }
                i++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i2 = 0; i2 < count; i2++) {
                am0.mo11120p(strArr[i2]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo22129E(ys2<SQLiteDatabase, Void> ys2) {
        s83.m30616r(this.f26202h.mo17138A0(new w12(this)), new x12(this, ys2), this.f26202h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo22130K(SQLiteDatabase sQLiteDatabase, am0 am0, String str) {
        this.f26202h.execute(new v12(sQLiteDatabase, str, am0));
    }

    /* renamed from: Q */
    public final void mo22131Q(am0 am0, String str) {
        mo22129E(new s12(this, am0, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Void mo22132c(a22 a22, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(a22.f13742a));
        contentValues.put("gws_query_id", a22.f13743b);
        contentValues.put("url", a22.f13744c);
        contentValues.put("event_state", Integer.valueOf(a22.f13745d - 1));
        sQLiteDatabase.insert("offline_buffered_pings", (String) null, contentValues);
        C2971s.m13214q();
        C3041u0 e = C2979b2.m13253e(this.f26201g);
        if (e != null) {
            try {
                e.zze(C4865b.m20503f2(this.f26201g));
            } catch (RemoteException e2) {
                C3018m1.m13389l("Failed to schedule offline ping sender.", e2);
            }
        }
        return null;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    /* renamed from: p */
    public final void mo22136p(String str) {
        mo22129E(new u12(this, str));
    }

    /* renamed from: x */
    public final void mo22137x(a22 a22) {
        mo22129E(new t12(this, a22));
    }
}
