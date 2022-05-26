package p159f.p160a.p161a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.afollestad.materialdialogs.internal.MDRootLayout;

/* renamed from: f.a.a.c */
/* compiled from: DialogBase */
class C4265c extends Dialog implements DialogInterface.OnShowListener {

    /* renamed from: g */
    protected MDRootLayout f12730g;

    /* renamed from: h */
    private DialogInterface.OnShowListener f12731h;

    C4265c(Context context, int i) {
        super(context, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo14581b() {
        super.setOnShowListener(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo14582d(View view) {
        super.setContentView(view);
    }

    public View findViewById(int i) {
        return this.f12730g.findViewById(i);
    }

    public void onShow(DialogInterface dialogInterface) {
        DialogInterface.OnShowListener onShowListener = this.f12731h;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    @Deprecated
    public void setContentView(int i) throws IllegalAccessError {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f12731h = onShowListener;
    }

    @Deprecated
    public void setContentView(View view) throws IllegalAccessError {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Deprecated
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessError {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }
}
