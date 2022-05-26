package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3289k;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class Status extends AbstractSafeParcelable implements C3228l, ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<Status> CREATOR = new C3234r();
    @RecentlyNonNull

    /* renamed from: l */
    public static final Status f10315l = new Status(0);
    @RecentlyNonNull

    /* renamed from: m */
    public static final Status f10316m = new Status(15);
    @RecentlyNonNull

    /* renamed from: n */
    public static final Status f10317n = new Status(16);

    /* renamed from: g */
    final int f10318g;

    /* renamed from: h */
    private final int f10319h;

    /* renamed from: i */
    private final String f10320i;

    /* renamed from: j */
    private final PendingIntent f10321j;

    /* renamed from: k */
    private final ConnectionResult f10322k;

    public Status(int i) {
        this(i, (String) null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f10318g = i;
        this.f10319h = i2;
        this.f10320i = str;
        this.f10321j = pendingIntent;
        this.f10322k = connectionResult;
    }

    /* renamed from: A0 */
    public void mo11484A0(@RecentlyNonNull Activity activity, int i) throws IntentSender.SendIntentException {
        if (mo11494v0()) {
            PendingIntent pendingIntent = this.f10321j;
            C3292l.m14240h(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, (Intent) null, 0, 0, 0);
        }
    }

    @RecentlyNonNull
    /* renamed from: F0 */
    public final String mo11485F0() {
        String str = this.f10320i;
        return str != null ? str : C3160d.m13797a(this.f10319h);
    }

    @RecentlyNonNull
    /* renamed from: Q */
    public Status mo11486Q() {
        return this;
    }

    @RecentlyNullable
    /* renamed from: Y */
    public ConnectionResult mo11487Y() {
        return this.f10322k;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f10318g != status.f10318g || this.f10319h != status.f10319h || !C3289k.m14227a(this.f10320i, status.f10320i) || !C3289k.m14227a(this.f10321j, status.f10321j) || !C3289k.m14227a(this.f10322k, status.f10322k)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C3289k.m14228b(Integer.valueOf(this.f10318g), Integer.valueOf(this.f10319h), this.f10320i, this.f10321j, this.f10322k);
    }

    @RecentlyNullable
    /* renamed from: m0 */
    public PendingIntent mo11490m0() {
        return this.f10321j;
    }

    /* renamed from: n0 */
    public int mo11491n0() {
        return this.f10319h;
    }

    @RecentlyNullable
    /* renamed from: o0 */
    public String mo11492o0() {
        return this.f10320i;
    }

    @RecentlyNonNull
    public String toString() {
        C3289k.C3290a c = C3289k.m14229c(this);
        c.mo11856a("statusCode", mo11485F0());
        c.mo11856a("resolution", this.f10321j);
        return c.toString();
    }

    /* renamed from: v0 */
    public boolean mo11494v0() {
        return this.f10321j != null;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, mo11491n0());
        C3315b.m14322n(parcel, 2, mo11492o0(), false);
        C3315b.m14321m(parcel, 3, this.f10321j, i, false);
        C3315b.m14321m(parcel, 4, mo11487Y(), i, false);
        C3315b.m14316h(parcel, 1000, this.f10318g);
        C3315b.m14310b(parcel, a);
    }

    /* renamed from: z0 */
    public boolean mo11496z0() {
        return this.f10319h <= 0;
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this(i, i2, str, pendingIntent, (ConnectionResult) null);
    }

    public Status(int i, String str) {
        this(1, i, str, (PendingIntent) null);
    }

    public Status(@RecentlyNonNull ConnectionResult connectionResult, @RecentlyNonNull String str) {
        this(connectionResult, str, 17);
    }

    @Deprecated
    public Status(@RecentlyNonNull ConnectionResult connectionResult, @RecentlyNonNull String str, int i) {
        this(1, i, str, connectionResult.mo11447n0(), connectionResult);
    }
}
