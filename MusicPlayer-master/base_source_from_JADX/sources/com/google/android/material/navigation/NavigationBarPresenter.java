package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.C0171g;
import androidx.appcompat.view.menu.C0175i;
import androidx.appcompat.view.menu.C0186m;
import androidx.appcompat.view.menu.C0195r;
import com.google.android.material.badge.C5908a;
import com.google.android.material.internal.ParcelableSparseArray;

public class NavigationBarPresenter implements C0186m {

    /* renamed from: g */
    private C0171g f28555g;

    /* renamed from: h */
    private C6119c f28556h;

    /* renamed from: i */
    private boolean f28557i = false;

    /* renamed from: j */
    private int f28558j;

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6106a();

        /* renamed from: g */
        int f28559g;

        /* renamed from: h */
        ParcelableSparseArray f28560h;

        /* renamed from: com.google.android.material.navigation.NavigationBarPresenter$SavedState$a */
        static class C6106a implements Parcelable.Creator<SavedState> {
            C6106a() {
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

        SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f28559g);
            parcel.writeParcelable(this.f28560h, 0);
        }

        SavedState(Parcel parcel) {
            this.f28559g = parcel.readInt();
            this.f28560h = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    /* renamed from: D */
    public int mo814D() {
        return this.f28558j;
    }

    /* renamed from: E */
    public void mo815E(boolean z) {
        if (!this.f28557i) {
            if (z) {
                this.f28556h.mo24352d();
            } else {
                this.f28556h.mo24369k();
            }
        }
    }

    /* renamed from: F */
    public boolean mo836F() {
        return false;
    }

    /* renamed from: G */
    public boolean mo816G(C0171g gVar, C0175i iVar) {
        return false;
    }

    /* renamed from: H */
    public boolean mo817H(C0171g gVar, C0175i iVar) {
        return false;
    }

    /* renamed from: J */
    public void mo819J(Context context, C0171g gVar) {
        this.f28555g = gVar;
        this.f28556h.mo741b(gVar);
    }

    /* renamed from: K */
    public void mo837K(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f28556h.mo24368j(savedState.f28559g);
            this.f28556h.setBadgeDrawables(C5908a.m35359b(this.f28556h.getContext(), savedState.f28560h));
        }
    }

    /* renamed from: L */
    public boolean mo820L(C0195r rVar) {
        return false;
    }

    /* renamed from: M */
    public Parcelable mo838M() {
        SavedState savedState = new SavedState();
        savedState.f28559g = this.f28556h.getSelectedItemId();
        savedState.f28560h = C5908a.m35360c(this.f28556h.getBadgeDrawables());
        return savedState;
    }

    /* renamed from: a */
    public void mo24240a(int i) {
        this.f28558j = i;
    }

    /* renamed from: b */
    public void mo24241b(C6119c cVar) {
        this.f28556h = cVar;
    }

    /* renamed from: c */
    public void mo822c(C0171g gVar, boolean z) {
    }

    /* renamed from: d */
    public void mo24242d(boolean z) {
        this.f28557i = z;
    }
}
