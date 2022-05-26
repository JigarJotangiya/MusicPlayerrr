package coocent.music.player.widget.ringtone;

import android.app.Activity;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import java.util.HashMap;
import java.util.Iterator;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: coocent.music.player.widget.ringtone.i */
/* compiled from: SongMetadataReader */
public class C7295i {

    /* renamed from: a */
    public Uri f32225a = MediaStore.Audio.Genres.EXTERNAL_CONTENT_URI;

    /* renamed from: b */
    public Activity f32226b = null;

    /* renamed from: c */
    public String f32227c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f32228d = BuildConfig.FLAVOR;

    public C7295i(Activity activity, String str) {
        this.f32226b = activity;
        this.f32227c = str;
        this.f32228d = m41360b(str);
        try {
            m41359a();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m41359a() {
        HashMap hashMap = new HashMap();
        Cursor query = this.f32226b.getContentResolver().query(this.f32225a, new String[]{"_id", "name"}, (String) null, (String[]) null, (String) null);
        query.moveToFirst();
        while (!query.isAfterLast()) {
            hashMap.put(query.getString(0), query.getString(1));
            query.moveToNext();
        }
        Iterator it = hashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            if (this.f32226b.getContentResolver().query(m41363e(str), new String[]{"_data"}, "_data LIKE \"" + this.f32227c + "\"", (String[]) null, (String) null).getCount() != 0) {
                String str2 = (String) hashMap.get(str);
                break;
            }
        }
        Uri contentUriForPath = MediaStore.Audio.Media.getContentUriForPath(this.f32227c);
        Cursor query2 = this.f32226b.getContentResolver().query(contentUriForPath, new String[]{"_id", "title", "artist", "album", "year", "_data"}, "_data LIKE \"" + this.f32227c + "\"", (String[]) null, (String) null);
        if (query2.getCount() == 0) {
            this.f32228d = m41360b(this.f32227c);
            return;
        }
        query2.moveToFirst();
        String d = m41362d(query2, "title");
        this.f32228d = d;
        if (d == null || d.length() == 0) {
            this.f32228d = m41360b(this.f32227c);
        }
        m41362d(query2, "artist");
        m41362d(query2, "album");
        m41361c(query2, "year");
    }

    /* renamed from: b */
    private String m41360b(String str) {
        return str.substring(str.lastIndexOf(47) + 1, str.lastIndexOf(46));
    }

    /* renamed from: c */
    private int m41361c(Cursor cursor, String str) {
        Integer valueOf = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(str)));
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return -1;
    }

    /* renamed from: d */
    private String m41362d(Cursor cursor, String str) {
        String string = cursor.getString(cursor.getColumnIndexOrThrow(str));
        if (string == null || string.length() <= 0) {
            return null;
        }
        return string;
    }

    /* renamed from: e */
    private Uri m41363e(String str) {
        return Uri.parse(this.f32225a.toString() + "/" + str + "/" + "members");
    }
}
