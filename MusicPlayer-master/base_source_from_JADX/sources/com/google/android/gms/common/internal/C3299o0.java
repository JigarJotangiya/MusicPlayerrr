package com.google.android.gms.common.internal;

import android.os.Looper;
import android.os.Message;
import p159f.p243f.p245b.p246a.p293c.p297d.C7448d;

/* renamed from: com.google.android.gms.common.internal.o0 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C3299o0 extends C7448d {

    /* renamed from: a */
    final /* synthetic */ C3261d f10645a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3299o0(C3261d dVar, Looper looper) {
        super(looper);
        this.f10645a = dVar;
    }

    /* renamed from: a */
    private static final void m14251a(Message message) {
        C3302p0 p0Var = (C3302p0) message.obj;
        p0Var.mo11844a();
        p0Var.mo11871d();
    }

    /* renamed from: b */
    private static final boolean m14252b(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            com.google.android.gms.common.internal.d r0 = r7.f10645a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f10586C
            int r0 = r0.get()
            int r1 = r8.arg1
            if (r0 == r1) goto L_0x0016
            boolean r0 = m14252b(r8)
            if (r0 == 0) goto L_0x0015
            m14251a(r8)
        L_0x0015:
            return
        L_0x0016:
            int r0 = r8.what
            r1 = 4
            r2 = 1
            r3 = 5
            if (r0 == r2) goto L_0x002e
            r4 = 7
            if (r0 == r4) goto L_0x002e
            if (r0 != r1) goto L_0x002a
            com.google.android.gms.common.internal.d r0 = r7.f10645a
            boolean r0 = r0.mo11806t()
            if (r0 == 0) goto L_0x002e
        L_0x002a:
            int r0 = r8.what
            if (r0 != r3) goto L_0x0036
        L_0x002e:
            com.google.android.gms.common.internal.d r0 = r7.f10645a
            boolean r0 = r0.mo11793e()
            if (r0 == 0) goto L_0x012a
        L_0x0036:
            int r0 = r8.what
            r4 = 8
            r5 = 3
            r6 = 0
            if (r0 != r1) goto L_0x0082
            com.google.android.gms.common.internal.d r0 = r7.f10645a
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            int r8 = r8.arg2
            r1.<init>(r8)
            com.google.android.gms.common.ConnectionResult unused = r0.f10606z = r1
            com.google.android.gms.common.internal.d r8 = r7.f10645a
            boolean r8 = com.google.android.gms.common.internal.C3261d.m14118Y(r8)
            if (r8 == 0) goto L_0x0061
            com.google.android.gms.common.internal.d r8 = r7.f10645a
            boolean r8 = r8.f10584A
            if (r8 == 0) goto L_0x005b
            goto L_0x0061
        L_0x005b:
            com.google.android.gms.common.internal.d r8 = r7.f10645a
            r8.m14127h0(r5, null)
            return
        L_0x0061:
            com.google.android.gms.common.internal.d r8 = r7.f10645a
            com.google.android.gms.common.ConnectionResult r8 = r8.f10606z
            if (r8 == 0) goto L_0x0070
            com.google.android.gms.common.internal.d r8 = r7.f10645a
            com.google.android.gms.common.ConnectionResult r8 = r8.f10606z
            goto L_0x0075
        L_0x0070:
            com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
            r8.<init>(r4)
        L_0x0075:
            com.google.android.gms.common.internal.d r0 = r7.f10645a
            com.google.android.gms.common.internal.d$c r0 = r0.f10596p
            r0.mo11571a(r8)
            com.google.android.gms.common.internal.d r0 = r7.f10645a
            r0.mo11780K(r8)
            return
        L_0x0082:
            if (r0 != r3) goto L_0x00a5
            com.google.android.gms.common.internal.d r8 = r7.f10645a
            com.google.android.gms.common.ConnectionResult r8 = r8.f10606z
            if (r8 == 0) goto L_0x0093
            com.google.android.gms.common.internal.d r8 = r7.f10645a
            com.google.android.gms.common.ConnectionResult r8 = r8.f10606z
            goto L_0x0098
        L_0x0093:
            com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
            r8.<init>(r4)
        L_0x0098:
            com.google.android.gms.common.internal.d r0 = r7.f10645a
            com.google.android.gms.common.internal.d$c r0 = r0.f10596p
            r0.mo11571a(r8)
            com.google.android.gms.common.internal.d r0 = r7.f10645a
            r0.mo11780K(r8)
            return
        L_0x00a5:
            if (r0 != r5) goto L_0x00c4
            java.lang.Object r0 = r8.obj
            boolean r1 = r0 instanceof android.app.PendingIntent
            if (r1 == 0) goto L_0x00b0
            r6 = r0
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        L_0x00b0:
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            int r8 = r8.arg2
            r0.<init>(r8, r6)
            com.google.android.gms.common.internal.d r8 = r7.f10645a
            com.google.android.gms.common.internal.d$c r8 = r8.f10596p
            r8.mo11571a(r0)
            com.google.android.gms.common.internal.d r8 = r7.f10645a
            r8.mo11780K(r0)
            return
        L_0x00c4:
            r1 = 6
            if (r0 != r1) goto L_0x00ec
            com.google.android.gms.common.internal.d r0 = r7.f10645a
            r0.m14127h0(r3, null)
            com.google.android.gms.common.internal.d r0 = r7.f10645a
            com.google.android.gms.common.internal.d$a r0 = r0.f10601u
            if (r0 == 0) goto L_0x00df
            com.google.android.gms.common.internal.d r0 = r7.f10645a
            com.google.android.gms.common.internal.d$a r0 = r0.f10601u
            int r1 = r8.arg2
            r0.mo11814z(r1)
        L_0x00df:
            com.google.android.gms.common.internal.d r0 = r7.f10645a
            int r8 = r8.arg2
            r0.mo11781L(r8)
            com.google.android.gms.common.internal.d r8 = r7.f10645a
            com.google.android.gms.common.internal.C3261d.m14123d0(r8, r3, r2, r6)
            return
        L_0x00ec:
            r1 = 2
            if (r0 != r1) goto L_0x00fc
            com.google.android.gms.common.internal.d r0 = r7.f10645a
            boolean r0 = r0.mo11797i()
            if (r0 == 0) goto L_0x00f8
            goto L_0x00fc
        L_0x00f8:
            m14251a(r8)
            return
        L_0x00fc:
            boolean r0 = m14252b(r8)
            if (r0 == 0) goto L_0x010a
            java.lang.Object r8 = r8.obj
            com.google.android.gms.common.internal.p0 r8 = (com.google.android.gms.common.internal.C3302p0) r8
            r8.mo11870c()
            return
        L_0x010a:
            int r8 = r8.what
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 45
            r0.<init>(r1)
            java.lang.String r1 = "Don't know how to handle message: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r1 = "GmsClient"
            android.util.Log.wtf(r1, r8, r0)
            return
        L_0x012a:
            m14251a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C3299o0.handleMessage(android.os.Message):void");
    }
}
