package p159f.p166c.p171b.p173b;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.preference.PreferenceManager;
import p159f.p166c.p171b.p172a.C4313a;
import p159f.p166c.p171b.p174c.C4320c;
import p159f.p332g.p333a.C7739a;
import p369i.C8457t;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.b.b.a */
/* compiled from: BaseSQLiteHelper.kt */
public abstract class C4316a extends C4317b {

    /* renamed from: g */
    private final Context f12906g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4316a(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        C8594l.m46771e(context, "mContext");
        this.f12906g = context;
    }

    /* renamed from: c */
    public SQLiteDatabase mo14726c() {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        C8594l.m46770d(writableDatabase, "writableDatabase");
        return writableDatabase;
    }

    /* renamed from: d */
    public abstract void mo14727d(SQLiteDatabase sQLiteDatabase, int i, int i2);

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        String[] strArr;
        int i;
        String[] strArr2;
        String[] strArr3;
        int i2;
        String[] strArr4;
        int i3;
        String str;
        int i4;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        int i5;
        String[] strArr8;
        String str2;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        C8594l.m46771e(sQLiteDatabase2, "db");
        sQLiteDatabase.beginTransaction();
        try {
            C4313a a = C4320c.f12910c.mo14740a();
            StringBuilder sb = new StringBuilder();
            String i6 = a.mo14699i();
            if (i6 != null) {
                sb.append("create table IF NOT EXISTS " + i6 + '(');
            }
            String d = a.mo14694d();
            if (d != null) {
                sb.append(d + " INTEGER PRIMARY KEY AUTOINCREMENT,");
            }
            String e = a.mo14695e();
            if (e != null) {
                sb.append(e + " varchar UNIQUE not null");
            }
            String[] b = a.mo14692b();
            int i7 = 0;
            if (b != null) {
                for (String str3 : b) {
                    sb.append(',' + str3 + " integer not null");
                }
                C8457t tVar = C8457t.f34900a;
            }
            String[] k = a.mo14701k();
            if (k != null) {
                for (String str4 : k) {
                    sb.append(',' + str4 + " integer not null");
                }
                C8457t tVar2 = C8457t.f34900a;
            }
            String g = a.mo14697g();
            if (g != null) {
                sb.append(',' + g + " integer not null");
            }
            String c = a.mo14693c();
            if (c != null) {
                sb.append(',' + c + " integer not null");
            }
            sb.append(")");
            sQLiteDatabase2.execSQL(sb.toString());
            String[] stringArray = this.f12906g.getResources().getStringArray(C7739a.equalizer_new_eq_name);
            C8594l.m46770d(stringArray, "mContext.resources.getSt…ay.equalizer_new_eq_name)");
            String[] stringArray2 = this.f12906g.getResources().getStringArray(C7739a.equalizer_new_eq_name_value);
            C8594l.m46770d(stringArray2, "mContext.resources.getSt…alizer_new_eq_name_value)");
            int length = stringArray.length;
            int i8 = 0;
            while (i8 < length) {
                try {
                    if (stringArray2[i8] == null) {
                        i4 = length;
                        Object[] array = C8437p.m46547V("0,0,0,0,0,0,0,0,0,0", new String[]{","}, false, 0, 6, (Object) null).toArray(new String[i7]);
                        if (array != null) {
                            strArr5 = (String[]) array;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    } else {
                        i4 = length;
                        String str5 = stringArray2[i8];
                        C8594l.m46769c(str5);
                        Object[] array2 = C8437p.m46547V(str5, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[i7]);
                        if (array2 != null) {
                            strArr5 = (String[]) array2;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                    ContentValues contentValues = new ContentValues();
                    String e2 = a.mo14695e();
                    if (e2 != null) {
                        contentValues.put(e2, stringArray[i8]);
                        C8457t tVar3 = C8457t.f34900a;
                    }
                    String[] b2 = a.mo14692b();
                    if (b2 != null) {
                        int length2 = strArr5.length;
                        strArr7 = stringArray;
                        int i9 = 0;
                        while (i9 < length2) {
                            String[] strArr9 = stringArray2;
                            String str6 = b2[i9];
                            String[] strArr10 = b2;
                            int i10 = length2;
                            int i11 = i9 + 1;
                            if (strArr5.length >= i11) {
                                String str7 = strArr5[i9];
                                int length3 = str7.length() - 1;
                                strArr8 = strArr5;
                                int i12 = 0;
                                boolean z = false;
                                while (true) {
                                    i5 = i11;
                                    if (i12 > length3) {
                                        break;
                                    }
                                    boolean z2 = C8594l.m46773g(str7.charAt(!z ? i12 : length3), 32) <= 0;
                                    if (!z) {
                                        if (!z2) {
                                            z = true;
                                        } else {
                                            i12++;
                                        }
                                    } else if (!z2) {
                                        break;
                                    } else {
                                        length3--;
                                    }
                                    i11 = i5;
                                }
                                str2 = str7.subSequence(i12, length3 + 1).toString();
                            } else {
                                strArr8 = strArr5;
                                i5 = i11;
                                str2 = "0";
                            }
                            contentValues.put(str6, str2);
                            b2 = strArr10;
                            stringArray2 = strArr9;
                            length2 = i10;
                            strArr5 = strArr8;
                            i9 = i5;
                        }
                        strArr6 = stringArray2;
                        C8457t tVar4 = C8457t.f34900a;
                    } else {
                        strArr7 = stringArray;
                        strArr6 = stringArray2;
                    }
                    String[] k2 = a.mo14701k();
                    if (k2 != null) {
                        for (String put : k2) {
                            contentValues.put(put, 1);
                        }
                        C8457t tVar5 = C8457t.f34900a;
                    }
                    String g2 = a.mo14697g();
                    if (g2 != null) {
                        contentValues.put(g2, Integer.valueOf(i8));
                        C8457t tVar6 = C8457t.f34900a;
                    }
                    String c2 = a.mo14693c();
                    if (c2 != null) {
                        contentValues.put(c2, Integer.valueOf(i8));
                        C8457t tVar7 = C8457t.f34900a;
                    }
                    sQLiteDatabase2.insert(a.mo14699i(), "0", contentValues);
                    i8++;
                    length = i4;
                    stringArray = strArr7;
                    stringArray2 = strArr6;
                    i7 = 0;
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            String h = a.mo14698h();
            if (h != null) {
                sb2.append("create table IF NOT EXISTS " + h + '(');
            }
            String d2 = a.mo14694d();
            if (d2 != null) {
                sb2.append(d2 + " INTEGER PRIMARY KEY AUTOINCREMENT,");
            }
            String e3 = a.mo14695e();
            if (e3 != null) {
                sb2.append(e3 + " varchar UNIQUE not null");
            }
            String[] a2 = a.mo14691a();
            if (a2 != null) {
                for (String str8 : a2) {
                    sb2.append(',' + str8 + " integer not null");
                }
                C8457t tVar8 = C8457t.f34900a;
            }
            String[] j = a.mo14700j();
            if (j != null) {
                for (String str9 : j) {
                    sb2.append(',' + str9 + " integer not null");
                }
                C8457t tVar9 = C8457t.f34900a;
            }
            String g3 = a.mo14697g();
            if (g3 != null) {
                sb2.append(',' + g3 + " integer not null");
            }
            String c3 = a.mo14693c();
            if (c3 != null) {
                sb2.append(',' + c3 + " integer not null");
            }
            sb2.append(")");
            sQLiteDatabase2.execSQL(sb2.toString());
            String[] stringArray3 = this.f12906g.getResources().getStringArray(C7739a.equalizer_old_eq_name);
            C8594l.m46770d(stringArray3, "mContext.resources.getSt…ay.equalizer_old_eq_name)");
            String[] stringArray4 = this.f12906g.getResources().getStringArray(C7739a.equalizer_old_eq_name_value);
            C8594l.m46770d(stringArray4, "mContext.resources.getSt…alizer_old_eq_name_value)");
            int length4 = stringArray3.length;
            int i13 = 0;
            while (i13 < length4) {
                if (stringArray4[i13] == null) {
                    Object[] array3 = C8437p.m46547V("0,0,0,0,0", new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
                    if (array3 != null) {
                        strArr = (String[]) array3;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                } else {
                    String str10 = stringArray4[i13];
                    C8594l.m46769c(str10);
                    Object[] array4 = C8437p.m46547V(str10, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
                    if (array4 != null) {
                        strArr = (String[]) array4;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                ContentValues contentValues2 = new ContentValues();
                String e4 = a.mo14695e();
                if (e4 != null) {
                    contentValues2.put(e4, stringArray3[i13]);
                    C8457t tVar10 = C8457t.f34900a;
                }
                String[] a3 = a.mo14691a();
                if (a3 != null) {
                    int length5 = strArr.length;
                    int i14 = 0;
                    while (i14 < length5) {
                        String str11 = a3[i14];
                        String[] strArr11 = stringArray3;
                        int i15 = i14 + 1;
                        if (strArr.length >= i15) {
                            String str12 = strArr[i14];
                            i3 = i15;
                            int length6 = str12.length() - 1;
                            int i16 = 0;
                            boolean z3 = false;
                            while (true) {
                                strArr4 = stringArray4;
                                if (i16 > length6) {
                                    i2 = length4;
                                    break;
                                }
                                i2 = length4;
                                boolean z4 = C8594l.m46773g(str12.charAt(!z3 ? i16 : length6), 32) <= 0;
                                if (!z3) {
                                    if (!z4) {
                                        z3 = true;
                                    } else {
                                        i16++;
                                    }
                                } else if (!z4) {
                                    break;
                                } else {
                                    length6--;
                                }
                                stringArray4 = strArr4;
                                length4 = i2;
                            }
                            str = str12.subSequence(i16, length6 + 1).toString();
                        } else {
                            i3 = i15;
                            strArr4 = stringArray4;
                            i2 = length4;
                            str = "0";
                        }
                        contentValues2.put(str11, str);
                        stringArray3 = strArr11;
                        i14 = i3;
                        stringArray4 = strArr4;
                        length4 = i2;
                    }
                    strArr3 = stringArray3;
                    strArr2 = stringArray4;
                    i = length4;
                    C8457t tVar11 = C8457t.f34900a;
                } else {
                    strArr3 = stringArray3;
                    strArr2 = stringArray4;
                    i = length4;
                }
                String[] j2 = a.mo14700j();
                if (j2 != null) {
                    for (String put2 : j2) {
                        contentValues2.put(put2, 1);
                    }
                    C8457t tVar12 = C8457t.f34900a;
                }
                String g4 = a.mo14697g();
                if (g4 != null) {
                    contentValues2.put(g4, Integer.valueOf(i13));
                    C8457t tVar13 = C8457t.f34900a;
                }
                String c4 = a.mo14693c();
                if (c4 != null) {
                    contentValues2.put(c4, Integer.valueOf(i13));
                    C8457t tVar14 = C8457t.f34900a;
                }
                sQLiteDatabase2.insert(a.mo14698h(), "0", contentValues2);
                i13++;
                stringArray3 = strArr3;
                stringArray4 = strArr2;
                length4 = i;
            }
            C8457t tVar15 = C8457t.f34900a;
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            mo14730p(this.f12906g);
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C8594l.m46771e(sQLiteDatabase, "db");
        mo14727d(sQLiteDatabase, i, i2);
    }

    /* renamed from: p */
    public void mo14730p(Context context) {
        C8594l.m46771e(context, "context");
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.f12906g).edit();
        edit.putBoolean("isFirstChangeDB", false);
        edit.apply();
    }
}
