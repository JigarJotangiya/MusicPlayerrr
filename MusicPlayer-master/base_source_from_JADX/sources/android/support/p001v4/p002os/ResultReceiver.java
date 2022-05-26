package android.support.p001v4.p002os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.p001v4.p002os.C0075a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.os.ResultReceiver */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C0072a();

    /* renamed from: g */
    final boolean f199g = false;

    /* renamed from: h */
    final Handler f200h = null;

    /* renamed from: i */
    C0075a f201i;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    class C0072a implements Parcelable.Creator<ResultReceiver> {
        C0072a() {
        }

        /* renamed from: a */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        /* renamed from: b */
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    class C0073b extends C0075a.C0076a {
        C0073b() {
        }

        /* renamed from: X6 */
        public void mo378X6(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f200h;
            if (handler != null) {
                handler.post(new C0074c(i, bundle));
            } else {
                resultReceiver.mo10a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$c */
    class C0074c implements Runnable {

        /* renamed from: g */
        final int f203g;

        /* renamed from: h */
        final Bundle f204h;

        C0074c(int i, Bundle bundle) {
            this.f203g = i;
            this.f204h = bundle;
        }

        public void run() {
            ResultReceiver.this.mo10a(this.f203g, this.f204h);
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f201i = C0075a.C0076a.m445z(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10a(int i, Bundle bundle) {
    }

    /* renamed from: b */
    public void mo371b(int i, Bundle bundle) {
        if (this.f199g) {
            Handler handler = this.f200h;
            if (handler != null) {
                handler.post(new C0074c(i, bundle));
            } else {
                mo10a(i, bundle);
            }
        } else {
            C0075a aVar = this.f201i;
            if (aVar != null) {
                try {
                    aVar.mo378X6(i, bundle);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f201i == null) {
                this.f201i = new C0073b();
            }
            parcel.writeStrongBinder(this.f201i.asBinder());
        }
    }
}
