package coocent.musiclibrary.music.p291i;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: coocent.musiclibrary.music.i.b */
/* compiled from: MusicPlaybackState */
public class C7375b {

    /* renamed from: a */
    private static C7375b f32453a;

    public C7375b(Context context) {
        C7374a.m41647c(context);
    }

    /* renamed from: a */
    public static final synchronized C7375b m41648a(Context context) {
        C7375b bVar;
        synchronized (C7375b.class) {
            if (f32453a == null) {
                f32453a = new C7375b(context.getApplicationContext());
            }
            bVar = f32453a;
        }
        return bVar;
    }

    /* renamed from: b */
    public void mo28160b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + "playbackqueue" + "(" + "trackid" + " LONG NOT NULL," + "sourceid" + " LONG NOT NULL," + "sourcetype" + " INT NOT NULL," + "sourceposition" + " INT NOT NULL);");
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS ");
        sb.append("playbackhistory");
        sb.append("(");
        sb.append("position");
        sb.append(" INT NOT NULL);");
        sQLiteDatabase.execSQL(sb.toString());
    }

    /* renamed from: c */
    public void mo28161c(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS playbackqueue");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS playbackhistory");
        mo28160b(sQLiteDatabase);
    }

    /* renamed from: d */
    public void mo28162d(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 2 && i2 >= 2) {
            mo28160b(sQLiteDatabase);
        }
    }
}
