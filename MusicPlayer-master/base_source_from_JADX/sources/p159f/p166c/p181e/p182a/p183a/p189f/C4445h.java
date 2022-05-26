package p159f.p166c.p181e.p182a.p183a.p189f;

import android.content.Context;
import android.widget.Toast;
import java.io.File;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.a.f.h */
/* compiled from: Utils.kt */
public final class C4445h {
    /* renamed from: a */
    public static final boolean m19499a(String str, String str2) {
        C8594l.m46771e(str, "$this$fileCopyTo");
        C8594l.m46771e(str2, "targetPath");
        if (str2.length() == 0) {
            return false;
        }
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        File unused = C8555j.m46756b(file, new File(str2), true, 0, 4, (Object) null);
        return true;
    }

    /* renamed from: b */
    public static final boolean m19500b(String str) {
        C8594l.m46771e(str, "$this$fileDelete");
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        file.delete();
        return true;
    }

    /* renamed from: c */
    public static final void m19501c(Context context, Context context2, int i, int i2) {
        C8594l.m46771e(context, "$this$stringToast");
        C8594l.m46771e(context2, "context");
        Toast.makeText(context2, context2.getString(i), i2).show();
    }

    /* renamed from: d */
    public static /* synthetic */ void m19502d(Context context, Context context2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            context2 = context.getApplicationContext();
            C8594l.m46770d(context2, "applicationContext");
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        m19501c(context, context2, i, i2);
    }
}
