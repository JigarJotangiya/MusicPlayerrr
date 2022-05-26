package p159f.p166c.p231p.p232a;

import android.media.MediaScannerConnection;
import android.net.Uri;
import java.util.HashSet;
import java.util.Map;

/* renamed from: f.c.p.a.a */
/* compiled from: lambda */
public final /* synthetic */ class C4749a implements MediaScannerConnection.OnScanCompletedListener {

    /* renamed from: a */
    public final /* synthetic */ HashSet f13561a;

    /* renamed from: b */
    public final /* synthetic */ Map.Entry f13562b;

    /* renamed from: c */
    public final /* synthetic */ C4752d f13563c;

    public /* synthetic */ C4749a(HashSet hashSet, Map.Entry entry, C4752d dVar) {
        this.f13561a = hashSet;
        this.f13562b = entry;
        this.f13563c = dVar;
    }

    public final void onScanCompleted(String str, Uri uri) {
        C4752d.m20319H(this.f13561a, this.f13562b, this.f13563c, str, uri);
    }
}
