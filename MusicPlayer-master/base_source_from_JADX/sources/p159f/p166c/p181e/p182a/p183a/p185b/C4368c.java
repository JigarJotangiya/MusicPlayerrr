package p159f.p166c.p181e.p182a.p183a.p185b;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.coocent.music.base.data.entity.Artist;
import java.util.List;
import java.util.Objects;
import p159f.p166c.p181e.p182a.p183a.p189f.C4434c;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.c.e.a.a.b.c */
/* compiled from: FavoriteArtistDao.kt */
public final class C4368c {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static C4368c f12954b;

    /* renamed from: c */
    public static final C4369a f12955c = new C4369a((C8589g) null);

    /* renamed from: a */
    private C4365a f12956a;

    /* renamed from: f.c.e.a.a.b.c$a */
    /* compiled from: FavoriteArtistDao.kt */
    public static final class C4369a {
        private C4369a() {
        }

        /* renamed from: a */
        public final C4368c mo14816a(Context context) {
            C8594l.m46771e(context, "context");
            if (C4368c.f12954b == null) {
                C4368c.f12954b = new C4368c(context);
            }
            C4368c a = C4368c.f12954b;
            Objects.requireNonNull(a, "null cannot be cast to non-null type com.coocent.music.base.data.db.FavoriteArtistDao");
            return a;
        }

        public /* synthetic */ C4369a(C8589g gVar) {
            this();
        }
    }

    public C4368c(Context context) {
        C8594l.m46771e(context, "context");
        this.f12956a = new C4365a(context.getApplicationContext());
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
    private final long[] m19043e() {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            f.c.e.a.a.b.a r2 = r4.f12956a     // Catch:{ Exception -> 0x0032 }
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch:{ Exception -> 0x0032 }
            java.lang.String r3 = "SELECT * FROM FavoriteArtist"
            android.database.Cursor r1 = r2.rawQuery(r3, r1)     // Catch:{ Exception -> 0x0032 }
        L_0x0012:
            boolean r2 = r1.moveToNext()     // Catch:{ Exception -> 0x0032 }
            if (r2 == 0) goto L_0x002a
            java.lang.String r2 = "artist_id"
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
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p185b.C4368c.m19043e():long[]");
    }

    /* renamed from: c */
    public final int mo14811c(long j, boolean z) {
        if (z) {
            try {
                if (C8477h.m46636u(m19043e()).contains(Long.valueOf(j))) {
                    return -1;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return -4;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("artist_id", Long.valueOf(j));
        if (this.f12956a.getWritableDatabase().insert("FavoriteArtist", BuildConfig.FLAVOR, contentValues) > 0) {
            return 1;
        }
        return -4;
    }

    /* renamed from: d */
    public final boolean mo14812d(long j) {
        return C8477h.m46636u(m19043e()).contains(Long.valueOf(j));
    }

    /* renamed from: f */
    public final List<Artist> mo14813f(Context context) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15090x(context, m19043e());
    }

    /* renamed from: g */
    public final int mo14814g(long j, boolean z) {
        if (z && !C8477h.m46636u(m19043e()).contains(Long.valueOf(j))) {
            return -1;
        }
        try {
            SQLiteDatabase readableDatabase = this.f12956a.getReadableDatabase();
            C8594l.m46770d(readableDatabase, "helper.readableDatabase");
            if (readableDatabase.delete("FavoriteArtist", "artist_id =?", new String[]{String.valueOf(j)}) > 0) {
                return 2;
            }
            return -4;
        } catch (Exception e) {
            e.printStackTrace();
            return -4;
        }
    }

    /* renamed from: h */
    public final int mo14815h(long j) {
        if (!C8477h.m46636u(m19043e()).contains(Long.valueOf(j))) {
            return mo14811c(j, false);
        }
        return mo14814g(j, true);
    }
}
