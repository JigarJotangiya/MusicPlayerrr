package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import p082e.p098e.C3478g;

public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new C6194a();

    /* renamed from: i */
    public final C3478g<String, Bundle> f28881i;

    /* renamed from: com.google.android.material.stateful.ExtendableSavedState$a */
    static class C6194a implements Parcelable.ClassLoaderCreator<ExtendableSavedState> {
        C6194a() {
        }

        /* renamed from: a */
        public ExtendableSavedState createFromParcel(Parcel parcel) {
            return new ExtendableSavedState(parcel, (ClassLoader) null, (C6194a) null);
        }

        /* renamed from: b */
        public ExtendableSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader, (C6194a) null);
        }

        /* renamed from: c */
        public ExtendableSavedState[] newArray(int i) {
            return new ExtendableSavedState[i];
        }
    }

    /* synthetic */ ExtendableSavedState(Parcel parcel, ClassLoader classLoader, C6194a aVar) {
        this(parcel, classLoader);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f28881i + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f28881i.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.f28881i.mo12395i(i2);
            bundleArr[i2] = this.f28881i.mo12397m(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f28881i = new C3478g<>();
    }

    private ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f28881i = new C3478g<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f28881i.put(strArr[i], bundleArr[i]);
        }
    }
}
