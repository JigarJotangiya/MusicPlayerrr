package net.coocent.android.xmlparser.widget.dialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.C0584b;
import androidx.fragment.app.C0602j;
import androidx.fragment.app.C0620p;

public class CommonDialog extends C0584b {

    /* renamed from: q0 */
    private DialogParams f36529q0;

    /* renamed from: r0 */
    private CreateDialogCallback f36530r0;

    /* renamed from: s0 */
    private DialogCancelCallback f36531s0;

    /* renamed from: t0 */
    private DialogViewBinder f36532t0;

    public static abstract class CreateDialogCallback implements Parcelable {
        public static final Parcelable.Creator<CreateDialogCallback> CREATOR = new Parcelable.Creator<CreateDialogCallback>() {
            /* renamed from: a */
            public CreateDialogCallback createFromParcel(Parcel parcel) {
                return new CreateDialogCallback(this, parcel) {
                    /* renamed from: a */
                    public Dialog mo32751a(Context context) {
                        return null;
                    }
                };
            }

            /* renamed from: b */
            public CreateDialogCallback[] newArray(int i) {
                return new CreateDialogCallback[i];
            }
        };

        public CreateDialogCallback() {
        }

        /* renamed from: a */
        public abstract Dialog mo32751a(Context context);

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
        }

        protected CreateDialogCallback(Parcel parcel) {
        }
    }

    public static abstract class DialogCancelCallback implements Parcelable {
        public static final Parcelable.Creator<DialogCancelCallback> CREATOR = new Parcelable.Creator<DialogCancelCallback>() {
            /* renamed from: a */
            public DialogCancelCallback createFromParcel(Parcel parcel) {
                return new DialogCancelCallback(this, parcel) {
                    /* renamed from: a */
                    public void mo32461a() {
                    }
                };
            }

            /* renamed from: b */
            public DialogCancelCallback[] newArray(int i) {
                return new DialogCancelCallback[i];
            }
        };

        public DialogCancelCallback() {
        }

        /* renamed from: a */
        public abstract void mo32461a();

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
        }

        protected DialogCancelCallback(Parcel parcel) {
        }
    }

    public static abstract class DialogViewBinder implements Parcelable {
        public static final Parcelable.Creator<DialogViewBinder> CREATOR = new Parcelable.Creator<DialogViewBinder>() {
            /* renamed from: a */
            public DialogViewBinder createFromParcel(Parcel parcel) {
                return new DialogViewBinder(this, parcel) {
                    /* renamed from: a */
                    public void mo32770a(CommonDialog commonDialog, View view) {
                        commonDialog.mo3832Y2();
                    }
                };
            }

            /* renamed from: b */
            public DialogViewBinder[] newArray(int i) {
                return new DialogViewBinder[0];
            }
        };

        public DialogViewBinder() {
        }

        /* renamed from: a */
        public abstract void mo32770a(CommonDialog commonDialog, View view);

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
        }

        public DialogViewBinder(Parcel parcel) {
        }
    }

    /* renamed from: net.coocent.android.xmlparser.widget.dialog.CommonDialog$b */
    public static final class C9517b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public DialogParams f36544a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public CreateDialogCallback f36545b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public DialogCancelCallback f36546c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public DialogViewBinder f36547d;

        public C9517b() {
            this(0);
        }

        /* renamed from: e */
        public CommonDialog mo32777e() {
            return new CommonDialog(this);
        }

        /* renamed from: f */
        public C9517b mo32778f(boolean z) {
            this.f36544a.f36542p = z;
            return this;
        }

        /* renamed from: g */
        public C9517b mo32779g(boolean z) {
            this.f36544a.f36543q = z;
            return this;
        }

        /* renamed from: h */
        public C9517b mo32780h(CreateDialogCallback createDialogCallback) {
            this.f36545b = createDialogCallback;
            return this;
        }

        /* renamed from: i */
        public C9517b mo32781i(DialogCancelCallback dialogCancelCallback) {
            this.f36546c = dialogCancelCallback;
            return this;
        }

        /* renamed from: j */
        public C9517b mo32782j(DialogViewBinder dialogViewBinder) {
            this.f36547d = dialogViewBinder;
            return this;
        }

        /* renamed from: k */
        public C9517b mo32783k(float f) {
            this.f36544a.f36539m = f;
            return this;
        }

        /* renamed from: l */
        public C9517b mo32784l(int i) {
            this.f36544a.f36538l = i;
            return this;
        }

        /* renamed from: m */
        public C9517b mo32785m(int i) {
            this.f36544a.f36537k = i;
            return this;
        }

        /* renamed from: n */
        public C9517b mo32786n(int i) {
            this.f36544a.f36534h = i;
            return this;
        }

        /* renamed from: o */
        public C9517b mo32787o(int i) {
            this.f36544a.f36536j = i;
            return this;
        }

        public C9517b(int i) {
            DialogParams dialogParams = new DialogParams();
            this.f36544a = dialogParams;
            dialogParams.f36533g = i;
        }
    }

    /* renamed from: R1 */
    public void mo3626R1(Bundle bundle) {
        super.mo3626R1(bundle);
        bundle.putParcelable("dialog_params", this.f36529q0);
        bundle.putParcelable("dialog_view_binder", this.f36532t0);
        bundle.putParcelable("dialog_cancel_callback", this.f36531s0);
        bundle.putParcelable("dialog_create_dialog_callback", this.f36530r0);
    }

    /* renamed from: S1 */
    public void mo3630S1() {
        super.mo3630S1();
        Dialog a3 = mo3834a3();
        if (a3 != null) {
            a3.setCanceledOnTouchOutside(this.f36529q0.f36543q);
            Window window = a3.getWindow();
            if (window != null) {
                int i = Build.VERSION.SDK_INT;
                if (i <= 19 && ((a3 instanceof ProgressDialog) || (a3 instanceof DatePickerDialog))) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                if (i >= 19) {
                    if (this.f36529q0.f36540n) {
                        window.getDecorView().setSystemUiVisibility(1028);
                    }
                    if (this.f36529q0.f36541o) {
                        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 512 | 2);
                    }
                    window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 256 | 4096);
                }
                WindowManager.LayoutParams attributes = window.getAttributes();
                DialogParams dialogParams = this.f36529q0;
                attributes.width = dialogParams.f36536j;
                attributes.height = dialogParams.f36537k;
                attributes.gravity = dialogParams.f36538l;
                int i2 = dialogParams.f36535i;
                if (i2 != -1) {
                    window.setBackgroundDrawableResource(i2);
                }
                attributes.dimAmount = this.f36529q0.f36539m;
                window.setAttributes(attributes);
            }
        }
    }

    /* renamed from: U1 */
    public void mo3636U1(View view, Bundle bundle) {
        super.mo3636U1(view, bundle);
        DialogViewBinder dialogViewBinder = this.f36532t0;
        if (dialogViewBinder != null) {
            dialogViewBinder.mo32770a(this, view);
        }
    }

    /* renamed from: c3 */
    public Dialog mo3836c3(Bundle bundle) {
        CreateDialogCallback createDialogCallback = this.f36530r0;
        if (createDialogCallback == null) {
            return super.mo3836c3(bundle);
        }
        return createDialogCallback.mo32751a(mo3708v2());
    }

    /* renamed from: h3 */
    public void mo3841h3(C0602j jVar, String str) {
        if (mo3622Q0() || jVar.mo3938Y(str) != null) {
            C0620p i = jVar.mo3957i();
            i.mo3823r(this);
            i.mo3815i();
            super.mo3841h3(jVar, str);
            return;
        }
        C0620p i2 = jVar.mo3957i();
        i2.mo4071e(this, str);
        i2.mo3816j();
    }

    /* renamed from: l1 */
    public void mo3679l1(Bundle bundle) {
        super.mo3679l1(bundle);
        if (bundle != null) {
            this.f36529q0 = (DialogParams) bundle.getParcelable("dialog_params");
            this.f36532t0 = (DialogViewBinder) bundle.getParcelable("dialog_view_binder");
            this.f36531s0 = (DialogCancelCallback) bundle.getParcelable("dialog_cancel_callback");
            this.f36530r0 = (CreateDialogCallback) bundle.getParcelable("dialog_create_dialog_callback");
            if (this.f36529q0 == null) {
                this.f36529q0 = new DialogParams();
            }
        }
        mo3837d3(this.f36529q0.f36542p);
        mo3839f3(0, this.f36529q0.f36533g);
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        DialogCancelCallback dialogCancelCallback = this.f36531s0;
        if (dialogCancelCallback != null) {
            dialogCancelCallback.mo32461a();
        }
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.f36529q0.f36534h;
        if (i != -1) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return super.mo3701t1(layoutInflater, viewGroup, bundle);
    }

    public CommonDialog() {
    }

    private CommonDialog(C9517b bVar) {
        this.f36529q0 = bVar.f36544a;
        this.f36531s0 = bVar.f36546c;
        this.f36530r0 = bVar.f36545b;
        this.f36532t0 = bVar.f36547d;
    }

    static class DialogParams implements Parcelable {
        public static final Parcelable.Creator<DialogParams> CREATOR = new C9513a();

        /* renamed from: g */
        int f36533g;

        /* renamed from: h */
        int f36534h = -1;

        /* renamed from: i */
        int f36535i = -1;

        /* renamed from: j */
        int f36536j = -2;

        /* renamed from: k */
        int f36537k = -2;

        /* renamed from: l */
        int f36538l = 17;

        /* renamed from: m */
        float f36539m = 0.0f;

        /* renamed from: n */
        boolean f36540n;

        /* renamed from: o */
        boolean f36541o;

        /* renamed from: p */
        boolean f36542p;

        /* renamed from: q */
        boolean f36543q;

        /* renamed from: net.coocent.android.xmlparser.widget.dialog.CommonDialog$DialogParams$a */
        class C9513a implements Parcelable.Creator<DialogParams> {
            C9513a() {
            }

            /* renamed from: a */
            public DialogParams createFromParcel(Parcel parcel) {
                return new DialogParams(parcel);
            }

            /* renamed from: b */
            public DialogParams[] newArray(int i) {
                return new DialogParams[i];
            }
        }

        DialogParams() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f36533g);
            parcel.writeInt(this.f36534h);
            parcel.writeInt(this.f36535i);
            parcel.writeInt(this.f36536j);
            parcel.writeInt(this.f36537k);
            parcel.writeInt(this.f36538l);
            parcel.writeFloat(this.f36539m);
            parcel.writeByte(this.f36540n ? (byte) 1 : 0);
            parcel.writeByte(this.f36541o ? (byte) 1 : 0);
            parcel.writeByte(this.f36542p ? (byte) 1 : 0);
            parcel.writeByte(this.f36543q ? (byte) 1 : 0);
        }

        protected DialogParams(Parcel parcel) {
            this.f36533g = parcel.readInt();
            this.f36534h = parcel.readInt();
            this.f36535i = parcel.readInt();
            this.f36536j = parcel.readInt();
            this.f36537k = parcel.readInt();
            this.f36538l = parcel.readInt();
            this.f36539m = parcel.readFloat();
            boolean z = true;
            this.f36540n = parcel.readByte() != 0;
            this.f36541o = parcel.readByte() != 0;
            this.f36542p = parcel.readByte() != 0;
            this.f36543q = parcel.readByte() == 0 ? false : z;
        }
    }
}
