package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C3313a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.c */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3141c implements Parcelable.Creator<GoogleSignInOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        ArrayList<Scope> arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < F) {
            int z4 = C3313a.m14308z(parcel);
            switch (C3313a.m14304v(z4)) {
                case 1:
                    i = C3313a.m14277B(parcel, z4);
                    break;
                case 2:
                    arrayList = C3313a.m14302t(parcel, z4, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) C3313a.m14297o(parcel, z4, Account.CREATOR);
                    break;
                case 4:
                    z = C3313a.m14305w(parcel, z4);
                    break;
                case 5:
                    z2 = C3313a.m14305w(parcel, z4);
                    break;
                case 6:
                    z3 = C3313a.m14305w(parcel, z4);
                    break;
                case 7:
                    str = C3313a.m14298p(parcel, z4);
                    break;
                case 8:
                    str2 = C3313a.m14298p(parcel, z4);
                    break;
                case 9:
                    arrayList2 = C3313a.m14302t(parcel, z4, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    str3 = C3313a.m14298p(parcel, z4);
                    break;
                default:
                    C3313a.m14280E(parcel, z4);
                    break;
            }
        }
        C3313a.m14303u(parcel, F);
        return new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2, str3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
