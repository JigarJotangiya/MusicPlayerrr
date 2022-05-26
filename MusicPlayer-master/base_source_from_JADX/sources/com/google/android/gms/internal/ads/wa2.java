package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.C2971s;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wa2 implements rg2<Bundle> {

    /* renamed from: a */
    public final Context f25307a;

    /* renamed from: b */
    public final zzbfi f25308b;

    /* renamed from: c */
    public final List<Parcelable> f25309c;

    public wa2(Context context, zzbfi zzbfi, List<Parcelable> list) {
        this.f25307a = context;
        this.f25308b = zzbfi;
        this.f25309c = list;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        Bundle bundle = (Bundle) obj;
        if (j10.f18302a.mo20989e().booleanValue()) {
            Bundle bundle2 = new Bundle();
            C2971s.m13214q();
            String str = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.f25307a.getSystemService("activity");
                if (activityManager != null) {
                    List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
                    if (!(runningTasks == null || runningTasks.isEmpty() || (runningTaskInfo = runningTasks.get(0)) == null || (componentName = runningTaskInfo.topActivity) == null)) {
                        str = componentName.getClassName();
                    }
                }
            } catch (Exception unused) {
            }
            bundle2.putString("activity", str);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("width", this.f25308b.f27219k);
            bundle3.putInt("height", this.f25308b.f27216h);
            bundle2.putBundle("size", bundle3);
            if (this.f25309c.size() > 0) {
                List<Parcelable> list = this.f25309c;
                bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle.putBundle("view_hierarchy", bundle2);
        }
    }
}
