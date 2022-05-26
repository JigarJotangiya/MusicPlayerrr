package p159f.p166c.p181e.p182a.p183a.p188e;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.coocent.music.base.data.entity.Music;
import java.util.List;
import p159f.p166c.p181e.p182a.p183a.p189f.C4434c;
import p159f.p166c.p181e.p182a.p183a.p189f.C4441e;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.a.e.i */
/* compiled from: GenresMusicLoader.kt */
public final class C4421i {

    /* renamed from: a */
    public static final C4421i f13000a = new C4421i();

    private C4421i() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r4 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r4 != null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<com.coocent.music.base.data.entity.Music> m19319a(android.content.Context r3, android.database.Cursor r4) {
        /*
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r4 == 0) goto L_0x0029
        L_0x0007:
            boolean r1 = r4.moveToNext()     // Catch:{ Exception -> 0x0019 }
            if (r1 == 0) goto L_0x0029
            f.c.e.a.a.d.b r1 = p159f.p166c.p181e.p182a.p183a.p187d.C4377b.f12966a     // Catch:{ Exception -> 0x0019 }
            com.coocent.music.base.data.entity.Music r1 = r1.mo14929b(r3, r4)     // Catch:{ Exception -> 0x0019 }
            r0.add(r1)     // Catch:{ Exception -> 0x0019 }
            goto L_0x0007
        L_0x0017:
            r3 = move-exception
            goto L_0x0023
        L_0x0019:
            r3 = move-exception
            r3.printStackTrace()     // Catch:{ all -> 0x0017 }
            if (r4 == 0) goto L_0x002c
        L_0x001f:
            r4.close()
            goto L_0x002c
        L_0x0023:
            if (r4 == 0) goto L_0x0028
            r4.close()
        L_0x0028:
            throw r3
        L_0x0029:
            if (r4 == 0) goto L_0x002c
            goto L_0x001f
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p188e.C4421i.m19319a(android.content.Context, android.database.Cursor):java.util.List");
    }

    /* renamed from: c */
    private final String m19320c(Context context) {
        if (C4434c.f13013c.mo15048a0()) {
            C4441e n = C4441e.m19454n(context);
            C8594l.m46770d(n, "MusicPreference.getInstance(context)");
            String t = n.mo15126t();
            C8594l.m46770d(t, "MusicPreference.getInsta…e(context).trackSortOrder");
            return t;
        }
        C4441e n2 = C4441e.m19454n(context);
        C8594l.m46770d(n2, "MusicPreference.getInstance(context)");
        String m = n2.mo15121m();
        C8594l.m46770d(m, "MusicPreference.getInsta…ext).genresTrackSortOrder");
        return m;
    }

    /* renamed from: d */
    private final Cursor m19321d(Context context, long j, String str, String[] strArr, String str2) {
        String str3 = "is_music=1 AND title != ''";
        try {
            if (!TextUtils.isEmpty(str)) {
                str3 = str3 + " AND " + str;
            }
            return context.getContentResolver().query(MediaStore.Audio.Genres.Members.getContentUri("external", j), (String[]) null, str3, strArr, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public final List<Music> mo14988b(Context context, long j) {
        C8594l.m46771e(context, "context");
        StringBuilder sb = new StringBuilder();
        C4423k.f13002a.mo14990a(context, sb);
        return m19319a(context, m19321d(context, j, sb.toString(), (String[]) null, m19320c(context)));
    }
}
