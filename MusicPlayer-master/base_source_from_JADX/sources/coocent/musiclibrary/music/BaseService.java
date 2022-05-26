package coocent.musiclibrary.music;

import android.os.Bundle;
import android.support.p001v4.media.MediaBrowserCompat;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.List;
import p369i.p387z.p389d.C8594l;

/* compiled from: BaseService.kt */
public class BaseService extends MediaBrowserServiceCompat {
    /* renamed from: L */
    public MediaBrowserServiceCompat.C0733e mo4310L(String str, int i, Bundle bundle) {
        C8594l.m46771e(str, "clientPackageName");
        return new MediaBrowserServiceCompat.C0733e("root", (Bundle) null);
    }

    /* renamed from: M */
    public void mo4311M(String str, MediaBrowserServiceCompat.C0750m<List<MediaBrowserCompat.MediaItem>> mVar) {
        C8594l.m46771e(str, "parentId");
        C8594l.m46771e(mVar, "result");
        mVar.mo4355f(new ArrayList());
    }
}
