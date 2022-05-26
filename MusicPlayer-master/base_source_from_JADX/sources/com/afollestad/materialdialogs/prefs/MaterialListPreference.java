package com.afollestad.materialdialogs.prefs;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.ListPreference;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Field;
import p159f.p160a.p161a.C4264b;
import p159f.p160a.p161a.C4269f;

public class MaterialListPreference extends ListPreference {

    /* renamed from: g */
    private Context f5562g;

    /* renamed from: h */
    private C4269f f5563h;

    /* renamed from: com.afollestad.materialdialogs.prefs.MaterialListPreference$a */
    class C1444a implements C4269f.C4280j {
        C1444a() {
        }

        /* renamed from: a */
        public boolean mo6908a(C4269f fVar, View view, int i, CharSequence charSequence) {
            MaterialListPreference.this.onClick((DialogInterface) null, -1);
            if (i >= 0 && MaterialListPreference.this.getEntryValues() != null) {
                try {
                    Field declaredField = ListPreference.class.getDeclaredField("mClickedDialogEntryIndex");
                    declaredField.setAccessible(true);
                    declaredField.set(MaterialListPreference.this, Integer.valueOf(i));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return true;
        }
    }

    /* renamed from: com.afollestad.materialdialogs.prefs.MaterialListPreference$b */
    class C1445b implements C4269f.C4283m {
        C1445b() {
        }

        /* renamed from: a */
        public void mo6880a(C4269f fVar, C4264b bVar) {
            int i = C1446c.f5568a[bVar.ordinal()];
            if (i == 1) {
                MaterialListPreference.this.onClick(fVar, -3);
            } else if (i != 2) {
                MaterialListPreference.this.onClick(fVar, -1);
            } else {
                MaterialListPreference.this.onClick(fVar, -2);
            }
        }
    }

    /* renamed from: com.afollestad.materialdialogs.prefs.MaterialListPreference$c */
    static /* synthetic */ class C1446c {

        /* renamed from: a */
        static final /* synthetic */ int[] f5568a;

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
                f5568a = r0
                f.a.a.b r1 = p159f.p160a.p161a.C4264b.NEUTRAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5568a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.a.a.b r1 = p159f.p160a.p161a.C4264b.NEGATIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.prefs.MaterialListPreference.C1446c.<clinit>():void");
        }
    }

    public MaterialListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7553c(context, attributeSet);
    }

    /* renamed from: c */
    private void m7553c(Context context, AttributeSet attributeSet) {
        this.f5562g = context;
        C1451a.m7565b(context, this, attributeSet);
        if (Build.VERSION.SDK_INT <= 10) {
            setWidgetLayoutResource(0);
        }
    }

    public Dialog getDialog() {
        return this.f5563h;
    }

    public void onActivityDestroy() {
        super.onActivityDestroy();
        C4269f fVar = this.f5563h;
        if (fVar != null && fVar.isShowing()) {
            this.f5563h.dismiss();
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
        if (savedState.f5564g) {
            showDialog(savedState.f5565h);
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
        savedState.f5564g = true;
        savedState.f5565h = dialog.onSaveInstanceState();
        return savedState;
    }

    public void setEntries(CharSequence[] charSequenceArr) {
        super.setEntries(charSequenceArr);
        C4269f fVar = this.f5563h;
        if (fVar != null) {
            fVar.mo14608z(charSequenceArr);
        }
    }

    /* access modifiers changed from: protected */
    public void showDialog(Bundle bundle) {
        if (getEntries() == null || getEntryValues() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        int findIndexOfValue = findIndexOfValue(getValue());
        C4269f.C4274d dVar = new C4269f.C4274d(this.f5562g);
        dVar.mo14623J(getDialogTitle());
        dVar.mo14637l(getDialogIcon());
        dVar.mo14634i(this);
        dVar.mo14614A(new C1445b());
        dVar.mo14649x(getNegativeButtonText());
        dVar.mo14639n(getEntries());
        dVar.mo14627a(true);
        dVar.mo14642q(findIndexOfValue, new C1444a());
        View onCreateDialogView = onCreateDialogView();
        if (onCreateDialogView != null) {
            onBindDialogView(onCreateDialogView);
            dVar.mo14633h(onCreateDialogView, false);
        } else {
            dVar.mo14631f(getDialogMessage());
        }
        C1451a.m7564a(this, this);
        C4269f c = dVar.mo14629c();
        this.f5563h = c;
        if (bundle != null) {
            c.onRestoreInstanceState(bundle);
        }
        onClick(this.f5563h, -2);
        this.f5563h.show();
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1443a();

        /* renamed from: g */
        boolean f5564g;

        /* renamed from: h */
        Bundle f5565h;

        /* renamed from: com.afollestad.materialdialogs.prefs.MaterialListPreference$SavedState$a */
        static class C1443a implements Parcelable.Creator<SavedState> {
            C1443a() {
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
            this.f5564g = parcel.readInt() != 1 ? false : true;
            this.f5565h = parcel.readBundle();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5564g ? 1 : 0);
            parcel.writeBundle(this.f5565h);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @TargetApi(21)
    public MaterialListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7553c(context, attributeSet);
    }
}
