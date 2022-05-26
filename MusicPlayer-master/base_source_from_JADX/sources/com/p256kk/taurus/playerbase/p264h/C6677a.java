package com.p256kk.taurus.playerbase.p264h;

import android.net.Uri;
import android.text.TextUtils;
import com.p256kk.taurus.playerbase.p259c.C6618a;

/* renamed from: com.kk.taurus.playerbase.h.a */
/* compiled from: DefaultRecordKeyProvider */
public class C6677a implements C6687h {
    /* renamed from: a */
    public String mo26018a(C6618a aVar) {
        String data = aVar.getData();
        Uri uri = aVar.getUri();
        String assetsPath = aVar.getAssetsPath();
        int rawId = aVar.getRawId();
        if (!TextUtils.isEmpty(data)) {
            return data;
        }
        if (uri != null) {
            return uri.toString();
        }
        if (!TextUtils.isEmpty(assetsPath)) {
            return assetsPath;
        }
        if (rawId > 0) {
            return String.valueOf(rawId);
        }
        return aVar.toString();
    }
}
