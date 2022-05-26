package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C3313a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.a */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3139a implements Parcelable.Creator<GoogleSignInAccount> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int F = C3313a.m14281F(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList<Scope> arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            switch (C3313a.m14304v(z)) {
                case 1:
                    i = C3313a.m14277B(parcel2, z);
                    break;
                case 2:
                    str = C3313a.m14298p(parcel2, z);
                    break;
                case 3:
                    str2 = C3313a.m14298p(parcel2, z);
                    break;
                case 4:
                    str3 = C3313a.m14298p(parcel2, z);
                    break;
                case 5:
                    str4 = C3313a.m14298p(parcel2, z);
                    break;
                case 6:
                    uri = (Uri) C3313a.m14297o(parcel2, z, Uri.CREATOR);
                    break;
                case 7:
                    str5 = C3313a.m14298p(parcel2, z);
                    break;
                case 8:
                    j = C3313a.m14278C(parcel2, z);
                    break;
                case 9:
                    str6 = C3313a.m14298p(parcel2, z);
                    break;
                case 10:
                    arrayList = C3313a.m14302t(parcel2, z, Scope.CREATOR);
                    break;
                case 11:
                    str7 = C3313a.m14298p(parcel2, z);
                    break;
                case 12:
                    str8 = C3313a.m14298p(parcel2, z);
                    break;
                default:
                    C3313a.m14280E(parcel2, z);
                    break;
            }
        }
        C3313a.m14303u(parcel2, F);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
