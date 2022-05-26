package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.C0584b;
import androidx.fragment.app.C0602j;
import com.google.android.gms.common.internal.C3292l;

/* renamed from: com.google.android.gms.common.j */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C3330j extends C0584b {

    /* renamed from: q0 */
    private Dialog f10697q0;

    /* renamed from: r0 */
    private DialogInterface.OnCancelListener f10698r0;

    /* renamed from: s0 */
    private Dialog f10699s0;

    /* renamed from: i3 */
    public static C3330j m14357i3(@RecentlyNonNull Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C3330j jVar = new C3330j();
        C3292l.m14241i(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        jVar.f10697q0 = dialog2;
        if (onCancelListener != null) {
            jVar.f10698r0 = onCancelListener;
        }
        return jVar;
    }

    /* renamed from: c3 */
    public Dialog mo3836c3(Bundle bundle) {
        Dialog dialog = this.f10697q0;
        if (dialog != null) {
            return dialog;
        }
        mo3838e3(false);
        if (this.f10699s0 == null) {
            this.f10699s0 = new AlertDialog.Builder(mo3606L()).create();
        }
        return this.f10699s0;
    }

    /* renamed from: h3 */
    public void mo3841h3(@RecentlyNonNull C0602j jVar, String str) {
        super.mo3841h3(jVar, str);
    }

    public void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f10698r0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
