package coocent.musiclibrary.music.p282c;

import android.app.Activity;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: coocent.musiclibrary.music.c.a */
/* compiled from: LyricDao */
public class C7325a {
    /* renamed from: a */
    public static List<String> m41489a(Activity activity, String[] strArr, String str) {
        ArrayList arrayList = new ArrayList();
        Uri contentUri = MediaStore.Files.getContentUri("external");
        String[] strArr2 = {"_data", "title"};
        String str2 = BuildConfig.FLAVOR;
        for (int i = 0; i < strArr.length; i++) {
            if (i != 0) {
                str2 = str2 + " OR ";
            }
            str2 = str2 + "_data" + " LIKE '%" + strArr[i] + "'";
        }
        Cursor query = activity.getContentResolver().query(contentUri, strArr2, str2, (String[]) null, "date_modified");
        Log.e("scan", "cursor：" + query.toString());
        if (query == null) {
            return arrayList;
        }
        if (query.moveToLast()) {
            do {
                arrayList.add(query.getString(0));
            } while (query.moveToPrevious());
        }
        query.close();
        return arrayList;
    }
}
