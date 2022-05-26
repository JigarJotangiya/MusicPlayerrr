package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.internal.C3142a;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.C3147a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class GoogleSignInOptions extends AbstractSafeParcelable implements C3147a.C3151d, ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new C3141c();
    @RecentlyNonNull

    /* renamed from: q */
    public static final Scope f10263q = new Scope("profile");
    @RecentlyNonNull

    /* renamed from: r */
    public static final Scope f10264r = new Scope("openid");
    @RecentlyNonNull

    /* renamed from: s */
    public static final Scope f10265s;
    @RecentlyNonNull

    /* renamed from: t */
    public static final Scope f10266t = new Scope("https://www.googleapis.com/auth/games");

    /* renamed from: g */
    final int f10267g;

    /* renamed from: h */
    private final ArrayList<Scope> f10268h;

    /* renamed from: i */
    private Account f10269i;

    /* renamed from: j */
    private boolean f10270j;

    /* renamed from: k */
    private final boolean f10271k;

    /* renamed from: l */
    private final boolean f10272l;

    /* renamed from: m */
    private String f10273m;

    /* renamed from: n */
    private String f10274n;

    /* renamed from: o */
    private ArrayList<GoogleSignInOptionsExtensionParcelable> f10275o;

    /* renamed from: p */
    private String f10276p;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static final class C3138a {

        /* renamed from: a */
        private Set<Scope> f10277a = new HashSet();

        /* renamed from: b */
        private boolean f10278b;

        /* renamed from: c */
        private boolean f10279c;

        /* renamed from: d */
        private boolean f10280d;

        /* renamed from: e */
        private String f10281e;

        /* renamed from: f */
        private Account f10282f;

        /* renamed from: g */
        private String f10283g;

        /* renamed from: h */
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> f10284h = new HashMap();

        /* renamed from: i */
        private String f10285i;

        @RecentlyNonNull
        /* renamed from: a */
        public GoogleSignInOptions mo11426a() {
            if (this.f10277a.contains(GoogleSignInOptions.f10266t)) {
                Set<Scope> set = this.f10277a;
                Scope scope = GoogleSignInOptions.f10265s;
                if (set.contains(scope)) {
                    this.f10277a.remove(scope);
                }
            }
            if (this.f10280d && (this.f10282f == null || !this.f10277a.isEmpty())) {
                mo11427b();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f10277a), this.f10282f, this.f10280d, this.f10278b, this.f10279c, this.f10281e, this.f10283g, this.f10284h, this.f10285i, (C3140b) null);
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C3138a mo11427b() {
            this.f10277a.add(GoogleSignInOptions.f10264r);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public C3138a mo11428c() {
            this.f10277a.add(GoogleSignInOptions.f10263q);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: d */
        public C3138a mo11429d(@RecentlyNonNull Scope scope, @RecentlyNonNull Scope... scopeArr) {
            this.f10277a.add(scope);
            this.f10277a.addAll(Arrays.asList(scopeArr));
            return this;
        }
    }

    static {
        new Scope("email");
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f10265s = scope;
        C3138a aVar = new C3138a();
        aVar.mo11427b();
        aVar.mo11428c();
        aVar.mo11426a();
        C3138a aVar2 = new C3138a();
        aVar2.mo11429d(scope, new Scope[0]);
        aVar2.mo11426a();
    }

    GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2, String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, m13732F0(arrayList2), str3);
    }

    /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3, C3140b bVar) {
        this(3, (ArrayList<Scope>) arrayList, account, z, z2, z3, str, str2, (Map<Integer, GoogleSignInOptionsExtensionParcelable>) map, str3);
    }

    /* renamed from: F0 */
    private static Map<Integer, GoogleSignInOptionsExtensionParcelable> m13732F0(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable next : list) {
            hashMap.put(Integer.valueOf(next.mo11434Y()), next);
        }
        return hashMap;
    }

    /* renamed from: A0 */
    public boolean mo11415A0() {
        return this.f10271k;
    }

    @RecentlyNonNull
    /* renamed from: Y */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> mo11416Y() {
        return this.f10275o;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r1.equals(r4.mo11424x()) != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.f10275o     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 > 0) goto L_0x0090
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.f10275o     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 <= 0) goto L_0x0018
            goto L_0x0090
        L_0x0018:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f10268h     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.mo11420n0()     // Catch:{ ClassCastException -> 0x0090 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f10268h     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.mo11420n0()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0090
        L_0x0035:
            android.accounts.Account r1 = r3.f10269i     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.mo11424x()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0090
            goto L_0x004a
        L_0x0040:
            android.accounts.Account r2 = r4.mo11424x()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
        L_0x004a:
            java.lang.String r1 = r3.f10273m     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = r4.mo11421o0()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
            goto L_0x006a
        L_0x005d:
            java.lang.String r1 = r3.f10273m     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r2 = r4.mo11421o0()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x006a
            goto L_0x0090
        L_0x006a:
            boolean r1 = r3.f10272l     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo11422v0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f10270j     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo11425z0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f10271k     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo11415A0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.lang.String r1 = r3.f10276p     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r4 = r4.mo11419m0()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch:{ ClassCastException -> 0x0090 }
            if (r4 == 0) goto L_0x0090
            r4 = 1
            return r4
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f10268h;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(arrayList2.get(i).mo11479Y());
        }
        Collections.sort(arrayList);
        C3142a aVar = new C3142a();
        aVar.mo11436a(arrayList);
        aVar.mo11436a(this.f10269i);
        aVar.mo11436a(this.f10273m);
        aVar.mo11438c(this.f10272l);
        aVar.mo11438c(this.f10270j);
        aVar.mo11438c(this.f10271k);
        aVar.mo11436a(this.f10276p);
        return aVar.mo11437b();
    }

    @RecentlyNullable
    /* renamed from: m0 */
    public String mo11419m0() {
        return this.f10276p;
    }

    @RecentlyNonNull
    /* renamed from: n0 */
    public ArrayList<Scope> mo11420n0() {
        return new ArrayList<>(this.f10268h);
    }

    @RecentlyNullable
    /* renamed from: o0 */
    public String mo11421o0() {
        return this.f10273m;
    }

    /* renamed from: v0 */
    public boolean mo11422v0() {
        return this.f10272l;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f10267g);
        C3315b.m14326r(parcel, 2, mo11420n0(), false);
        C3315b.m14321m(parcel, 3, mo11424x(), i, false);
        C3315b.m14311c(parcel, 4, mo11425z0());
        C3315b.m14311c(parcel, 5, mo11415A0());
        C3315b.m14311c(parcel, 6, mo11422v0());
        C3315b.m14322n(parcel, 7, mo11421o0(), false);
        C3315b.m14322n(parcel, 8, this.f10274n, false);
        C3315b.m14326r(parcel, 9, mo11416Y(), false);
        C3315b.m14322n(parcel, 10, mo11419m0(), false);
        C3315b.m14310b(parcel, a);
    }

    @RecentlyNullable
    /* renamed from: x */
    public Account mo11424x() {
        return this.f10269i;
    }

    /* renamed from: z0 */
    public boolean mo11425z0() {
        return this.f10270j;
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map, String str3) {
        this.f10267g = i;
        this.f10268h = arrayList;
        this.f10269i = account;
        this.f10270j = z;
        this.f10271k = z2;
        this.f10272l = z3;
        this.f10273m = str;
        this.f10274n = str2;
        this.f10275o = new ArrayList<>(map.values());
        this.f10276p = str3;
    }
}
