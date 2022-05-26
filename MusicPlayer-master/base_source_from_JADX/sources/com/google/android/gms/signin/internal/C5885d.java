package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import p159f.p243f.p245b.p246a.p293c.p296c.C7440b;
import p159f.p243f.p245b.p246a.p293c.p296c.C7441c;

/* renamed from: com.google.android.gms.signin.internal.d */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C5885d extends C7440b implements C5886e {
    public C5885d() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f2 */
    public final boolean mo22728f2(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) C7441c.m41831a(parcel, ConnectionResult.CREATOR);
                zaa zaa = (zaa) C7441c.m41831a(parcel, zaa.CREATOR);
                break;
            case 4:
                Status status = (Status) C7441c.m41831a(parcel, Status.CREATOR);
                break;
            case 6:
                Status status2 = (Status) C7441c.m41831a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status3 = (Status) C7441c.m41831a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) C7441c.m41831a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                mo11615M1((zak) C7441c.m41831a(parcel, zak.CREATOR));
                break;
            case 9:
                zag zag = (zag) C7441c.m41831a(parcel, zag.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
