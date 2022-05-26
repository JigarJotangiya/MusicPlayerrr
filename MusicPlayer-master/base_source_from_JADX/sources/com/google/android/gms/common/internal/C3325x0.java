package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C3313a;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* renamed from: com.google.android.gms.common.internal.x0 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3325x0 implements Parcelable.Creator<GetServiceRequest> {
    /* renamed from: a */
    static void m14345a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, getServiceRequest.f10538g);
        C3315b.m14316h(parcel, 2, getServiceRequest.f10539h);
        C3315b.m14316h(parcel, 3, getServiceRequest.f10540i);
        C3315b.m14322n(parcel, 4, getServiceRequest.f10541j, false);
        C3315b.m14315g(parcel, 5, getServiceRequest.f10542k, false);
        C3315b.m14325q(parcel, 6, getServiceRequest.f10543l, i, false);
        C3315b.m14312d(parcel, 7, getServiceRequest.f10544m, false);
        C3315b.m14321m(parcel, 8, getServiceRequest.f10545n, i, false);
        C3315b.m14325q(parcel, 10, getServiceRequest.f10546o, i, false);
        C3315b.m14325q(parcel, 11, getServiceRequest.f10547p, i, false);
        C3315b.m14311c(parcel, 12, getServiceRequest.f10548q);
        C3315b.m14316h(parcel, 13, getServiceRequest.f10549r);
        C3315b.m14311c(parcel, 14, getServiceRequest.f10550s);
        C3315b.m14322n(parcel, 15, getServiceRequest.mo11736Y(), false);
        C3315b.m14310b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int F = C3313a.m14281F(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        Feature[] featureArr = null;
        Feature[] featureArr2 = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < F) {
            int z3 = C3313a.m14308z(parcel);
            switch (C3313a.m14304v(z3)) {
                case 1:
                    i = C3313a.m14277B(parcel2, z3);
                    break;
                case 2:
                    i2 = C3313a.m14277B(parcel2, z3);
                    break;
                case 3:
                    i3 = C3313a.m14277B(parcel2, z3);
                    break;
                case 4:
                    str = C3313a.m14298p(parcel2, z3);
                    break;
                case 5:
                    iBinder = C3313a.m14276A(parcel2, z3);
                    break;
                case 6:
                    scopeArr = (Scope[]) C3313a.m14301s(parcel2, z3, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C3313a.m14288f(parcel2, z3);
                    break;
                case 8:
                    account = (Account) C3313a.m14297o(parcel2, z3, Account.CREATOR);
                    break;
                case 10:
                    featureArr = (Feature[]) C3313a.m14301s(parcel2, z3, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) C3313a.m14301s(parcel2, z3, Feature.CREATOR);
                    break;
                case 12:
                    z = C3313a.m14305w(parcel2, z3);
                    break;
                case 13:
                    i4 = C3313a.m14277B(parcel2, z3);
                    break;
                case 14:
                    z2 = C3313a.m14305w(parcel2, z3);
                    break;
                case 15:
                    str2 = C3313a.m14298p(parcel2, z3);
                    break;
                default:
                    C3313a.m14280E(parcel2, z3);
                    break;
            }
        }
        C3313a.m14303u(parcel2, F);
        return new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4, z2, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
