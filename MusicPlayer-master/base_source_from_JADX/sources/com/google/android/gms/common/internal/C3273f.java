package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.C3147a;
import com.google.android.gms.common.api.C3164f;
import com.google.android.gms.common.api.C3165g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.C3179d;
import com.google.android.gms.common.api.internal.C3191j;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.f */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C3273f<T extends IInterface> extends C3261d<T> implements C3147a.C3156f {

    /* renamed from: E */
    private final Set<Scope> f10623E;

    /* renamed from: F */
    private final Account f10624F;

    @Deprecated
    protected C3273f(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, int i, @RecentlyNonNull C3269e eVar, @RecentlyNonNull C3164f fVar, @RecentlyNonNull C3165g gVar) {
        this(context, looper, i, eVar, (C3179d) fVar, (C3191j) gVar);
    }

    /* renamed from: j0 */
    private final Set<Scope> m14194j0(Set<Scope> set) {
        mo11834i0(set);
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: B */
    public final Set<Scope> mo11771B() {
        return this.f10623E;
    }

    /* renamed from: a */
    public Set<Scope> mo11503a() {
        return mo11802p() ? this.f10623E : Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public Set<Scope> mo11834i0(@RecentlyNonNull Set<Scope> set) {
        return set;
    }

    @RecentlyNullable
    /* renamed from: u */
    public final Account mo11807u() {
        return this.f10624F;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C3273f(@androidx.annotation.RecentlyNonNull android.content.Context r10, @androidx.annotation.RecentlyNonNull android.os.Looper r11, int r12, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.internal.C3269e r13, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.internal.C3179d r14, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.internal.C3191j r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.g r3 = com.google.android.gms.common.internal.C3276g.m14204b(r10)
            com.google.android.gms.common.b r4 = com.google.android.gms.common.C3235b.m14015l()
            com.google.android.gms.common.internal.C3292l.m14240h(r14)
            r7 = r14
            com.google.android.gms.common.api.internal.d r7 = (com.google.android.gms.common.api.internal.C3179d) r7
            com.google.android.gms.common.internal.C3292l.m14240h(r15)
            r8 = r15
            com.google.android.gms.common.api.internal.j r8 = (com.google.android.gms.common.api.internal.C3191j) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C3273f.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.e, com.google.android.gms.common.api.internal.d, com.google.android.gms.common.api.internal.j):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C3273f(@androidx.annotation.RecentlyNonNull android.content.Context r11, @androidx.annotation.RecentlyNonNull android.os.Looper r12, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.internal.C3276g r13, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.C3235b r14, int r15, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.internal.C3269e r16, com.google.android.gms.common.api.internal.C3179d r17, com.google.android.gms.common.api.internal.C3191j r18) {
        /*
            r10 = this;
            r9 = r10
            r0 = r17
            r1 = r18
            r2 = 0
            if (r0 != 0) goto L_0x000a
            r6 = r2
            goto L_0x0010
        L_0x000a:
            com.google.android.gms.common.internal.y r3 = new com.google.android.gms.common.internal.y
            r3.<init>(r0)
            r6 = r3
        L_0x0010:
            if (r1 != 0) goto L_0x0014
            r7 = r2
            goto L_0x001a
        L_0x0014:
            com.google.android.gms.common.internal.z r0 = new com.google.android.gms.common.internal.z
            r0.<init>(r1)
            r7 = r0
        L_0x001a:
            java.lang.String r8 = r16.mo11823f()
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            android.accounts.Account r0 = r16.mo11818a()
            r9.f10624F = r0
            java.util.Set r0 = r16.mo11820c()
            r10.m14194j0(r0)
            r9.f10623E = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C3273f.<init>(android.content.Context, android.os.Looper, com.google.android.gms.common.internal.g, com.google.android.gms.common.b, int, com.google.android.gms.common.internal.e, com.google.android.gms.common.api.internal.d, com.google.android.gms.common.api.internal.j):void");
    }
}
