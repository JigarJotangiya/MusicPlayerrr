package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.common.internal.d0 */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3267d0 implements Parcelable.Creator<zat> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                i = C3313a.m14277B(parcel, z);
            } else if (v == 2) {
                account = (Account) C3313a.m14297o(parcel, z, Account.CREATOR);
            } else if (v == 3) {
                i2 = C3313a.m14277B(parcel, z);
            } else if (v != 4) {
                C3313a.m14280E(parcel, z);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C3313a.m14297o(parcel, z, GoogleSignInAccount.CREATOR);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zat(i, account, i2, googleSignInAccount);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zat[i];
    }
}
