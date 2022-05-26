package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.fc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5073fc extends C5111gd {

    /* renamed from: h */
    private final Activity f16515h;

    /* renamed from: i */
    private final View f16516i;

    public C5073fc(C5701wb wbVar, String str, String str2, C4920b8 b8Var, int i, int i2, View view, Activity activity) {
        super(wbVar, "VJibBREzYucPjNukhWG65jB60OIZQrcDVR3W2JV3G5ynshQ4Nd74pHrZYUgRiYK0", "TiANcug5zndviERrHpzUihvZthrd+vHCK5ngnbrocVE=", b8Var, i, 62);
        this.f16516i = view;
        this.f16515h = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15751a() throws IllegalAccessException, InvocationTargetException {
        if (this.f16516i != null) {
            boolean booleanValue = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22324F1)).booleanValue();
            Object[] objArr = (Object[]) this.f17020e.invoke((Object) null, new Object[]{this.f16516i, this.f16515h, Boolean.valueOf(booleanValue)});
            synchronized (this.f17019d) {
                this.f17019d.mo16113W(((Long) objArr[0]).longValue());
                this.f17019d.mo16115Z(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.f17019d.mo16114X((String) objArr[2]);
                }
            }
        }
    }
}
