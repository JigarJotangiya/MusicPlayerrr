package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C3147a;
import com.google.android.gms.common.api.C3147a.C3149b;
import com.google.android.gms.common.internal.C3292l;
import p159f.p243f.p245b.p246a.p303f.C7471i;

/* renamed from: com.google.android.gms.common.api.internal.n */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C3199n<A extends C3147a.C3149b, ResultT> {

    /* renamed from: a */
    private final Feature[] f10426a;

    /* renamed from: b */
    private final boolean f10427b;

    /* renamed from: c */
    private final int f10428c;

    /* renamed from: com.google.android.gms.common.api.internal.n$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static class C3200a<A extends C3147a.C3149b, ResultT> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C3195l<A, C7471i<ResultT>> f10429a;

        /* renamed from: b */
        private boolean f10430b = true;

        /* renamed from: c */
        private Feature[] f10431c;

        /* renamed from: d */
        private int f10432d = 0;

        /* synthetic */ C3200a(C3205p0 p0Var) {
        }

        @RecentlyNonNull
        /* renamed from: a */
        public C3199n<A, ResultT> mo11610a() {
            C3292l.m14234b(this.f10429a != null, "execute parameter required");
            return new C3207q0(this, this.f10431c, this.f10430b, this.f10432d);
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C3200a<A, ResultT> mo11611b(@RecentlyNonNull C3195l<A, C7471i<ResultT>> lVar) {
            this.f10429a = lVar;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public C3200a<A, ResultT> mo11612c(boolean z) {
            this.f10430b = z;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: d */
        public C3200a<A, ResultT> mo11613d(@RecentlyNonNull Feature... featureArr) {
            this.f10431c = featureArr;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: e */
        public C3200a<A, ResultT> mo11614e(int i) {
            this.f10432d = i;
            return this;
        }
    }

    protected C3199n(Feature[] featureArr, boolean z, int i) {
        this.f10426a = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.f10427b = z2;
        this.f10428c = i;
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static <A extends C3147a.C3149b, ResultT> C3200a<A, ResultT> m13912a() {
        return new C3200a<>((C3205p0) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo11606b(@RecentlyNonNull A a, @RecentlyNonNull C7471i<ResultT> iVar) throws RemoteException;

    /* renamed from: c */
    public boolean mo11607c() {
        return this.f10427b;
    }

    @RecentlyNullable
    /* renamed from: d */
    public final Feature[] mo11608d() {
        return this.f10426a;
    }

    /* renamed from: e */
    public final int mo11609e() {
        return this.f10428c;
    }
}
