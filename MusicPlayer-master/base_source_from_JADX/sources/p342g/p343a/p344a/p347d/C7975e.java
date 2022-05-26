package p342g.p343a.p344a.p347d;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import coocent.music.player.skin.net.MySkinEntity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: g.a.a.d.e */
/* compiled from: SkinDao */
public class C7975e {

    /* renamed from: b */
    private static C7975e f33686b;

    /* renamed from: a */
    private C7971a f33687a;

    public C7975e(Context context) {
        this.f33687a = new C7971a(context);
    }

    /* renamed from: d */
    public static C7975e m43662d(Context context) {
        if (f33686b == null) {
            f33686b = new C7975e(context);
        }
        return f33686b;
    }

    /* renamed from: g */
    private boolean m43663g(MySkinEntity mySkinEntity, SQLiteDatabase sQLiteDatabase) {
        SQLiteStatement compileStatement = sQLiteDatabase.compileStatement("insert into musicSkin (skinId,skinName,skinZipLink,skinModifyNumber,minAppVersion,skinThumbnailLink,skinZipSize) values (?,?,?,?,?,?,?)");
        sQLiteDatabase.beginTransaction();
        try {
            compileStatement.bindLong(1, (long) mySkinEntity.mo27305a());
            compileStatement.bindString(2, mySkinEntity.mo27309e());
            compileStatement.bindString(3, mySkinEntity.mo27311g());
            compileStatement.bindString(4, mySkinEntity.mo27307d());
            compileStatement.bindString(5, mySkinEntity.mo27306b());
            compileStatement.bindString(6, mySkinEntity.mo27310f());
            compileStatement.bindString(7, mySkinEntity.mo27312h());
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

    /* renamed from: a */
    public synchronized boolean mo29513a(MySkinEntity mySkinEntity) {
        SQLiteDatabase writableDatabase;
        writableDatabase = this.f33687a.getWritableDatabase();
        if (mo29514b(mySkinEntity.mo27305a())) {
            mo29515c((long) mySkinEntity.mo27305a());
        }
        return m43663g(mySkinEntity, writableDatabase);
    }

    /* renamed from: b */
    public boolean mo29514b(int i) {
        SQLiteDatabase writableDatabase = this.f33687a.getWritableDatabase();
        Cursor rawQuery = writableDatabase.rawQuery("select * from musicSkin where skinId=" + i, (String[]) null);
        if (rawQuery.getCount() > 0) {
            rawQuery.close();
            return true;
        }
        rawQuery.close();
        return false;
    }

    /* renamed from: c */
    public void mo29515c(long j) {
        SQLiteDatabase writableDatabase = this.f33687a.getWritableDatabase();
        writableDatabase.execSQL("delete from musicSkin where skinId =" + j);
    }

    /* renamed from: e */
    public List<MySkinEntity> mo29516e() {
        Cursor rawQuery = this.f33687a.getReadableDatabase().rawQuery("select * from musicSkin", (String[]) null);
        ArrayList arrayList = new ArrayList();
        if (rawQuery != null && rawQuery.getCount() > 0) {
            while (rawQuery.moveToNext()) {
                MySkinEntity mySkinEntity = new MySkinEntity();
                mySkinEntity.mo27313i(rawQuery.getInt(rawQuery.getColumnIndex("skinId")));
                mySkinEntity.mo27316l(rawQuery.getString(rawQuery.getColumnIndex("skinName")));
                mySkinEntity.mo27318n(rawQuery.getString(rawQuery.getColumnIndex("skinZipLink")));
                mySkinEntity.mo27317m(rawQuery.getString(rawQuery.getColumnIndex("skinThumbnailLink")));
                mySkinEntity.mo27314j(rawQuery.getString(rawQuery.getColumnIndex("minAppVersion")));
                mySkinEntity.mo27315k(rawQuery.getString(rawQuery.getColumnIndex("skinModifyNumber")));
                mySkinEntity.mo27319o(rawQuery.getString(rawQuery.getColumnIndex("skinZipSize")));
                arrayList.add(mySkinEntity);
            }
            rawQuery.close();
        }
        return arrayList;
    }

    /* renamed from: f */
    public MySkinEntity mo29517f(int i) {
        MySkinEntity mySkinEntity = null;
        Cursor rawQuery = this.f33687a.getReadableDatabase().rawQuery("select * from musicSkin where skinId = " + i, (String[]) null);
        if (rawQuery != null && rawQuery.getCount() > 0) {
            while (rawQuery.moveToNext()) {
                mySkinEntity = new MySkinEntity();
                mySkinEntity.mo27313i(rawQuery.getInt(rawQuery.getColumnIndex("skinId")));
                mySkinEntity.mo27316l(rawQuery.getString(rawQuery.getColumnIndex("skinName")));
                mySkinEntity.mo27318n(rawQuery.getString(rawQuery.getColumnIndex("skinZipLink")));
                mySkinEntity.mo27317m(rawQuery.getString(rawQuery.getColumnIndex("skinThumbnailLink")));
                mySkinEntity.mo27314j(rawQuery.getString(rawQuery.getColumnIndex("minAppVersion")));
                mySkinEntity.mo27315k(rawQuery.getString(rawQuery.getColumnIndex("skinModifyNumber")));
                mySkinEntity.mo27319o(rawQuery.getString(rawQuery.getColumnIndex("skinZipSize")));
            }
            rawQuery.close();
        }
        return mySkinEntity;
    }
}
