package com.afollestad.materialdialogs.prefs;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.MultiSelectListPreference;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import p159f.p160a.p161a.C4264b;
import p159f.p160a.p161a.C4269f;

@TargetApi(11)
public class MaterialMultiSelectListPreference extends MultiSelectListPreference {

    /* renamed from: g */
    private Context f5569g;

    /* renamed from: h */
    private C4269f f5570h;

    /* renamed from: com.afollestad.materialdialogs.prefs.MaterialMultiSelectListPreference$a */
    class C1448a implements C4269f.C4279i {
        C1448a() {
        }

        /* renamed from: a */
        public boolean mo6921a(C4269f fVar, Integer[] numArr, CharSequence[] charSequenceArr) {
            MaterialMultiSelectListPreference.this.onClick((DialogInterface) null, -1);
            fVar.dismiss();
            HashSet hashSet = new HashSet();
            for (Integer intValue : numArr) {
                hashSet.add(MaterialMultiSelectListPreference.this.getEntryValues()[intValue.intValue()].toString());
            }
            if (!MaterialMultiSelectListPreference.this.callChangeListener(hashSet)) {
                return true;
            }
            MaterialMultiSelectListPreference.this.setValues(hashSet);
            return true;
        }
    }

    /* renamed from: com.afollestad.materialdialogs.prefs.MaterialMultiSelectListPreference$b */
    class C1449b implements C4269f.C4283m {
        C1449b() {
        }

        /* renamed from: a */
        public void mo6880a(C4269f fVar, C4264b bVar) {
            int i = C1450c.f5575a[bVar.ordinal()];
            if (i == 1) {
                MaterialMultiSelectListPreference.this.onClick(fVar, -3);
            } else if (i != 2) {
                MaterialMultiSelectListPreference.this.onClick(fVar, -1);
            } else {
                MaterialMultiSelectListPreference.this.onClick(fVar, -2);
            }
        }
    }

    /* renamed from: com.afollestad.materialdialogs.prefs.MaterialMultiSelectListPreference$c */
    static /* synthetic */ class C1450c {

        /* renamed from: a */
        static final /* synthetic */ int[] f5575a;

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
                f5575a = r0
                f.a.a.b r1 = p159f.p160a.p161a.C4264b.NEUTRAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5575a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.a.a.b r1 = p159f.p160a.p161a.C4264b.NEGATIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.prefs.MaterialMultiSelectListPreference.C1450c.<clinit>():void");
        }
    }

    public MaterialMultiSelectListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7559d(context, attributeSet);
    }

    /* renamed from: d */
    private void m7559d(Context context, AttributeSet attributeSet) {
        this.f5569g = context;
        C1451a.m7565b(context, this, attributeSet);
        if (Build.VERSION.SDK_INT <= 10) {
            setWidgetLayoutResource(0);
        }
    }

    public Dialog getDialog() {
        return this.f5570h;
    }

    public void onActivityDestroy() {
        super.onActivityDestroy();
        C4269f fVar = this.f5570h;
        if (fVar != null && fVar.isShowing()) {
            this.f5570h.dismiss();
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
        if (savedState.f5571g) {
            showDialog(savedState.f5572h);
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
        savedState.f5571g = true;
        savedState.f5572h = dialog.onSaveInstanceState();
        return savedState;
    }

    public void setEntries(CharSequence[] charSequenceArr) {
        super.setEntries(charSequenceArr);
        C4269f fVar = this.f5570h;
        if (fVar != null) {
            fVar.mo14608z(charSequenceArr);
        }
    }

    /* access modifiers changed from: protected */
    public void showDialog(Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        for (String next : getValues()) {
            if (findIndexOfValue(next) >= 0) {
                arrayList.add(Integer.valueOf(findIndexOfValue(next)));
            }
        }
        C4269f.C4274d dVar = new C4269f.C4274d(this.f5569g);
        dVar.mo14623J(getDialogTitle());
        dVar.mo14637l(getDialogIcon());
        dVar.mo14649x(getNegativeButtonText());
        dVar.mo14620G(getPositiveButtonText());
        dVar.mo14614A(new C1449b());
        dVar.mo14639n(getEntries());
        dVar.mo14641p((Integer[]) arrayList.toArray(new Integer[arrayList.size()]), new C1448a());
        dVar.mo14634i(this);
        View onCreateDialogView = onCreateDialogView();
        if (onCreateDialogView != null) {
            onBindDialogView(onCreateDialogView);
            dVar.mo14633h(onCreateDialogView, false);
        } else {
            dVar.mo14631f(getDialogMessage());
        }
        C1451a.m7564a(this, this);
        C4269f c = dVar.mo14629c();
        this.f5570h = c;
        if (bundle != null) {
            c.onRestoreInstanceState(bundle);
        }
        this.f5570h.show();
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1447a();

        /* renamed from: g */
        boolean f5571g;

        /* renamed from: h */
        Bundle f5572h;

        /* renamed from: com.afollestad.materialdialogs.prefs.MaterialMultiSelectListPreference$SavedState$a */
        static class C1447a implements Parcelable.Creator<SavedState> {
            C1447a() {
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
            this.f5571g = parcel.readInt() != 1 ? false : true;
            this.f5572h = parcel.readBundle();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5571g ? 1 : 0);
            parcel.writeBundle(this.f5572h);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @TargetApi(21)
    public MaterialMultiSelectListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7559d(context, attributeSet);
    }
}
