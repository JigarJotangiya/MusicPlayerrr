package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;
import java.util.HashMap;

/* renamed from: com.google.android.gms.common.util.l */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C3367l {
    /* renamed from: a */
    public static void m14467a(@RecentlyNonNull StringBuilder sb, @RecentlyNonNull HashMap<String, String> hashMap) {
        sb.append("{");
        boolean z = true;
        for (String next : hashMap.keySet()) {
            if (!z) {
                sb.append(",");
            }
            String str = hashMap.get(next);
            sb.append("\"");
            sb.append(next);
            sb.append("\":");
            if (str == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str);
                sb.append("\"");
            }
            z = false;
        }
        sb.append("}");
    }
}
