package com.afollestad.materialdialogs.prefs;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.afollestad.materialdialogs.internal.C1435c;
import p159f.p160a.p161a.C4264b;
import p159f.p160a.p161a.C4269f;
import p159f.p160a.p161a.p162q.C4294a;
import p159f.p160a.p161a.p162q.C4295b;
import p159f.p160a.p161a.p163r.C4297a;

public class MaterialEditTextPreference extends EditTextPreference {

    /* renamed from: g */
    private int f5555g = 0;

    /* renamed from: h */
    private C4269f f5556h;

    /* renamed from: i */
    private EditText f5557i;

    /* renamed from: com.afollestad.materialdialogs.prefs.MaterialEditTextPreference$a */
    class C1441a implements C4269f.C4283m {
        C1441a() {
        }

        /* renamed from: a */
        public void mo6880a(C4269f fVar, C4264b bVar) {
            int i = C1442b.f5561a[bVar.ordinal()];
            if (i == 1) {
                MaterialEditTextPreference.this.onClick(fVar, -3);
            } else if (i != 2) {
                MaterialEditTextPreference.this.onClick(fVar, -1);
            } else {
                MaterialEditTextPreference.this.onClick(fVar, -2);
            }
        }
    }

    /* renamed from: com.afollestad.materialdialogs.prefs.MaterialEditTextPreference$b */
    static /* synthetic */ class C1442b {

        /* renamed from: a */
        static final /* synthetic */ int[] f5561a;

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
                f5561a = r0
                f.a.a.b r1 = p159f.p160a.p161a.C4264b.NEUTRAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5561a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.a.a.b r1 = p159f.p160a.p161a.C4264b.NEGATIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.prefs.MaterialEditTextPreference.C1442b.<clinit>():void");
        }
    }

    public MaterialEditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7548c(context, attributeSet);
    }

    /* renamed from: c */
    private void m7548c(Context context, AttributeSet attributeSet) {
        C1451a.m7565b(context, this, attributeSet);
        this.f5555g = C4297a.m18799m(context, C4294a.md_widget_color, C4297a.m18799m(context, C4294a.colorAccent, Build.VERSION.SDK_INT >= 21 ? C4297a.m18798l(context, 16843829) : 0));
        AppCompatEditText appCompatEditText = new AppCompatEditText(context, attributeSet);
        this.f5557i = appCompatEditText;
        appCompatEditText.setId(16908291);
        this.f5557i.setEnabled(true);
    }

    /* renamed from: d */
    private void m7549d(Dialog dialog) {
        Window window = dialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }

    public Dialog getDialog() {
        return this.f5556h;
    }

    public EditText getEditText() {
        return this.f5557i;
    }

    public void onActivityDestroy() {
        super.onActivityDestroy();
        C4269f fVar = this.f5556h;
        if (fVar != null && fVar.isShowing()) {
            this.f5556h.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onAddEditTextToDialogView(View view, EditText editText) {
        ((ViewGroup) view).addView(editText, new LinearLayout.LayoutParams(-1, -2));
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"MissingSuperCall"})
    public void onBindDialogView(View view) {
        EditText editText = this.f5557i;
        editText.setText(getText());
        if (editText.getText().length() > 0) {
            editText.setSelection(editText.length());
        }
        ViewParent parent = editText.getParent();
        if (parent != view) {
            if (parent != null) {
                ((ViewGroup) parent).removeView(editText);
            }
            onAddEditTextToDialogView(view, editText);
        }
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        if (z) {
            String obj = this.f5557i.getText().toString();
            if (callChangeListener(obj)) {
                setText(obj);
            }
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
        if (savedState.f5558g) {
            showDialog(savedState.f5559h);
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
        savedState.f5558g = true;
        savedState.f5559h = dialog.onSaveInstanceState();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void showDialog(Bundle bundle) {
        C4269f.C4274d dVar = new C4269f.C4274d(getContext());
        dVar.mo14623J(getDialogTitle());
        dVar.mo14637l(getDialogIcon());
        dVar.mo14620G(getPositiveButtonText());
        dVar.mo14649x(getNegativeButtonText());
        dVar.mo14634i(this);
        dVar.mo14614A(new C1441a());
        dVar.mo14634i(this);
        View inflate = LayoutInflater.from(getContext()).inflate(C4295b.md_stub_inputpref, (ViewGroup) null);
        onBindDialogView(inflate);
        C1435c.m7537e(this.f5557i, this.f5555g);
        TextView textView = (TextView) inflate.findViewById(16908299);
        if (getDialogMessage() == null || getDialogMessage().toString().length() <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(getDialogMessage());
        }
        dVar.mo14633h(inflate, false);
        C1451a.m7564a(this, this);
        C4269f c = dVar.mo14629c();
        this.f5556h = c;
        if (bundle != null) {
            c.onRestoreInstanceState(bundle);
        }
        m7549d(this.f5556h);
        this.f5556h.show();
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1440a();

        /* renamed from: g */
        boolean f5558g;

        /* renamed from: h */
        Bundle f5559h;

        /* renamed from: com.afollestad.materialdialogs.prefs.MaterialEditTextPreference$SavedState$a */
        static class C1440a implements Parcelable.Creator<SavedState> {
            C1440a() {
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
            this.f5558g = parcel.readInt() != 1 ? false : true;
            this.f5559h = parcel.readBundle();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5558g ? 1 : 0);
            parcel.writeBundle(this.f5559h);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @TargetApi(21)
    public MaterialEditTextPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7548c(context, attributeSet);
    }
}
