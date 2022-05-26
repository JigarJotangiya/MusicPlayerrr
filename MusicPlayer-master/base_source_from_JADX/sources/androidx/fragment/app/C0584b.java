package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: androidx.fragment.app.b */
/* compiled from: DialogFragment */
public class C0584b extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: d0 */
    private Handler f3025d0;

    /* renamed from: e0 */
    private Runnable f3026e0 = new C0585a();

    /* renamed from: f0 */
    DialogInterface.OnCancelListener f3027f0 = new C0586b();

    /* renamed from: g0 */
    DialogInterface.OnDismissListener f3028g0 = new C0587c();

    /* renamed from: h0 */
    int f3029h0 = 0;

    /* renamed from: i0 */
    int f3030i0 = 0;

    /* renamed from: j0 */
    boolean f3031j0 = true;

    /* renamed from: k0 */
    boolean f3032k0 = true;

    /* renamed from: l0 */
    int f3033l0 = -1;

    /* renamed from: m0 */
    Dialog f3034m0;

    /* renamed from: n0 */
    boolean f3035n0;

    /* renamed from: o0 */
    boolean f3036o0;

    /* renamed from: p0 */
    boolean f3037p0;

    /* renamed from: androidx.fragment.app.b$a */
    /* compiled from: DialogFragment */
    class C0585a implements Runnable {
        C0585a() {
        }

        public void run() {
            C0584b bVar = C0584b.this;
            bVar.f3028g0.onDismiss(bVar.f3034m0);
        }
    }

    /* renamed from: androidx.fragment.app.b$b */
    /* compiled from: DialogFragment */
    class C0586b implements DialogInterface.OnCancelListener {
        C0586b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C0584b bVar = C0584b.this;
            Dialog dialog = bVar.f3034m0;
            if (dialog != null) {
                bVar.onCancel(dialog);
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$c */
    /* compiled from: DialogFragment */
    class C0587c implements DialogInterface.OnDismissListener {
        C0587c() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            C0584b bVar = C0584b.this;
            Dialog dialog = bVar.f3034m0;
            if (dialog != null) {
                bVar.onDismiss(dialog);
            }
        }
    }

    /* renamed from: C1 */
    public void mo3580C1() {
        super.mo3580C1();
        Dialog dialog = this.f3034m0;
        if (dialog != null) {
            this.f3035n0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f3034m0.dismiss();
            if (!this.f3036o0) {
                onDismiss(this.f3034m0);
            }
            this.f3034m0 = null;
        }
    }

    /* renamed from: D1 */
    public void mo3583D1() {
        super.mo3583D1();
        if (!this.f3037p0 && !this.f3036o0) {
            this.f3036o0 = true;
        }
    }

    /* renamed from: E1 */
    public LayoutInflater mo3586E1(Bundle bundle) {
        if (!this.f3032k0) {
            return super.mo3586E1(bundle);
        }
        Dialog c3 = mo3836c3(bundle);
        this.f3034m0 = c3;
        if (c3 == null) {
            return (LayoutInflater) this.f2954y.mo3883e().getSystemService("layout_inflater");
        }
        mo3840g3(c3, this.f3029h0);
        return (LayoutInflater) this.f3034m0.getContext().getSystemService("layout_inflater");
    }

    /* renamed from: R1 */
    public void mo3626R1(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.mo3626R1(bundle);
        Dialog dialog = this.f3034m0;
        if (!(dialog == null || (onSaveInstanceState = dialog.onSaveInstanceState()) == null)) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f3029h0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f3030i0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f3031j0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f3032k0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f3033l0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    /* renamed from: S1 */
    public void mo3630S1() {
        super.mo3630S1();
        Dialog dialog = this.f3034m0;
        if (dialog != null) {
            this.f3035n0 = false;
            dialog.show();
        }
    }

    /* renamed from: T1 */
    public void mo3633T1() {
        super.mo3633T1();
        Dialog dialog = this.f3034m0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* renamed from: X2 */
    public void mo3831X2() {
        mo3833Z2(false, false);
    }

    /* renamed from: Y2 */
    public void mo3832Y2() {
        mo3833Z2(true, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z2 */
    public void mo3833Z2(boolean z, boolean z2) {
        if (!this.f3036o0) {
            this.f3036o0 = true;
            this.f3037p0 = false;
            Dialog dialog = this.f3034m0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f3034m0.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.f3025d0.getLooper()) {
                        onDismiss(this.f3034m0);
                    } else {
                        this.f3025d0.post(this.f3026e0);
                    }
                }
            }
            this.f3035n0 = true;
            if (this.f3033l0 >= 0) {
                mo3693q0().mo3915G0(this.f3033l0, 1);
                this.f3033l0 = -1;
                return;
            }
            C0620p i = mo3693q0().mo3957i();
            i.mo3823r(this);
            if (z) {
                i.mo3816j();
            } else {
                i.mo3815i();
            }
        }
    }

    /* renamed from: a3 */
    public Dialog mo3834a3() {
        return this.f3034m0;
    }

    /* renamed from: b3 */
    public int mo3835b3() {
        return this.f3030i0;
    }

    /* renamed from: c3 */
    public Dialog mo3836c3(Bundle bundle) {
        return new Dialog(mo3708v2(), mo3835b3());
    }

    /* renamed from: d1 */
    public void mo3660d1(Bundle bundle) {
        Bundle bundle2;
        super.mo3660d1(bundle);
        if (this.f3032k0) {
            View J0 = mo3600J0();
            if (J0 != null) {
                if (J0.getParent() == null) {
                    this.f3034m0.setContentView(J0);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            FragmentActivity L = mo3606L();
            if (L != null) {
                this.f3034m0.setOwnerActivity(L);
            }
            this.f3034m0.setCancelable(this.f3031j0);
            this.f3034m0.setOnCancelListener(this.f3027f0);
            this.f3034m0.setOnDismissListener(this.f3028g0);
            if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                this.f3034m0.onRestoreInstanceState(bundle2);
            }
        }
    }

    /* renamed from: d3 */
    public void mo3837d3(boolean z) {
        this.f3031j0 = z;
        Dialog dialog = this.f3034m0;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    /* renamed from: e3 */
    public void mo3838e3(boolean z) {
        this.f3032k0 = z;
    }

    /* renamed from: f3 */
    public void mo3839f3(int i, int i2) {
        this.f3029h0 = i;
        if (i == 2 || i == 3) {
            this.f3030i0 = 16973913;
        }
        if (i2 != 0) {
            this.f3030i0 = i2;
        }
    }

    /* renamed from: g3 */
    public void mo3840g3(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: h1 */
    public void mo3669h1(Context context) {
        super.mo3669h1(context);
        if (!this.f3037p0) {
            this.f3036o0 = false;
        }
    }

    /* renamed from: h3 */
    public void mo3841h3(C0602j jVar, String str) {
        this.f3036o0 = false;
        this.f3037p0 = true;
        C0620p i = jVar.mo3957i();
        i.mo4071e(this, str);
        i.mo3815i();
    }

    /* renamed from: l1 */
    public void mo3679l1(Bundle bundle) {
        super.mo3679l1(bundle);
        this.f3025d0 = new Handler();
        this.f3032k0 = this.f2910C == 0;
        if (bundle != null) {
            this.f3029h0 = bundle.getInt("android:style", 0);
            this.f3030i0 = bundle.getInt("android:theme", 0);
            this.f3031j0 = bundle.getBoolean("android:cancelable", true);
            this.f3032k0 = bundle.getBoolean("android:showsDialog", this.f3032k0);
            this.f3033l0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f3035n0) {
            mo3833Z2(true, true);
        }
    }
}
