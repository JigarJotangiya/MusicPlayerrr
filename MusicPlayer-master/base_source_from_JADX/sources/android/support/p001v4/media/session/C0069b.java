package android.support.p001v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p001v4.media.MediaDescriptionCompat;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.RatingCompat;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: android.support.v4.media.session.b */
/* compiled from: IMediaSession */
public interface C0069b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    /* compiled from: IMediaSession */
    public static abstract class C0070a extends Binder implements C0069b {

        /* renamed from: android.support.v4.media.session.b$a$a */
        /* compiled from: IMediaSession */
        private static class C0071a implements C0069b {

            /* renamed from: h */
            public static C0069b f197h;

            /* renamed from: g */
            private IBinder f198g;

            C0071a(IBinder iBinder) {
                this.f198g = iBinder;
            }

            /* renamed from: A3 */
            public boolean mo271A3(KeyEvent keyEvent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    boolean z = true;
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f198g.transact(2, obtain, obtain2, 0) && C0070a.m433C0() != null) {
                        return C0070a.m433C0().mo271A3(keyEvent);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: X0 */
            public void mo291X0(C0066a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.f198g.transact(3, obtain, obtain2, 0) || C0070a.m433C0() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C0070a.m433C0().mo291X0(aVar);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f198g;
            }

            /* renamed from: h0 */
            public MediaMetadataCompat mo299h0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f198g.transact(27, obtain, obtain2, 0) && C0070a.m433C0() != null) {
                        return C0070a.m433C0().mo299h0();
                    }
                    obtain2.readException();
                    MediaMetadataCompat createFromParcel = obtain2.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return createFromParcel;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0070a() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        /* renamed from: C0 */
        public static C0069b m433C0() {
            return C0071a.f197h;
        }

        /* renamed from: z */
        public static C0069b m434z(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0069b)) {
                return new C0071a(iBinder);
            }
            return (C0069b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.KeyEvent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: android.support.v4.media.RatingCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: android.support.v4.media.MediaDescriptionCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: android.support.v4.media.MediaDescriptionCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v37, resolved type: android.support.v4.media.MediaDescriptionCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: android.os.Bundle} */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v43 */
        /* JADX WARNING: type inference failed for: r3v44 */
        /* JADX WARNING: type inference failed for: r3v45 */
        /* JADX WARNING: type inference failed for: r3v46 */
        /* JADX WARNING: type inference failed for: r3v47 */
        /* JADX WARNING: type inference failed for: r3v48 */
        /* JADX WARNING: type inference failed for: r3v49 */
        /* JADX WARNING: type inference failed for: r3v50 */
        /* JADX WARNING: type inference failed for: r3v51 */
        /* JADX WARNING: type inference failed for: r3v52 */
        /* JADX WARNING: type inference failed for: r3v53 */
        /* JADX WARNING: type inference failed for: r3v54 */
        /* JADX WARNING: type inference failed for: r3v55 */
        /* JADX WARNING: type inference failed for: r3v56 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                if (r5 == r0) goto L_0x0413
                r0 = 0
                r3 = 0
                switch(r5) {
                    case 1: goto L_0x03e6;
                    case 2: goto L_0x03c9;
                    case 3: goto L_0x03b7;
                    case 4: goto L_0x03a5;
                    case 5: goto L_0x0397;
                    case 6: goto L_0x0389;
                    case 7: goto L_0x037b;
                    case 8: goto L_0x0364;
                    case 9: goto L_0x0356;
                    case 10: goto L_0x033f;
                    case 11: goto L_0x0329;
                    case 12: goto L_0x0313;
                    case 13: goto L_0x0309;
                    case 14: goto L_0x02ec;
                    case 15: goto L_0x02cf;
                    case 16: goto L_0x02a6;
                    case 17: goto L_0x0298;
                    case 18: goto L_0x028e;
                    case 19: goto L_0x0284;
                    case 20: goto L_0x027a;
                    case 21: goto L_0x0270;
                    case 22: goto L_0x0266;
                    case 23: goto L_0x025c;
                    case 24: goto L_0x024e;
                    case 25: goto L_0x0235;
                    case 26: goto L_0x0218;
                    case 27: goto L_0x0201;
                    case 28: goto L_0x01ea;
                    case 29: goto L_0x01dc;
                    case 30: goto L_0x01c5;
                    case 31: goto L_0x01ae;
                    case 32: goto L_0x01a0;
                    case 33: goto L_0x0196;
                    case 34: goto L_0x0179;
                    case 35: goto L_0x015c;
                    case 36: goto L_0x0133;
                    case 37: goto L_0x0125;
                    case 38: goto L_0x0117;
                    case 39: goto L_0x0109;
                    case 40: goto L_0x00f8;
                    case 41: goto L_0x00df;
                    case 42: goto L_0x00c2;
                    case 43: goto L_0x00a9;
                    case 44: goto L_0x009b;
                    case 45: goto L_0x008d;
                    case 46: goto L_0x007c;
                    case 47: goto L_0x006e;
                    case 48: goto L_0x0060;
                    case 49: goto L_0x0052;
                    case 50: goto L_0x003b;
                    case 51: goto L_0x0012;
                    default: goto L_0x000d;
                }
            L_0x000d:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0012:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0024
                android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> r5 = android.support.p001v4.media.RatingCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.support.v4.media.RatingCompat r5 = (android.support.p001v4.media.RatingCompat) r5
                goto L_0x0025
            L_0x0024:
                r5 = r3
            L_0x0025:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0034
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0034:
                r4.mo282O3(r5, r3)
                r7.writeNoException()
                return r1
            L_0x003b:
                r6.enforceInterface(r2)
                android.os.Bundle r5 = r4.mo313t2()
                r7.writeNoException()
                if (r5 == 0) goto L_0x004e
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x0051
            L_0x004e:
                r7.writeInt(r0)
            L_0x0051:
                return r1
            L_0x0052:
                r6.enforceInterface(r2)
                float r5 = r6.readFloat()
                r4.mo316v3(r5)
                r7.writeNoException()
                return r1
            L_0x0060:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.mo304l6(r5)
                r7.writeNoException()
                return r1
            L_0x006e:
                r6.enforceInterface(r2)
                int r5 = r4.mo320z4()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x007c:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0086
                r0 = 1
            L_0x0086:
                r4.mo292Z3(r0)
                r7.writeNoException()
                return r1
            L_0x008d:
                r6.enforceInterface(r2)
                boolean r5 = r4.mo276F4()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x009b:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.mo273C4(r5)
                r7.writeNoException()
                return r1
            L_0x00a9:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00bb
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.p001v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.MediaDescriptionCompat r3 = (android.support.p001v4.media.MediaDescriptionCompat) r3
            L_0x00bb:
                r4.mo308q1(r3)
                r7.writeNoException()
                return r1
            L_0x00c2:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00d4
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.p001v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.MediaDescriptionCompat r3 = (android.support.p001v4.media.MediaDescriptionCompat) r3
            L_0x00d4:
                int r5 = r6.readInt()
                r4.mo287R3(r3, r5)
                r7.writeNoException()
                return r1
            L_0x00df:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00f1
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.p001v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.MediaDescriptionCompat r3 = (android.support.p001v4.media.MediaDescriptionCompat) r3
            L_0x00f1:
                r4.mo317w1(r3)
                r7.writeNoException()
                return r1
            L_0x00f8:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0102
                r0 = 1
            L_0x0102:
                r4.mo289U5(r0)
                r7.writeNoException()
                return r1
            L_0x0109:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.mo305n5(r5)
                r7.writeNoException()
                return r1
            L_0x0117:
                r6.enforceInterface(r2)
                boolean r5 = r4.mo294d1()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0125:
                r6.enforceInterface(r2)
                int r5 = r4.mo285Q5()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0133:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0145
                android.os.Parcelable$Creator r5 = android.net.Uri.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.net.Uri r5 = (android.net.Uri) r5
                goto L_0x0146
            L_0x0145:
                r5 = r3
            L_0x0146:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0155
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0155:
                r4.mo301i1(r5, r3)
                r7.writeNoException()
                return r1
            L_0x015c:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0172
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0172:
                r4.mo275D1(r5, r3)
                r7.writeNoException()
                return r1
            L_0x0179:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x018f
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x018f:
                r4.mo310r2(r5, r3)
                r7.writeNoException()
                return r1
            L_0x0196:
                r6.enforceInterface(r2)
                r4.mo278J1()
                r7.writeNoException()
                return r1
            L_0x01a0:
                r6.enforceInterface(r2)
                int r5 = r4.mo270A1()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x01ae:
                r6.enforceInterface(r2)
                android.os.Bundle r5 = r4.getExtras()
                r7.writeNoException()
                if (r5 == 0) goto L_0x01c1
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x01c4
            L_0x01c1:
                r7.writeInt(r0)
            L_0x01c4:
                return r1
            L_0x01c5:
                r6.enforceInterface(r2)
                java.lang.CharSequence r5 = r4.mo303j2()
                r7.writeNoException()
                if (r5 == 0) goto L_0x01d8
                r7.writeInt(r1)
                android.text.TextUtils.writeToParcel(r5, r7, r1)
                goto L_0x01db
            L_0x01d8:
                r7.writeInt(r0)
            L_0x01db:
                return r1
            L_0x01dc:
                r6.enforceInterface(r2)
                java.util.List r5 = r4.mo302i5()
                r7.writeNoException()
                r7.writeTypedList(r5)
                return r1
            L_0x01ea:
                r6.enforceInterface(r2)
                android.support.v4.media.session.PlaybackStateCompat r5 = r4.mo315v0()
                r7.writeNoException()
                if (r5 == 0) goto L_0x01fd
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x0200
            L_0x01fd:
                r7.writeInt(r0)
            L_0x0200:
                return r1
            L_0x0201:
                r6.enforceInterface(r2)
                android.support.v4.media.MediaMetadataCompat r5 = r4.mo299h0()
                r7.writeNoException()
                if (r5 == 0) goto L_0x0214
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x0217
            L_0x0214:
                r7.writeInt(r0)
            L_0x0217:
                return r1
            L_0x0218:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x022e
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x022e:
                r4.mo283P0(r5, r3)
                r7.writeNoException()
                return r1
            L_0x0235:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0247
                android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> r5 = android.support.p001v4.media.RatingCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.RatingCompat r3 = (android.support.p001v4.media.RatingCompat) r3
            L_0x0247:
                r4.mo296f1(r3)
                r7.writeNoException()
                return r1
            L_0x024e:
                r6.enforceInterface(r2)
                long r5 = r6.readLong()
                r4.mo295e3(r5)
                r7.writeNoException()
                return r1
            L_0x025c:
                r6.enforceInterface(r2)
                r4.mo309q5()
                r7.writeNoException()
                return r1
            L_0x0266:
                r6.enforceInterface(r2)
                r4.mo281N2()
                r7.writeNoException()
                return r1
            L_0x0270:
                r6.enforceInterface(r2)
                r4.previous()
                r7.writeNoException()
                return r1
            L_0x027a:
                r6.enforceInterface(r2)
                r4.next()
                r7.writeNoException()
                return r1
            L_0x0284:
                r6.enforceInterface(r2)
                r4.stop()
                r7.writeNoException()
                return r1
            L_0x028e:
                r6.enforceInterface(r2)
                r4.mo284Q()
                r7.writeNoException()
                return r1
            L_0x0298:
                r6.enforceInterface(r2)
                long r5 = r6.readLong()
                r4.mo288T5(r5)
                r7.writeNoException()
                return r1
            L_0x02a6:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x02b8
                android.os.Parcelable$Creator r5 = android.net.Uri.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.net.Uri r5 = (android.net.Uri) r5
                goto L_0x02b9
            L_0x02b8:
                r5 = r3
            L_0x02b9:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x02c8
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x02c8:
                r4.mo286R2(r5, r3)
                r7.writeNoException()
                return r1
            L_0x02cf:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x02e5
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x02e5:
                r4.mo280L2(r5, r3)
                r7.writeNoException()
                return r1
            L_0x02ec:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0302
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0302:
                r4.mo272B2(r5, r3)
                r7.writeNoException()
                return r1
            L_0x0309:
                r6.enforceInterface(r2)
                r4.mo274D0()
                r7.writeNoException()
                return r1
            L_0x0313:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                java.lang.String r6 = r6.readString()
                r4.mo300h1(r5, r8, r6)
                r7.writeNoException()
                return r1
            L_0x0329:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                java.lang.String r6 = r6.readString()
                r4.mo277H3(r5, r8, r6)
                r7.writeNoException()
                return r1
            L_0x033f:
                r6.enforceInterface(r2)
                android.support.v4.media.session.ParcelableVolumeInfo r5 = r4.mo293Z5()
                r7.writeNoException()
                if (r5 == 0) goto L_0x0352
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x0355
            L_0x0352:
                r7.writeInt(r0)
            L_0x0355:
                return r1
            L_0x0356:
                r6.enforceInterface(r2)
                long r5 = r4.mo279K5()
                r7.writeNoException()
                r7.writeLong(r5)
                return r1
            L_0x0364:
                r6.enforceInterface(r2)
                android.app.PendingIntent r5 = r4.mo318y1()
                r7.writeNoException()
                if (r5 == 0) goto L_0x0377
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x037a
            L_0x0377:
                r7.writeInt(r0)
            L_0x037a:
                return r1
            L_0x037b:
                r6.enforceInterface(r2)
                java.lang.String r5 = r4.mo290W()
                r7.writeNoException()
                r7.writeString(r5)
                return r1
            L_0x0389:
                r6.enforceInterface(r2)
                java.lang.String r5 = r4.mo319y6()
                r7.writeNoException()
                r7.writeString(r5)
                return r1
            L_0x0397:
                r6.enforceInterface(r2)
                boolean r5 = r4.mo312t1()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x03a5:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.v4.media.session.a r5 = android.support.p001v4.media.session.C0066a.C0067a.m382z(r5)
                r4.mo314u2(r5)
                r7.writeNoException()
                return r1
            L_0x03b7:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.v4.media.session.a r5 = android.support.p001v4.media.session.C0066a.C0067a.m382z(r5)
                r4.mo291X0(r5)
                r7.writeNoException()
                return r1
            L_0x03c9:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x03db
                android.os.Parcelable$Creator r5 = android.view.KeyEvent.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.view.KeyEvent r3 = (android.view.KeyEvent) r3
            L_0x03db:
                boolean r5 = r4.mo271A3(r3)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x03e6:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x03fc
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.os.Bundle r8 = (android.os.Bundle) r8
                goto L_0x03fd
            L_0x03fc:
                r8 = r3
            L_0x03fd:
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x040c
                android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper> r0 = android.support.p001v4.media.session.MediaSessionCompat.ResultReceiverWrapper.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r3 = r6
                android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper r3 = (android.support.p001v4.media.session.MediaSessionCompat.ResultReceiverWrapper) r3
            L_0x040c:
                r4.mo297g5(r5, r8, r3)
                r7.writeNoException()
                return r1
            L_0x0413:
                r7.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.media.session.C0069b.C0070a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: A1 */
    int mo270A1() throws RemoteException;

    /* renamed from: A3 */
    boolean mo271A3(KeyEvent keyEvent) throws RemoteException;

    /* renamed from: B2 */
    void mo272B2(String str, Bundle bundle) throws RemoteException;

    /* renamed from: C4 */
    void mo273C4(int i) throws RemoteException;

    /* renamed from: D0 */
    void mo274D0() throws RemoteException;

    /* renamed from: D1 */
    void mo275D1(String str, Bundle bundle) throws RemoteException;

    /* renamed from: F4 */
    boolean mo276F4() throws RemoteException;

    /* renamed from: H3 */
    void mo277H3(int i, int i2, String str) throws RemoteException;

    /* renamed from: J1 */
    void mo278J1() throws RemoteException;

    /* renamed from: K5 */
    long mo279K5() throws RemoteException;

    /* renamed from: L2 */
    void mo280L2(String str, Bundle bundle) throws RemoteException;

    /* renamed from: N2 */
    void mo281N2() throws RemoteException;

    /* renamed from: O3 */
    void mo282O3(RatingCompat ratingCompat, Bundle bundle) throws RemoteException;

    /* renamed from: P0 */
    void mo283P0(String str, Bundle bundle) throws RemoteException;

    /* renamed from: Q */
    void mo284Q() throws RemoteException;

    /* renamed from: Q5 */
    int mo285Q5() throws RemoteException;

    /* renamed from: R2 */
    void mo286R2(Uri uri, Bundle bundle) throws RemoteException;

    /* renamed from: R3 */
    void mo287R3(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException;

    /* renamed from: T5 */
    void mo288T5(long j) throws RemoteException;

    /* renamed from: U5 */
    void mo289U5(boolean z) throws RemoteException;

    /* renamed from: W */
    String mo290W() throws RemoteException;

    /* renamed from: X0 */
    void mo291X0(C0066a aVar) throws RemoteException;

    /* renamed from: Z3 */
    void mo292Z3(boolean z) throws RemoteException;

    /* renamed from: Z5 */
    ParcelableVolumeInfo mo293Z5() throws RemoteException;

    /* renamed from: d1 */
    boolean mo294d1() throws RemoteException;

    /* renamed from: e3 */
    void mo295e3(long j) throws RemoteException;

    /* renamed from: f1 */
    void mo296f1(RatingCompat ratingCompat) throws RemoteException;

    /* renamed from: g5 */
    void mo297g5(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException;

    Bundle getExtras() throws RemoteException;

    /* renamed from: h0 */
    MediaMetadataCompat mo299h0() throws RemoteException;

    /* renamed from: h1 */
    void mo300h1(int i, int i2, String str) throws RemoteException;

    /* renamed from: i1 */
    void mo301i1(Uri uri, Bundle bundle) throws RemoteException;

    /* renamed from: i5 */
    List<MediaSessionCompat.QueueItem> mo302i5() throws RemoteException;

    /* renamed from: j2 */
    CharSequence mo303j2() throws RemoteException;

    /* renamed from: l6 */
    void mo304l6(int i) throws RemoteException;

    /* renamed from: n5 */
    void mo305n5(int i) throws RemoteException;

    void next() throws RemoteException;

    void previous() throws RemoteException;

    /* renamed from: q1 */
    void mo308q1(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    /* renamed from: q5 */
    void mo309q5() throws RemoteException;

    /* renamed from: r2 */
    void mo310r2(String str, Bundle bundle) throws RemoteException;

    void stop() throws RemoteException;

    /* renamed from: t1 */
    boolean mo312t1() throws RemoteException;

    /* renamed from: t2 */
    Bundle mo313t2() throws RemoteException;

    /* renamed from: u2 */
    void mo314u2(C0066a aVar) throws RemoteException;

    /* renamed from: v0 */
    PlaybackStateCompat mo315v0() throws RemoteException;

    /* renamed from: v3 */
    void mo316v3(float f) throws RemoteException;

    /* renamed from: w1 */
    void mo317w1(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    /* renamed from: y1 */
    PendingIntent mo318y1() throws RemoteException;

    /* renamed from: y6 */
    String mo319y6() throws RemoteException;

    /* renamed from: z4 */
    int mo320z4() throws RemoteException;
}
