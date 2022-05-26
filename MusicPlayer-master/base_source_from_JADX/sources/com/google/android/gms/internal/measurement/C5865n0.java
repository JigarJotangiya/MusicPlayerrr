package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* renamed from: com.google.android.gms.internal.measurement.n0 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
public final class C5865n0 extends C5838a implements C5869p0 {
    C5865n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    /* renamed from: A6 */
    public final void mo22692A6(Bundle bundle, C5873r0 r0Var, long j) throws RemoteException {
        Parcel z = mo22655z();
        C5853h0.m35033c(z, bundle);
        C5853h0.m35034d(z, r0Var);
        z.writeLong(j);
        mo22653C0(32, z);
    }

    /* renamed from: B6 */
    public final void mo22693B6(C5873r0 r0Var) throws RemoteException {
        Parcel z = mo22655z();
        C5853h0.m35034d(z, r0Var);
        mo22653C0(16, z);
    }

    /* renamed from: D3 */
    public final void mo22694D3(String str, String str2, boolean z, C5873r0 r0Var) throws RemoteException {
        Parcel z2 = mo22655z();
        z2.writeString(str);
        z2.writeString(str2);
        C5853h0.m35031a(z2, z);
        C5853h0.m35034d(z2, r0Var);
        mo22653C0(5, z2);
    }

    /* renamed from: F6 */
    public final void mo22695F6(C5873r0 r0Var) throws RemoteException {
        Parcel z = mo22655z();
        C5853h0.m35034d(z, r0Var);
        mo22653C0(19, z);
    }

    /* renamed from: G2 */
    public final void mo22696G2(C4863a aVar, long j) throws RemoteException {
        Parcel z = mo22655z();
        C5853h0.m35034d(z, aVar);
        z.writeLong(j);
        mo22653C0(26, z);
    }

    /* renamed from: I3 */
    public final void mo22697I3(String str, long j) throws RemoteException {
        Parcel z = mo22655z();
        z.writeString(str);
        z.writeLong(j);
        mo22653C0(23, z);
    }

    /* renamed from: I5 */
    public final void mo22698I5(C4863a aVar, Bundle bundle, long j) throws RemoteException {
        Parcel z = mo22655z();
        C5853h0.m35034d(z, aVar);
        C5853h0.m35033c(z, bundle);
        z.writeLong(j);
        mo22653C0(27, z);
    }

    /* renamed from: K1 */
    public final void mo22699K1(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel z3 = mo22655z();
        z3.writeString(str);
        z3.writeString(str2);
        C5853h0.m35033c(z3, bundle);
        C5853h0.m35031a(z3, z);
        C5853h0.m35031a(z3, z2);
        z3.writeLong(j);
        mo22653C0(2, z3);
    }

    /* renamed from: L1 */
    public final void mo22700L1(C4863a aVar, long j) throws RemoteException {
        Parcel z = mo22655z();
        C5853h0.m35034d(z, aVar);
        z.writeLong(j);
        mo22653C0(30, z);
    }

    /* renamed from: N0 */
    public final void mo22701N0(Bundle bundle, long j) throws RemoteException {
        Parcel z = mo22655z();
        C5853h0.m35033c(z, bundle);
        z.writeLong(j);
        mo22653C0(8, z);
    }

    /* renamed from: N6 */
    public final void mo22702N6(C5873r0 r0Var) throws RemoteException {
        Parcel z = mo22655z();
        C5853h0.m35034d(z, r0Var);
        mo22653C0(22, z);
    }

    /* renamed from: O4 */
    public final void mo22703O4(String str, String str2, C5873r0 r0Var) throws RemoteException {
        Parcel z = mo22655z();
        z.writeString(str);
        z.writeString(str2);
        C5853h0.m35034d(z, r0Var);
        mo22653C0(10, z);
    }

    /* renamed from: Q2 */
    public final void mo22704Q2(String str, String str2, C4863a aVar, boolean z, long j) throws RemoteException {
        Parcel z2 = mo22655z();
        z2.writeString(str);
        z2.writeString(str2);
        C5853h0.m35034d(z2, aVar);
        C5853h0.m35031a(z2, z);
        z2.writeLong(j);
        mo22653C0(4, z2);
    }

    /* renamed from: T3 */
    public final void mo22705T3(C5873r0 r0Var) throws RemoteException {
        Parcel z = mo22655z();
        C5853h0.m35034d(z, r0Var);
        mo22653C0(17, z);
    }

    /* renamed from: U0 */
    public final void mo22706U0(C4863a aVar, String str, String str2, long j) throws RemoteException {
        Parcel z = mo22655z();
        C5853h0.m35034d(z, aVar);
        z.writeString(str);
        z.writeString(str2);
        z.writeLong(j);
        mo22653C0(15, z);
    }

    /* renamed from: Z6 */
    public final void mo22707Z6(C4863a aVar, C5873r0 r0Var, long j) throws RemoteException {
        Parcel z = mo22655z();
        C5853h0.m35034d(z, aVar);
        C5853h0.m35034d(z, r0Var);
        z.writeLong(j);
        mo22653C0(31, z);
    }

    /* renamed from: a6 */
    public final void mo22708a6(C4863a aVar, long j) throws RemoteException {
        Parcel z = mo22655z();
        C5853h0.m35034d(z, aVar);
        z.writeLong(j);
        mo22653C0(25, z);
    }

    /* renamed from: b6 */
    public final void mo22709b6(String str, long j) throws RemoteException {
        Parcel z = mo22655z();
        z.writeString(str);
        z.writeLong(j);
        mo22653C0(24, z);
    }

    /* renamed from: c6 */
    public final void mo22710c6(C4863a aVar, long j) throws RemoteException {
        Parcel z = mo22655z();
        C5853h0.m35034d(z, aVar);
        z.writeLong(j);
        mo22653C0(29, z);
    }

    /* renamed from: g1 */
    public final void mo22711g1(int i, String str, C4863a aVar, C4863a aVar2, C4863a aVar3) throws RemoteException {
        Parcel z = mo22655z();
        z.writeInt(5);
        z.writeString(str);
        C5853h0.m35034d(z, aVar);
        C5853h0.m35034d(z, aVar2);
        C5853h0.m35034d(z, aVar3);
        mo22653C0(33, z);
    }

    /* renamed from: l5 */
    public final void mo22712l5(C5873r0 r0Var) throws RemoteException {
        Parcel z = mo22655z();
        C5853h0.m35034d(z, r0Var);
        mo22653C0(21, z);
    }

    /* renamed from: r5 */
    public final void mo22713r5(C4863a aVar, long j) throws RemoteException {
        Parcel z = mo22655z();
        C5853h0.m35034d(z, aVar);
        z.writeLong(j);
        mo22653C0(28, z);
    }

    /* renamed from: u4 */
    public final void mo22714u4(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel z = mo22655z();
        z.writeString(str);
        z.writeString(str2);
        C5853h0.m35033c(z, bundle);
        mo22653C0(9, z);
    }

    /* renamed from: v2 */
    public final void mo22715v2(String str, C5873r0 r0Var) throws RemoteException {
        Parcel z = mo22655z();
        z.writeString(str);
        C5853h0.m35034d(z, r0Var);
        mo22653C0(6, z);
    }

    /* renamed from: y5 */
    public final void mo22716y5(Bundle bundle, long j) throws RemoteException {
        Parcel z = mo22655z();
        C5853h0.m35033c(z, bundle);
        z.writeLong(j);
        mo22653C0(44, z);
    }

    /* renamed from: z6 */
    public final void mo22717z6(C4863a aVar, zzz zzz, long j) throws RemoteException {
        Parcel z = mo22655z();
        C5853h0.m35034d(z, aVar);
        C5853h0.m35033c(z, zzz);
        z.writeLong(j);
        mo22653C0(1, z);
    }
}
