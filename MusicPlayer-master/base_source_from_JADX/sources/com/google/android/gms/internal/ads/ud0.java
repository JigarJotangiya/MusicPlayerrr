package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.p074x.C3126b;
import java.util.Map;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ud0 extends ce0 {

    /* renamed from: c */
    private final Map<String, String> f24296c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f24297d;

    /* renamed from: e */
    private final String f24298e = m31771l("description");

    /* renamed from: f */
    private final long f24299f = m31770k("start_ticks");

    /* renamed from: g */
    private final long f24300g = m31770k("end_ticks");

    /* renamed from: h */
    private final String f24301h = m31771l("summary");

    /* renamed from: i */
    private final String f24302i = m31771l("location");

    public ud0(pr0 pr0, Map<String, String> map) {
        super(pr0, "createCalendarEvent");
        this.f24296c = map;
        this.f24297d = pr0.mo17241i();
    }

    /* renamed from: k */
    private final long m31770k(String str) {
        String str2 = this.f24296c.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: l */
    private final String m31771l(String str) {
        return TextUtils.isEmpty(this.f24296c.get(str)) ? BuildConfig.FLAVOR : this.f24296c.get(str);
    }

    /* access modifiers changed from: package-private */
    @TargetApi(14)
    /* renamed from: i */
    public final Intent mo21248i() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f24298e);
        data.putExtra("eventLocation", this.f24302i);
        data.putExtra("description", this.f24301h);
        long j = this.f24299f;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.f24300g;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    /* renamed from: j */
    public final void mo21249j() {
        if (this.f24297d == null) {
            mo16610c("Activity context is not available.");
            return;
        }
        C2971s.m13214q();
        if (!new C5836zy(this.f24297d).mo22448b()) {
            mo16610c("This feature is not available on the device.");
            return;
        }
        C2971s.m13214q();
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f24297d);
        Resources d = C2971s.m13213p().mo17559d();
        builder.setTitle(d != null ? d.getString(C3126b.f10237s5) : "Create calendar event");
        builder.setMessage(d != null ? d.getString(C3126b.f10238s6) : "Allow Ad to create a calendar event?");
        builder.setPositiveButton(d != null ? d.getString(C3126b.f10235s3) : "Accept", new sd0(this));
        builder.setNegativeButton(d != null ? d.getString(C3126b.f10236s4) : "Decline", new td0(this));
        builder.create().show();
    }
}
