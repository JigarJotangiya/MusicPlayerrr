package coocent.musiclibrary.music.p283d;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.core.content.C0506a;
import com.coocent.music.base.data.entity.Music;
import coocent.musiclibrary.music.p292j.C7393h;
import java.util.ArrayList;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;

/* renamed from: coocent.musiclibrary.music.d.b */
/* compiled from: SongLoader */
public class C7327b {
    /* renamed from: a */
    public static ArrayList<Music> m41493a(Context context, int i) {
        return m41496d(context, m41497e(context, "duration>=" + (i * 1000), (String[]) null));
    }

    /* renamed from: b */
    public static Music m41494b(Context context, Cursor cursor) {
        Cursor cursor2 = cursor;
        Music music = new Music();
        if (cursor2 != null && cursor.moveToFirst()) {
            long j = cursor2.getLong(0);
            ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, j);
            Context context2 = context;
            long j2 = j;
            String[] K = C4477c.m19581K(context2, j2, cursor2.getString(1), cursor2.getString(3), cursor2.getString(2));
            String str = K[0];
            String str2 = K[1];
            String str3 = K[2];
            int i = cursor2.getInt(4);
            cursor2.getInt(5);
            music = new Music(j2, (long) cursor2.getInt(6), cursor2.getLong(7), str, str3, str2, cursor2.getString(8), i, 0);
        }
        if (cursor2 != null) {
            cursor.close();
        }
        return music;
    }

    /* renamed from: c */
    public static Music m41495c(Context context, long j) {
        return m41494b(context, m41497e(context, "_id=" + String.valueOf(j), (String[]) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x007c  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<com.coocent.music.base.data.entity.Music> m41496d(android.content.Context r20, android.database.Cursor r21) {
        /*
            r0 = r21
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r0 == 0) goto L_0x007a
            boolean r2 = r21.moveToFirst()
            if (r2 == 0) goto L_0x007a
        L_0x000f:
            r2 = 0
            long r9 = r0.getLong(r2)
            android.net.Uri r3 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            android.content.ContentUris.withAppendedId(r3, r9)
            r11 = 1
            java.lang.String r6 = r0.getString(r11)
            r12 = 2
            java.lang.String r8 = r0.getString(r12)
            r3 = 3
            java.lang.String r7 = r0.getString(r3)
            r3 = r20
            r4 = r9
            java.lang.String[] r3 = p159f.p166c.p181e.p182a.p190b.p197l.C4477c.m19581K(r3, r4, r6, r7, r8)
            r2 = r3[r2]
            r13 = r3[r11]
            r11 = r3[r12]
            r3 = 4
            int r14 = r0.getInt(r3)
            r3 = 5
            r0.getInt(r3)
            r3 = 6
            int r3 = r0.getInt(r3)
            long r6 = (long) r3
            r3 = 7
            long r15 = r0.getLong(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 8
            java.lang.String r4 = r0.getString(r4)
            r3.append(r4)
            java.lang.String r4 = ""
            r3.append(r4)
            java.lang.String r17 = r3.toString()
            com.coocent.music.base.data.entity.Music r12 = new com.coocent.music.base.data.entity.Music
            r18 = 0
            r3 = r12
            r4 = r9
            r8 = r15
            r10 = r2
            r2 = r12
            r12 = r13
            r13 = r17
            r15 = r18
            r3.<init>(r4, r6, r8, r10, r11, r12, r13, r14, r15)
            r1.add(r2)
            boolean r2 = r21.moveToNext()
            if (r2 != 0) goto L_0x000f
        L_0x007a:
            if (r0 == 0) goto L_0x007f
            r21.close()
        L_0x007f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: coocent.musiclibrary.music.p283d.C7327b.m41496d(android.content.Context, android.database.Cursor):java.util.ArrayList");
    }

    /* renamed from: e */
    public static Cursor m41497e(Context context, String str, String[] strArr) {
        return m41498f(context, str, strArr, C7393h.m41695f(context).mo28187i());
    }

    /* renamed from: f */
    private static Cursor m41498f(Context context, String str, String[] strArr, String str2) {
        Context context2 = context;
        if (context2 == null) {
            return null;
        }
        try {
            if (C0506a.m3149a(context2, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                return null;
            }
            String str3 = "is_music=1 AND title != ''";
            if (!TextUtils.isEmpty(str)) {
                str3 = str3 + " AND " + str;
            }
            return context.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "title", "artist", "album", "duration", "track", "artist_id", "album_id", "_data"}, str3, strArr, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
