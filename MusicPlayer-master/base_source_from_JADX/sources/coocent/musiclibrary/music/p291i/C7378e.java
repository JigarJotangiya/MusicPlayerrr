package coocent.musiclibrary.music.p291i;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.view.animation.AccelerateInterpolator;

/* renamed from: coocent.musiclibrary.music.i.e */
/* compiled from: SongPlayCount */
public class C7378e {

    /* renamed from: b */
    private static C7378e f32457b;

    /* renamed from: c */
    private static int f32458c = 604800000;

    /* renamed from: d */
    private static String f32459d = "songid=?";

    /* renamed from: a */
    private C7374a f32460a = null;

    static {
        new AccelerateInterpolator(1.5f);
    }

    public C7378e(Context context) {
        this.f32460a = C7374a.m41647c(context);
        long currentTimeMillis = System.currentTimeMillis() / ((long) f32458c);
    }

    /* renamed from: a */
    private void m41661a(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("songplaycount", f32459d, new String[]{str});
    }

    /* renamed from: b */
    private static String m41662b(int i) {
        return "week" + String.valueOf(i);
    }

    /* renamed from: c */
    public static final synchronized C7378e m41663c(Context context) {
        C7378e eVar;
        synchronized (C7378e.class) {
            if (f32457b == null) {
                f32457b = new C7378e(context.getApplicationContext());
            }
            eVar = f32457b;
        }
        return eVar;
    }

    /* renamed from: d */
    public void mo28170d(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS ");
        sb.append("songplaycount");
        sb.append("(");
        sb.append("songid");
        sb.append(" INT UNIQUE,");
        for (int i = 0; i < 52; i++) {
            sb.append(m41662b(i));
            sb.append(" INT DEFAULT 0,");
        }
        sb.append("weekindex");
        sb.append(" INT NOT NULL,");
        sb.append("playcountscore");
        sb.append(" REAL DEFAULT 0);");
        sQLiteDatabase.execSQL(sb.toString());
    }

    /* renamed from: e */
    public void mo28171e(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS songplaycount");
        mo28170d(sQLiteDatabase);
    }

    /* renamed from: f */
    public void mo28172f(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* renamed from: g */
    public void mo28173g(long j) {
        m41661a(this.f32460a.getWritableDatabase(), String.valueOf(j));
    }
}
