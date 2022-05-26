package p342g.p343a.p344a.p358i;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import coocent.musiclibrary.music.p292j.C7397j;
import java.lang.ref.SoftReference;

/* renamed from: g.a.a.i.d */
/* compiled from: AlbumPicUtil */
public class C8312d {
    /* renamed from: a */
    public static String m45964a(Context context, String str) {
        try {
            Cursor query = context.getContentResolver().query(Uri.parse("content://media/external/audio/albums" + "/" + str), new String[]{"album_art"}, "album_art != '' or album_art != null", (String[]) null, (String) null);
            if (query == null) {
                return null;
            }
            String string = query.moveToNext() ? query.getString(0) : null;
            query.close();
            return string;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static SoftReference<Bitmap> m45965b(Context context, int i) {
        String a;
        if (i <= 0 || (a = m45964a(context, String.valueOf(i))) == null || a.isEmpty()) {
            return null;
        }
        float f = C7397j.f32506c;
        return m45966c(a, (int) (f * 40.0f), (int) (f * 40.0f));
    }

    /* renamed from: c */
    public static SoftReference<Bitmap> m45966c(String str, int i, int i2) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i3 = options.outWidth / i;
            int i4 = options.outHeight / i2;
            if (i3 <= i4) {
                i3 = i4;
            }
            options.inSampleSize = i3;
            options.inJustDecodeBounds = false;
            return new SoftReference<>(BitmapFactory.decodeFile(str, options));
        } catch (Exception unused) {
            return null;
        }
    }
}
