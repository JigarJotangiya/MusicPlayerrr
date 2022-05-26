package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import p159f.p243f.p245b.p246a.p248b.C4865b;
import p159f.p243f.p245b.p246a.p248b.C4866c;

/* renamed from: com.google.android.gms.common.internal.g0 */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3277g0 extends C4866c<C3256b0> {

    /* renamed from: c */
    private static final C3277g0 f10632c = new C3277g0();

    private C3277g0() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    /* renamed from: c */
    public static View m14208c(Context context, int i, int i2) throws C4866c.C4867a {
        C3277g0 g0Var = f10632c;
        try {
            zax zax = new zax(1, i, i2, (Scope[]) null);
            return (View) C4865b.m20502K0(((C3256b0) g0Var.mo15605b(context)).mo11764l3(C4865b.m20503f2(context), zax));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Could not get button with size ");
            sb.append(i);
            sb.append(" and color ");
            sb.append(i2);
            throw new C4866c.C4867a(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11842a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof C3256b0 ? (C3256b0) queryLocalInterface : new C3256b0(iBinder);
    }
}
