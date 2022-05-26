package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.C0620p;
import androidx.lifecycle.C0697n;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C0570a();

    /* renamed from: g */
    final int[] f2893g;

    /* renamed from: h */
    final ArrayList<String> f2894h;

    /* renamed from: i */
    final int[] f2895i;

    /* renamed from: j */
    final int[] f2896j;

    /* renamed from: k */
    final int f2897k;

    /* renamed from: l */
    final String f2898l;

    /* renamed from: m */
    final int f2899m;

    /* renamed from: n */
    final int f2900n;

    /* renamed from: o */
    final CharSequence f2901o;

    /* renamed from: p */
    final int f2902p;

    /* renamed from: q */
    final CharSequence f2903q;

    /* renamed from: r */
    final ArrayList<String> f2904r;

    /* renamed from: s */
    final ArrayList<String> f2905s;

    /* renamed from: t */
    final boolean f2906t;

    /* renamed from: androidx.fragment.app.BackStackState$a */
    static class C0570a implements Parcelable.Creator<BackStackState> {
        C0570a() {
        }

        /* renamed from: a */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        /* renamed from: b */
        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(C0583a aVar) {
        int size = aVar.f3135a.size();
        this.f2893g = new int[(size * 5)];
        if (aVar.f3141g) {
            this.f2894h = new ArrayList<>(size);
            this.f2895i = new int[size];
            this.f2896j = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C0620p.C0621a aVar2 = aVar.f3135a.get(i);
                int i3 = i2 + 1;
                this.f2893g[i2] = aVar2.f3152a;
                ArrayList<String> arrayList = this.f2894h;
                Fragment fragment = aVar2.f3153b;
                arrayList.add(fragment != null ? fragment.f2940k : null);
                int[] iArr = this.f2893g;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f3154c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f3155d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f3156e;
                iArr[i6] = aVar2.f3157f;
                this.f2895i[i] = aVar2.f3158g.ordinal();
                this.f2896j[i] = aVar2.f3159h.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.f2897k = aVar.f3140f;
            this.f2898l = aVar.f3143i;
            this.f2899m = aVar.f3024t;
            this.f2900n = aVar.f3144j;
            this.f2901o = aVar.f3145k;
            this.f2902p = aVar.f3146l;
            this.f2903q = aVar.f3147m;
            this.f2904r = aVar.f3148n;
            this.f2905s = aVar.f3149o;
            this.f2906t = aVar.f3150p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public C0583a mo3570a(C0602j jVar) {
        C0583a aVar = new C0583a(jVar);
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f2893g;
            if (i < iArr.length) {
                C0620p.C0621a aVar2 = new C0620p.C0621a();
                int i3 = i + 1;
                aVar2.f3152a = iArr[i];
                if (C0602j.m3853r0(2)) {
                    Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.f2893g[i3]);
                }
                String str = this.f2894h.get(i2);
                if (str != null) {
                    aVar2.f3153b = jVar.mo3934W(str);
                } else {
                    aVar2.f3153b = null;
                }
                aVar2.f3158g = C0697n.C0700c.values()[this.f2895i[i2]];
                aVar2.f3159h = C0697n.C0700c.values()[this.f2896j[i2]];
                int[] iArr2 = this.f2893g;
                int i4 = i3 + 1;
                int i5 = iArr2[i3];
                aVar2.f3154c = i5;
                int i6 = i4 + 1;
                int i7 = iArr2[i4];
                aVar2.f3155d = i7;
                int i8 = i6 + 1;
                int i9 = iArr2[i6];
                aVar2.f3156e = i9;
                int i10 = iArr2[i8];
                aVar2.f3157f = i10;
                aVar.f3136b = i5;
                aVar.f3137c = i7;
                aVar.f3138d = i9;
                aVar.f3139e = i10;
                aVar.mo4072f(aVar2);
                i2++;
                i = i8 + 1;
            } else {
                aVar.f3140f = this.f2897k;
                aVar.f3143i = this.f2898l;
                aVar.f3024t = this.f2899m;
                aVar.f3141g = true;
                aVar.f3144j = this.f2900n;
                aVar.f3145k = this.f2901o;
                aVar.f3146l = this.f2902p;
                aVar.f3147m = this.f2903q;
                aVar.f3148n = this.f2904r;
                aVar.f3149o = this.f2905s;
                aVar.f3150p = this.f2906t;
                aVar.mo3827w(1);
                return aVar;
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f2893g);
        parcel.writeStringList(this.f2894h);
        parcel.writeIntArray(this.f2895i);
        parcel.writeIntArray(this.f2896j);
        parcel.writeInt(this.f2897k);
        parcel.writeString(this.f2898l);
        parcel.writeInt(this.f2899m);
        parcel.writeInt(this.f2900n);
        TextUtils.writeToParcel(this.f2901o, parcel, 0);
        parcel.writeInt(this.f2902p);
        TextUtils.writeToParcel(this.f2903q, parcel, 0);
        parcel.writeStringList(this.f2904r);
        parcel.writeStringList(this.f2905s);
        parcel.writeInt(this.f2906t ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.f2893g = parcel.createIntArray();
        this.f2894h = parcel.createStringArrayList();
        this.f2895i = parcel.createIntArray();
        this.f2896j = parcel.createIntArray();
        this.f2897k = parcel.readInt();
        this.f2898l = parcel.readString();
        this.f2899m = parcel.readInt();
        this.f2900n = parcel.readInt();
        this.f2901o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2902p = parcel.readInt();
        this.f2903q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2904r = parcel.createStringArrayList();
        this.f2905s = parcel.createStringArrayList();
        this.f2906t = parcel.readInt() != 0;
    }
}
