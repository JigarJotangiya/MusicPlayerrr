package p342g.p343a.p344a.p347d;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.provider.MediaStore;
import android.util.Log;
import com.coocent.music.base.data.entity.Music;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: g.a.a.d.d */
/* compiled from: RecentPlayDao */
public class C7974d {

    /* renamed from: b */
    private static C7974d f33684b;

    /* renamed from: a */
    private C7971a f33685a;

    public C7974d(Context context) {
        this.f33685a = new C7971a(context);
    }

    /* renamed from: c */
    private void m43655c(Music music, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("recentPlay", "audioId=?", new String[]{String.valueOf(music.mo9215k())});
    }

    /* renamed from: d */
    public static C7974d m43656d(Context context) {
        if (f33684b == null) {
            f33684b = new C7974d(context);
        }
        return f33684b;
    }

    /* renamed from: f */
    private boolean m43657f(Music music, SQLiteDatabase sQLiteDatabase) {
        SQLiteStatement compileStatement = sQLiteDatabase.compileStatement("insert into recentPlay (audioId,albumId,albumName,artistName,duration,title,trackNumber,path,updatatime,star) values (?,?,?,?,?,?,?,?,?,?)");
        sQLiteDatabase.beginTransaction();
        try {
            compileStatement.bindLong(1, music.mo9215k());
            compileStatement.bindLong(2, music.mo9205d());
            compileStatement.bindString(3, music.mo9207e());
            compileStatement.bindString(4, music.mo9210g());
            compileStatement.bindLong(5, (long) music.mo9214j());
            compileStatement.bindString(6, music.mo9218n());
            compileStatement.bindLong(7, 0);
            compileStatement.bindString(8, music.mo9211h());
            long time = new Date().getTime();
            Log.e("getRecentPlay", "insert time:" + time);
            compileStatement.bindLong(9, time);
            compileStatement.bindLong(10, (long) music.mo9217m());
            if (compileStatement.executeInsert() < 0) {
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return false;
            }
            sQLiteDatabase.setTransactionSuccessful();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return true;
        } catch (Exception e3) {
            e3.printStackTrace();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            return false;
        } catch (Throwable th) {
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0060, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo29509a(com.coocent.music.base.data.entity.Music r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            int r1 = r6.mo9261a()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            r2 = 7
            if (r1 != r2) goto L_0x000b
            monitor-exit(r5)
            return r0
        L_0x000b:
            android.content.Context r1 = p342g.p343a.p344a.p358i.C8345u.m46327h()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            if (r1 != 0) goto L_0x0013
            monitor-exit(r5)
            return r0
        L_0x0013:
            g.a.a.d.a r1 = r5.f33685a     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            if (r1 != 0) goto L_0x0022
            g.a.a.d.a r1 = new g.a.a.d.a     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            android.content.Context r2 = p342g.p343a.p344a.p358i.C8345u.m46327h()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            r1.<init>(r2)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            r5.f33685a = r1     // Catch:{ Exception -> 0x005f, all -> 0x005c }
        L_0x0022:
            g.a.a.d.a r1 = r5.f33685a     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            if (r1 != 0) goto L_0x0028
            monitor-exit(r5)
            return r0
        L_0x0028:
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            r2.<init>()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            java.lang.String r3 = "select count(*) from recentPlay where audioId="
            r2.append(r3)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            long r3 = r6.mo9215k()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            r2.append(r3)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            r3 = 0
            android.database.Cursor r2 = r1.rawQuery(r2, r3)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            if (r2 == 0) goto L_0x0051
            int r3 = r2.getCount()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            if (r3 <= 0) goto L_0x0051
            r5.m43655c(r6, r1)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
        L_0x0051:
            if (r2 == 0) goto L_0x0056
            r2.close()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
        L_0x0056:
            boolean r6 = r5.m43657f(r6, r1)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            monitor-exit(r5)
            return r6
        L_0x005c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L_0x005f:
            monitor-exit(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p342g.p343a.p344a.p347d.C7974d.mo29509a(com.coocent.music.base.data.entity.Music):boolean");
    }

    /* renamed from: b */
    public void mo29510b(long j) {
        SQLiteDatabase writableDatabase = this.f33685a.getWritableDatabase();
        writableDatabase.execSQL("delete from recentPlay where audioId =" + j);
    }

    /* renamed from: e */
    public List<Music> mo29511e(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase readableDatabase = this.f33685a.getReadableDatabase();
            Cursor rawQuery = readableDatabase.rawQuery("select * from recentPlay where duration>=" + (i * 1000) + " AND updatatime > " + (new Date().getTime() - (((((((long) i2) * 60) * 1000) * 60) * 24) * 7)) + " order by updatatime desc limit 0,50", (String[]) null);
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
                    music.mo9203D(ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, music.mo9215k()));
                    arrayList.add(music);
                }
                rawQuery.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: g */
    public void mo29512g(Music music) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("albumName", music.mo9207e());
        contentValues.put("artistName", music.mo9210g());
        contentValues.put("title", music.mo9218n());
        this.f33685a.getWritableDatabase().update("recentPlay", contentValues, "audioId=" + music.mo9215k(), (String[]) null);
    }
}
