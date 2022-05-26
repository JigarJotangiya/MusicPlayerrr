package com.afollestad.materialdialogs.prefs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.DialogPreference;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import p159f.p160a.p161a.C4264b;
import p159f.p160a.p161a.C4269f;

public class MaterialDialogPreference extends DialogPreference {

    /* renamed from: g */
    private Context f5549g;

    /* renamed from: h */
    private C4269f f5550h;

    /* renamed from: com.afollestad.materialdialogs.prefs.MaterialDialogPreference$a */
    class C1438a implements C4269f.C4283m {
        C1438a() {
        }

        /* renamed from: a */
        public void mo6880a(C4269f fVar, C4264b bVar) {
            int i = C1439b.f5554a[bVar.ordinal()];
            if (i == 1) {
                MaterialDialogPreference.this.onClick(fVar, -3);
            } else if (i != 2) {
                MaterialDialogPreference.this.onClick(fVar, -1);
            } else {
                MaterialDialogPreference.this.onClick(fVar, -2);
            }
        }
    }

    /* renamed from: com.afollestad.materialdialogs.prefs.MaterialDialogPreference$b */
    static /* synthetic */ class C1439b {

        /* renamed from: a */
        static final /* synthetic */ int[] f5554a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                f.a.a.b[] r0 = p159f.p160a.p161a.C4264b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5554a = r0
                f.a.a.b r1 = p159f.p160a.p161a.C4264b.NEUTRAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5554a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.a.a.b r1 = p159f.p160a.p161a.C4264b.NEGATIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.prefs.MaterialDialogPreference.C1439b.<clinit>():void");
        }
    }

    public MaterialDialogPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7544c(context, attributeSet);
    }

    /* renamed from: c */
    private void m7544c(Context context, AttributeSet attributeSet) {
        this.f5549g = context;
        C1451a.m7565b(context, this, attributeSet);
    }

    public Dialog getDialog() {
        return this.f5550h;
    }

    public void onActivityDestroy() {
        super.onActivityDestroy();
        C4269f fVar = this.f5550h;
        if (fVar != null && fVar.isShowing()) {
            this.f5550h.dismiss();
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C1451a.m7566c(this, this);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f5551g) {
            showDialog(savedState.f5552h);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Dialog dialog = getDialog();
        if (dialog == null || !dialog.isShowing()) {
            return onSaveInstanceState;
        }
        SavedState savedState = new SavedState(onSaveInstanceState);
        savedState.f5551g = true;
        savedState.f5552h = dialog.onSaveInstanceState();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void showDialog(Bundle bundle) {
        C4269f.C4274d dVar = new C4269f.C4274d(this.f5549g);
        dVar.mo14623J(getDialogTitle());
        dVar.mo14637l(getDialogIcon());
        dVar.mo14634i(this);
        dVar.mo14614A(new C1438a());
        dVar.mo14620G(getPositiveButtonText());
        dVar.mo14649x(getNegativeButtonText());
        dVar.mo14627a(true);
        View onCreateDialogView = onCreateDialogView();
        if (onCreateDialogView != null) {
            onBindDialogView(onCreateDialogView);
            dVar.mo14633h(onCreateDialogView, false);
        } else {
            dVar.mo14631f(getDialogMessage());
        }
        C1451a.m7564a(this, this);
        C4269f c = dVar.mo14629c();
        this.f5550h = c;
        if (bundle != null) {
            c.onRestoreInstanceState(bundle);
        }
        this.f5550h.show();
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1437a();

        /* renamed from: g */
        boolean f5551g;

        /* renamed from: h */
        Bundle f5552h;

        /* renamed from: com.afollestad.materialdialogs.prefs.MaterialDialogPreference$SavedState$a */
        static class C1437a implements Parcelable.Creator<SavedState> {
            C1437a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f5551g = parcel.readInt() != 1 ? false : true;
            this.f5552h = parcel.readBundle();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5551g ? 1 : 0);
            parcel.writeBundle(this.f5552h);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MaterialDialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7544c(context, attributeSet);
    }
}
