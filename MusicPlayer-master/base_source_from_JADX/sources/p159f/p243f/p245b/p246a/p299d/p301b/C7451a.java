package p159f.p243f.p245b.p246a.p299d.p301b;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.C3247i;

/* renamed from: f.f.b.a.d.b.a */
/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
public final class C7451a {
    /* renamed from: a */
    public static String m41860a(Context context) {
        try {
            return context.getResources().getResourcePackageName(C3247i.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: b */
    public static final String m41861b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
