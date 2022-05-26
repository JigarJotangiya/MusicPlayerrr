package com.coocent.music.base.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: Genres.kt */
public final class Genres extends C2342b implements Parcelable {
    public static final Parcelable.Creator<Genres> CREATOR = new C2338a();

    /* renamed from: h */
    private long f8206h;

    /* renamed from: i */
    public String f8207i;

    /* renamed from: j */
    private int f8208j;

    /* renamed from: com.coocent.music.base.data.entity.Genres$a */
    /* compiled from: Genres.kt */
    public static final class C2338a implements Parcelable.Creator<Genres> {
        /* renamed from: a */
        public final Genres createFromParcel(Parcel parcel) {
            C8594l.m46771e(parcel, "parcel");
            return new Genres(parcel.readLong(), parcel.readString(), parcel.readInt());
        }

        /* renamed from: b */
        public final Genres[] newArray(int i) {
            return new Genres[i];
        }
    }

    public Genres(long j, String str, int i) {
        this.f8206h = j;
        this.f8207i = str;
        this.f8208j = i;
    }

    /* renamed from: d */
    public final long mo9186d() {
        return this.f8206h;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int mo9188e() {
        return this.f8208j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Genres)) {
            return false;
        }
        Genres genres = (Genres) obj;
        return this.f8206h == genres.f8206h && C8594l.m46767a(this.f8207i, genres.f8207i) && this.f8208j == genres.f8208j;
    }

    /* renamed from: f */
    public final String mo9190f() {
        String str = this.f8207i;
        return str == null ? "unKnow" : str;
    }

    /* renamed from: g */
    public final void mo9191g(long j) {
        this.f8206h = j;
    }

    /* renamed from: h */
    public final void mo9192h(int i) {
        this.f8208j = i;
    }

    public int hashCode() {
        int a = C1428c.m7501a(this.f8206h) * 31;
        String str = this.f8207i;
        return ((a + (str == null ? 0 : str.hashCode())) * 31) + this.f8208j;
    }

    public String toString() {
        return "Genres(id=" + this.f8206h + ", name=" + this.f8207i + ", musicCount=" + this.f8208j + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C8594l.m46771e(parcel, "out");
        parcel.writeLong(this.f8206h);
        parcel.writeString(this.f8207i);
        parcel.writeInt(this.f8208j);
    }

    public Genres() {
        this(0, BuildConfig.FLAVOR, 0);
    }
}
