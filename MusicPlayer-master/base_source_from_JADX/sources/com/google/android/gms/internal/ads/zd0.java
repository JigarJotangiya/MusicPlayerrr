package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.p074x.C3126b;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zd0 extends ce0 {

    /* renamed from: c */
    private final Map<String, String> f26741c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f26742d;

    public zd0(pr0 pr0, Map<String, String> map) {
        super(pr0, "storePicture");
        this.f26741c = map;
        this.f26742d = pr0.mo17241i();
    }

    /* renamed from: i */
    public final void mo22357i() {
        if (this.f26742d == null) {
            mo16610c("Activity context is not available");
            return;
        }
        C2971s.m13214q();
        if (!new C5836zy(this.f26742d).mo22449c()) {
            mo16610c("Feature is not supported by the device.");
            return;
        }
        String str = this.f26741c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            mo16610c("Image url cannot be empty.");
        } else if (!URLUtil.isValidUrl(str)) {
            String valueOf = String.valueOf(str);
            mo16610c(valueOf.length() != 0 ? "Invalid image url: ".concat(valueOf) : new String("Invalid image url: "));
        } else {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            C2971s.m13214q();
            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                Resources d = C2971s.m13213p().mo17559d();
                C2971s.m13214q();
                AlertDialog.Builder builder = new AlertDialog.Builder(this.f26742d);
                builder.setTitle(d != null ? d.getString(C3126b.f10233s1) : "Save image");
                builder.setMessage(d != null ? d.getString(C3126b.f10234s2) : "Allow Ad to store image in Picture gallery?");
                builder.setPositiveButton(d != null ? d.getString(C3126b.f10235s3) : "Accept", new xd0(this, str, lastPathSegment));
                builder.setNegativeButton(d != null ? d.getString(C3126b.f10236s4) : "Decline", new yd0(this));
                builder.create().show();
                return;
            }
            String valueOf2 = String.valueOf(lastPathSegment);
            mo16610c(valueOf2.length() != 0 ? "Image type not recognized: ".concat(valueOf2) : new String("Image type not recognized: "));
        }
    }
}
