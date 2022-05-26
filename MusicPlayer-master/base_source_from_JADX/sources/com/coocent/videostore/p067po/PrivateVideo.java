package com.coocent.videostore.p067po;

import android.os.Parcel;
import android.os.Parcelable;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

@Deprecated
/* renamed from: com.coocent.videostore.po.PrivateVideo */
public class PrivateVideo implements Parcelable {
    public static final Parcelable.Creator<PrivateVideo> CREATOR = new C2828a();

    /* renamed from: A */
    private long f9576A;

    /* renamed from: B */
    private String f9577B;

    /* renamed from: C */
    private String f9578C;

    /* renamed from: D */
    private String f9579D;

    /* renamed from: E */
    private Boolean f9580E;

    /* renamed from: g */
    private long f9581g;

    /* renamed from: h */
    private String f9582h;

    /* renamed from: i */
    private String f9583i;

    /* renamed from: j */
    private String f9584j;

    /* renamed from: k */
    private String f9585k;

    /* renamed from: l */
    private String f9586l;

    /* renamed from: m */
    private long f9587m;

    /* renamed from: n */
    private long f9588n;

    /* renamed from: o */
    private int f9589o;

    /* renamed from: p */
    private int f9590p;

    /* renamed from: q */
    private String f9591q;

    /* renamed from: r */
    private long f9592r;

    /* renamed from: s */
    private long f9593s;

    /* renamed from: t */
    private String f9594t;

    /* renamed from: u */
    private String f9595u;

    /* renamed from: v */
    private String f9596v;

    /* renamed from: w */
    private boolean f9597w;

    /* renamed from: x */
    private long f9598x;

    /* renamed from: y */
    private int f9599y;

    /* renamed from: z */
    private int f9600z;

    /* renamed from: com.coocent.videostore.po.PrivateVideo$a */
    class C2828a implements Parcelable.Creator<PrivateVideo> {
        C2828a() {
        }

        /* renamed from: a */
        public PrivateVideo createFromParcel(Parcel parcel) {
            return new PrivateVideo(parcel);
        }

        /* renamed from: b */
        public PrivateVideo[] newArray(int i) {
            return new PrivateVideo[i];
        }
    }

    public PrivateVideo() {
        this.f9596v = BuildConfig.FLAVOR;
        this.f9597w = false;
        this.f9598x = Long.MIN_VALUE;
    }

    /* renamed from: A */
    public void mo10457A(int i) {
        this.f9600z = i;
    }

    /* renamed from: B */
    public void mo10458B(int i) {
        this.f9599y = i;
    }

    /* renamed from: C */
    public void mo10459C(long j) {
        this.f9593s = j;
    }

    /* renamed from: D */
    public void mo10460D(long j) {
        this.f9592r = j;
    }

    /* renamed from: F */
    public void mo10461F(String str) {
        this.f9584j = str;
    }

    /* renamed from: G */
    public void mo10462G(long j) {
        this.f9588n = j;
    }

    /* renamed from: I */
    public void mo10463I(String str) {
        this.f9586l = str;
    }

    /* renamed from: J */
    public void mo10464J(String str) {
        this.f9594t = str;
    }

    /* renamed from: L */
    public void mo10465L(String str) {
        this.f9595u = str;
    }

    /* renamed from: M */
    public void mo10466M(int i) {
        this.f9590p = i;
    }

    /* renamed from: N */
    public void mo10467N(long j) {
        this.f9581g = j;
    }

    /* renamed from: O */
    public void mo10468O(Boolean bool) {
        this.f9580E = bool;
    }

    /* renamed from: P */
    public void mo10469P(String str) {
        this.f9578C = str;
    }

    /* renamed from: Q */
    public void mo10470Q(String str) {
        this.f9577B = str;
    }

    /* renamed from: R */
    public void mo10471R(String str) {
        this.f9579D = str;
    }

    /* renamed from: S */
    public void mo10472S(long j) {
        this.f9576A = j;
    }

    /* renamed from: U */
    public void mo10473U(long j) {
        this.f9598x = j;
    }

    /* renamed from: V */
    public void mo10474V(String str) {
        this.f9591q = str;
    }

    /* renamed from: W */
    public void mo10475W(String str) {
        this.f9583i = str;
    }

    /* renamed from: X */
    public void mo10476X(boolean z) {
        this.f9597w = z;
    }

    /* renamed from: Y */
    public void mo10477Y(long j) {
        this.f9587m = j;
    }

    /* renamed from: Z */
    public void mo10478Z(String str) {
        this.f9596v = str;
    }

    /* renamed from: a */
    public int mo10479a() {
        return this.f9600z;
    }

    /* renamed from: a0 */
    public void mo10480a0(String str) {
        this.f9585k = str;
    }

    /* renamed from: b */
    public int mo10481b() {
        return this.f9599y;
    }

    /* renamed from: b0 */
    public void mo10482b0(String str) {
        this.f9582h = str;
    }

    /* renamed from: c0 */
    public void mo10483c0(int i) {
        this.f9589o = i;
    }

    /* renamed from: d */
    public long mo10484d() {
        return this.f9593s;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public long mo10486e() {
        return this.f9592r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.f9581g == ((PrivateVideo) obj).f9581g) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String mo10488f() {
        return this.f9584j;
    }

    /* renamed from: g */
    public long mo10489g() {
        return this.f9588n;
    }

    /* renamed from: h */
    public String mo10490h() {
        return this.f9586l;
    }

    public int hashCode() {
        return Long.valueOf(this.f9581g).hashCode();
    }

    /* renamed from: i */
    public String mo10492i() {
        return this.f9594t;
    }

    /* renamed from: j */
    public String mo10493j() {
        return this.f9595u;
    }

    /* renamed from: k */
    public int mo10494k() {
        return this.f9590p;
    }

    /* renamed from: l */
    public long mo10495l() {
        return this.f9581g;
    }

    /* renamed from: m */
    public Boolean mo10496m() {
        return this.f9580E;
    }

    /* renamed from: n */
    public String mo10497n() {
        return this.f9578C;
    }

    /* renamed from: o */
    public String mo10498o() {
        return this.f9577B;
    }

    /* renamed from: p */
    public String mo10499p() {
        return this.f9579D;
    }

    /* renamed from: q */
    public long mo10500q() {
        return this.f9576A;
    }

    /* renamed from: r */
    public long mo10501r() {
        return this.f9598x;
    }

    /* renamed from: s */
    public String mo10502s() {
        return this.f9591q;
    }

    /* renamed from: t */
    public String mo10503t() {
        return this.f9583i;
    }

    /* renamed from: u */
    public long mo10504u() {
        return this.f9587m;
    }

    /* renamed from: v */
    public String mo10505v() {
        return this.f9596v;
    }

    /* renamed from: w */
    public String mo10506w() {
        return this.f9585k;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f9581g);
        parcel.writeString(this.f9582h);
        parcel.writeString(this.f9583i);
        parcel.writeString(this.f9584j);
        parcel.writeString(this.f9585k);
        parcel.writeString(this.f9586l);
        parcel.writeLong(this.f9587m);
        parcel.writeLong(this.f9588n);
        parcel.writeInt(this.f9589o);
        parcel.writeInt(this.f9590p);
        parcel.writeString(this.f9591q);
        parcel.writeLong(this.f9592r);
        parcel.writeLong(this.f9593s);
        parcel.writeString(this.f9594t);
        parcel.writeString(this.f9595u);
        parcel.writeString(this.f9596v);
        parcel.writeByte(this.f9597w ? (byte) 1 : 0);
        parcel.writeLong(this.f9598x);
        parcel.writeInt(this.f9599y);
        parcel.writeInt(this.f9600z);
        parcel.writeLong(this.f9576A);
        parcel.writeString(this.f9577B);
        parcel.writeString(this.f9578C);
        parcel.writeString(this.f9579D);
        if (this.f9580E == null) {
            this.f9580E = Boolean.FALSE;
        }
        try {
            parcel.writeValue(this.f9580E);
        } catch (Exception e) {
            this.f9580E = Boolean.FALSE;
            e.printStackTrace();
        }
    }

    /* renamed from: x */
    public String mo10508x() {
        return this.f9582h;
    }

    /* renamed from: y */
    public int mo10509y() {
        return this.f9589o;
    }

    /* renamed from: z */
    public boolean mo10510z() {
        return this.f9597w;
    }

    protected PrivateVideo(Parcel parcel) {
        this.f9596v = BuildConfig.FLAVOR;
        boolean z = false;
        this.f9597w = false;
        this.f9598x = Long.MIN_VALUE;
        this.f9581g = parcel.readLong();
        this.f9582h = parcel.readString();
        this.f9583i = parcel.readString();
        this.f9584j = parcel.readString();
        this.f9585k = parcel.readString();
        this.f9586l = parcel.readString();
        this.f9587m = parcel.readLong();
        this.f9588n = parcel.readLong();
        this.f9589o = parcel.readInt();
        this.f9590p = parcel.readInt();
        this.f9591q = parcel.readString();
        this.f9592r = parcel.readLong();
        this.f9593s = parcel.readLong();
        this.f9594t = parcel.readString();
        this.f9595u = parcel.readString();
        this.f9596v = parcel.readString();
        this.f9597w = parcel.readByte() != 0 ? true : z;
        this.f9598x = parcel.readLong();
        this.f9599y = parcel.readInt();
        this.f9600z = parcel.readInt();
        this.f9576A = parcel.readLong();
        this.f9577B = parcel.readString();
        this.f9578C = parcel.readString();
        this.f9579D = parcel.readString();
        if (this.f9580E == null) {
            this.f9580E = Boolean.FALSE;
        }
        try {
            this.f9580E = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        } catch (Exception e) {
            this.f9580E = Boolean.FALSE;
            e.printStackTrace();
        }
    }
}
