package p159f.p243f.p245b.p246a.p299d.p301b;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3292l;

/* renamed from: f.f.b.a.d.b.b */
/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
public final class C7452b {
    /* renamed from: a */
    public static String m41862a(Context context, String str, String str2) {
        C3292l.m14240h(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = C7451a.m41860a(context);
        }
        return C7451a.m41861b("google_app_id", resources, str2);
    }
}
