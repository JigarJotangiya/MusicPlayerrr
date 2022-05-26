package com.coocent.music.base.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: Folder.kt */
public final class Folder extends C2342b implements Parcelable {
    public static final Parcelable.Creator<Folder> CREATOR = new C2337a();

    /* renamed from: h */
    private long f8202h;

    /* renamed from: i */
    private String f8203i;

    /* renamed from: j */
    private String f8204j;

    /* renamed from: k */
    private int f8205k;

    /* renamed from: com.coocent.music.base.data.entity.Folder$a */
    /* compiled from: Folder.kt */
    public static final class C2337a implements Parcelable.Creator<Folder> {
        /* renamed from: a */
        public final Folder createFromParcel(Parcel parcel) {
            C8594l.m46771e(parcel, "parcel");
            return new Folder(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* renamed from: b */
        public final Folder[] newArray(int i) {
            return new Folder[i];
        }
    }

    public Folder(long j, String str, String str2, int i) {
        C8594l.m46771e(str2, "path");
        this.f8202h = j;
        this.f8203i = str;
        this.f8204j = str2;
        this.f8205k = i;
    }

    /* renamed from: d */
    public final int mo9173d() {
        return this.f8205k;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo9175e() {
        String str = this.f8203i;
        return str == null ? "unKnow" : str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Folder)) {
            return false;
        }
        Folder folder = (Folder) obj;
        return this.f8202h == folder.f8202h && C8594l.m46767a(this.f8203i, folder.f8203i) && C8594l.m46767a(this.f8204j, folder.f8204j) && this.f8205k == folder.f8205k;
    }

    /* renamed from: f */
    public final String mo9177f() {
        return this.f8204j;
    }

    /* renamed from: g */
    public final void mo9178g(int i) {
        this.f8205k = i;
    }

    public int hashCode() {
        int a = C1428c.m7501a(this.f8202h) * 31;
        String str = this.f8203i;
        return ((((a + (str == null ? 0 : str.hashCode())) * 31) + this.f8204j.hashCode()) * 31) + this.f8205k;
    }

    public String toString() {
        return "Folder(id=" + this.f8202h + ", name=" + this.f8203i + ", path=" + this.f8204j + ", musicCount=" + this.f8205k + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C8594l.m46771e(parcel, "out");
        parcel.writeLong(this.f8202h);
        parcel.writeString(this.f8203i);
        parcel.writeString(this.f8204j);
        parcel.writeInt(this.f8205k);
    }

    public Folder() {
        this(0, BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0);
    }
}
