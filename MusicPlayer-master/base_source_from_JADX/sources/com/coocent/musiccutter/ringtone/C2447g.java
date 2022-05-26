package com.coocent.musiccutter.ringtone;

import android.app.Activity;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import java.util.HashMap;
import java.util.Iterator;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.coocent.musiccutter.ringtone.g */
/* compiled from: SongMetadataReader */
public class C2447g {

    /* renamed from: a */
    public Uri f8585a = MediaStore.Audio.Genres.EXTERNAL_CONTENT_URI;

    /* renamed from: b */
    public Activity f8586b = null;

    /* renamed from: c */
    public String f8587c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f8588d = BuildConfig.FLAVOR;

    public C2447g(Activity activity, String str) {
        this.f8586b = activity;
        this.f8587c = str;
        this.f8588d = m11465b(str);
        try {
            m11464a();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m11464a() {
        HashMap hashMap = new HashMap();
        Cursor query = this.f8586b.getContentResolver().query(this.f8585a, new String[]{"_id", "name"}, (String) null, (String[]) null, (String) null);
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
            if (this.f8586b.getContentResolver().query(m11468e(str), new String[]{"_data"}, "_data LIKE \"" + this.f8587c + "\"", (String[]) null, (String) null).getCount() != 0) {
                String str2 = (String) hashMap.get(str);
                break;
            }
        }
        Uri contentUriForPath = MediaStore.Audio.Media.getContentUriForPath(this.f8587c);
        Cursor query2 = this.f8586b.getContentResolver().query(contentUriForPath, new String[]{"_id", "title", "artist", "album", "year", "_data"}, "_data LIKE \"" + this.f8587c + "\"", (String[]) null, (String) null);
        if (query2.getCount() == 0) {
            this.f8588d = m11465b(this.f8587c);
            return;
        }
        query2.moveToFirst();
        String d = m11467d(query2, "title");
        this.f8588d = d;
        if (d == null || d.length() == 0) {
            this.f8588d = m11465b(this.f8587c);
        }
        m11467d(query2, "artist");
        m11467d(query2, "album");
        m11466c(query2, "year");
    }

    /* renamed from: b */
    private String m11465b(String str) {
        return str.substring(str.lastIndexOf(47) + 1, str.lastIndexOf(46));
    }

    /* renamed from: c */
    private int m11466c(Cursor cursor, String str) {
        Integer valueOf = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(str)));
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return -1;
    }

    /* renamed from: d */
    private String m11467d(Cursor cursor, String str) {
        String string = cursor.getString(cursor.getColumnIndexOrThrow(str));
        if (string == null || string.length() <= 0) {
            return null;
        }
        return string;
    }

    /* renamed from: e */
    private Uri m11468e(String str) {
        return Uri.parse(this.f8585a.toString() + "/" + str + "/" + "members");
    }
}
