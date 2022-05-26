package p082e.p126k;

import android.content.Context;
import java.io.File;
import p369i.p387z.p389d.C8594l;

/* renamed from: e.k.a */
/* compiled from: DataStoreFile.kt */
public final class C3812a {
    /* renamed from: a */
    public static final File m16457a(Context context, String str) {
        C8594l.m46771e(context, "<this>");
        C8594l.m46771e(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), C8594l.m46777k("datastore/", str));
    }
}
