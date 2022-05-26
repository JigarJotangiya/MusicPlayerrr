package com.google.android.gms.ads;

import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.ads.r */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class C3110r {
    @RecentlyNonNull

    /* renamed from: e */
    public static final List<String> f10196e = Arrays.asList(new String[]{"MA", "T", "PG", "G"});

    /* renamed from: a */
    private final int f10197a;

    /* renamed from: b */
    private final int f10198b;

    /* renamed from: c */
    private final String f10199c;

    /* renamed from: d */
    private final List<String> f10200d;

    /* renamed from: com.google.android.gms.ads.r$a */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public static class C3111a {

        /* renamed from: a */
        private int f10201a = -1;

        /* renamed from: b */
        private int f10202b = -1;

        /* renamed from: c */
        private String f10203c = null;

        /* renamed from: d */
        private final List<String> f10204d = new ArrayList();

        @RecentlyNonNull
        /* renamed from: a */
        public C3110r mo11344a() {
            return new C3110r(this.f10201a, this.f10202b, this.f10203c, this.f10204d, (C2905f0) null);
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C3111a mo11345b(List<String> list) {
            this.f10204d.clear();
            if (list != null) {
                this.f10204d.addAll(list);
            }
            return this;
        }
    }

    /* synthetic */ C3110r(int i, int i2, String str, List list, C2905f0 f0Var) {
        this.f10197a = i;
        this.f10198b = i2;
        this.f10199c = str;
        this.f10200d = list;
    }

    @RecentlyNonNull
    /* renamed from: a */
    public String mo11340a() {
        String str = this.f10199c;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    /* renamed from: b */
    public int mo11341b() {
        return this.f10197a;
    }

    /* renamed from: c */
    public int mo11342c() {
        return this.f10198b;
    }

    @RecentlyNonNull
    /* renamed from: d */
    public List<String> mo11343d() {
        return new ArrayList(this.f10200d);
    }
}
