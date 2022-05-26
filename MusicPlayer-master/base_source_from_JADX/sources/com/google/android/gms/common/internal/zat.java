package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new C3267d0();

    /* renamed from: g */
    final int f10679g;

    /* renamed from: h */
    private final Account f10680h;

    /* renamed from: i */
    private final int f10681i;

    /* renamed from: j */
    private final GoogleSignInAccount f10682j;

    zat(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f10679g = i;
        this.f10680h = account;
        this.f10681i = i2;
        this.f10682j = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f10679g);
        C3315b.m14321m(parcel, 2, this.f10680h, i, false);
        C3315b.m14316h(parcel, 3, this.f10681i);
        C3315b.m14321m(parcel, 4, this.f10682j, i, false);
        C3315b.m14310b(parcel, a);
    }

    public zat(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
