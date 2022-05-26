package p159f.p243f.p244a;

import androidx.annotation.RecentlyNonNull;

/* renamed from: f.f.a.a */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public enum C4856a {
    INVALID_REQUEST("Invalid Ad request."),
    NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
    NETWORK_ERROR("A network error occurred."),
    INTERNAL_ERROR("There was an internal error.");
    
    private final String zzb;

    private C4856a(String str) {
        this.zzb = str;
    }

    @RecentlyNonNull
    public String toString() {
        return this.zzb;
    }
}
