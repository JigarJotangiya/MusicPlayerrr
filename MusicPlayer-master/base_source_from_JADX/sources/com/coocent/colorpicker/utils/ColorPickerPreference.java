package com.coocent.colorpicker.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p159f.p166c.p167a.p168c.C4306a;
import p159f.p166c.p167a.p169d.C4309a;

public class ColorPickerPreference extends Preference implements Preference.OnPreferenceClickListener, C4306a.C4308b {

    /* renamed from: g */
    View f7449g;

    /* renamed from: h */
    C4306a f7450h;

    /* renamed from: i */
    private int f7451i = -16777216;

    /* renamed from: j */
    private float f7452j = 0.0f;

    /* renamed from: k */
    private boolean f7453k = false;

    /* renamed from: l */
    private boolean f7454l = false;

    public ColorPickerPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m10323o(context, attributeSet);
    }

    /* renamed from: h */
    public static String m10319h(int i) {
        String hexString = Integer.toHexString(Color.alpha(i));
        String hexString2 = Integer.toHexString(Color.red(i));
        String hexString3 = Integer.toHexString(Color.green(i));
        String hexString4 = Integer.toHexString(Color.blue(i));
        if (hexString.length() == 1) {
            hexString = "0" + hexString;
        }
        if (hexString2.length() == 1) {
            hexString2 = "0" + hexString2;
        }
        if (hexString3.length() == 1) {
            hexString3 = "0" + hexString3;
        }
        if (hexString4.length() == 1) {
            hexString4 = "0" + hexString4;
        }
        return "#" + hexString + hexString2 + hexString3 + hexString4;
    }

    /* renamed from: j */
    public static int m10320j(String str) throws IllegalArgumentException {
        if (!str.startsWith("#")) {
            str = "#" + str;
        }
        return Color.parseColor(str);
    }

    /* renamed from: k */
    public static String m10321k(int i) {
        String hexString = Integer.toHexString(Color.red(i));
        String hexString2 = Integer.toHexString(Color.green(i));
        String hexString3 = Integer.toHexString(Color.blue(i));
        if (hexString.length() == 1) {
            hexString = "0" + hexString;
        }
        if (hexString2.length() == 1) {
            hexString2 = "0" + hexString2;
        }
        if (hexString3.length() == 1) {
            hexString3 = "0" + hexString3;
        }
        return "#" + hexString + hexString2 + hexString3;
    }

    /* renamed from: l */
    private Bitmap m10322l() {
        int i = (int) (this.f7452j * 31.0f);
        int i2 = this.f7451i;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        int width = createBitmap.getWidth();
        int height = createBitmap.getHeight();
        int i3 = 0;
        while (i3 < width) {
            int i4 = i3;
            while (i4 < height) {
                int i5 = (i3 <= 1 || i4 <= 1 || i3 >= width + -2 || i4 >= height + -2) ? -7829368 : i2;
                createBitmap.setPixel(i3, i4, i5);
                if (i3 != i4) {
                    createBitmap.setPixel(i4, i3, i5);
                }
                i4++;
            }
            i3++;
        }
        return createBitmap;
    }

    /* renamed from: o */
    private void m10323o(Context context, AttributeSet attributeSet) {
        this.f7452j = getContext().getResources().getDisplayMetrics().density;
        setOnPreferenceClickListener(this);
        if (attributeSet != null) {
            this.f7453k = attributeSet.getAttributeBooleanValue((String) null, "alphaSlider", false);
            this.f7454l = attributeSet.getAttributeBooleanValue((String) null, "hexValue", false);
        }
    }

    /* renamed from: p */
    private void m10324p() {
        if (this.f7449g != null) {
            ImageView imageView = new ImageView(getContext());
            LinearLayout linearLayout = (LinearLayout) this.f7449g.findViewById(16908312);
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), (int) (this.f7452j * 8.0f), linearLayout.getPaddingBottom());
                int childCount = linearLayout.getChildCount();
                if (childCount > 0) {
                    linearLayout.removeViews(0, childCount);
                }
                linearLayout.addView(imageView);
                linearLayout.setMinimumWidth(0);
                imageView.setBackgroundDrawable(new C4309a((int) (this.f7452j * 5.0f)));
                imageView.setImageBitmap(m10322l());
            }
        }
    }

    /* renamed from: c */
    public void mo8769c() {
    }

    /* renamed from: d */
    public void mo8770d(int i, String str) {
        if (isPersistent()) {
            persistInt(i);
        }
        this.f7451i = i;
        m10324p();
        try {
            getOnPreferenceChangeListener().onPreferenceChange(this, Integer.valueOf(i));
        } catch (NullPointerException unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onBindView(View view) {
        super.onBindView(view);
        this.f7449g = view;
        m10324p();
    }

    /* access modifiers changed from: protected */
    public Object onGetDefaultValue(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        if (string == null || !string.startsWith("#")) {
            return Integer.valueOf(typedArray.getColor(i, -16777216));
        }
        return Integer.valueOf(m10320j(string));
    }

    public boolean onPreferenceClick(Preference preference) {
        mo8777q((Bundle) null);
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable == null || !(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        mo8777q(savedState.f7455g);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        C4306a aVar = this.f7450h;
        if (aVar == null || !aVar.isShowing()) {
            return onSaveInstanceState;
        }
        SavedState savedState = new SavedState(onSaveInstanceState);
        savedState.f7455g = this.f7450h.onSaveInstanceState();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSetInitialValue(boolean z, Object obj) {
        int persistedInt = z ? getPersistedInt(this.f7451i) : ((Integer) obj).intValue();
        mo8770d(persistedInt, String.format("#%08X", new Object[]{Integer.valueOf(persistedInt)}));
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo8777q(Bundle bundle) {
        C4306a aVar = new C4306a(getContext(), this.f7451i);
        this.f7450h = aVar;
        aVar.mo14670s(this);
        if (this.f7453k) {
            this.f7450h.mo14668q(true);
        }
        if (this.f7454l) {
            this.f7450h.mo14669r(true);
        }
        if (bundle != null) {
            this.f7450h.onRestoreInstanceState(bundle);
        }
        this.f7450h.show();
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2220a();

        /* renamed from: g */
        Bundle f7455g;

        /* renamed from: com.coocent.colorpicker.utils.ColorPickerPreference$SavedState$a */
        class C2220a implements Parcelable.Creator<SavedState> {
            C2220a() {
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

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f7455g = parcel.readBundle();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f7455g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ColorPickerPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m10323o(context, attributeSet);
    }
}
