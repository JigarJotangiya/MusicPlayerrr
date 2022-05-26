package p159f.p166c.p231p.p232a;

import android.media.MediaScannerConnection;
import android.net.Uri;
import java.io.File;
import java.util.HashSet;

/* renamed from: f.c.p.a.b */
/* compiled from: lambda */
public final /* synthetic */ class C4750b implements MediaScannerConnection.OnScanCompletedListener {

    /* renamed from: a */
    public final /* synthetic */ HashSet f13564a;

    /* renamed from: b */
    public final /* synthetic */ File f13565b;

    /* renamed from: c */
    public final /* synthetic */ C4752d f13566c;

    public /* synthetic */ C4750b(HashSet hashSet, File file, C4752d dVar) {
        this.f13564a = hashSet;
        this.f13565b = file;
        this.f13566c = dVar;
    }

    public final void onScanCompleted(String str, Uri uri) {
        C4752d.m20322K(this.f13564a, this.f13565b, this.f13566c, str, uri);
    }
}
