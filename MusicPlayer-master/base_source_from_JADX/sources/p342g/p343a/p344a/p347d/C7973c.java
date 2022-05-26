package p342g.p343a.p344a.p347d;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.net.Uri;
import android.provider.MediaStore;
import com.coocent.music.base.data.entity.Music;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: g.a.a.d.c */
/* compiled from: NowPlayingDao */
public class C7973c {

    /* renamed from: b */
    private static C7973c f33682b;

    /* renamed from: a */
    private C7971a f33683a;

    public C7973c(Context context) {
        this.f33683a = new C7971a(context);
    }

    /* renamed from: d */
    public static C7973c m43649d(Context context) {
        if (f33682b == null) {
            f33682b = new C7973c(context);
        }
        return f33682b;
    }

    /* renamed from: a */
    public boolean mo29504a(List<Music> list) {
        SQLiteDatabase writableDatabase = this.f33683a.getWritableDatabase();
        SQLiteStatement compileStatement = writableDatabase.compileStatement("insert into nowPlaying (audioId,albumId,albumName,artistName,duration,title,trackNumber,path,updatatime,star,itemType,uri) values (?,?,?,?,?,?,?,?,?,?,?,?)");
        writableDatabase.beginTransaction();
        int i = 0;
        while (i < list.size()) {
            try {
                compileStatement.bindLong(1, list.get(i).mo9215k());
                compileStatement.bindLong(2, list.get(i).mo9205d());
                compileStatement.bindString(3, list.get(i).mo9207e());
                compileStatement.bindString(4, list.get(i).mo9210g());
                compileStatement.bindLong(5, (long) list.get(i).mo9214j());
                compileStatement.bindString(6, list.get(i).mo9218n());
                compileStatement.bindLong(7, 0);
                compileStatement.bindString(8, list.get(i).mo9211h());
                compileStatement.bindLong(9, new Date().getTime());
                compileStatement.bindLong(10, (long) list.get(i).mo9217m());
                compileStatement.bindLong(11, (long) list.get(i).mo9261a());
                compileStatement.bindString(12, list.get(i).mo9219o().toString());
                if (compileStatement.executeInsert() < 0) {
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.endTransaction();
                            writableDatabase.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    return false;
                }
                i++;
            } catch (Exception e2) {
                e2.printStackTrace();
                if (writableDatabase != null) {
                    try {
                        writableDatabase.endTransaction();
                        writableDatabase.close();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
                return false;
            } catch (Throwable th) {
                if (writableDatabase != null) {
                    try {
                        writableDatabase.endTransaction();
                        writableDatabase.close();
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        }
        writableDatabase.setTransactionSuccessful();
        if (writableDatabase != null) {
            try {
                writableDatabase.endTransaction();
                writableDatabase.close();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return true;
    }

    /* renamed from: b */
    public void mo29505b() {
        try {
            SQLiteDatabase readableDatabase = this.f33683a.getReadableDatabase();
            readableDatabase.execSQL("delete from nowPlaying");
            readableDatabase.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public void mo29506c(long j) {
        SQLiteDatabase readableDatabase = this.f33683a.getReadableDatabase();
        readableDatabase.execSQL("delete from nowPlaying where audioId=" + j);
    }

    /* renamed from: e */
    public List<Music> mo29507e() {
        Uri uri;
        Cursor rawQuery = this.f33683a.getReadableDatabase().rawQuery("select * from nowPlaying", (String[]) null);
        ArrayList arrayList = new ArrayList();
        if (rawQuery != null && rawQuery.getCount() > 0) {
            while (rawQuery.moveToNext()) {
                Music music = new Music();
                music.mo9231y((long) rawQuery.getInt(rawQuery.getColumnIndex("audioId")));
                music.mo9222r(rawQuery.getLong(rawQuery.getColumnIndex("albumId")));
                music.mo9223s(rawQuery.getString(rawQuery.getColumnIndex("albumName")));
                music.mo9224t(rawQuery.getString(rawQuery.getColumnIndex("artistName")));
                music.mo9230x(rawQuery.getInt(rawQuery.getColumnIndex("duration")));
                music.mo9202C(rawQuery.getString(rawQuery.getColumnIndex("title")));
                music.mo9226u(rawQuery.getString(rawQuery.getColumnIndex("path")));
                music.mo9201B(rawQuery.getInt(rawQuery.getColumnIndex("star")));
                music.mo9262b(rawQuery.getInt(rawQuery.getColumnIndex("itemType")));
                if (music.mo9261a() == 7) {
                    uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else {
                    uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                music.mo9203D(ContentUris.withAppendedId(uri, music.mo9215k()));
                arrayList.add(music);
            }
            rawQuery.close();
        }
        return arrayList;
    }

    /* renamed from: f */
    public void mo29508f(Music music) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("albumName", music.mo9207e());
        contentValues.put("artistName", music.mo9210g());
        contentValues.put("title", music.mo9218n());
        this.f33683a.getWritableDatabase().update("nowPlaying", contentValues, "audioId=" + music.mo9215k(), (String[]) null);
    }
}
