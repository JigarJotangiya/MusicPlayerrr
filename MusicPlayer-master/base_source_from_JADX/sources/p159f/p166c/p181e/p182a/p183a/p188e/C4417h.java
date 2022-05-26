package p159f.p166c.p181e.p182a.p183a.p188e;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import com.coocent.music.base.data.entity.Genres;
import java.util.Comparator;
import java.util.List;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.a.e.h */
/* compiled from: GenresLoader.kt */
public final class C4417h {

    /* renamed from: a */
    public static final C4417h f12999a = new C4417h();

    /* renamed from: f.c.e.a.a.e.h$a */
    /* compiled from: Comparisons.kt */
    public static final class C4418a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C8498b.m46698a(((Genres) t).mo9190f(), ((Genres) t2).mo9190f());
        }
    }

    /* renamed from: f.c.e.a.a.e.h$b */
    /* compiled from: Comparisons.kt */
    public static final class C4419b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C8498b.m46698a(Integer.valueOf(((Genres) t2).mo9188e()), Integer.valueOf(((Genres) t).mo9188e()));
        }
    }

    /* renamed from: f.c.e.a.a.e.h$c */
    /* compiled from: Comparisons.kt */
    public static final class C4420c<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C8498b.m46698a(((Genres) t2).mo9190f(), ((Genres) t).mo9190f());
        }
    }

    private C4417h() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r9 == null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (r9 != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        r8 = p159f.p166c.p181e.p182a.p183a.p189f.C4441e.m19454n(r8);
        p369i.p387z.p389d.C8594l.m46770d(r8, "MusicPreference.getInstance(context)");
        r8 = r8.mo15120l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        if (r8 != null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        r9 = r8.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        if (r9 == 3373707) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        if (r9 == 1174227718) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        if (r9 == 1297818103) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        if (r8.equals("songCount DESC") == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007d, code lost:
        if (r0.size() <= 1) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007f, code lost:
        p369i.p377u.C8486p.m46674o(r0, new p159f.p166c.p181e.p182a.p183a.p188e.C4417h.C4419b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008e, code lost:
        if (r8.equals("name DESC") == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0094, code lost:
        if (r0.size() <= 1) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0096, code lost:
        p369i.p377u.C8486p.m46674o(r0, new p159f.p166c.p181e.p182a.p183a.p188e.C4417h.C4420c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a5, code lost:
        if (r8.equals("name") == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ab, code lost:
        if (r0.size() <= 1) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ad, code lost:
        p369i.p377u.C8486p.m46674o(r0, new p159f.p166c.p181e.p182a.p183a.p188e.C4417h.C4418a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b5, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<com.coocent.music.base.data.entity.Genres> m19315b(android.content.Context r8, android.database.Cursor r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            f.c.e.a.a.e.k r2 = p159f.p166c.p181e.p182a.p183a.p188e.C4423k.f13002a
            r2.mo14990a(r8, r1)
            if (r9 == 0) goto L_0x0047
        L_0x0011:
            boolean r2 = r9.moveToNext()     // Catch:{ Exception -> 0x003a }
            if (r2 == 0) goto L_0x0047
            f.c.e.a.a.d.b r2 = p159f.p166c.p181e.p182a.p183a.p187d.C4377b.f12966a     // Catch:{ Exception -> 0x003a }
            com.coocent.music.base.data.entity.Genres r2 = r2.mo14928a(r9)     // Catch:{ Exception -> 0x003a }
            f.c.e.a.a.e.h r3 = f12999a     // Catch:{ Exception -> 0x003a }
            long r4 = r2.mo9186d()     // Catch:{ Exception -> 0x003a }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x003a }
            int r3 = r3.m19316c(r8, r4, r6)     // Catch:{ Exception -> 0x003a }
            r2.mo9192h(r3)     // Catch:{ Exception -> 0x003a }
            int r3 = r2.mo9188e()     // Catch:{ Exception -> 0x003a }
            if (r3 <= 0) goto L_0x0011
            r0.add(r2)     // Catch:{ Exception -> 0x003a }
            goto L_0x0011
        L_0x0038:
            r8 = move-exception
            goto L_0x0041
        L_0x003a:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ all -> 0x0038 }
            if (r9 == 0) goto L_0x004c
            goto L_0x0049
        L_0x0041:
            if (r9 == 0) goto L_0x0046
            r9.close()
        L_0x0046:
            throw r8
        L_0x0047:
            if (r9 == 0) goto L_0x004c
        L_0x0049:
            r9.close()
        L_0x004c:
            f.c.e.a.a.f.e r8 = p159f.p166c.p181e.p182a.p183a.p189f.C4441e.m19454n(r8)
            java.lang.String r9 = "MusicPreference.getInstance(context)"
            p369i.p387z.p389d.C8594l.m46770d(r8, r9)
            java.lang.String r8 = r8.mo15120l()
            if (r8 != 0) goto L_0x005c
            goto L_0x00b5
        L_0x005c:
            int r9 = r8.hashCode()
            r1 = 3373707(0x337a8b, float:4.72757E-39)
            r2 = 1
            if (r9 == r1) goto L_0x009f
            r1 = 1174227718(0x45fd4b06, float:8105.378)
            if (r9 == r1) goto L_0x0088
            r1 = 1297818103(0x4d5b21f7, float:2.29777264E8)
            if (r9 == r1) goto L_0x0071
            goto L_0x00b5
        L_0x0071:
            java.lang.String r9 = "songCount DESC"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x00b5
            int r8 = r0.size()
            if (r8 <= r2) goto L_0x00b5
            f.c.e.a.a.e.h$b r8 = new f.c.e.a.a.e.h$b
            r8.<init>()
            p369i.p377u.C8486p.m46674o(r0, r8)
            goto L_0x00b5
        L_0x0088:
            java.lang.String r9 = "name DESC"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x00b5
            int r8 = r0.size()
            if (r8 <= r2) goto L_0x00b5
            f.c.e.a.a.e.h$c r8 = new f.c.e.a.a.e.h$c
            r8.<init>()
            p369i.p377u.C8486p.m46674o(r0, r8)
            goto L_0x00b5
        L_0x009f:
            java.lang.String r9 = "name"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x00b5
            int r8 = r0.size()
            if (r8 <= r2) goto L_0x00b5
            f.c.e.a.a.e.h$a r8 = new f.c.e.a.a.e.h$a
            r8.<init>()
            p369i.p377u.C8486p.m46674o(r0, r8)
        L_0x00b5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p188e.C4417h.m19315b(android.content.Context, android.database.Cursor):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        if (r10 != null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r10 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        return r9;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m19316c(android.content.Context r8, long r9, java.lang.String r11) {
        /*
            r7 = this;
            java.lang.String r0 = "external"
            android.net.Uri r2 = android.provider.MediaStore.Audio.Genres.Members.getContentUri(r0, r9)
            r9 = 0
            r10 = 0
            java.lang.String r0 = "is_music=1 AND title != ''"
            boolean r1 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x0041 }
            if (r1 != 0) goto L_0x0026
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0041 }
            r1.<init>()     // Catch:{ Exception -> 0x0041 }
            r1.append(r0)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r0 = " AND "
            r1.append(r0)     // Catch:{ Exception -> 0x0041 }
            r1.append(r11)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r11 = r1.toString()     // Catch:{ Exception -> 0x0041 }
            r4 = r11
            goto L_0x0027
        L_0x0026:
            r4 = r0
        L_0x0027:
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x0041 }
            r3 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0041 }
            if (r10 == 0) goto L_0x0039
            int r8 = r10.getCount()     // Catch:{ Exception -> 0x0041 }
            r9 = r8
        L_0x0039:
            if (r10 == 0) goto L_0x0048
        L_0x003b:
            r10.close()
            goto L_0x0048
        L_0x003f:
            r8 = move-exception
            goto L_0x0049
        L_0x0041:
            r8 = move-exception
            r8.printStackTrace()     // Catch:{ all -> 0x003f }
            if (r10 == 0) goto L_0x0048
            goto L_0x003b
        L_0x0048:
            return r9
        L_0x0049:
            if (r10 == 0) goto L_0x004e
            r10.close()
        L_0x004e:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p188e.C4417h.m19316c(android.content.Context, long, java.lang.String):int");
    }

    /* renamed from: d */
    private final Cursor m19317d(Context context, String str, String[] strArr) {
        try {
            return context.getContentResolver().query(MediaStore.Audio.Genres.EXTERNAL_CONTENT_URI, new String[]{"_id", "name"}, str, strArr, (String) null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final List<Genres> mo14984a(Context context) {
        C8594l.m46771e(context, "context");
        return m19315b(context, m19317d(context, (String) null, (String[]) null));
    }
}
