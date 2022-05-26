package coocent.music.player.skin.net;

import android.os.Parcel;
import android.os.Parcelable;

public class MySkinEntity implements Parcelable {
    public static final Parcelable.Creator<MySkinEntity> CREATOR = new C7113a();

    /* renamed from: g */
    private int f31391g;

    /* renamed from: h */
    private String f31392h;

    /* renamed from: i */
    private String f31393i;

    /* renamed from: j */
    private String f31394j;

    /* renamed from: k */
    private String f31395k;

    /* renamed from: l */
    private String f31396l;

    /* renamed from: m */
    private String f31397m;

    /* renamed from: coocent.music.player.skin.net.MySkinEntity$a */
    class C7113a implements Parcelable.Creator<MySkinEntity> {
        C7113a() {
        }

        /* renamed from: a */
        public MySkinEntity createFromParcel(Parcel parcel) {
            return new MySkinEntity(parcel);
        }

        /* renamed from: b */
        public MySkinEntity[] newArray(int i) {
            return new MySkinEntity[i];
        }
    }

    public MySkinEntity() {
    }

    /* renamed from: a */
    public int mo27305a() {
        return this.f31391g;
    }

    /* renamed from: b */
    public String mo27306b() {
        return this.f31394j;
    }

    /* renamed from: d */
    public String mo27307d() {
        return this.f31393i;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo27309e() {
        return this.f31392h;
    }

    /* renamed from: f */
    public String mo27310f() {
        return this.f31396l;
    }

    /* renamed from: g */
    public String mo27311g() {
        return this.f31395k;
    }

    /* renamed from: h */
    public String mo27312h() {
        return this.f31397m;
    }

    /* renamed from: i */
    public void mo27313i(int i) {
        this.f31391g = i;
    }

    /* renamed from: j */
    public void mo27314j(String str) {
        this.f31394j = str;
    }

    /* renamed from: k */
    public void mo27315k(String str) {
        this.f31393i = str;
    }

    /* renamed from: l */
    public void mo27316l(String str) {
        this.f31392h = str;
    }

    /* renamed from: m */
    public void mo27317m(String str) {
        this.f31396l = str;
    }

    /* renamed from: n */
    public void mo27318n(String str) {
        this.f31395k = str;
    }

    /* renamed from: o */
    public void mo27319o(String str) {
        this.f31397m = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f31391g);
        parcel.writeString(this.f31392h);
        parcel.writeString(this.f31393i);
        parcel.writeString(this.f31394j);
        parcel.writeString(this.f31395k);
        parcel.writeString(this.f31396l);
        parcel.writeString(this.f31397m);
    }

    public MySkinEntity(int i, String str) {
        this.f31391g = i;
        this.f31392h = str;
    }

    protected MySkinEntity(Parcel parcel) {
        this.f31391g = parcel.readInt();
        this.f31392h = parcel.readString();
        this.f31393i = parcel.readString();
        this.f31394j = parcel.readString();
        this.f31395k = parcel.readString();
        this.f31396l = parcel.readString();
        this.f31397m = parcel.readString();
    }
}
