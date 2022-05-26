package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.un4seen.bass.BASS;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yd2 implements sg2<zd2> {

    /* renamed from: a */
    private final e93 f26340a;

    /* renamed from: b */
    private final ViewGroup f26341b;

    /* renamed from: c */
    private final Context f26342c;

    /* renamed from: d */
    private final Set<String> f26343d;

    public yd2(e93 e93, ViewGroup viewGroup, Context context, Set<String> set) {
        this.f26340a = e93;
        this.f26343d = set;
        this.f26341b = viewGroup;
        this.f26342c = context;
    }

    /* renamed from: a */
    public final d93<zd2> mo15767a() {
        return this.f26340a.mo17138A0(new xd2(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ zd2 mo22190b() throws Exception {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22371L3)).booleanValue() && this.f26341b != null && this.f26343d.contains("banner")) {
            return new zd2(Boolean.valueOf(this.f26341b.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22378M3)).booleanValue() && this.f26343d.contains("native")) {
            Context context = this.f26342c;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & BASS.BASS_SPEAKER_FRONT) == 0) {
                    try {
                        boolean z = false;
                        if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0) {
                            z = true;
                        }
                        bool = Boolean.valueOf(z);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    bool = Boolean.TRUE;
                }
                return new zd2(bool);
            }
        }
        return new zd2((Boolean) null);
    }
}
