package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.gc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5110gc extends C5111gd {
    public C5110gc(C5701wb wbVar, String str, String str2, C4920b8 b8Var, int i, int i2) {
        super(wbVar, "SnrtMYC9+qStj9ZoSAj1DR6mGb7YlLFiZbsMn2F8wpevpQUtlzrwws7lBSZ1KQhS", "3Z4807bJ0KoyYYoQ9dcfmEBolGH5CdxZiQurF1neOqs=", b8Var, i, 49);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15751a() throws IllegalAccessException, InvocationTargetException {
        this.f17019d.mo16105N(3);
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.f17020e.invoke((Object) null, new Object[]{this.f17016a.mo21778b()})).booleanValue();
            C4920b8 b8Var = this.f17019d;
            if (true == booleanValue) {
                i = 2;
            }
            b8Var.mo16105N(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
