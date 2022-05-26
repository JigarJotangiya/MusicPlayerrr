package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C3289k;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class ConnectionResult extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new C3336n();
    @RecentlyNonNull

    /* renamed from: k */
    public static final ConnectionResult f10295k = new ConnectionResult(0);

    /* renamed from: g */
    final int f10296g;

    /* renamed from: h */
    private final int f10297h;

    /* renamed from: i */
    private final PendingIntent f10298i;

    /* renamed from: j */
    private final String f10299j;

    public ConnectionResult(int i) {
        this(i, (PendingIntent) null, (String) null);
    }

    ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f10296g = i;
        this.f10297h = i2;
        this.f10298i = pendingIntent;
        this.f10299j = str;
    }

    /* renamed from: z0 */
    static String m13753z0(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    /* renamed from: Y */
    public int mo11443Y() {
        return this.f10297h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f10297h == connectionResult.f10297h && C3289k.m14227a(this.f10298i, connectionResult.f10298i) && C3289k.m14227a(this.f10299j, connectionResult.f10299j);
    }

    public int hashCode() {
        return C3289k.m14228b(Integer.valueOf(this.f10297h), this.f10298i, this.f10299j);
    }

    @RecentlyNullable
    /* renamed from: m0 */
    public String mo11446m0() {
        return this.f10299j;
    }

    @RecentlyNullable
    /* renamed from: n0 */
    public PendingIntent mo11447n0() {
        return this.f10298i;
    }

    /* renamed from: o0 */
    public boolean mo11448o0() {
        return (this.f10297h == 0 || this.f10298i == null) ? false : true;
    }

    @RecentlyNonNull
    public String toString() {
        C3289k.C3290a c = C3289k.m14229c(this);
        c.mo11856a("statusCode", m13753z0(this.f10297h));
        c.mo11856a("resolution", this.f10298i);
        c.mo11856a("message", this.f10299j);
        return c.toString();
    }

    /* renamed from: v0 */
    public boolean mo11450v0() {
        return this.f10297h == 0;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f10296g);
        C3315b.m14316h(parcel, 2, mo11443Y());
        C3315b.m14321m(parcel, 3, mo11447n0(), i, false);
        C3315b.m14322n(parcel, 4, mo11446m0(), false);
        C3315b.m14310b(parcel, a);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (String) null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}
