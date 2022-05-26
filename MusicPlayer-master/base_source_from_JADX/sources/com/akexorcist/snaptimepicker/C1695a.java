package com.akexorcist.snaptimepicker;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.C0133c;
import androidx.fragment.app.C0584b;
import p369i.p387z.p389d.C8594l;

/* renamed from: com.akexorcist.snaptimepicker.a */
/* compiled from: BaseSnapTimePickerDialogFragment.kt */
public abstract class C1695a extends C0584b {

    /* renamed from: q0 */
    public View f6359q0;

    /* renamed from: R1 */
    public void mo3626R1(Bundle bundle) {
        C8594l.m46771e(bundle, "outState");
        super.mo3626R1(bundle);
        mo7545n3(bundle);
    }

    /* renamed from: c3 */
    public Dialog mo3836c3(Bundle bundle) {
        C0133c.C0134a aVar = new C0133c.C0134a(mo3708v2());
        View p3 = mo7547p3();
        this.f6359q0 = p3;
        aVar.mo646q(p3);
        C0133c a = aVar.mo630a();
        C8594l.m46770d(a, "builder.create()");
        a.requestWindowFeature(1);
        Window window = a.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return a;
    }

    /* renamed from: d1 */
    public void mo3660d1(Bundle bundle) {
        super.mo3660d1(bundle);
        mo7541j3();
        if (bundle != null) {
            mo7542k3();
        } else {
            mo7540i3();
        }
        mo7546o3();
    }

    /* renamed from: i3 */
    public abstract void mo7540i3();

    /* renamed from: j3 */
    public abstract void mo7541j3();

    /* renamed from: k3 */
    public abstract void mo7542k3();

    /* renamed from: l1 */
    public void mo3679l1(Bundle bundle) {
        super.mo3679l1(bundle);
        if (bundle != null) {
            mo7544m3(bundle);
        } else {
            mo7543l3(mo3638V());
        }
    }

    /* renamed from: l3 */
    public abstract void mo7543l3(Bundle bundle);

    /* renamed from: m3 */
    public abstract void mo7544m3(Bundle bundle);

    /* renamed from: n3 */
    public abstract void mo7545n3(Bundle bundle);

    /* renamed from: o3 */
    public abstract void mo7546o3();

    /* renamed from: p3 */
    public abstract View mo7547p3();
}
