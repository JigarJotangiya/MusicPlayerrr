package coocent.musiclibrary.music.p291i;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: coocent.musiclibrary.music.i.c */
/* compiled from: RecentStore */
public class C7376c {

    /* renamed from: b */
    private static C7376c f32454b;

    /* renamed from: a */
    private C7374a f32455a = null;

    public C7376c(Context context) {
        this.f32455a = C7374a.m41647c(context);
    }

    /* renamed from: a */
    public static final synchronized C7376c m41652a(Context context) {
        C7376c cVar;
        synchronized (C7376c.class) {
            if (f32454b == null) {
                f32454b = new C7376c(context.getApplicationContext());
            }
            cVar = f32454b;
        }
        return cVar;
    }

    /* renamed from: b */
    public void mo28163b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS recenthistory (songid LONG NOT NULL,timeplayed LONG NOT NULL);");
    }

    /* renamed from: c */
    public void mo28164c(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS recenthistory");
        mo28163b(sQLiteDatabase);
    }

    /* renamed from: d */
    public void mo28165d(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* renamed from: e */
    public void mo28166e(long j) {
        this.f32455a.getWritableDatabase().delete("recenthistory", "songid = ?", new String[]{String.valueOf(j)});
    }
}
