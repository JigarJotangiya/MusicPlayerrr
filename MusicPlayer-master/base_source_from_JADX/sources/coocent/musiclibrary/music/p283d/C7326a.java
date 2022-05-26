package coocent.musiclibrary.music.p283d;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import androidx.core.content.C0506a;
import coocent.musiclibrary.music.p292j.C7393h;

/* renamed from: coocent.musiclibrary.music.d.a */
/* compiled from: AlbumSongLoader */
public class C7326a {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x006f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<com.coocent.music.base.data.entity.Music> m41490a(android.content.Context r18, long r19, int r21) {
        /*
            android.database.Cursor r0 = m41492c(r18, r19, r21)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r0 == 0) goto L_0x006d
            boolean r2 = r0.moveToFirst()
            if (r2 == 0) goto L_0x006d
        L_0x0011:
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
            r3 = r18
            r4 = r9
            java.lang.String[] r3 = p159f.p166c.p181e.p182a.p190b.p197l.C4477c.m19581K(r3, r4, r6, r7, r8)
            r2 = r3[r2]
            r13 = r3[r11]
            r11 = r3[r12]
            r3 = 4
            int r14 = r0.getInt(r3)
            r3 = 5
            int r3 = r0.getInt(r3)
        L_0x0041:
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r4) goto L_0x0048
            int r3 = r3 + -1000
            goto L_0x0041
        L_0x0048:
            r3 = 6
            int r3 = r0.getInt(r3)
            long r6 = (long) r3
            r3 = 7
            java.lang.String r15 = r0.getString(r3)
            com.coocent.music.base.data.entity.Music r12 = new com.coocent.music.base.data.entity.Music
            r16 = 0
            r3 = r12
            r4 = r9
            r8 = r19
            r10 = r2
            r2 = r12
            r12 = r13
            r13 = r15
            r15 = r16
            r3.<init>(r4, r6, r8, r10, r11, r12, r13, r14, r15)
            r1.add(r2)
            boolean r2 = r0.moveToNext()
            if (r2 != 0) goto L_0x0011
        L_0x006d:
            if (r0 == 0) goto L_0x0072
            r0.close()
        L_0x0072:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: coocent.musiclibrary.music.p283d.C7326a.m41490a(android.content.Context, long, int):java.util.ArrayList");
    }

    /* renamed from: b */
    public static Cursor m41491b(Context context, String str) {
        if (C0506a.m3149a(context, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            return null;
        }
        return context.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "title", "artist", "album", "duration", "track", "artist_id", "_data"}, str, (String[]) null, C7393h.m41695f(context).mo28181b());
    }

    /* renamed from: c */
    public static Cursor m41492c(Context context, long j, int i) {
        return m41491b(context, "is_music=1 AND title != '' AND album_id=" + j + " AND duration>=" + (i * 1000));
    }
}
