package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C3289k;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class WebImage extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<WebImage> CREATOR = new C3251d();

    /* renamed from: g */
    final int f10517g;

    /* renamed from: h */
    private final Uri f10518h;

    /* renamed from: i */
    private final int f10519i;

    /* renamed from: j */
    private final int f10520j;

    WebImage(int i, Uri uri, int i2, int i3) {
        this.f10517g = i;
        this.f10518h = uri;
        this.f10519i = i2;
        this.f10520j = i3;
    }

    /* renamed from: Y */
    public int mo11709Y() {
        return this.f10520j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            return C3289k.m14227a(this.f10518h, webImage.f10518h) && this.f10519i == webImage.f10519i && this.f10520j == webImage.f10520j;
        }
    }

    public int hashCode() {
        return C3289k.m14228b(this.f10518h, Integer.valueOf(this.f10519i), Integer.valueOf(this.f10520j));
    }

    @RecentlyNonNull
    /* renamed from: m0 */
    public Uri mo11712m0() {
        return this.f10518h;
    }

    /* renamed from: n0 */
    public int mo11713n0() {
        return this.f10519i;
    }

    @RecentlyNonNull
    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.f10519i), Integer.valueOf(this.f10520j), this.f10518h.toString()});
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f10517g);
        C3315b.m14321m(parcel, 2, mo11712m0(), i, false);
        C3315b.m14316h(parcel, 3, mo11713n0());
        C3315b.m14316h(parcel, 4, mo11709Y());
        C3315b.m14310b(parcel, a);
    }

    public WebImage(@RecentlyNonNull Uri uri, int i, int i2) throws IllegalArgumentException {
        this(1, uri, i, i2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WebImage(@androidx.annotation.RecentlyNonNull org.json.JSONObject r5) throws java.lang.IllegalArgumentException {
        /*
            r4 = this;
            android.net.Uri r0 = android.net.Uri.EMPTY
            java.lang.String r1 = "url"
            boolean r2 = r5.has(r1)
            if (r2 == 0) goto L_0x0012
            java.lang.String r1 = r5.getString(r1)     // Catch:{ JSONException -> 0x0012 }
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch:{ JSONException -> 0x0012 }
        L_0x0012:
            java.lang.String r1 = "width"
            r2 = 0
            int r1 = r5.optInt(r1, r2)
            java.lang.String r3 = "height"
            int r5 = r5.optInt(r3, r2)
            r4.<init>(r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.WebImage.<init>(org.json.JSONObject):void");
    }
}
