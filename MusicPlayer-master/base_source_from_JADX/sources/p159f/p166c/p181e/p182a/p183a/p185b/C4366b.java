package p159f.p166c.p181e.p182a.p183a.p185b;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.coocent.music.base.data.entity.Album;
import java.util.List;
import java.util.Objects;
import p159f.p166c.p181e.p182a.p183a.p189f.C4434c;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.c.e.a.a.b.b */
/* compiled from: FavoriteAlbumDao.kt */
public final class C4366b {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static C4366b f12951b;

    /* renamed from: c */
    public static final C4367a f12952c = new C4367a((C8589g) null);

    /* renamed from: a */
    private C4365a f12953a;

    /* renamed from: f.c.e.a.a.b.b$a */
    /* compiled from: FavoriteAlbumDao.kt */
    public static final class C4367a {
        private C4367a() {
        }

        /* renamed from: a */
        public final C4366b mo14810a(Context context) {
            C8594l.m46771e(context, "context");
            if (C4366b.f12951b == null) {
                C4366b.f12951b = new C4366b(context);
            }
            C4366b a = C4366b.f12951b;
            Objects.requireNonNull(a, "null cannot be cast to non-null type com.coocent.music.base.data.db.FavoriteAlbumDao");
            return a;
        }

        public /* synthetic */ C4367a(C8589g gVar) {
            this();
        }
    }

    public C4366b(Context context) {
        C8594l.m46771e(context, "context");
        this.f12953a = new C4365a(context.getApplicationContext());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r1 == 0) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        return p369i.p377u.C8490t.m46676A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        if (r1 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        r1.close();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long[] m19034e() {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            f.c.e.a.a.b.a r2 = r4.f12953a     // Catch:{ Exception -> 0x0032 }
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch:{ Exception -> 0x0032 }
            java.lang.String r3 = "SELECT * FROM FavoriteAlbum"
            android.database.Cursor r1 = r2.rawQuery(r3, r1)     // Catch:{ Exception -> 0x0032 }
        L_0x0012:
            boolean r2 = r1.moveToNext()     // Catch:{ Exception -> 0x0032 }
            if (r2 == 0) goto L_0x002a
            java.lang.String r2 = "album_id"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ Exception -> 0x0032 }
            long r2 = r1.getLong(r2)     // Catch:{ Exception -> 0x0032 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x0032 }
            r0.add(r2)     // Catch:{ Exception -> 0x0032 }
            goto L_0x0012
        L_0x002a:
            if (r1 == 0) goto L_0x0039
        L_0x002c:
            r1.close()
            goto L_0x0039
        L_0x0030:
            r0 = move-exception
            goto L_0x003e
        L_0x0032:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x0039
            goto L_0x002c
        L_0x0039:
            long[] r0 = p369i.p377u.C8490t.m46676A(r0)
            return r0
        L_0x003e:
            if (r1 == 0) goto L_0x0043
            r1.close()
        L_0x0043:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p185b.C4366b.m19034e():long[]");
    }

    /* renamed from: c */
    public final int mo14805c(long j, boolean z) {
        if (z) {
            try {
                if (C8477h.m46636u(m19034e()).contains(Long.valueOf(j))) {
                    return -1;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return -4;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("album_id", Long.valueOf(j));
        return this.f12953a.getWritableDatabase().insert("FavoriteAlbum", BuildConfig.FLAVOR, contentValues) > 0 ? 1 : 2;
    }

    /* renamed from: d */
    public final boolean mo14806d(long j) {
        return C8477h.m46636u(m19034e()).contains(Long.valueOf(j));
    }

    /* renamed from: f */
    public final List<Album> mo14807f(Context context) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15076q(context, m19034e());
    }

    /* renamed from: g */
    public final int mo14808g(long j, boolean z) {
        if (z && !C8477h.m46636u(m19034e()).contains(Long.valueOf(j))) {
            return -1;
        }
        try {
            SQLiteDatabase readableDatabase = this.f12953a.getReadableDatabase();
            C8594l.m46770d(readableDatabase, "helper.readableDatabase");
            if (readableDatabase.delete("FavoriteAlbum", "album_id =?", new String[]{String.valueOf(j)}) > 0) {
                return 2;
            }
            return -4;
        } catch (Exception e) {
            e.printStackTrace();
            return -4;
        }
    }

    /* renamed from: h */
    public final int mo14809h(long j) {
        if (!C8477h.m46636u(m19034e()).contains(Long.valueOf(j))) {
            return mo14805c(j, false);
        }
        return mo14808g(j, true);
    }
}
