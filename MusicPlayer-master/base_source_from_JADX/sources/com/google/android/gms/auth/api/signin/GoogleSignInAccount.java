package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import com.google.android.gms.common.util.C3359d;
import com.google.android.gms.common.util.C3362g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C3139a();
    @RecentlyNonNull

    /* renamed from: t */
    public static C3359d f10249t = C3362g.m14447d();

    /* renamed from: g */
    final int f10250g;

    /* renamed from: h */
    private String f10251h;

    /* renamed from: i */
    private String f10252i;

    /* renamed from: j */
    private String f10253j;

    /* renamed from: k */
    private String f10254k;

    /* renamed from: l */
    private Uri f10255l;

    /* renamed from: m */
    private String f10256m;

    /* renamed from: n */
    private long f10257n;

    /* renamed from: o */
    private String f10258o;

    /* renamed from: p */
    List<Scope> f10259p;

    /* renamed from: q */
    private String f10260q;

    /* renamed from: r */
    private String f10261r;

    /* renamed from: s */
    private Set<Scope> f10262s = new HashSet();

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f10250g = i;
        this.f10251h = str;
        this.f10252i = str2;
        this.f10253j = str3;
        this.f10254k = str4;
        this.f10255l = uri;
        this.f10256m = str5;
        this.f10257n = j;
        this.f10258o = str6;
        this.f10259p = list;
        this.f10260q = str7;
        this.f10261r = str8;
    }

    @RecentlyNullable
    /* renamed from: L0 */
    public static GoogleSignInAccount m13720L0(String str) throws JSONException {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount N0 = m13721N0(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str2 = jSONObject.optString("serverAuthCode");
        }
        N0.f10256m = str2;
        return N0;
    }

    @RecentlyNonNull
    /* renamed from: N0 */
    public static GoogleSignInAccount m13721N0(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, @RecentlyNonNull String str7, @RecentlyNonNull Set<Scope> set) {
        long longValue = l.longValue();
        C3292l.m14237e(str7);
        C3292l.m14240h(set);
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, longValue, str7, new ArrayList(set), str5, str6);
    }

    @RecentlyNullable
    /* renamed from: A0 */
    public Uri mo11402A0() {
        return this.f10255l;
    }

    /* renamed from: F0 */
    public Set<Scope> mo11403F0() {
        HashSet hashSet = new HashSet(this.f10259p);
        hashSet.addAll(this.f10262s);
        return hashSet;
    }

    @RecentlyNullable
    /* renamed from: H0 */
    public String mo11404H0() {
        return this.f10256m;
    }

    @RecentlyNullable
    /* renamed from: Y */
    public String mo11405Y() {
        return this.f10254k;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f10258o.equals(this.f10258o) && googleSignInAccount.mo11403F0().equals(mo11403F0());
    }

    public int hashCode() {
        return ((this.f10258o.hashCode() + 527) * 31) + mo11403F0().hashCode();
    }

    @RecentlyNullable
    /* renamed from: m0 */
    public String mo11408m0() {
        return this.f10253j;
    }

    @RecentlyNullable
    /* renamed from: n0 */
    public String mo11409n0() {
        return this.f10261r;
    }

    @RecentlyNullable
    /* renamed from: o0 */
    public String mo11410o0() {
        return this.f10260q;
    }

    @RecentlyNullable
    /* renamed from: v0 */
    public String mo11411v0() {
        return this.f10251h;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f10250g);
        C3315b.m14322n(parcel, 2, mo11411v0(), false);
        C3315b.m14322n(parcel, 3, mo11414z0(), false);
        C3315b.m14322n(parcel, 4, mo11408m0(), false);
        C3315b.m14322n(parcel, 5, mo11405Y(), false);
        C3315b.m14321m(parcel, 6, mo11402A0(), i, false);
        C3315b.m14322n(parcel, 7, mo11404H0(), false);
        C3315b.m14319k(parcel, 8, this.f10257n);
        C3315b.m14322n(parcel, 9, this.f10258o, false);
        C3315b.m14326r(parcel, 10, this.f10259p, false);
        C3315b.m14322n(parcel, 11, mo11410o0(), false);
        C3315b.m14322n(parcel, 12, mo11409n0(), false);
        C3315b.m14310b(parcel, a);
    }

    @RecentlyNullable
    /* renamed from: x */
    public Account mo11413x() {
        String str = this.f10253j;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    @RecentlyNullable
    /* renamed from: z0 */
    public String mo11414z0() {
        return this.f10252i;
    }
}
