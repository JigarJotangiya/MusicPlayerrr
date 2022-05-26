package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.p070b0.C2891a;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ux */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5649ux {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final HashSet<String> f24488a = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Bundle f24489b = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final HashMap<Class<? extends Object>, Object> f24490c = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final HashSet<String> f24491d = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Bundle f24492e = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final HashSet<String> f24493f = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Date f24494g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f24495h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final List<String> f24496i = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f24497j = -1;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Location f24498k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f24499l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f24500m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f24501n = -1;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f24502o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C2891a f24503p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f24504q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f24505r = 60000;

    /* renamed from: A */
    public final void mo21385A(String str) {
        this.f24491d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    @Deprecated
    /* renamed from: a */
    public final void mo21386a(Date date) {
        this.f24494g = date;
    }

    @Deprecated
    /* renamed from: b */
    public final void mo21387b(int i) {
        this.f24497j = i;
    }

    @Deprecated
    /* renamed from: c */
    public final void mo21388c(boolean z) {
        this.f24502o = z;
    }

    /* renamed from: d */
    public final void mo21389d(Location location) {
        this.f24498k = location;
    }

    @Deprecated
    /* renamed from: e */
    public final void mo21390e(boolean z) {
        this.f24501n = z ? 1 : 0;
    }

    /* renamed from: x */
    public final void mo21391x(String str) {
        this.f24488a.add(str);
    }

    /* renamed from: y */
    public final void mo21392y(Class<? extends Object> cls, Bundle bundle) {
        this.f24489b.putBundle(cls.getName(), bundle);
    }

    /* renamed from: z */
    public final void mo21393z(String str) {
        this.f24491d.add(str);
    }
}
