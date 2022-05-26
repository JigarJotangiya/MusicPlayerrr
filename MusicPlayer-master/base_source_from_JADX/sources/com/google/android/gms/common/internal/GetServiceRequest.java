package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.C3237c;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3279h;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class GetServiceRequest extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new C3325x0();

    /* renamed from: g */
    final int f10538g;

    /* renamed from: h */
    final int f10539h;

    /* renamed from: i */
    int f10540i;

    /* renamed from: j */
    String f10541j;

    /* renamed from: k */
    IBinder f10542k;

    /* renamed from: l */
    Scope[] f10543l;

    /* renamed from: m */
    Bundle f10544m;

    /* renamed from: n */
    Account f10545n;

    /* renamed from: o */
    Feature[] f10546o;

    /* renamed from: p */
    Feature[] f10547p;

    /* renamed from: q */
    boolean f10548q;

    /* renamed from: r */
    int f10549r;

    /* renamed from: s */
    boolean f10550s;

    /* renamed from: t */
    private final String f10551t;

    GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4, boolean z2, String str2) {
        this.f10538g = i;
        this.f10539h = i2;
        this.f10540i = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f10541j = "com.google.android.gms";
        } else {
            this.f10541j = str;
        }
        if (i < 2) {
            this.f10545n = iBinder != null ? C3252a.m14088K0(C3279h.C3280a.m14212C0(iBinder)) : null;
        } else {
            this.f10542k = iBinder;
            this.f10545n = account;
        }
        this.f10543l = scopeArr;
        this.f10544m = bundle;
        this.f10546o = featureArr;
        this.f10547p = featureArr2;
        this.f10548q = z;
        this.f10549r = i4;
        this.f10550s = z2;
        this.f10551t = str2;
    }

    @RecentlyNullable
    /* renamed from: Y */
    public final String mo11736Y() {
        return this.f10551t;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        C3325x0.m14345a(this, parcel, i);
    }

    public GetServiceRequest(int i, String str) {
        this.f10538g = 6;
        this.f10540i = C3237c.f10485a;
        this.f10539h = i;
        this.f10548q = true;
        this.f10551t = str;
    }
}
