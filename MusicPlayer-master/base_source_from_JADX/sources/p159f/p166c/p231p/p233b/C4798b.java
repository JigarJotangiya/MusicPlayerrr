package p159f.p166c.p231p.p233b;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.p.b.b */
/* compiled from: FilesUtils.kt */
public final class C4798b {

    /* renamed from: a */
    public static final C4798b f13591a = new C4798b();

    private C4798b() {
    }

    /* renamed from: a */
    public final boolean mo15536a(Context context, Uri uri) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(uri, "uri");
        try {
            AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
            if (openAssetFileDescriptor == null) {
                return false;
            }
            openAssetFileDescriptor.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
