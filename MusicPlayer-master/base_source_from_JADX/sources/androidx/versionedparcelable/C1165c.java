package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p082e.p098e.C3465a;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: androidx.versionedparcelable.c */
/* compiled from: VersionedParcelParcel */
class C1165c extends C1164b {

    /* renamed from: d */
    private final SparseIntArray f4762d;

    /* renamed from: e */
    private final Parcel f4763e;

    /* renamed from: f */
    private final int f4764f;

    /* renamed from: g */
    private final int f4765g;

    /* renamed from: h */
    private final String f4766h;

    /* renamed from: i */
    private int f4767i;

    /* renamed from: j */
    private int f4768j;

    /* renamed from: k */
    private int f4769k;

    C1165c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.FLAVOR, new C3465a(), new C3465a(), new C3465a());
    }

    /* renamed from: A */
    public void mo6142A(byte[] bArr) {
        if (bArr != null) {
            this.f4763e.writeInt(bArr.length);
            this.f4763e.writeByteArray(bArr);
            return;
        }
        this.f4763e.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo6144C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f4763e, 0);
    }

    /* renamed from: E */
    public void mo6146E(int i) {
        this.f4763e.writeInt(i);
    }

    /* renamed from: G */
    public void mo6148G(Parcelable parcelable) {
        this.f4763e.writeParcelable(parcelable, 0);
    }

    /* renamed from: I */
    public void mo6150I(String str) {
        this.f4763e.writeString(str);
    }

    /* renamed from: a */
    public void mo6155a() {
        int i = this.f4767i;
        if (i >= 0) {
            int i2 = this.f4762d.get(i);
            int dataPosition = this.f4763e.dataPosition();
            this.f4763e.setDataPosition(i2);
            this.f4763e.writeInt(dataPosition - i2);
            this.f4763e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1164b mo6156b() {
        Parcel parcel = this.f4763e;
        int dataPosition = parcel.dataPosition();
        int i = this.f4768j;
        if (i == this.f4764f) {
            i = this.f4765g;
        }
        int i2 = i;
        return new C1165c(parcel, dataPosition, i2, this.f4766h + "  ", this.f4759a, this.f4760b, this.f4761c);
    }

    /* renamed from: g */
    public boolean mo6158g() {
        return this.f4763e.readInt() != 0;
    }

    /* renamed from: i */
    public byte[] mo6160i() {
        int readInt = this.f4763e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f4763e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public CharSequence mo6162k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f4763e);
    }

    /* renamed from: m */
    public boolean mo6164m(int i) {
        while (this.f4768j < this.f4765g) {
            int i2 = this.f4769k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f4763e.setDataPosition(this.f4768j);
            int readInt = this.f4763e.readInt();
            this.f4769k = this.f4763e.readInt();
            this.f4768j += readInt;
        }
        if (this.f4769k == i) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public int mo6166o() {
        return this.f4763e.readInt();
    }

    /* renamed from: q */
    public <T extends Parcelable> T mo6168q() {
        return this.f4763e.readParcelable(C1165c.class.getClassLoader());
    }

    /* renamed from: s */
    public String mo6170s() {
        return this.f4763e.readString();
    }

    /* renamed from: w */
    public void mo6174w(int i) {
        mo6155a();
        this.f4767i = i;
        this.f4762d.put(i, this.f4763e.dataPosition());
        mo6146E(0);
        mo6146E(i);
    }

    /* renamed from: y */
    public void mo6176y(boolean z) {
        this.f4763e.writeInt(z ? 1 : 0);
    }

    private C1165c(Parcel parcel, int i, int i2, String str, C3465a<String, Method> aVar, C3465a<String, Method> aVar2, C3465a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f4762d = new SparseIntArray();
        this.f4767i = -1;
        this.f4768j = 0;
        this.f4769k = -1;
        this.f4763e = parcel;
        this.f4764f = i;
        this.f4765g = i2;
        this.f4768j = i;
        this.f4766h = str;
    }
}
