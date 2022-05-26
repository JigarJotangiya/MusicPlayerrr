package p342g.p343a.p344a.p347d;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import media.musicplayer.audioplayer.videoplayer.R;

/* renamed from: g.a.a.d.a */
/* compiled from: DBHelper */
public class C7971a extends SQLiteOpenHelper {

    /* renamed from: g */
    private Context f33680g;

    public C7971a(Context context) {
        super(context, "FastMusicDB.db", (SQLiteDatabase.CursorFactory) null, 3);
        this.f33680g = context;
    }

    /* renamed from: E */
    private void m43637E(SQLiteDatabase sQLiteDatabase, StringBuilder sb) {
        sb.append("create table if not exists ");
        sb.append("music_sound_effect");
        sb.append("(id integer primary key autoincrement ,");
        sb.append("soundEffectId integer  ,");
        sb.append("soundEffectName varchar(100) ,");
        sb.append("dataName varchar(100) ,");
        sb.append("dataEnable integer ,");
        sb.append("data1 integer  ,");
        sb.append("data2 integer  ,");
        sb.append("data3 integer  ,");
        sb.append("data4 integer  ,");
        sb.append("data5 integer  ,");
        sb.append("data6 integer  ,");
        sb.append("data7 integer  ,");
        sb.append("data8 integer  ,");
        sb.append("data9 integer  ,");
        sb.append("data10 integer ,");
        sb.append("eqStyle integer ,");
        sb.append("toneEffectEnable integer ,");
        sb.append("tempo integer ,");
        sb.append("simpleRate integer ,");
        sb.append("toneType integer ,");
        sb.append("balance real ,");
        sb.append("balanceEnable integer ,");
        sb.append("rotates integer ,");
        sb.append("rotateEnable integer ,");
        sb.append("reverse integer ,");
        sb.append("reverseEnable  integer ,");
        sb.append("pitch integer ,");
        sb.append("pitchEnable integer ,");
        sb.append("volume real ,");
        sb.append("volumeBooster integer ,");
        sb.append("compressType integer ,");
        sb.append("autoWahType integer ,");
        sb.append("phaserType integer ,");
        sb.append("chorusType integer ,");
        sb.append("enableEd integer )");
        sQLiteDatabase.execSQL(sb.toString());
        String[] stringArray = this.f33680g.getResources().getStringArray(R.array.sound_effect);
        for (int i = 0; i < stringArray.length; i++) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("soundEffectId", Integer.valueOf(i));
            contentValues.put("soundEffectName", stringArray[i]);
            contentValues.put("enableEd", 0);
            sQLiteDatabase.insert("music_sound_effect", "0", contentValues);
        }
    }

    /* renamed from: H */
    private void m43638H(SQLiteDatabase sQLiteDatabase, StringBuilder sb) {
        sb.append("create table if not exists ");
        sb.append("musicSkin");
        sb.append("(id integer primary key autoincrement ,");
        sb.append("skinId integer  ,");
        sb.append("skinName varchar(100) ,");
        sb.append("skinZipLink varchar(100) ,");
        sb.append("skinModifyNumber varchar(100) ,");
        sb.append("minAppVersion varchar(100) ,");
        sb.append("skinThumbnailLink varchar(100) ,");
        sb.append("skinZipSize varchar(100) )");
        sQLiteDatabase.execSQL(sb.toString());
    }

    /* renamed from: K */
    private void m43639K(SQLiteDatabase sQLiteDatabase, StringBuilder sb) {
        m43643x(sb, sQLiteDatabase, "topRate");
    }

    /* renamed from: c */
    private void m43640c(StringBuilder sb, SQLiteDatabase sQLiteDatabase) {
        m43643x(sb, sQLiteDatabase, "nowPlaying");
    }

    /* renamed from: d */
    private void m43641d(SQLiteDatabase sQLiteDatabase, StringBuilder sb) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        sb.append("create table IF NOT EXISTS equalizer(");
        sb.append("_ID INTEGER PRIMARY KEY AUTOINCREMENT,");
        sb.append("name varchar(80) not null,");
        sb.append("data1 integer not null,");
        sb.append("data2 integer not null,");
        sb.append("data3 integer not null,");
        sb.append("data4 integer not null,");
        sb.append("data5 integer not null,");
        sb.append("data6 integer not null,");
        sb.append("data7 integer not null,");
        sb.append("data8 integer not null,");
        sb.append("data9 integer not null,");
        sb.append("data10 integer not null");
        sb.append(")");
        sQLiteDatabase.execSQL(sb.toString());
        String[] stringArray = this.f33680g.getResources().getStringArray(R.array.eq_name);
        String[] stringArray2 = this.f33680g.getResources().getStringArray(R.array.eq_value);
        for (int i = 0; i < stringArray.length; i++) {
            String[] split = (stringArray2[i] == null ? "0,0,0,0,0" : stringArray2[i]).split(",");
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", stringArray[i]);
            contentValues.put("data1", split.length >= 1 ? split[0].trim() : "0");
            if (split.length >= 2) {
                str = split[1].trim();
            } else {
                str = "0";
            }
            contentValues.put("data2", str);
            if (split.length >= 3) {
                str2 = split[2].trim();
            } else {
                str2 = "0";
            }
            contentValues.put("data3", str2);
            if (split.length >= 4) {
                str3 = split[3].trim();
            } else {
                str3 = "0";
            }
            contentValues.put("data4", str3);
            if (split.length >= 5) {
                str4 = split[4].trim();
            } else {
                str4 = "0";
            }
            contentValues.put("data5", str4);
            if (split.length >= 6) {
                str5 = split[5].trim();
            } else {
                str5 = "0";
            }
            contentValues.put("data6", str5);
            if (split.length >= 7) {
                str6 = split[6].trim();
            } else {
                str6 = "0";
            }
            contentValues.put("data7", str6);
            if (split.length >= 8) {
                str7 = split[7].trim();
            } else {
                str7 = "0";
            }
            contentValues.put("data8", str7);
            if (split.length >= 9) {
                str8 = split[8].trim();
            } else {
                str8 = "0";
            }
            contentValues.put("data9", str8);
            if (split.length >= 10) {
                str9 = split[9].trim();
            } else {
                str9 = "0";
            }
            contentValues.put("data10", str9);
            sQLiteDatabase.insert("equalizer", "0", contentValues);
        }
    }

    /* renamed from: p */
    private void m43642p(StringBuilder sb, SQLiteDatabase sQLiteDatabase) {
        m43643x(sb, sQLiteDatabase, "recentPlay");
    }

    /* renamed from: x */
    private void m43643x(StringBuilder sb, SQLiteDatabase sQLiteDatabase, String str) {
        sb.append("create table if not exists ");
        sb.append(str);
        sb.append("(id integer primary key autoincrement ,");
        sb.append("audioId integer  ,");
        sb.append("albumId integer ,");
        sb.append("albumName varchar(100) ,");
        sb.append("artistName varchar(100) ,");
        sb.append("duration integer ,");
        sb.append("title varchar(100) ,");
        sb.append("trackNumber integer ,");
        sb.append("path varchar(100) ,");
        sb.append("updatatime integer ,");
        sb.append("star integer ,");
        sb.append("itemType integer ,");
        sb.append("uri varchar )");
        sQLiteDatabase.execSQL(sb.toString());
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        m43640c(sb, sQLiteDatabase);
        sb.setLength(0);
        m43642p(sb, sQLiteDatabase);
        sb.setLength(0);
        m43641d(sQLiteDatabase, sb);
        sb.setLength(0);
        m43639K(sQLiteDatabase, sb);
        sb.setLength(0);
        m43638H(sQLiteDatabase, sb);
        sb.setLength(0);
        m43637E(sQLiteDatabase, sb);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        if (i == 1) {
            sQLiteDatabase.execSQL("create table IF NOT EXISTS equalizer(" + "_ID INTEGER PRIMARY KEY AUTOINCREMENT," + "name varchar(80) not null," + "data1 integer not null," + "data2 integer not null," + "data3 integer not null," + "data4 integer not null," + "data5 integer not null" + "data6 integer not null" + "data7 integer not null" + "data8 integer not null" + "data9 integer not null" + "data10 integer not null" + ")");
            String[] stringArray = this.f33680g.getResources().getStringArray(R.array.eq_name);
            String[] stringArray2 = this.f33680g.getResources().getStringArray(R.array.eq_value);
            for (int i3 = 0; i3 < stringArray.length; i3++) {
                String[] split = (stringArray2[i3] == null ? "0,0,0,0,0" : stringArray2[i3]).split(",");
                ContentValues contentValues = new ContentValues();
                contentValues.put("name", stringArray[i3]);
                contentValues.put("data1", split.length >= 1 ? split[0].trim() : "0");
                if (split.length >= 2) {
                    str = split[1].trim();
                } else {
                    str = "0";
                }
                contentValues.put("data2", str);
                if (split.length >= 3) {
                    str2 = split[2].trim();
                } else {
                    str2 = "0";
                }
                contentValues.put("data3", str2);
                if (split.length >= 4) {
                    str3 = split[3].trim();
                } else {
                    str3 = "0";
                }
                contentValues.put("data4", str3);
                if (split.length >= 5) {
                    str4 = split[4].trim();
                } else {
                    str4 = "0";
                }
                contentValues.put("data5", str4);
                if (split.length >= 6) {
                    str5 = split[5].trim();
                } else {
                    str5 = "0";
                }
                contentValues.put("data6", str5);
                if (split.length >= 7) {
                    str6 = split[6].trim();
                } else {
                    str6 = "0";
                }
                contentValues.put("data7", str6);
                if (split.length >= 8) {
                    str7 = split[7].trim();
                } else {
                    str7 = "0";
                }
                contentValues.put("data8", str7);
                if (split.length >= 9) {
                    str8 = split[8].trim();
                } else {
                    str8 = "0";
                }
                contentValues.put("data9", str8);
                if (split.length >= 10) {
                    str9 = split[9].trim();
                } else {
                    str9 = "0";
                }
                contentValues.put("data10", str9);
                sQLiteDatabase.insert("equalizer", "0", contentValues);
            }
            i++;
        }
        if (i == 2) {
            sQLiteDatabase.execSQL("alter table nowPlaying add column itemType integer");
            sQLiteDatabase.execSQL("alter table nowPlaying add column uri varchar");
        }
    }
}
