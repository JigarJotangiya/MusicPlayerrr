package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C0580a();

    /* renamed from: g */
    final String f2997g;

    /* renamed from: h */
    final String f2998h;

    /* renamed from: i */
    final boolean f2999i;

    /* renamed from: j */
    final int f3000j;

    /* renamed from: k */
    final int f3001k;

    /* renamed from: l */
    final String f3002l;

    /* renamed from: m */
    final boolean f3003m;

    /* renamed from: n */
    final boolean f3004n;

    /* renamed from: o */
    final boolean f3005o;

    /* renamed from: p */
    final Bundle f3006p;

    /* renamed from: q */
    final boolean f3007q;

    /* renamed from: r */
    final int f3008r;

    /* renamed from: s */
    Bundle f3009s;

    /* renamed from: androidx.fragment.app.FragmentState$a */
    static class C0580a implements Parcelable.Creator<FragmentState> {
        C0580a() {
        }

        /* renamed from: a */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        /* renamed from: b */
        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    FragmentState(Fragment fragment) {
        this.f2997g = fragment.getClass().getName();
        this.f2998h = fragment.f2940k;
        this.f2999i = fragment.f2948s;
        this.f3000j = fragment.f2909B;
        this.f3001k = fragment.f2910C;
        this.f3002l = fragment.f2911D;
        this.f3003m = fragment.f2914G;
        this.f3004n = fragment.f2947r;
        this.f3005o = fragment.f2913F;
        this.f3006p = fragment.f2941l;
        this.f3007q = fragment.f2912E;
        this.f3008r = fragment.f2929V.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2997g);
        sb.append(" (");
        sb.append(this.f2998h);
        sb.append(")}:");
        if (this.f2999i) {
            sb.append(" fromLayout");
        }
        if (this.f3001k != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3001k));
        }
        String str = this.f3002l;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f3002l);
        }
        if (this.f3003m) {
            sb.append(" retainInstance");
        }
        if (this.f3004n) {
            sb.append(" removing");
        }
        if (this.f3005o) {
            sb.append(" detached");
        }
        if (this.f3007q) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2997g);
        parcel.writeString(this.f2998h);
        parcel.writeInt(this.f2999i ? 1 : 0);
        parcel.writeInt(this.f3000j);
        parcel.writeInt(this.f3001k);
        parcel.writeString(this.f3002l);
        parcel.writeInt(this.f3003m ? 1 : 0);
        parcel.writeInt(this.f3004n ? 1 : 0);
        parcel.writeInt(this.f3005o ? 1 : 0);
        parcel.writeBundle(this.f3006p);
        parcel.writeInt(this.f3007q ? 1 : 0);
        parcel.writeBundle(this.f3009s);
        parcel.writeInt(this.f3008r);
    }

    FragmentState(Parcel parcel) {
        this.f2997g = parcel.readString();
        this.f2998h = parcel.readString();
        boolean z = true;
        this.f2999i = parcel.readInt() != 0;
        this.f3000j = parcel.readInt();
        this.f3001k = parcel.readInt();
        this.f3002l = parcel.readString();
        this.f3003m = parcel.readInt() != 0;
        this.f3004n = parcel.readInt() != 0;
        this.f3005o = parcel.readInt() != 0;
        this.f3006p = parcel.readBundle();
        this.f3007q = parcel.readInt() == 0 ? false : z;
        this.f3009s = parcel.readBundle();
        this.f3008r = parcel.readInt();
    }
}
