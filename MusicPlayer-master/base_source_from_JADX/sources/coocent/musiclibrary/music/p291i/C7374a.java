package coocent.musiclibrary.music.p291i;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: coocent.musiclibrary.music.i.a */
/* compiled from: MusicDB */
public class C7374a extends SQLiteOpenHelper {

    /* renamed from: h */
    private static C7374a f32451h;

    /* renamed from: g */
    private final Context f32452g;

    public C7374a(Context context) {
        super(context, "musicdb.db", (SQLiteDatabase.CursorFactory) null, 4);
        this.f32452g = context;
    }

    /* renamed from: c */
    public static final synchronized C7374a m41647c(Context context) {
        C7374a aVar;
        synchronized (C7374a.class) {
            if (f32451h == null) {
                f32451h = new C7374a(context.getApplicationContext());
            }
            aVar = f32451h;
        }
        return aVar;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C7375b.m41648a(this.f32452g).mo28160b(sQLiteDatabase);
        C7376c.m41652a(this.f32452g).mo28163b(sQLiteDatabase);
        C7378e.m41663c(this.f32452g).mo28170d(sQLiteDatabase);
        C7377d.m41657a(this.f32452g).mo28167b(sQLiteDatabase);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C7375b.m41648a(this.f32452g).mo28161c(sQLiteDatabase, i, i2);
        C7376c.m41652a(this.f32452g).mo28164c(sQLiteDatabase, i, i2);
        C7378e.m41663c(this.f32452g).mo28171e(sQLiteDatabase, i, i2);
        C7377d.m41657a(this.f32452g).mo28168c(sQLiteDatabase, i, i2);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C7375b.m41648a(this.f32452g).mo28162d(sQLiteDatabase, i, i2);
        C7376c.m41652a(this.f32452g).mo28165d(sQLiteDatabase, i, i2);
        C7378e.m41663c(this.f32452g).mo28172f(sQLiteDatabase, i, i2);
        C7377d.m41657a(this.f32452g).mo28169d(sQLiteDatabase, i, i2);
    }
}
