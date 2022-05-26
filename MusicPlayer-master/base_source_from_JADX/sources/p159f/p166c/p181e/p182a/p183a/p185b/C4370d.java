package p159f.p166c.p181e.p182a.p183a.p185b;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import androidx.core.content.C0506a;
import com.coocent.music.base.data.entity.Music;
import com.coocent.music.base.data.entity.Playlist;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p159f.p166c.p181e.p182a.p183a.p188e.C4423k;
import p159f.p166c.p181e.p182a.p183a.p188e.C4429l;
import p159f.p166c.p181e.p182a.p183a.p189f.C4441e;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.c.e.a.a.b.d */
/* compiled from: PlaylistDao.kt */
public final class C4370d {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static C4370d f12957b;

    /* renamed from: c */
    public static final C4371a f12958c = new C4371a((C8589g) null);

    /* renamed from: a */
    private C4365a f12959a;

    /* renamed from: f.c.e.a.a.b.d$a */
    /* compiled from: PlaylistDao.kt */
    public static final class C4371a {
        private C4371a() {
        }

        /* renamed from: a */
        public final C4370d mo14843a(Context context) {
            C8594l.m46771e(context, "context");
            if (C4370d.f12957b == null) {
                C4370d.f12957b = new C4370d(context);
            }
            C4370d a = C4370d.f12957b;
            Objects.requireNonNull(a, "null cannot be cast to non-null type com.coocent.music.base.data.db.PlaylistDao");
            return a;
        }

        public /* synthetic */ C4371a(C8589g gVar) {
            this();
        }
    }

    public C4370d(Context context) {
        C8594l.m46771e(context, "context");
        this.f12959a = new C4365a(context.getApplicationContext());
    }

    /* renamed from: e */
    private final void m19052e(Context context, List<Playlist> list) {
        boolean z = false;
        for (Playlist next : list) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", next.mo9242g());
            contentValues.put("songCount", Integer.valueOf(next.mo9243h()));
            contentValues.put("allMusicIds", mo14842z(next.mo9241f()));
            this.f12959a.getWritableDatabase().insert("Playlist", BuildConfig.FLAVOR, contentValues);
            if (C8594l.m46767a(next.mo9242g(), "Favorites")) {
                z = true;
            }
        }
        if (!z) {
            mo14831n(context, "Favorites");
        }
    }

    /* renamed from: i */
    private final int m19053i(String str) {
        return str.length() > 500 ? -5 : 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.database.Cursor] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m19054j(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0046 }
            r1.<init>()     // Catch:{ Exception -> 0x0046 }
            java.lang.String r2 = "select * from Playlist where name='"
            r1.append(r2)     // Catch:{ Exception -> 0x0046 }
            r1.append(r6)     // Catch:{ Exception -> 0x0046 }
            r6 = 39
            r1.append(r6)     // Catch:{ Exception -> 0x0046 }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x0046 }
            f.c.e.a.a.b.a r1 = r5.f12959a     // Catch:{ Exception -> 0x0046 }
            android.database.sqlite.SQLiteDatabase r1 = r1.getReadableDatabase()     // Catch:{ Exception -> 0x0046 }
            android.database.Cursor r0 = r1.rawQuery(r6, r0)     // Catch:{ Exception -> 0x0046 }
            if (r0 == 0) goto L_0x003e
            boolean r6 = r0.moveToFirst()     // Catch:{ Exception -> 0x0046 }
            if (r6 == 0) goto L_0x003e
            java.lang.String r6 = "_ID"
            int r6 = r0.getColumnIndex(r6)     // Catch:{ Exception -> 0x0046 }
            long r1 = r0.getLong(r6)     // Catch:{ Exception -> 0x0046 }
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x003e
            r6 = 1
            r0.close()
            return r6
        L_0x003e:
            if (r0 == 0) goto L_0x0050
        L_0x0040:
            r0.close()
            goto L_0x0050
        L_0x0044:
            r6 = move-exception
            goto L_0x0052
        L_0x0046:
            java.lang.String r6 = "PlaylistDao"
            java.lang.String r1 = "ERROR CODE:-4"
            android.util.Log.e(r6, r1)     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0050
            goto L_0x0040
        L_0x0050:
            r6 = 0
            return r6
        L_0x0052:
            if (r0 == 0) goto L_0x0057
            r0.close()
        L_0x0057:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p185b.C4370d.m19054j(java.lang.String):boolean");
    }

    /* renamed from: l */
    private final int m19055l(String str) {
        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
        if (C8437p.m46563l0(str).toString().length() == 0) {
            Log.e("PlaylistDao", "ERROR CODE:-2");
            return -2;
        } else if (str.length() > 100) {
            Log.e("PlaylistDao", "ERROR CODE:-3");
            return -3;
        } else if (!m19054j(str)) {
            return 0;
        } else {
            Log.e("PlaylistDao", "ERROR CODE:-1");
            return -1;
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v3, types: [android.database.Cursor] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        if (r5 == 0) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r5 != 0) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        r5.close();
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m19056w(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            r5 = 0
            r0 = -1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x003b }
            r2.<init>()     // Catch:{ all -> 0x003b }
            java.lang.String r3 = "select * from Playlist where name='"
            r2.append(r3)     // Catch:{ all -> 0x003b }
            r2.append(r6)     // Catch:{ all -> 0x003b }
            r6 = 39
            r2.append(r6)     // Catch:{ all -> 0x003b }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x003b }
            f.c.e.a.a.b.a r2 = r4.f12959a     // Catch:{ all -> 0x003b }
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch:{ all -> 0x003b }
            android.database.Cursor r5 = r2.rawQuery(r6, r5)     // Catch:{ all -> 0x003b }
            if (r5 == 0) goto L_0x0035
            boolean r6 = r5.moveToFirst()     // Catch:{ all -> 0x003b }
            if (r6 == 0) goto L_0x0035
            java.lang.String r6 = "_ID"
            int r6 = r5.getColumnIndex(r6)     // Catch:{ all -> 0x003b }
            long r0 = r5.getLong(r6)     // Catch:{ all -> 0x003b }
        L_0x0035:
            if (r5 == 0) goto L_0x0045
        L_0x0037:
            r5.close()
            goto L_0x0045
        L_0x003b:
            java.lang.String r6 = "PlaylistDao"
            java.lang.String r2 = "ERROR CODE:-4"
            android.util.Log.e(r6, r2)     // Catch:{ all -> 0x0046 }
            if (r5 == 0) goto L_0x0045
            goto L_0x0037
        L_0x0045:
            return r0
        L_0x0046:
            r6 = move-exception
            if (r5 == 0) goto L_0x004c
            r5.close()
        L_0x004c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p185b.C4370d.m19056w(android.content.Context, java.lang.String):long");
    }

    /* renamed from: A */
    public final int mo14817A(long j) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("favorite", 0);
            if (this.f12959a.getWritableDatabase().update("Playlist", contentValues, "_ID = ?", new String[]{String.valueOf(j)}) > 0) {
                return 2;
            }
            return -4;
        } catch (Exception e) {
            e.printStackTrace();
            return -4;
        }
    }

    /* renamed from: B */
    public final int mo14818B(Context context, long[] jArr, long j) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(jArr, "musicIds");
        Playlist u = mo14838u(context, j);
        Object[] array = C8437p.m46547V(mo14842z(u.mo9241f()), new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        String[] strArr = (String[]) array;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StringBuilder sb = new StringBuilder();
        try {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (!C8594l.m46767a(strArr[i], BuildConfig.FLAVOR)) {
                    linkedHashMap.put(Long.valueOf(Long.parseLong(strArr[i])), strArr[i]);
                }
            }
            int length2 = jArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (C8477h.m46628m(strArr, String.valueOf(jArr[i2]))) {
                    linkedHashMap.remove(Long.valueOf(jArr[i2]));
                }
            }
            for (Map.Entry value : linkedHashMap.entrySet()) {
                sb.append(((String) value.getValue()) + ",");
            }
            String sb2 = sb.toString();
            C8594l.m46770d(sb2, "newAllMusicIdsString.toString()");
            if (C8436o.m46518l(sb2, ",", false, 2, (Object) null)) {
                sb.deleteCharAt(sb.length() - 1);
            }
            Playlist playlist = new Playlist();
            playlist.mo9249m(u.mo9239e());
            playlist.mo9251o(u.mo9242g());
            playlist.mo9252p(linkedHashMap.size());
            String sb3 = sb.toString();
            C8594l.m46770d(sb3, "newAllMusicIdsString.toString()");
            playlist.mo9250n(mo14820D(sb3));
            if (mo14823G(playlist) > 0) {
                return jArr.length;
            }
            return -4;
        } catch (Throwable unused) {
            Log.e("PlaylistDao", "ERROR CODE:-4");
            return -4;
        }
    }

    /* renamed from: C */
    public final int mo14819C(String str, long j) {
        C8594l.m46771e(str, "name");
        int l = m19055l(str);
        if (l < 0) {
            return l;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", str);
        return this.f12959a.getWritableDatabase().update("Playlist", contentValues, "_ID = ?", new String[]{String.valueOf(j)});
    }

    /* renamed from: D */
    public final long[] mo14820D(String str) {
        C8594l.m46771e(str, "musicIds");
        ArrayList arrayList = new ArrayList();
        if (str.length() > 0) {
            List V = C8437p.m46547V(str, new String[]{","}, false, 0, 6, (Object) null);
            try {
                if (!V.isEmpty()) {
                    int size = V.size();
                    for (int i = 0; i < size; i++) {
                        if (((CharSequence) V.get(i)).length() > 0) {
                            arrayList.add(Long.valueOf(Long.parseLong((String) V.get(i))));
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return C8490t.m46676A(arrayList);
    }

    /* renamed from: E */
    public final int mo14821E(Context context, long j, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "playlistName");
        Playlist v = mo14839v(context, str);
        if (mo14827g(context, j, v.mo9239e())) {
            if (mo14818B(context, new long[]{j}, v.mo9239e()) > 0) {
                return 2;
            }
            return -4;
        }
        if (mo14826f(context, new long[]{j}, v.mo9239e()) > 0) {
            return 1;
        }
        return -4;
    }

    /* renamed from: F */
    public final int mo14822F(Context context, long j) {
        C8594l.m46771e(context, "context");
        try {
            if (mo14838u(context, j).mo9246j()) {
                return mo14817A(j);
            }
            return mo14824c(j);
        } catch (Exception e) {
            e.printStackTrace();
            return -4;
        }
    }

    /* renamed from: G */
    public final int mo14823G(Playlist playlist) {
        C8594l.m46771e(playlist, "playlist");
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", playlist.mo9242g());
        contentValues.put("songCount", Integer.valueOf(playlist.mo9243h()));
        contentValues.put("allMusicIds", mo14842z(playlist.mo9241f()));
        return this.f12959a.getWritableDatabase().update("Playlist", contentValues, "_ID = ?", new String[]{String.valueOf(playlist.mo9239e())});
    }

    /* renamed from: c */
    public final int mo14824c(long j) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("favorite", 1);
            if (this.f12959a.getWritableDatabase().update("Playlist", contentValues, "_ID = ?", new String[]{String.valueOf(j)}) > 0) {
                return 1;
            }
            return -4;
        } catch (Exception e) {
            e.printStackTrace();
            return -4;
        }
    }

    /* renamed from: d */
    public final void mo14825d(Context context) {
        C8594l.m46771e(context, "context");
        m19052e(context, C4429l.f13003a.mo15006a(context));
    }

    /* renamed from: f */
    public final int mo14826f(Context context, long[] jArr, long j) {
        Context context2 = context;
        long[] jArr2 = jArr;
        C8594l.m46771e(context2, "context");
        C8594l.m46771e(jArr2, "musicIds");
        Playlist u = mo14838u(context2, j);
        Object[] array = C8437p.m46547V(mo14842z(u.mo9241f()), new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        String[] strArr = (String[]) array;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StringBuilder sb = new StringBuilder();
        try {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (true ^ C8594l.m46767a(strArr[i], BuildConfig.FLAVOR)) {
                    linkedHashMap.put(Long.valueOf(Long.parseLong(strArr[i])), strArr[i]);
                }
            }
            int length2 = jArr2.length;
            boolean z = true;
            for (int i2 = 0; i2 < length2; i2++) {
                if (!C8477h.m46628m(strArr, String.valueOf(jArr2[i2]))) {
                    linkedHashMap.put(Long.valueOf(jArr2[i2]), String.valueOf(jArr2[i2]));
                    z = false;
                } else if (jArr2.length == 1) {
                    return -1;
                }
            }
            if (z) {
                return -1;
            }
            for (Map.Entry value : linkedHashMap.entrySet()) {
                sb.append(((String) value.getValue()) + ",");
            }
            String sb2 = sb.toString();
            C8594l.m46770d(sb2, "newAllMusicIdsString.toString()");
            if (C8436o.m46518l(sb2, ",", false, 2, (Object) null)) {
                sb.deleteCharAt(sb.length() - 1);
            }
            Playlist playlist = new Playlist();
            playlist.mo9249m(u.mo9239e());
            playlist.mo9251o(u.mo9242g());
            playlist.mo9252p(linkedHashMap.size());
            String sb3 = sb.toString();
            C8594l.m46770d(sb3, "newAllMusicIdsString.toString()");
            playlist.mo9250n(mo14820D(sb3));
            int G = mo14823G(playlist);
            if (G > 0) {
                return G;
            }
            return -4;
        } catch (Throwable unused) {
            Log.e("PlaylistDao", "ERROR CODE:-4");
            return -4;
        }
    }

    /* renamed from: g */
    public final boolean mo14827g(Context context, long j, long j2) {
        C8594l.m46771e(context, "context");
        return C8477h.m46627l(mo14838u(context, j2).mo9241f(), j);
    }

    /* renamed from: h */
    public final boolean mo14828h(Context context, long j, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "playlistName");
        return C8477h.m46627l(mo14839v(context, str).mo9241f(), j);
    }

    /* renamed from: k */
    public final boolean mo14829k(Context context, long j) {
        C8594l.m46771e(context, "context");
        return mo14838u(context, j).mo9246j();
    }

    /* renamed from: m */
    public final void mo14830m(Context context) {
        C8594l.m46771e(context, "context");
        if (Build.VERSION.SDK_INT < 23) {
            mo14825d(context);
        } else if (C0506a.m3149a(context, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            mo14825d(context);
        }
    }

    /* renamed from: n */
    public final long mo14831n(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "newName");
        int l = m19055l(str);
        if (l < 0) {
            return (long) l;
        }
        Playlist playlist = new Playlist();
        playlist.mo9251o(str);
        playlist.mo9250n(new long[0]);
        playlist.mo9252p(0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", playlist.mo9242g());
        contentValues.put("songCount", Integer.valueOf(playlist.mo9243h()));
        contentValues.put("allMusicIds", mo14842z(playlist.mo9241f()));
        if (this.f12959a.getWritableDatabase().insert("Playlist", BuildConfig.FLAVOR, contentValues) > 0) {
            return m19056w(context, playlist.mo9242g());
        }
        Log.e("PlaylistDao", "ERROR CODE:-4");
        return (long) -4;
    }

    /* renamed from: o */
    public final int mo14832o(Context context, long[] jArr) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(jArr, "musicIds");
        int i = 0;
        for (Playlist next : mo14841y(context, false)) {
            Object[] array = C8437p.m46547V(mo14842z(next.mo9241f()), new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            StringBuilder sb = new StringBuilder();
            try {
                int length = strArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    if (!C8594l.m46767a(strArr[i2], BuildConfig.FLAVOR)) {
                        linkedHashMap.put(Long.valueOf(Long.parseLong(strArr[i2])), strArr[i2]);
                    }
                }
                int length2 = jArr.length;
                for (int i3 = 0; i3 < length2; i3++) {
                    if (C8477h.m46628m(strArr, String.valueOf(jArr[i3]))) {
                        linkedHashMap.remove(Long.valueOf(jArr[i3]));
                    }
                }
                for (Map.Entry value : linkedHashMap.entrySet()) {
                    sb.append(((String) value.getValue()) + ",");
                }
                String sb2 = sb.toString();
                C8594l.m46770d(sb2, "newAllMusicIdsString.toString()");
                if (C8436o.m46518l(sb2, ",", false, 2, (Object) null)) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                Playlist playlist = new Playlist();
                playlist.mo9249m(next.mo9239e());
                playlist.mo9251o(next.mo9242g());
                playlist.mo9252p(linkedHashMap.size());
                String sb3 = sb.toString();
                C8594l.m46770d(sb3, "newAllMusicIdsString.toString()");
                playlist.mo9250n(mo14820D(sb3));
                i += mo14823G(playlist);
            } catch (Throwable unused) {
                Log.e("PlaylistDao", "ERROR CODE:-4");
                return -4;
            }
        }
        return i;
    }

    /* renamed from: p */
    public final int mo14833p(long j) {
        try {
            SQLiteDatabase readableDatabase = this.f12959a.getReadableDatabase();
            C8594l.m46770d(readableDatabase, "helper.readableDatabase");
            return readableDatabase.delete("Playlist", "_ID =?", new String[]{String.valueOf(j)});
        } catch (Exception e) {
            e.printStackTrace();
            return -4;
        }
    }

    /* renamed from: q */
    public final int mo14834q(Context context, long j, String str, String str2, String str3) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "playlistName");
        C8594l.m46771e(str2, "artworkUrl");
        C8594l.m46771e(str3, "description");
        try {
            if (C8437p.m46563l0(str).toString().length() == 0) {
                Log.e("PlaylistDao", "ERROR CODE:-2");
                return -2;
            } else if (str.length() > 100) {
                Log.e("PlaylistDao", "ERROR CODE:-3");
                return -3;
            } else {
                int i = m19053i(str3);
                if (i < 0) {
                    return i;
                }
                if (!(!C8594l.m46767a(mo14838u(context, j).mo9242g(), str)) || !m19054j(str)) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("name", str);
                    contentValues.put("thumbnail", str2);
                    contentValues.put("describe", str3);
                    return this.f12959a.getWritableDatabase().update("Playlist", contentValues, "_ID = ?", new String[]{String.valueOf(j)});
                }
                Log.e("PlaylistDao", "ERROR CODE:-1");
                return -1;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return -4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        if (r1 == null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (r1 == null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        r1.close();
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Playlist> mo14835r(android.content.Context r8) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r8, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            f.c.e.a.a.b.a r2 = r7.f12959a     // Catch:{ all -> 0x003e }
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch:{ all -> 0x003e }
            java.lang.String r3 = "SELECT * FROM Playlist WHERE favorite = ?"
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ all -> 0x003e }
            r6 = 0
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x003e }
            r5[r6] = r4     // Catch:{ all -> 0x003e }
            android.database.Cursor r1 = r2.rawQuery(r3, r5)     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x0038
            boolean r2 = r1.moveToFirst()     // Catch:{ all -> 0x003e }
            if (r2 == 0) goto L_0x0038
        L_0x0029:
            f.c.e.a.a.d.b r2 = p159f.p166c.p181e.p182a.p183a.p187d.C4377b.f12966a     // Catch:{ all -> 0x003e }
            com.coocent.music.base.data.entity.Playlist r2 = r2.mo14930c(r8, r1)     // Catch:{ all -> 0x003e }
            r0.add(r2)     // Catch:{ all -> 0x003e }
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x003e }
            if (r2 != 0) goto L_0x0029
        L_0x0038:
            if (r1 == 0) goto L_0x0045
        L_0x003a:
            r1.close()
            goto L_0x0045
        L_0x003e:
            r8 = move-exception
            r8.printStackTrace()     // Catch:{ all -> 0x0046 }
            if (r1 == 0) goto L_0x0045
            goto L_0x003a
        L_0x0045:
            return r0
        L_0x0046:
            r8 = move-exception
            if (r1 == 0) goto L_0x004c
            r1.close()
        L_0x004c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p185b.C4370d.mo14835r(android.content.Context):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0059, code lost:
        if (r1 != null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        if (r1 == null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        return r0;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Playlist> mo14836s(android.content.Context r6, java.lang.String r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r6, r0)
            java.lang.String r0 = "name"
            p369i.p387z.p389d.C8594l.m46771e(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            f.c.e.a.a.b.a r2 = r5.f12959a     // Catch:{ all -> 0x005f }
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch:{ all -> 0x005f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x005f }
            r3.<init>()     // Catch:{ all -> 0x005f }
            java.lang.String r4 = "SELECT * FROM Playlist WHERE name LIKE '%"
            r3.append(r4)     // Catch:{ all -> 0x005f }
            r3.append(r7)     // Catch:{ all -> 0x005f }
            java.lang.String r7 = "%'"
            r3.append(r7)     // Catch:{ all -> 0x005f }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x005f }
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x005f }
            android.database.Cursor r1 = r2.rawQuery(r7, r3)     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x0059
        L_0x0035:
            boolean r7 = r1.moveToNext()     // Catch:{ all -> 0x005f }
            if (r7 == 0) goto L_0x0059
            f.c.e.a.a.d.b r7 = p159f.p166c.p181e.p182a.p183a.p187d.C4377b.f12966a     // Catch:{ all -> 0x005f }
            com.coocent.music.base.data.entity.Playlist r7 = r7.mo14930c(r6, r1)     // Catch:{ all -> 0x005f }
            if (r8 == 0) goto L_0x0055
            java.lang.String r2 = r7.mo9242g()     // Catch:{ all -> 0x005f }
            java.lang.String r3 = "Favorites"
            boolean r2 = p369i.p387z.p389d.C8594l.m46767a(r2, r3)     // Catch:{ all -> 0x005f }
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0035
            r0.add(r7)     // Catch:{ all -> 0x005f }
            goto L_0x0035
        L_0x0055:
            r0.add(r7)     // Catch:{ all -> 0x005f }
            goto L_0x0035
        L_0x0059:
            if (r1 == 0) goto L_0x0066
        L_0x005b:
            r1.close()
            goto L_0x0066
        L_0x005f:
            r6 = move-exception
            r6.printStackTrace()     // Catch:{ all -> 0x0067 }
            if (r1 == 0) goto L_0x0066
            goto L_0x005b
        L_0x0066:
            return r0
        L_0x0067:
            r6 = move-exception
            if (r1 == 0) goto L_0x006d
            r1.close()
        L_0x006d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p185b.C4370d.mo14836s(android.content.Context, java.lang.String, boolean):java.util.List");
    }

    /* renamed from: t */
    public final List<Playlist> mo14837t(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "name");
        return mo14836s(context, str, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r1 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (r1 != null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        r1.close();
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.coocent.music.base.data.entity.Playlist mo14838u(android.content.Context r7, long r8) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r7, r0)
            com.coocent.music.base.data.entity.Playlist r0 = new com.coocent.music.base.data.entity.Playlist
            r0.<init>()
            r1 = 0
            f.c.e.a.a.b.a r2 = r6.f12959a     // Catch:{ all -> 0x0036 }
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = "SELECT * FROM Playlist WHERE _ID = ?"
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x0036 }
            r5 = 0
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0036 }
            r4[r5] = r8     // Catch:{ all -> 0x0036 }
            android.database.Cursor r1 = r2.rawQuery(r3, r4)     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0030
            boolean r8 = r1.moveToFirst()     // Catch:{ all -> 0x0036 }
            if (r8 == 0) goto L_0x0030
            f.c.e.a.a.d.b r8 = p159f.p166c.p181e.p182a.p183a.p187d.C4377b.f12966a     // Catch:{ all -> 0x0036 }
            com.coocent.music.base.data.entity.Playlist r7 = r8.mo14930c(r7, r1)     // Catch:{ all -> 0x0036 }
            r0 = r7
        L_0x0030:
            if (r1 == 0) goto L_0x003d
        L_0x0032:
            r1.close()
            goto L_0x003d
        L_0x0036:
            r7 = move-exception
            r7.printStackTrace()     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x003d
            goto L_0x0032
        L_0x003d:
            return r0
        L_0x003e:
            r7 = move-exception
            if (r1 == 0) goto L_0x0044
            r1.close()
        L_0x0044:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p185b.C4370d.mo14838u(android.content.Context, long):com.coocent.music.base.data.entity.Playlist");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r1 == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (r1 != null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        r1.close();
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.coocent.music.base.data.entity.Playlist mo14839v(android.content.Context r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r7, r0)
            java.lang.String r0 = "name"
            p369i.p387z.p389d.C8594l.m46771e(r8, r0)
            com.coocent.music.base.data.entity.Playlist r0 = new com.coocent.music.base.data.entity.Playlist
            r0.<init>()
            r1 = 0
            f.c.e.a.a.b.a r2 = r6.f12959a     // Catch:{ all -> 0x0037 }
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch:{ all -> 0x0037 }
            java.lang.String r3 = "SELECT * FROM Playlist WHERE name = ?"
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x0037 }
            r5 = 0
            r4[r5] = r8     // Catch:{ all -> 0x0037 }
            android.database.Cursor r1 = r2.rawQuery(r3, r4)     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0031
            boolean r8 = r1.moveToFirst()     // Catch:{ all -> 0x0037 }
            if (r8 == 0) goto L_0x0031
            f.c.e.a.a.d.b r8 = p159f.p166c.p181e.p182a.p183a.p187d.C4377b.f12966a     // Catch:{ all -> 0x0037 }
            com.coocent.music.base.data.entity.Playlist r7 = r8.mo14930c(r7, r1)     // Catch:{ all -> 0x0037 }
            r0 = r7
        L_0x0031:
            if (r1 == 0) goto L_0x003e
        L_0x0033:
            r1.close()
            goto L_0x003e
        L_0x0037:
            r7 = move-exception
            r7.printStackTrace()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003e
            goto L_0x0033
        L_0x003e:
            return r0
        L_0x003f:
            r7 = move-exception
            if (r1 == 0) goto L_0x0045
            r1.close()
        L_0x0045:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p185b.C4370d.mo14839v(android.content.Context, java.lang.String):com.coocent.music.base.data.entity.Playlist");
    }

    /* renamed from: x */
    public final List<Music> mo14840x(Context context, long j) {
        C8594l.m46771e(context, "context");
        Playlist u = mo14838u(context, j);
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        String r = n.mo15124r();
        if (C8594l.m46767a(r, "music_ids")) {
            return C4423k.f13002a.mo14997t(context, u.mo9241f());
        }
        return C4423k.f13002a.mo14996r(context, u.mo9241f(), r, true);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005f, code lost:
        if (r1 != null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0061, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0072, code lost:
        if (r1 == 0) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0075, code lost:
        return r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Playlist> mo14841y(android.content.Context r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r8, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            f.c.e.a.a.b.a r2 = r7.f12959a     // Catch:{ Exception -> 0x0067 }
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch:{ Exception -> 0x0067 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0067 }
            r3.<init>()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r4 = "SELECT * FROM Playlist ORDER BY "
            r3.append(r4)     // Catch:{ Exception -> 0x0067 }
            f.c.e.a.a.f.e r4 = p159f.p166c.p181e.p182a.p183a.p189f.C4441e.m19454n(r8)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r5 = "MusicPreference.getInstance(context)"
            p369i.p387z.p389d.C8594l.m46770d(r4, r5)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r4 = r4.mo15125s()     // Catch:{ Exception -> 0x0067 }
            r3.append(r4)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0067 }
            android.database.Cursor r1 = r2.rawQuery(r3, r1)     // Catch:{ Exception -> 0x0067 }
            r2 = 0
            r3 = 0
        L_0x0035:
            boolean r4 = r1.moveToNext()     // Catch:{ Exception -> 0x0067 }
            if (r4 == 0) goto L_0x005f
            f.c.e.a.a.d.b r4 = p159f.p166c.p181e.p182a.p183a.p187d.C4377b.f12966a     // Catch:{ Exception -> 0x0067 }
            java.lang.String r5 = "cursor"
            p369i.p387z.p389d.C8594l.m46770d(r1, r5)     // Catch:{ Exception -> 0x0067 }
            com.coocent.music.base.data.entity.Playlist r4 = r4.mo14930c(r8, r1)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r5 = r4.mo9242g()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r6 = "Favorites"
            boolean r5 = p369i.p387z.p389d.C8594l.m46767a(r5, r6)     // Catch:{ Exception -> 0x0067 }
            if (r5 == 0) goto L_0x005b
            if (r9 != 0) goto L_0x0035
            if (r3 != 0) goto L_0x0035
            r0.add(r2, r4)     // Catch:{ Exception -> 0x0067 }
            r3 = 1
            goto L_0x0035
        L_0x005b:
            r0.add(r4)     // Catch:{ Exception -> 0x0067 }
            goto L_0x0035
        L_0x005f:
            if (r1 == 0) goto L_0x0075
        L_0x0061:
            r1.close()
            goto L_0x0075
        L_0x0065:
            r8 = move-exception
            goto L_0x0076
        L_0x0067:
            r8 = move-exception
            r8.printStackTrace()     // Catch:{ all -> 0x0065 }
            java.lang.String r8 = "PlaylistDao"
            java.lang.String r9 = "ERROR CODE:-4"
            android.util.Log.e(r8, r9)     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x0075
            goto L_0x0061
        L_0x0075:
            return r0
        L_0x0076:
            if (r1 == 0) goto L_0x007b
            r1.close()
        L_0x007b:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p185b.C4370d.mo14841y(android.content.Context, boolean):java.util.List");
    }

    /* renamed from: z */
    public final String mo14842z(long[] jArr) {
        C8594l.m46771e(jArr, "musicIds");
        StringBuffer stringBuffer = new StringBuffer();
        if (!(jArr.length == 0)) {
            for (long append : jArr) {
                stringBuffer.append(append);
                stringBuffer.append(",");
            }
        }
        String stringBuffer2 = stringBuffer.toString();
        C8594l.m46770d(stringBuffer2, "musicIdsString.toString()");
        if (C8436o.m46518l(stringBuffer2, ",", false, 2, (Object) null)) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        String stringBuffer3 = stringBuffer.toString();
        C8594l.m46770d(stringBuffer3, "musicIdsString.toString()");
        return stringBuffer3;
    }
}
