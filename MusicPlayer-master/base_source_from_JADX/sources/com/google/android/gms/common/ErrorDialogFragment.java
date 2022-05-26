package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C3292l;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class ErrorDialogFragment extends DialogFragment {

    /* renamed from: g */
    private Dialog f10300g;

    /* renamed from: h */
    private DialogInterface.OnCancelListener f10301h;

    /* renamed from: i */
    private Dialog f10302i;

    /* renamed from: a */
    public static ErrorDialogFragment m13759a(@RecentlyNonNull Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        C3292l.m14241i(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        errorDialogFragment.f10300g = dialog2;
        if (onCancelListener != null) {
            errorDialogFragment.f10301h = onCancelListener;
        }
        return errorDialogFragment;
    }

    public void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f10301h;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f10300g;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f10302i == null) {
            this.f10302i = new AlertDialog.Builder(getActivity()).create();
        }
        return this.f10302i;
    }

    public void show(@RecentlyNonNull FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
