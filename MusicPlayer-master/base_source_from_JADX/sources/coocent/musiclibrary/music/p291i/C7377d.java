package coocent.musiclibrary.music.p291i;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: coocent.musiclibrary.music.i.d */
/* compiled from: SearchHistory */
public class C7377d {

    /* renamed from: a */
    private static C7377d f32456a;

    public C7377d(Context context) {
        C7374a.m41647c(context);
    }

    /* renamed from: a */
    public static final synchronized C7377d m41657a(Context context) {
        C7377d dVar;
        synchronized (C7377d.class) {
            if (f32456a == null) {
                f32456a = new C7377d(context.getApplicationContext());
            }
            dVar = f32456a;
        }
        return dVar;
    }

    /* renamed from: b */
    public void mo28167b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS searchhistory (searchstring STRING NOT NULL,timesearched LONG NOT NULL);");
    }

    /* renamed from: c */
    public void mo28168c(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS searchhistory");
        mo28167b(sQLiteDatabase);
    }

    /* renamed from: d */
    public void mo28169d(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
