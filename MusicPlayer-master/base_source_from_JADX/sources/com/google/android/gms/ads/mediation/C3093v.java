package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.C3114t;
import com.google.android.gms.ads.formats.C2907b;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.mediation.v */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C3093v {

    /* renamed from: a */
    private String f10155a;

    /* renamed from: b */
    private List<C2907b> f10156b;

    /* renamed from: c */
    private String f10157c;

    /* renamed from: d */
    private C2907b f10158d;

    /* renamed from: e */
    private String f10159e;

    /* renamed from: f */
    private String f10160f;

    /* renamed from: g */
    private Double f10161g;

    /* renamed from: h */
    private String f10162h;

    /* renamed from: i */
    private String f10163i;

    /* renamed from: j */
    private C3114t f10164j;

    /* renamed from: k */
    private boolean f10165k;

    /* renamed from: l */
    private View f10166l;

    /* renamed from: m */
    private View f10167m;

    /* renamed from: n */
    private Object f10168n;

    /* renamed from: o */
    private Bundle f10169o = new Bundle();

    /* renamed from: p */
    private boolean f10170p;

    /* renamed from: q */
    private boolean f10171q;

    /* renamed from: r */
    private float f10172r;

    /* renamed from: A */
    public final void mo11237A(boolean z) {
        this.f10170p = z;
    }

    /* renamed from: B */
    public final void mo11238B(@RecentlyNonNull String str) {
        this.f10163i = str;
    }

    /* renamed from: C */
    public final void mo11239C(@RecentlyNonNull Double d) {
        this.f10161g = d;
    }

    /* renamed from: D */
    public final void mo11240D(@RecentlyNonNull String str) {
        this.f10162h = str;
    }

    /* renamed from: E */
    public abstract void mo10626E(@RecentlyNonNull View view, @RecentlyNonNull Map<String, View> map, @RecentlyNonNull Map<String, View> map2);

    /* renamed from: F */
    public void mo11241F(@RecentlyNonNull View view) {
    }

    @RecentlyNonNull
    /* renamed from: G */
    public final View mo11242G() {
        return this.f10167m;
    }

    @RecentlyNonNull
    /* renamed from: H */
    public final C3114t mo11243H() {
        return this.f10164j;
    }

    @RecentlyNonNull
    /* renamed from: I */
    public final Object mo11244I() {
        return this.f10168n;
    }

    /* renamed from: J */
    public final void mo11245J(@RecentlyNonNull Object obj) {
        this.f10168n = obj;
    }

    /* renamed from: K */
    public final void mo11246K(@RecentlyNonNull C3114t tVar) {
        this.f10164j = tVar;
    }

    @RecentlyNonNull
    /* renamed from: a */
    public View mo11247a() {
        return this.f10166l;
    }

    @RecentlyNonNull
    /* renamed from: b */
    public final String mo11248b() {
        return this.f10160f;
    }

    @RecentlyNonNull
    /* renamed from: c */
    public final String mo11249c() {
        return this.f10157c;
    }

    @RecentlyNonNull
    /* renamed from: d */
    public final String mo11250d() {
        return this.f10159e;
    }

    /* renamed from: e */
    public float mo11251e() {
        return 0.0f;
    }

    /* renamed from: f */
    public float mo11252f() {
        return 0.0f;
    }

    @RecentlyNonNull
    /* renamed from: g */
    public final Bundle mo11253g() {
        return this.f10169o;
    }

    @RecentlyNonNull
    /* renamed from: h */
    public final String mo11254h() {
        return this.f10155a;
    }

    @RecentlyNonNull
    /* renamed from: i */
    public final C2907b mo11255i() {
        return this.f10158d;
    }

    @RecentlyNonNull
    /* renamed from: j */
    public final List<C2907b> mo11256j() {
        return this.f10156b;
    }

    /* renamed from: k */
    public float mo11257k() {
        return this.f10172r;
    }

    /* renamed from: l */
    public final boolean mo11258l() {
        return this.f10171q;
    }

    /* renamed from: m */
    public final boolean mo11259m() {
        return this.f10170p;
    }

    @RecentlyNonNull
    /* renamed from: n */
    public final String mo11260n() {
        return this.f10163i;
    }

    @RecentlyNonNull
    /* renamed from: o */
    public final Double mo11261o() {
        return this.f10161g;
    }

    @RecentlyNonNull
    /* renamed from: p */
    public final String mo11262p() {
        return this.f10162h;
    }

    /* renamed from: q */
    public void mo11263q(@RecentlyNonNull View view) {
    }

    /* renamed from: r */
    public boolean mo11264r() {
        return this.f10165k;
    }

    /* renamed from: s */
    public void mo11265s() {
    }

    /* renamed from: t */
    public final void mo11266t(@RecentlyNonNull String str) {
        this.f10160f = str;
    }

    /* renamed from: u */
    public final void mo11267u(@RecentlyNonNull String str) {
        this.f10157c = str;
    }

    /* renamed from: v */
    public final void mo11268v(@RecentlyNonNull String str) {
        this.f10159e = str;
    }

    /* renamed from: w */
    public final void mo11269w(@RecentlyNonNull String str) {
        this.f10155a = str;
    }

    /* renamed from: x */
    public final void mo11270x(@RecentlyNonNull C2907b bVar) {
        this.f10158d = bVar;
    }

    /* renamed from: y */
    public final void mo11271y(@RecentlyNonNull List<C2907b> list) {
        this.f10156b = list;
    }

    /* renamed from: z */
    public final void mo11272z(boolean z) {
        this.f10171q = z;
    }
}
