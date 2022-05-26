package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.customview.view.AbsSavedState;
import p082e.p083a.C3400a;
import p082e.p109h.p119p.C3704a;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: l */
    private static final int[] f28370l = {16842912};

    /* renamed from: i */
    private boolean f28371i;

    /* renamed from: j */
    private boolean f28372j;

    /* renamed from: k */
    private boolean f28373k;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6054a();

        /* renamed from: i */
        boolean f28374i;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$SavedState$a */
        static class C6054a implements Parcelable.ClassLoaderCreator<SavedState> {
            C6054a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m36352b(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f28374i = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f28374i ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m36352b(parcel);
        }
    }

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    class C6055a extends C3704a {
        C6055a() {
        }

        /* renamed from: f */
        public void mo3426f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3426f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        /* renamed from: g */
        public void mo3427g(View view, C3736c cVar) {
            super.mo3427g(view, cVar);
            cVar.mo13110a0(CheckableImageButton.this.mo24033a());
            cVar.mo13112b0(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public boolean mo24033a() {
        return this.f28372j;
    }

    public boolean isChecked() {
        return this.f28371i;
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.f28371i) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = f28370l;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3471a());
        setChecked(savedState.f28374i);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f28374i = this.f28371i;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.f28372j != z) {
            this.f28372j = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.f28372j && this.f28371i != z) {
            this.f28371i = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.f28373k = z;
    }

    public void setPressed(boolean z) {
        if (this.f28373k) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.f28371i);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3400a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28372j = true;
        this.f28373k = true;
        C3774v.m16217o0(this, new C6055a());
    }
}
