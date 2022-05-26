package p159f.p166c.p181e.p182a.p183a.p185b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: f.c.e.a.a.b.a */
/* compiled from: DBHelper */
public class C4365a extends SQLiteOpenHelper {
    public C4365a(Context context) {
        super(context, "MusicBaseDB.db", (SQLiteDatabase.CursorFactory) null, 3);
    }

    /* renamed from: E */
    private void m19026E(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE Playlist ADD COLUMN favorite INTEGER DEFAULT 0");
        StringBuilder sb = new StringBuilder();
        m19029d(sb, sQLiteDatabase);
        sb.setLength(0);
        m19028c(sb, sQLiteDatabase);
        sb.setLength(0);
    }

    /* renamed from: H */
    private void m19027H(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE Playlist ADD COLUMN thumbnail VARCHAR ");
        sQLiteDatabase.execSQL("ALTER TABLE Playlist ADD COLUMN describe VARCHAR ");
    }

    /* renamed from: c */
    private void m19028c(StringBuilder sb, SQLiteDatabase sQLiteDatabase) {
        sb.append("create table if not exists ");
        sb.append("FavoriteAlbum");
        sb.append("(album_id integer primary key )");
        sQLiteDatabase.execSQL(sb.toString());
    }

    /* renamed from: d */
    private void m19029d(StringBuilder sb, SQLiteDatabase sQLiteDatabase) {
        sb.append("create table if not exists ");
        sb.append("FavoriteArtist");
        sb.append("(artist_id integer primary key )");
        sQLiteDatabase.execSQL(sb.toString());
    }

    /* renamed from: p */
    private void m19030p(StringBuilder sb, SQLiteDatabase sQLiteDatabase) {
        sb.append("create table if not exists ");
        sb.append("Playlist");
        sb.append("(_ID integer primary key autoincrement ,");
        sb.append("name varchar ,");
        sb.append("songCount integer ,");
        sb.append("allMusicIds varchar , ");
        sb.append("favorite integer , ");
        sb.append("thumbnail varchar , ");
        sb.append("describe varchar )");
        sQLiteDatabase.execSQL(sb.toString());
    }

    /* renamed from: x */
    private void m19031x(StringBuilder sb, SQLiteDatabase sQLiteDatabase) {
        m19030p(sb, sQLiteDatabase);
        sb.setLength(0);
        m19029d(sb, sQLiteDatabase);
        sb.setLength(0);
        m19028c(sb, sQLiteDatabase);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        m19031x(sb, sQLiteDatabase);
        sb.setLength(0);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i == 1) {
            m19026E(sQLiteDatabase);
            i++;
        }
        if (i == 2) {
            m19027H(sQLiteDatabase);
        }
    }
}
