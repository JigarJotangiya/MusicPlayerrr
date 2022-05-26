package com.coocent.videostore.p067po;

import android.os.Parcel;
import android.os.Parcelable;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.coocent.videostore.po.Video */
public class Video implements Parcelable {
    public static final Parcelable.Creator<Video> CREATOR = new C2829a();

    /* renamed from: A */
    private long f9601A;

    /* renamed from: B */
    private String f9602B;

    /* renamed from: C */
    private String f9603C;

    /* renamed from: D */
    private String f9604D;

    /* renamed from: E */
    private Boolean f9605E;

    /* renamed from: g */
    private long f9606g;

    /* renamed from: h */
    private String f9607h;

    /* renamed from: i */
    private String f9608i;

    /* renamed from: j */
    private String f9609j;

    /* renamed from: k */
    private String f9610k;

    /* renamed from: l */
    private String f9611l;

    /* renamed from: m */
    private long f9612m;

    /* renamed from: n */
    private long f9613n;

    /* renamed from: o */
    private int f9614o;

    /* renamed from: p */
    private int f9615p;

    /* renamed from: q */
    private String f9616q;

    /* renamed from: r */
    private long f9617r;

    /* renamed from: s */
    private long f9618s;

    /* renamed from: t */
    private String f9619t;

    /* renamed from: u */
    private String f9620u;

    /* renamed from: v */
    private String f9621v;

    /* renamed from: w */
    private boolean f9622w;

    /* renamed from: x */
    private long f9623x;

    /* renamed from: y */
    private int f9624y;

    /* renamed from: z */
    private int f9625z;

    /* renamed from: com.coocent.videostore.po.Video$a */
    class C2829a implements Parcelable.Creator<Video> {
        C2829a() {
        }

        /* renamed from: a */
        public Video createFromParcel(Parcel parcel) {
            return new Video(parcel);
        }

        /* renamed from: b */
        public Video[] newArray(int i) {
            return new Video[i];
        }
    }

    public Video(long j, String str, String str2, String str3, String str4, String str5, long j2, long j3, int i, int i2, String str6, long j4, long j5, String str7, String str8, boolean z) {
        this.f9621v = BuildConfig.FLAVOR;
        this.f9622w = false;
        this.f9623x = Long.MIN_VALUE;
        Boolean bool = Boolean.FALSE;
        this.f9605E = bool;
        this.f9606g = j;
        this.f9607h = str;
        this.f9608i = str2;
        this.f9609j = str3;
        this.f9610k = str4;
        this.f9611l = str5;
        this.f9612m = j2;
        this.f9613n = j3;
        this.f9614o = i;
        this.f9615p = i2;
        this.f9616q = str6;
        this.f9617r = j4;
        this.f9618s = j5;
        this.f9619t = str7;
        this.f9620u = str8;
        this.f9622w = z;
        this.f9605E = bool;
    }

    /* renamed from: A */
    public void mo10515A(int i) {
        this.f9625z = i;
    }

    /* renamed from: B */
    public void mo10516B(int i) {
        this.f9624y = i;
    }

    /* renamed from: C */
    public void mo10517C(long j) {
        this.f9618s = j;
    }

    /* renamed from: D */
    public void mo10518D(long j) {
        this.f9617r = j;
    }

    /* renamed from: F */
    public void mo10519F(String str) {
        this.f9609j = str;
    }

    /* renamed from: G */
    public void mo10520G(long j) {
        this.f9613n = j;
    }

    /* renamed from: I */
    public void mo10521I(String str) {
        this.f9611l = str;
    }

    /* renamed from: J */
    public void mo10522J(String str) {
        this.f9619t = str;
    }

    /* renamed from: L */
    public void mo10523L(String str) {
        this.f9620u = str;
    }

    /* renamed from: M */
    public void mo10524M(int i) {
        this.f9615p = i;
    }

    /* renamed from: N */
    public void mo10525N(long j) {
        this.f9606g = j;
    }

    /* renamed from: O */
    public void mo10526O(Boolean bool) {
        this.f9605E = bool;
    }

    /* renamed from: P */
    public void mo10527P(String str) {
        this.f9603C = str;
    }

    /* renamed from: Q */
    public void mo10528Q(String str) {
        this.f9602B = str;
    }

    /* renamed from: R */
    public void mo10529R(String str) {
        this.f9604D = str;
    }

    /* renamed from: S */
    public void mo10530S(long j) {
        this.f9601A = j;
    }

    /* renamed from: U */
    public void mo10531U(long j) {
        this.f9623x = j;
    }

    /* renamed from: V */
    public void mo10532V(String str) {
        this.f9616q = str;
    }

    /* renamed from: W */
    public void mo10533W(String str) {
        this.f9608i = str;
    }

    /* renamed from: X */
    public void mo10534X(boolean z) {
        this.f9622w = z;
    }

    /* renamed from: Y */
    public void mo10535Y(long j) {
        this.f9612m = j;
    }

    /* renamed from: Z */
    public void mo10536Z(String str) {
        this.f9621v = str;
    }

    /* renamed from: a */
    public int mo10537a() {
        return this.f9625z;
    }

    /* renamed from: a0 */
    public void mo10538a0(String str) {
        this.f9610k = str;
    }

    /* renamed from: b */
    public int mo10539b() {
        return this.f9624y;
    }

    /* renamed from: b0 */
    public void mo10540b0(String str) {
        this.f9607h = str;
    }

    /* renamed from: c0 */
    public void mo10541c0(int i) {
        this.f9614o = i;
    }

    /* renamed from: d */
    public long mo10542d() {
        return this.f9618s;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public long mo10544e() {
        return this.f9617r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.f9606g == ((Video) obj).f9606g) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String mo10546f() {
        return this.f9609j;
    }

    /* renamed from: g */
    public long mo10547g() {
        return this.f9613n;
    }

    /* renamed from: h */
    public String mo10548h() {
        return this.f9611l;
    }

    public int hashCode() {
        return Long.valueOf(this.f9606g).hashCode();
    }

    /* renamed from: i */
    public String mo10550i() {
        return this.f9619t;
    }

    /* renamed from: j */
    public String mo10551j() {
        return this.f9620u;
    }

    /* renamed from: k */
    public int mo10552k() {
        return this.f9615p;
    }

    /* renamed from: l */
    public long mo10553l() {
        return this.f9606g;
    }

    /* renamed from: m */
    public Boolean mo10554m() {
        return this.f9605E;
    }

    /* renamed from: n */
    public String mo10555n() {
        return this.f9603C;
    }

    /* renamed from: o */
    public String mo10556o() {
        return this.f9602B;
    }

    /* renamed from: p */
    public String mo10557p() {
        return this.f9604D;
    }

    /* renamed from: q */
    public long mo10558q() {
        return this.f9601A;
    }

    /* renamed from: r */
    public long mo10559r() {
        return this.f9623x;
    }

    /* renamed from: s */
    public String mo10560s() {
        return this.f9616q;
    }

    /* renamed from: t */
    public String mo10561t() {
        return this.f9608i;
    }

    public String toString() {
        return "Video{mId=" + this.f9606g + ", mUriString='" + this.f9607h + '\'' + ", mPath='" + this.f9608i + '\'' + ", mDisplayName='" + this.f9609j + '\'' + ", mTitle='" + this.f9610k + '\'' + ", mExtension='" + this.f9611l + '\'' + ", mSize=" + this.f9612m + ", mDuration=" + this.f9613n + ", mWidth=" + this.f9614o + ", mHeight=" + this.f9615p + ", mMimeType='" + this.f9616q + '\'' + ", mDateTaken=" + this.f9617r + ", mDateModified=" + this.f9618s + ", mFolderName='" + this.f9619t + '\'' + ", mFolderPath='" + this.f9620u + '\'' + ", mThumbnail='" + this.f9621v + '\'' + ", mRecentAdded=" + this.f9622w + ", mLastWatchTimeMs=" + this.f9623x + ", mCurrentFolderVideoCount=" + this.f9624y + ", mCurrentFolderRecentAddedVideoCount=" + this.f9625z + ", mLastPlayBackTime=" + this.f9601A + ", mLastCopyUri='" + this.f9602B + '\'' + ", mLastCopyPath='" + this.f9603C + '\'' + ", mLastDisplayName='" + this.f9604D + '\'' + ", mIsPrivateVideo=" + this.f9605E + '}';
    }

    /* renamed from: u */
    public long mo10563u() {
        return this.f9612m;
    }

    /* renamed from: v */
    public String mo10564v() {
        return this.f9621v;
    }

    /* renamed from: w */
    public String mo10565w() {
        return this.f9610k;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f9606g);
        parcel.writeString(this.f9607h);
        parcel.writeString(this.f9608i);
        parcel.writeString(this.f9609j);
        parcel.writeString(this.f9610k);
        parcel.writeString(this.f9611l);
        parcel.writeLong(this.f9612m);
        parcel.writeLong(this.f9613n);
        parcel.writeInt(this.f9614o);
        parcel.writeInt(this.f9615p);
        parcel.writeString(this.f9616q);
        parcel.writeLong(this.f9617r);
        parcel.writeLong(this.f9618s);
        parcel.writeString(this.f9619t);
        parcel.writeString(this.f9620u);
        parcel.writeString(this.f9621v);
        parcel.writeByte(this.f9622w ? (byte) 1 : 0);
        parcel.writeLong(this.f9623x);
        parcel.writeInt(this.f9624y);
        parcel.writeInt(this.f9625z);
        parcel.writeLong(this.f9601A);
        parcel.writeString(this.f9602B);
        parcel.writeString(this.f9603C);
        parcel.writeString(this.f9604D);
        if (this.f9605E == null) {
            this.f9605E = Boolean.FALSE;
        }
        try {
            parcel.writeValue(this.f9605E);
        } catch (Exception e) {
            this.f9605E = Boolean.FALSE;
            e.printStackTrace();
        }
    }

    /* renamed from: x */
    public String mo10567x() {
        return this.f9607h;
    }

    /* renamed from: y */
    public int mo10568y() {
        return this.f9614o;
    }

    /* renamed from: z */
    public boolean mo10569z() {
        return this.f9622w;
    }

    public Video() {
        this.f9621v = BuildConfig.FLAVOR;
        this.f9622w = false;
        this.f9623x = Long.MIN_VALUE;
        this.f9605E = Boolean.FALSE;
    }

    public Video(PrivateVideo privateVideo) {
        this.f9621v = BuildConfig.FLAVOR;
        this.f9622w = false;
        this.f9623x = Long.MIN_VALUE;
        this.f9605E = Boolean.FALSE;
        mo10525N(privateVideo.mo10495l());
        mo10540b0(privateVideo.mo10508x());
        mo10533W(privateVideo.mo10503t());
        mo10519F(privateVideo.mo10488f());
        mo10538a0(privateVideo.mo10506w());
        mo10521I(privateVideo.mo10490h());
        mo10535Y(privateVideo.mo10504u());
        mo10520G(privateVideo.mo10489g());
        mo10541c0(privateVideo.mo10509y());
        mo10524M(privateVideo.mo10494k());
        mo10532V(privateVideo.mo10502s());
        mo10518D(privateVideo.mo10486e());
        mo10517C(privateVideo.mo10484d());
        mo10522J(privateVideo.mo10492i());
        mo10523L(privateVideo.mo10493j());
        mo10536Z(privateVideo.mo10505v());
        mo10534X(privateVideo.mo10510z());
        mo10531U(privateVideo.mo10501r());
        mo10516B(privateVideo.mo10481b());
        mo10515A(privateVideo.mo10479a());
        mo10530S(privateVideo.mo10500q());
        mo10528Q(privateVideo.mo10498o());
        mo10527P(privateVideo.mo10497n());
        mo10529R(privateVideo.mo10499p());
        mo10526O(privateVideo.mo10496m());
    }

    protected Video(Parcel parcel) {
        this.f9621v = BuildConfig.FLAVOR;
        boolean z = false;
        this.f9622w = false;
        this.f9623x = Long.MIN_VALUE;
        Boolean bool = Boolean.FALSE;
        this.f9605E = bool;
        this.f9606g = parcel.readLong();
        this.f9607h = parcel.readString();
        this.f9608i = parcel.readString();
        this.f9609j = parcel.readString();
        this.f9610k = parcel.readString();
        this.f9611l = parcel.readString();
        this.f9612m = parcel.readLong();
        this.f9613n = parcel.readLong();
        this.f9614o = parcel.readInt();
        this.f9615p = parcel.readInt();
        this.f9616q = parcel.readString();
        this.f9617r = parcel.readLong();
        this.f9618s = parcel.readLong();
        this.f9619t = parcel.readString();
        this.f9620u = parcel.readString();
        this.f9621v = parcel.readString();
        this.f9622w = parcel.readByte() != 0 ? true : z;
        this.f9623x = parcel.readLong();
        this.f9624y = parcel.readInt();
        this.f9625z = parcel.readInt();
        this.f9601A = parcel.readLong();
        this.f9602B = parcel.readString();
        this.f9603C = parcel.readString();
        this.f9604D = parcel.readString();
        if (this.f9605E == null) {
            this.f9605E = bool;
        }
        try {
            this.f9605E = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        } catch (Exception e) {
            this.f9605E = Boolean.FALSE;
            e.printStackTrace();
        }
    }
}
