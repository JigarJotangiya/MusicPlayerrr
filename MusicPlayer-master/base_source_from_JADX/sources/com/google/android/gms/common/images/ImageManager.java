package com.google.android.gms.common.images;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p159f.p243f.p245b.p246a.p293c.p296c.C7443e;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class ImageManager {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final Object f10505h = new Object();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static HashSet<Uri> f10506i = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f10507a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Handler f10508b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ExecutorService f10509c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C7443e f10510d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Map<C3250c, ImageReceiver> f10511e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Map<Uri, ImageReceiver> f10512f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Map<Uri, Long> f10513g;

    @KeepName
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    private final class ImageReceiver extends ResultReceiver {

        /* renamed from: g */
        private final Uri f10514g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final ArrayList<C3250c> f10515h;

        /* renamed from: i */
        final /* synthetic */ ImageManager f10516i;

        public final void onReceiveResult(int i, Bundle bundle) {
            this.f10516i.f10509c.execute(new C3248a(this.f10516i, this.f10514g, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }
}
