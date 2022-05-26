package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C3365j;
import java.io.DataInputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzcdo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcdo> CREATOR = new og0();

    /* renamed from: g */
    ParcelFileDescriptor f27345g;

    /* renamed from: h */
    private Parcelable f27346h = null;

    /* renamed from: i */
    private boolean f27347i = true;

    public zzcdo(ParcelFileDescriptor parcelFileDescriptor) {
        this.f27345g = parcelFileDescriptor;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: Y */
    public final <T extends SafeParcelable> T mo22569Y(Parcelable.Creator<T> creator) {
        if (this.f27347i) {
            ParcelFileDescriptor parcelFileDescriptor = this.f27345g;
            if (parcelFileDescriptor == null) {
                ul0.m31859d("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
            try {
                int readInt = dataInputStream.readInt();
                byte[] bArr = new byte[readInt];
                dataInputStream.readFully(bArr, 0, readInt);
                C3365j.m14462a(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, readInt);
                    obtain.setDataPosition(0);
                    this.f27346h = (Parcelable) creator.createFromParcel(obtain);
                    obtain.recycle();
                    this.f27347i = false;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            } catch (IOException e) {
                ul0.m31860e("Could not read from parcel file descriptor", e);
                C3365j.m14462a(dataInputStream);
                return null;
            } catch (Throwable th2) {
                C3365j.m14462a(dataInputStream);
                throw th2;
            }
        }
        return (SafeParcelable) this.f27346h;
    }

    /* JADX INFO: finally extract failed */
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.f27345g == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f27346h.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                    try {
                        hm0.f17708a.execute(new ng0(autoCloseOutputStream, marshall));
                        parcelFileDescriptor = createPipe[0];
                    } catch (IOException e) {
                        e = e;
                    }
                } catch (IOException e2) {
                    e = e2;
                    autoCloseOutputStream = null;
                    ul0.m31860e("Error transporting the ad response", e);
                    C2971s.m13213p().mo17571s(e, "LargeParcelTeleporter.pipeData.2");
                    C3365j.m14462a(autoCloseOutputStream);
                    this.f27345g = parcelFileDescriptor;
                    int a = C3315b.m14309a(parcel);
                    C3315b.m14321m(parcel, 2, this.f27345g, i, false);
                    C3315b.m14310b(parcel, a);
                }
                this.f27345g = parcelFileDescriptor;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        int a2 = C3315b.m14309a(parcel);
        C3315b.m14321m(parcel, 2, this.f27345g, i, false);
        C3315b.m14310b(parcel, a2);
    }
}
