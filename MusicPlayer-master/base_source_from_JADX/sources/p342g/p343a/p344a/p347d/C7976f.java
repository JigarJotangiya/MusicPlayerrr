package p342g.p343a.p344a.p347d;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import coocent.music.player.mode.SoundEffect;
import java.util.ArrayList;
import java.util.List;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: g.a.a.d.f */
/* compiled from: SoundEffectDao */
public class C7976f {

    /* renamed from: b */
    private static C7976f f33688b;

    /* renamed from: a */
    private C7971a f33689a;

    public C7976f(Context context) {
        this.f33689a = new C7971a(context);
    }

    /* renamed from: g */
    public static C7976f m43669g(Context context) {
        if (f33688b == null) {
            f33688b = new C7976f(context);
        }
        return f33688b;
    }

    /* renamed from: a */
    public boolean mo29518a(SoundEffect soundEffect) {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = this.f33689a.getWritableDatabase();
            SQLiteStatement compileStatement = writableDatabase.compileStatement("insert into music_sound_effect (soundEffectId,soundEffectName,dataName,dataEnable,eqStyle,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,toneEffectEnable,tempo,simpleRate,toneType,balance,balanceEnable,rotates,rotateEnable,reverse,reverseEnable,pitch,pitchEnable,volume,volumeBooster,compressType,autoWahType,phaserType,chorusType,enableEd) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            writableDatabase.beginTransaction();
            try {
                compileStatement.bindLong(1, (long) soundEffect.mo26991C());
                String D = soundEffect.mo26992D();
                String str = BuildConfig.FLAVOR;
                compileStatement.bindString(2, D == null ? str : soundEffect.mo26992D());
                if (soundEffect.mo27044r() != null) {
                    str = soundEffect.mo27044r();
                }
                compileStatement.bindString(3, str);
                compileStatement.bindLong(4, (long) soundEffect.mo27042q());
                compileStatement.bindLong(5, (long) soundEffect.mo27048t());
                compileStatement.bindLong(6, (long) ((int) soundEffect.mo27023g()));
                compileStatement.bindLong(7, (long) ((int) soundEffect.mo27027i()));
                compileStatement.bindLong(8, (long) ((int) soundEffect.mo27028j()));
                compileStatement.bindLong(9, (long) ((int) soundEffect.mo27030k()));
                compileStatement.bindLong(10, (long) ((int) soundEffect.mo27032l()));
                compileStatement.bindLong(11, (long) ((int) soundEffect.mo27034m()));
                compileStatement.bindLong(12, (long) ((int) soundEffect.mo27036n()));
                compileStatement.bindLong(13, (long) ((int) soundEffect.mo27038o()));
                compileStatement.bindLong(14, (long) ((int) soundEffect.mo27040p()));
                compileStatement.bindLong(15, (long) ((int) soundEffect.mo27025h()));
                compileStatement.bindLong(16, (long) soundEffect.mo26994G());
                compileStatement.bindLong(17, (long) soundEffect.mo26993F());
                compileStatement.bindLong(18, (long) soundEffect.mo26990B());
                compileStatement.bindLong(19, (long) soundEffect.mo26995I());
                compileStatement.bindDouble(20, (double) soundEffect.mo27013b());
                compileStatement.bindLong(21, (long) soundEffect.mo27016d());
                compileStatement.bindLong(22, (long) soundEffect.mo27061z());
                compileStatement.bindLong(23, (long) soundEffect.mo26989A());
                compileStatement.bindLong(24, (long) soundEffect.mo27057x());
                compileStatement.bindLong(25, (long) soundEffect.mo27059y());
                compileStatement.bindLong(26, (long) soundEffect.mo27052v());
                compileStatement.bindLong(27, (long) soundEffect.mo27054w());
                compileStatement.bindDouble(28, (double) soundEffect.mo26996J());
                compileStatement.bindLong(29, (long) soundEffect.mo26997L());
                compileStatement.bindLong(30, (long) soundEffect.mo27021f());
                compileStatement.bindLong(31, (long) soundEffect.mo27011a());
                compileStatement.bindLong(32, (long) soundEffect.mo27050u());
                compileStatement.bindLong(33, (long) soundEffect.mo27019e());
                compileStatement.bindLong(34, (long) soundEffect.mo27046s());
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
                writableDatabase.setTransactionSuccessful();
                if (writableDatabase != null) {
                    try {
                        writableDatabase.endTransaction();
                        writableDatabase.close();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                return true;
            } catch (Exception e3) {
                e3.printStackTrace();
                if (writableDatabase != null) {
                    try {
                        writableDatabase.endTransaction();
                        writableDatabase.close();
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                }
                return false;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        } catch (Throwable th) {
            if (writableDatabase != null) {
                try {
                    writableDatabase.endTransaction();
                    writableDatabase.close();
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
    }

    /* renamed from: b */
    public boolean mo29519b(List<SoundEffect> list) {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = this.f33689a.getWritableDatabase();
            SQLiteStatement compileStatement = writableDatabase.compileStatement("insert into music_sound_effect (soundEffectId,soundEffectName,dataName,dataEnable,eqStyle,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,toneEffectEnable,tempo,simpleRate,toneType,balance,balanceEnable,rotates,rotateEnable,reverse,reverseEnable,pitch,pitchEnable,volume,volumeBooster,compressType,autoWahType,phaserType,chorusType,enableEd) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            writableDatabase.beginTransaction();
            int i = 0;
            while (i < list.size()) {
                try {
                    compileStatement.bindLong(1, (long) list.get(i).mo26991C());
                    String D = list.get(i).mo26992D();
                    String str = BuildConfig.FLAVOR;
                    compileStatement.bindString(2, D == null ? str : list.get(i).mo26992D());
                    if (list.get(i).mo27044r() != null) {
                        str = list.get(i).mo27044r();
                    }
                    compileStatement.bindString(3, str);
                    compileStatement.bindLong(4, (long) list.get(i).mo27042q());
                    compileStatement.bindLong(5, (long) list.get(i).mo27048t());
                    compileStatement.bindLong(6, (long) ((int) list.get(i).mo27023g()));
                    compileStatement.bindLong(7, (long) ((int) list.get(i).mo27027i()));
                    compileStatement.bindLong(8, (long) ((int) list.get(i).mo27028j()));
                    compileStatement.bindLong(9, (long) ((int) list.get(i).mo27030k()));
                    compileStatement.bindLong(10, (long) ((int) list.get(i).mo27032l()));
                    compileStatement.bindLong(11, (long) ((int) list.get(i).mo27034m()));
                    compileStatement.bindLong(12, (long) ((int) list.get(i).mo27036n()));
                    compileStatement.bindLong(13, (long) ((int) list.get(i).mo27038o()));
                    compileStatement.bindLong(14, (long) ((int) list.get(i).mo27040p()));
                    compileStatement.bindLong(15, (long) ((int) list.get(i).mo27025h()));
                    compileStatement.bindLong(16, (long) list.get(i).mo26994G());
                    compileStatement.bindLong(17, (long) list.get(i).mo26993F());
                    compileStatement.bindLong(18, (long) list.get(i).mo26990B());
                    compileStatement.bindLong(19, (long) list.get(i).mo26995I());
                    compileStatement.bindDouble(20, (double) list.get(i).mo27013b());
                    compileStatement.bindLong(21, (long) list.get(i).mo27016d());
                    compileStatement.bindLong(22, (long) list.get(i).mo27061z());
                    compileStatement.bindLong(23, (long) list.get(i).mo26989A());
                    compileStatement.bindLong(24, (long) list.get(i).mo27057x());
                    compileStatement.bindLong(25, (long) list.get(i).mo27059y());
                    compileStatement.bindLong(26, (long) list.get(i).mo27052v());
                    compileStatement.bindLong(27, (long) list.get(i).mo27054w());
                    compileStatement.bindDouble(28, (double) list.get(i).mo26996J());
                    compileStatement.bindLong(29, (long) list.get(i).mo26997L());
                    compileStatement.bindLong(30, (long) list.get(i).mo27021f());
                    compileStatement.bindLong(31, (long) list.get(i).mo27011a());
                    compileStatement.bindLong(32, (long) list.get(i).mo27050u());
                    compileStatement.bindLong(33, (long) list.get(i).mo27019e());
                    compileStatement.bindLong(34, (long) list.get(i).mo27046s());
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
                }
            }
            writableDatabase.setTransactionSuccessful();
            if (writableDatabase != null) {
                try {
                    writableDatabase.endTransaction();
                    writableDatabase.close();
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            return true;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        } catch (Throwable th) {
            if (writableDatabase != null) {
                try {
                    writableDatabase.endTransaction();
                    writableDatabase.close();
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
    }

    /* renamed from: c */
    public boolean mo29520c(int i) {
        try {
            SQLiteDatabase readableDatabase = this.f33689a.getReadableDatabase();
            readableDatabase.execSQL("delete from music_sound_effect where soundEffectId = " + i);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: d */
    public void mo29521d() {
        try {
            SQLiteDatabase readableDatabase = this.f33689a.getReadableDatabase();
            readableDatabase.execSQL("delete from music_sound_effect");
            readableDatabase.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    public boolean mo29522e(int i, SoundEffect soundEffect) {
        try {
            SQLiteDatabase readableDatabase = this.f33689a.getReadableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("dataEnable", Integer.valueOf(soundEffect.mo27042q()));
            contentValues.put("data1", Float.valueOf(soundEffect.mo27023g()));
            contentValues.put("data2", Float.valueOf(soundEffect.mo27027i()));
            contentValues.put("data3", Float.valueOf(soundEffect.mo27028j()));
            contentValues.put("data4", Float.valueOf(soundEffect.mo27030k()));
            contentValues.put("data5", Float.valueOf(soundEffect.mo27032l()));
            contentValues.put("data6", Float.valueOf(soundEffect.mo27034m()));
            contentValues.put("data7", Float.valueOf(soundEffect.mo27036n()));
            contentValues.put("data8", Float.valueOf(soundEffect.mo27038o()));
            contentValues.put("data9", Float.valueOf(soundEffect.mo27040p()));
            contentValues.put("data10", Float.valueOf(soundEffect.mo27025h()));
            contentValues.put("eqStyle", Integer.valueOf(soundEffect.mo27048t()));
            contentValues.put("toneEffectEnable", Integer.valueOf(soundEffect.mo26994G()));
            contentValues.put("tempo", Integer.valueOf(soundEffect.mo26993F()));
            contentValues.put("simpleRate", Integer.valueOf(soundEffect.mo26990B()));
            contentValues.put("toneType", Integer.valueOf(soundEffect.mo26995I()));
            contentValues.put("rotateEnable", Integer.valueOf(soundEffect.mo26989A()));
            contentValues.put("rotates", Integer.valueOf(soundEffect.mo27061z()));
            contentValues.put("reverseEnable", Integer.valueOf(soundEffect.mo27059y()));
            contentValues.put("reverse", Integer.valueOf(soundEffect.mo27057x()));
            contentValues.put("balanceEnable", Integer.valueOf(soundEffect.mo27016d()));
            contentValues.put("balance", Float.valueOf(soundEffect.mo27013b()));
            contentValues.put("pitchEnable", Integer.valueOf(soundEffect.mo27054w()));
            contentValues.put("pitch", Integer.valueOf(soundEffect.mo27052v()));
            contentValues.put("volumeBooster", Integer.valueOf(soundEffect.mo26997L()));
            contentValues.put("compressType", Integer.valueOf(soundEffect.mo27021f()));
            contentValues.put("autoWahType", Integer.valueOf(soundEffect.mo27011a()));
            contentValues.put("phaserType", Integer.valueOf(soundEffect.mo27050u()));
            contentValues.put("chorusType", Integer.valueOf(soundEffect.mo27019e()));
            if (readableDatabase.update("music_sound_effect", contentValues, "soundEffectId=?", new String[]{String.valueOf(i)}) > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: f */
    public List<SoundEffect> mo29523f() {
        return mo29524h("select * from music_sound_effect");
    }

    /* renamed from: h */
    public List<SoundEffect> mo29524h(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor rawQuery = this.f33689a.getReadableDatabase().rawQuery(str, (String[]) null);
            if (rawQuery != null && rawQuery.getCount() > 0) {
                while (rawQuery.moveToNext()) {
                    SoundEffect soundEffect = new SoundEffect();
                    soundEffect.mo27049t0(rawQuery.getInt(rawQuery.getColumnIndex("soundEffectId")));
                    soundEffect.mo27051u0(rawQuery.getString(rawQuery.getColumnIndex("soundEffectName")));
                    soundEffect.mo27022f0(rawQuery.getString(rawQuery.getColumnIndex("dataName")));
                    soundEffect.mo27020e0(rawQuery.getInt(rawQuery.getColumnIndex("dataEnable")));
                    soundEffect.mo27026h0(rawQuery.getInt(rawQuery.getColumnIndex("eqStyle")));
                    soundEffect.mo27005U((float) rawQuery.getInt(rawQuery.getColumnIndex("data1")));
                    soundEffect.mo27007W((float) rawQuery.getInt(rawQuery.getColumnIndex("data2")));
                    soundEffect.mo27008X((float) rawQuery.getInt(rawQuery.getColumnIndex("data3")));
                    soundEffect.mo27009Y((float) rawQuery.getInt(rawQuery.getColumnIndex("data4")));
                    soundEffect.mo27010Z((float) rawQuery.getInt(rawQuery.getColumnIndex("data5")));
                    soundEffect.mo27012a0((float) rawQuery.getInt(rawQuery.getColumnIndex("data6")));
                    soundEffect.mo27014b0((float) rawQuery.getInt(rawQuery.getColumnIndex("data7")));
                    soundEffect.mo27015c0((float) rawQuery.getInt(rawQuery.getColumnIndex("data8")));
                    soundEffect.mo27017d0((float) rawQuery.getInt(rawQuery.getColumnIndex("data9")));
                    soundEffect.mo27006V((float) rawQuery.getInt(rawQuery.getColumnIndex("data10")));
                    soundEffect.mo27055w0(rawQuery.getInt(rawQuery.getColumnIndex("toneEffectEnable")));
                    soundEffect.mo27053v0(rawQuery.getInt(rawQuery.getColumnIndex("tempo")));
                    soundEffect.mo27047s0(rawQuery.getInt(rawQuery.getColumnIndex("simpleRate")));
                    soundEffect.mo27058x0(rawQuery.getInt(rawQuery.getColumnIndex("toneType")));
                    soundEffect.mo27001P(rawQuery.getFloat(rawQuery.getColumnIndex("balance")));
                    soundEffect.mo27002Q(rawQuery.getInt(rawQuery.getColumnIndex("balanceEnable")));
                    soundEffect.mo27041p0(rawQuery.getInt(rawQuery.getColumnIndex("rotates")));
                    soundEffect.mo27043q0(rawQuery.getInt(rawQuery.getColumnIndex("rotateEnable")));
                    soundEffect.mo27037n0(rawQuery.getInt(rawQuery.getColumnIndex("reverse")));
                    soundEffect.mo27039o0(rawQuery.getInt(rawQuery.getColumnIndex("reverseEnable")));
                    soundEffect.mo27033l0(rawQuery.getInt(rawQuery.getColumnIndex("pitch")));
                    soundEffect.mo27035m0(rawQuery.getInt(rawQuery.getColumnIndex("pitchEnable")));
                    soundEffect.mo27060y0(rawQuery.getFloat(rawQuery.getColumnIndex("volume")));
                    soundEffect.mo27062z0(rawQuery.getInt(rawQuery.getColumnIndex("volumeBooster")));
                    soundEffect.mo27004S(rawQuery.getInt(rawQuery.getColumnIndex("compressType")));
                    soundEffect.mo27000O(rawQuery.getInt(rawQuery.getColumnIndex("autoWahType")));
                    soundEffect.mo27031k0(rawQuery.getInt(rawQuery.getColumnIndex("phaserType")));
                    soundEffect.mo27003R(rawQuery.getInt(rawQuery.getColumnIndex("chorusType")));
                    soundEffect.mo27024g0(rawQuery.getInt(rawQuery.getColumnIndex("enableEd")));
                    arrayList.add(soundEffect);
                }
                rawQuery.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: i */
    public SoundEffect mo29525i(long j) {
        SoundEffect soundEffect = null;
        try {
            SQLiteDatabase readableDatabase = this.f33689a.getReadableDatabase();
            Cursor rawQuery = readableDatabase.rawQuery("select * from music_sound_effect where soundEffectId = " + j, (String[]) null);
            if (rawQuery != null && rawQuery.getCount() > 0) {
                while (rawQuery.moveToNext()) {
                    SoundEffect soundEffect2 = new SoundEffect();
                    try {
                        soundEffect2.mo27049t0(rawQuery.getInt(rawQuery.getColumnIndex("soundEffectId")));
                        soundEffect2.mo27051u0(rawQuery.getString(rawQuery.getColumnIndex("soundEffectName")));
                        soundEffect2.mo27022f0(rawQuery.getString(rawQuery.getColumnIndex("dataName")));
                        soundEffect2.mo27020e0(rawQuery.getInt(rawQuery.getColumnIndex("dataEnable")));
                        soundEffect2.mo27026h0(rawQuery.getInt(rawQuery.getColumnIndex("eqStyle")));
                        soundEffect2.mo27005U((float) rawQuery.getInt(rawQuery.getColumnIndex("data1")));
                        soundEffect2.mo27007W((float) rawQuery.getInt(rawQuery.getColumnIndex("data2")));
                        soundEffect2.mo27008X((float) rawQuery.getInt(rawQuery.getColumnIndex("data3")));
                        soundEffect2.mo27009Y((float) rawQuery.getInt(rawQuery.getColumnIndex("data4")));
                        soundEffect2.mo27010Z((float) rawQuery.getInt(rawQuery.getColumnIndex("data5")));
                        soundEffect2.mo27012a0((float) rawQuery.getInt(rawQuery.getColumnIndex("data6")));
                        soundEffect2.mo27014b0((float) rawQuery.getInt(rawQuery.getColumnIndex("data7")));
                        soundEffect2.mo27015c0((float) rawQuery.getInt(rawQuery.getColumnIndex("data8")));
                        soundEffect2.mo27017d0((float) rawQuery.getInt(rawQuery.getColumnIndex("data9")));
                        soundEffect2.mo27006V((float) rawQuery.getInt(rawQuery.getColumnIndex("data10")));
                        soundEffect2.mo27055w0(rawQuery.getInt(rawQuery.getColumnIndex("toneEffectEnable")));
                        soundEffect2.mo27053v0(rawQuery.getInt(rawQuery.getColumnIndex("tempo")));
                        soundEffect2.mo27047s0(rawQuery.getInt(rawQuery.getColumnIndex("simpleRate")));
                        soundEffect2.mo27058x0(rawQuery.getInt(rawQuery.getColumnIndex("toneType")));
                        soundEffect2.mo27001P(rawQuery.getFloat(rawQuery.getColumnIndex("balance")));
                        soundEffect2.mo27002Q(rawQuery.getInt(rawQuery.getColumnIndex("balanceEnable")));
                        soundEffect2.mo27041p0(rawQuery.getInt(rawQuery.getColumnIndex("rotates")));
                        soundEffect2.mo27043q0(rawQuery.getInt(rawQuery.getColumnIndex("rotateEnable")));
                        soundEffect2.mo27037n0(rawQuery.getInt(rawQuery.getColumnIndex("reverse")));
                        soundEffect2.mo27039o0(rawQuery.getInt(rawQuery.getColumnIndex("reverseEnable")));
                        soundEffect2.mo27033l0(rawQuery.getInt(rawQuery.getColumnIndex("pitch")));
                        soundEffect2.mo27035m0(rawQuery.getInt(rawQuery.getColumnIndex("pitchEnable")));
                        soundEffect2.mo27060y0(rawQuery.getFloat(rawQuery.getColumnIndex("volume")));
                        soundEffect2.mo27062z0(rawQuery.getInt(rawQuery.getColumnIndex("volumeBooster")));
                        soundEffect2.mo27004S(rawQuery.getInt(rawQuery.getColumnIndex("compressType")));
                        soundEffect2.mo27000O(rawQuery.getInt(rawQuery.getColumnIndex("autoWahType")));
                        soundEffect2.mo27031k0(rawQuery.getInt(rawQuery.getColumnIndex("phaserType")));
                        soundEffect2.mo27003R(rawQuery.getInt(rawQuery.getColumnIndex("chorusType")));
                        soundEffect2.mo27024g0(rawQuery.getInt(rawQuery.getColumnIndex("enableEd")));
                        soundEffect = soundEffect2;
                    } catch (Exception e) {
                        e = e;
                        soundEffect = soundEffect2;
                        e.printStackTrace();
                        return soundEffect;
                    }
                }
                rawQuery.close();
            }
        } catch (Exception e2) {
            e = e2;
        }
        return soundEffect;
    }

    /* renamed from: j */
    public boolean mo29526j(String str) {
        try {
            SQLiteDatabase readableDatabase = this.f33689a.getReadableDatabase();
            Cursor rawQuery = readableDatabase.rawQuery("select * from music_sound_effect where soundEffectName = '" + str + "'", (String[]) null);
            if (rawQuery == null || rawQuery.getCount() <= 0) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: k */
    public int mo29527k(int i, String str) {
        try {
            if (str.trim().isEmpty()) {
                return -2;
            }
            if (mo29526j(str)) {
                return -1;
            }
            SQLiteDatabase readableDatabase = this.f33689a.getReadableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("soundEffectName", str);
            return readableDatabase.update("music_sound_effect", contentValues, "soundEffectId=?", new String[]{String.valueOf(i)});
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
